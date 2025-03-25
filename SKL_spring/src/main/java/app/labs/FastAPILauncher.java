package app.labs;

import jakarta.annotation.PostConstruct;
import java.io.IOException;

import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FastAPILauncher {

    private Process fastApiProcess;

    /*
     * FastAPI 실행을 비동기로 실행하여 Spring Boot의 응답 흐름을 방해하지 않음
     * (FastAPI 실행이 Spring Boot의 메인 스레드를 블로킹(blocking) 하는지 확인 필요)
     * 비동기 처리로 ProcessBuilder가 응답을 블로킹하지 않도록 수정
     */

    @Async
    @PostConstruct
    public void startFastAPIServer() {
        try {
            // FastAPI 서버 실행 (백그라운드에서 실행)
            ProcessBuilder processBuilder;
            String os = System.getProperty("os.name").toLowerCase();

            String venv = "C:\\labs_python\\.venv\\Scripts\\activate";
            String fastAPICommand= "python C:\\labs_python\\SamKimILee\\SKL_spring\\fastapi-server\\main1.py";

            if (os.contains("win")) {
                processBuilder = new ProcessBuilder("cmd.exe", "/c", venv + " && " + fastAPICommand);
                log.info("FastAPILauncher Command: {}", venv + " && " + fastAPICommand);
            } else {  // Linux 운영체제일 때
                processBuilder = new ProcessBuilder("/bin/sh", "-c", venv + " && " + fastAPICommand);
                log.info("FastAPILauncher Command: {}", venv + " && " + fastAPICommand);
            }

            processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
            processBuilder.redirectError(ProcessBuilder.Redirect.INHERIT);
            // processBuilder.redirectErrorStream(true);
            fastApiProcess = processBuilder.start(); // 프로세스를 fastApiProcess에 저장
            System.out.println("FastAPI 서버 실행됨!");
            // http://127.0.0.1:8000/docs로 fastAPI API 확인 가능 (+ 서버 실행됬는지 확인가능)
            // cmd에서도 확인 가능 -> netstat -ano | findstr :8000
            // TIME_WAIT 상태는 그대로 둬도 자동으로 사라짐 (운영체제가 정리함).
            // LISTENING 상태의 프로세스(PID {PID})가 있으면 taskkill로 직접 종료해야 함. (taskkill /PID {PID} / F)
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("FastAPI 서버 실행 실패!");
        }
    }

    @PreDestroy
    public void stopFastAPIServer() {
        if (fastApiProcess != null) {
            fastApiProcess.destroy(); // FastAPI 프로세스 종료
            System.out.println("FastAPI 서버 종료됨!");
        }
    }
}


/* FastAPILauncher 추가 후 오류 발생 원인
   FastAPILauncher가 FastAPI 서버를 실행하면서 Spring Boot의 응답 흐름이 바뀌었을 가능성이 큼

* 1. FastAPI 프로세스 실행이 블로킹(blocking)되어 응답 처리가 지연됨
    ProcessBuilder가 FastAPI 서버 실행을 기다리면서 Spring Boot가 응답을 지연할 가능성이 있음
    이 과정에서 Spring Boot가 세션을 나중에 만들려다 응답이 이미 커밋되어 오류 발생

* 2. FastAPI 실행 시 Spring Boot의 요청 흐름을 바꿨을 가능성
    FastAPI가 실행되면서 Spring Boot 내부에서 HTTP 요청을 다루는 방식이 변경되었을 수도 있음
    예를 들어, 비동기(@Async) 처리나 필터(Filter) 로직이 다르게 동작했을 가능성

* 3. FastAPI 실행 중 stdout(출력 스트림) 버퍼 문제
    ProcessBuilder에서 FastAPI 실행 로그를 Spring Boot가 처리하는 방식이 응답과 충돌할 수 있음
    로그 처리가 블로킹되면서 세션을 정상적으로 생성하지 못하고 응답이 먼저 커밋되는 경우
*/
