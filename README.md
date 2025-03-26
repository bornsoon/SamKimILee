<div align="center">
<img src="https://github.com/user-attachments/assets/50dbb390-fd92-4986-ac8b-d5dbfc54f11e">
</div>

<h2>🎯 목차</h2>
01. <a href=#1>프로젝트 소개</a><br>        
02. <a href=#2> Architecture</a><br>
03. <a href=#3>ERD</a><br>
04. <a href=#4>Class Diagram</a><br>
05. <a href=#5>프로젝트 구성원</a><br>
06. <a href=#6>기술 스택</a><br>
07. <a href=#7>Git-flow</a><br>
08. <a href=#8>AI 자동화 시스템</a><br>
09. <a href=#9>상세 구현 내용</a><br>
10. <a href=#10>문제점 및 해결 방안</a><br>
11. <a href=#11>상세페이지</a><br>
12. <a href=#12>회고</a><br>

<br>
<h2 id=1>🎯 프로젝트 소개</h2>

#### ☝️ `AI`를 접목한,
#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;나만의 감정을 인식하고 기록할 수 있는 **`  일기 공간  `** 과
#### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;서로의 감정을 공유할 수 있는 **`  공감 공간  `** 을 제공하는 웹 서비스
##### 🔹 프로젝트 기간 : 2025.01.17 ~ 2025.02.25

<br>
<h2 id=2>🎯 Architecture</h2>
<div align="center">
<!-- ![Architecture-3](https://github.com/user-attachments/assets/7bfb64a8-0da8-49b7-b7ff-b74bfdd152e2) -->
<img src=https://github.com/user-attachments/assets/0269df3b-0a6e-480e-b038-315bce7e9aba width="700">
</div>

<h2 id=3>🎯 ERD</h2>
<div align="center">
<img src=https://github.com/user-attachments/assets/39f96cb1-c564-4eed-bfe8-d583659d8a4b width=900">
</div>

<h2 id=4>🎯 Class Diagram</h2>
<div align="center">
<img src=https://github.com/user-attachments/assets/88b90b8d-256c-4a68-a68d-78ea95638647 width="800">
</div>

<br>
<h2 id=5>🎯 프로젝트 구성원</h2>

🏷 **`이효림 (📌 팀장)`**
- **프로젝트 총괄**, 일정 관리, DB 설계  
- **AI 서버(FastAPI)와 웹 서버(Spring Boot) 연동**
- **알림 기능 개발**  
- 감정의 방 **Front-end, Back-end 개발**  

🏷 **`김경민`**  
- **일기 요약 모델 튜닝, 감정 분류 모델 튜닝**  
- 힐링 공간 **Front-end, Back-end 개발**  

🏷 **`김미지`**  
- **UI/UX 총괄**  
- 퍼블리싱  

🏷 **`김세준`**  
- **Git 관리, DB 설계**  
- 관리자 페이지 **Front-end, Back-end 개발**
- 로그인 및 회원가입 페이지 **Front-end, Back-end 개발**  
- 마이페이지 **Front-end, Back-end 개발**  

🏷 **`이민정`**  
- 감정 분류 모델 튜닝  
- **일기의 방 Front-end, Back-end 개발**  


<br><br>
<h2 id=6>🎯 기술스택</h2>

### 🖥️ 개발 환경
 <img src="https://img.shields.io/badge/Spring Tools 4-6DB33F?style=for-the-badge&logo=spring&logoColor=white"> <img src="https://img.shields.io/badge/OracleDB 21c Express-FAA61A?style=for-the-badge&logo=oracle&logoColor=white"> <img src="https://img.shields.io/badge/AWS EC2-232F3E?style=for-the-badge&logo=amazonwebservices&logoColor=white"> <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white">
<br>

### 🔧 도구 및 버전 관리
<img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white"> <img src="https://img.shields.io/badge/SourceTree-0052CC?style=for-the-badge&logo=sourcetree&logoColor=white"> <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white">
<img src="https://img.shields.io/badge/Notion-000000?style=for-the-badge&logo=notion&logoColor=white">
<img src="https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white">
<br>

### 🌱 프레임워크 및 라이브러리
<img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"> <img src="https://img.shields.io/badge/MyBatis-4479A1?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/FastAPI-009688?style=for-the-badge&logo=fastapi&logoColor=white"> <img src="https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white"> <img src="https://img.shields.io/badge/jQuery-0769AD?style=for-the-badge&logo=jQuery&logoColor=white"/> <img src="https://img.shields.io/badge/Hugging Face-FFBF00?style=for-the-badge&logo=huggingface&logoColor=white"> <img src="https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white">
<br>

### 📝 언어
<img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=openjdk&logoColor=white"> <img src="https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white"> <img src="https://img.shields.io/badge/HTML-E34F26?style=for-the-badge&logo=html5&logoColor=white"> <img src="https://img.shields.io/badge/CSS-1572B6?style=for-the-badge&logo=css3&logoColor=white"> <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black">

<br><br>
<h2 id=7>🎯 Git-flow</h2>
<img src="https://github.com/user-attachments/assets/b9340e7e-7107-4338-b08c-6a8bf6640ae7">

#### `Description`
1. 로컬에 메인 저장소(main repository) 클론
2. 팀원 각자의 사용자명으로 브랜치 생성 (Git 관리자는 dev 브랜치도 생성)
3. 단위 개발 완료 후 원격 저장소(origin)에 푸시
4. 원격 저장소의 사용자 브랜치를 dev 브랜치에 병합
5. 테스트 후 이상이 없으면 main 브랜치에 병합하고, 원격 저장소(origin)에 푸시
6. 기존 사용자 브랜치(local/origin 모두) 삭제 후 main 브랜치 pull
7. 2번부터 반복
   
<br><br>
<h2 id=8>🎯 AI 자동화 시스템</h2>

| **📝 일기 작성 과정**  | **💬 공감의 글 작성 과정**  |
| ----------------- | ----------------- |
|1. 일기 작성<br>2. **일기 요약 AI 모델**을 통한 **`일기 줄거리 자동 요약`**<br>3. **감정 분류 AI 모델**을 통한 **`"주요 감정" 자동 결정`**<br>4. **`주요 감정에 대한 피드백 제공`**|1. 공감의 글 작성<br>2. **악성 필터링 AI 모델**을 통한 **`악성글 자동 분류`**<br>3. 게시글 **`자동 숨김 처리`**<br>4. 게시글 작성자에게 **`숨김 처리 알림 전송`**|
| <img src=https://github.com/user-attachments/assets/68e93d0c-8421-4f8d-8ce7-6a9f7f8ec6ec width="500">  | <img src=https://github.com/user-attachments/assets/18cf2bc0-9ed1-4dca-a584-6d98e9cdff21 width="500">  |

<br><br>
<h2 id=9>🎯 상세 구현 내용</h2>

### **📌 ` AI 서버 연동 & 알림 처리 `**
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=https://github.com/user-attachments/assets/bdc93d71-ed14-442f-8941-3b3c14e71605 width=800>

### **📌 ` 신고 기능 & 공감 버튼 `**
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src=https://github.com/user-attachments/assets/23082c49-1e3d-4400-ba44-5626c9d5ee95 width=800>

<br><br>

<h2 id=10>🔍 문제점 및 해결 방안💡</h2>

### 1️⃣ AWS EC2에서 Oracle DB 사용 중 다운 현상 발생
#### 🔍 문제점
- ##### 로컬에서 구축한 Oracle DB를 AWS 환경에서 사용하기 위해 EC2에 `Docker`로 직접 설치해야 했음.
- ##### 하지만 Oracle 21c 버전은 프리티어 `EC2의 메모리를 초과`하여 지속적으로 다운되는 문제 발생.
#### 💡 해결 방안
- ##### 보다 가벼운 Oracle 11g 버전으로 다운그레이드하여 다시 구축.
- ##### 11g 버전에서는 Sequence를 PK의 Default 값으로 설정하는 구문이 지원되지 않음, 이에 따라 테이블 스키마와 일부 SQL 쿼리를 수정.
- ##### EC2 요금제를 업그레이드하여 더 높은 메모리와 성능을 제공하는 인스턴스로 변경, 이를 통해 `DB 안정성 확보`.
- ##### `Docker 볼륨`을 활용하여 DB 데이터를 영구 저장하도록 구성, 이를 통해 `컨테이너 재시작 시에도 데이터 유지 가능`하도록 개선.
<br>

### 2️⃣ AI 모델 응답 지연 문제
#### 🔍 문제점
- ##### AI 모델을 활용한 "일기의 방"과 "공감의 방" 기능에서 `요청 처리 시간`이 길어짐.
- ##### AI 응답이 지연되면서 `기존 웹 서비스의 전체적인 성능 저하 발생`.
#### 💡 해결 방안
- ##### Spring Boot의 `@Async 어노테이션`을 활용하여 AI 모델 호출을 `별도의 스레드에서 실행`하도록 처리.
- ##### `FastAPI 서버 실행을 비동기(Async) 방식으로 변경`하여, `Spring Boot 요청 흐름을 방해하지 않도록 개선`.
- ##### 이로 인해 AI 모델이 실행되는 동안에도 웹 서비스가 원활하게 동작할 수 있도록 최적화.
<br>

### 3️⃣ Spring Boot와 FastAPI 연동 문제
#### 🔍 문제점
- ##### Spring Boot가 FastAPI 실행을 기다리는 동안 `세션 생성보다 응답이 먼저 커밋`되는 문제 발생.
- ##### `응답이 커밋된 후` 세션을 만들려고 하면 java.lang.IllegalStateException: Cannot create a session after the response has been committed `오류 발생`.
- ##### FastAPI 프로세스 실행으로 인해 Spring Boot의 `응답 흐름이 블로킹`되는 현상이 원인.
#### 💡 해결 방안
- ##### FastAPI 실행 로그를 Spring Boot에서 출력하도록 설정하여 `디버깅 편의성 향상`.
- ##### Spring Boot에서 `FastAPI 실행을 비동기(@Async)로 처리`하여 `메인 스레드 블로킹 방지`.
- ##### Interceptor에서 `기존 세션만 조회`하도록 변경하여, `응답이 커밋된 후 새로운 세션을 생성하지 않도록 로직 수정`.
- ##### 이로 인해 FastAPI와 Spring Boot가 안정적으로 연동되면서 세션 관련 오류 방지.
<br>

### 4️⃣ CORS 문제
#### 🔍 문제점
- ##### localhost와 127.0.0.1 간 요청 시 `CORS 정책`으로 인해 `Cross-Origin Request Blocked 오류` 발생.
- ##### 일부 페이지에서 요청을 보낼 때 특정 출처만 허용되도록 설정되어 있어 `API 요청이 차단`됨.
#### 💡 해결 방안
- ##### 서버의 `Access-Control-Allow-Origin 헤더`를 수정하여 두 출처(localhost, 127.0.0.1) 모두 허용하도록 변경.
- ##### Spring Boot의 `CorsRegistry`를 활용하여 allowedOrigins() 메서드로 `허용할 출처를 명시적으로 등록`.
- ##### 이를 통해 `CORS 문제를 해결`하고, 개발 환경에서도 `원활한 API 호출 가능`하도록 개선.
<br>
  
<br><br>
<h2 id=11>🎯 상세페이지</h2>
<b>
 <details>
  <summary>홈 화면 상세보기</summary>
   <table>
    <tr>
     <th>홈 화면</th>
     <th width="300">상세 기능</th>
    </tr>
    <tr>
     <td>
      <img src=https://github.com/user-attachments/assets/0245fce0-65fc-4258-8f51-009e76ab3bf9 width="500">
     </td>
     <td>
      <ul>
       <li>슬라이딩&nbsp&nbsp</li>
       <li>3가지 서비스 연결&nbsp&nbsp</li>
      </ul>
     </td>
    </tr>
   </table>
 </details>
 
 <details>
  <summary>회원가입 및 로그인 상세보기</summary>
   <table>
    <tr>
     <th>회원가입 및 로그인</th>
     <th width="300">상세 기능</th>
    </tr>
    <tr>
     <td>
      <img src=https://github.com/user-attachments/assets/04059072-9db0-4b18-bcf7-27f0201adc12 width="500">
     </td>
     <td>
     &nbsp;&nbsp;&nbsp;【 회원가입 기능 】<br>
      <ul>
       <li>
        아이디 중복 검사
       </li>
       <li>
        닉네임 중복 검사사
       </li>
      </ul>
      &nbsp;&nbsp;&nbsp;【 로그인 기능 】<br>
     </td>
    </tr>
   </table>
 </details>
 
 <details open>
  <summary>공감의 방 상세보기</summary>
   <table>
    <tr>
     <th>공감의 방</th>
     <th width="300">상세 기능</th>
    </tr>
    <tr>
     <td>
      <img src=https://github.com/user-attachments/assets/4b358f69-e71f-48b2-b7ad-40ee54b6e688 width="500">
     </td>
     <td>
     &nbsp;&nbsp;&nbsp;【 공감의 방 주요 기능 】<br>
      <ul>
       <li>
        4가지 공감의 방<br>
        (joy / sad / cheer / worry)
       </li>
       <li>
        공감글 작성 모달
       </li>
       <li>
        공감글 상세보기 모달
       </li>
       <li>
        4가지 공감 버튼<br>
        (joy / sad / cheer / worry)<br>
        (본인 게시글에는 불가)
       </li>
      </ul>
       &nbsp;&nbsp;&nbsp;【 AI 악성글 필터링 기능 】<br>
      <ul>
       <li>
        AI 악성글 필터링 적용
       </li>
       <li>
        필터링 결과에 따른 글 숨김 처리
       </li>
      </ul>
      </ul>
      &nbsp;&nbsp;&nbsp;【 알림 및 신고 기능 】<br>
      <ul>
       <li>
        숨김 처리 후 작성자에 알림 제공
       </li>
       <li>신고 기능<br>
           (신고 받은 글 작성자에 알림 제공)
       </li>
       <li>
        신고 누적수 5회 이상 숨김 처리
       </li>
      </ul>
     </td>
    </tr>
   </table>  
 </details>

 <details open>
   <summary>일기의 방 상세보기</summary>
    <table>
     <tr>
      <th>일기의 방</th>
      <th width="300">상세 기능</th>
     </tr>
     <tr>
      <td>
       <img src=https://github.com/user-attachments/assets/b9225909-4338-4345-bf34-f12274ab23b0 width="500">
      </td>
      <td>
      &nbsp;&nbsp;&nbsp;【 일기의 방 주요 기능 】<br>
       <ul>
        <li>일기 작성 및 파일 첨부</li>
        <li>TOAST UI Editor 적용</li>
       </ul>
       &nbsp;&nbsp;&nbsp;【 AI 감정 분류 및 피드백 기능 】<br>
       <ul>
        <li>AI 감정 분류 결과 제공</li>
        <li>감정에 따른 피드백 제공</li>
       </ul>
      </td>
     </tr>
    </table>
 </details>
 
 <details>
  <summary>힐링의 방 상세보기</summary>
   <table>
    <tr>
     <th>힐링의 방</th>
     <th width="300">상세 기능</th>
    </tr>
    <tr>
     <td>
      <img src="https://github.com/user-attachments/assets/5c6dfb51-b531-4dd4-9d7c-561caa369c51" width="500">
     </td>
    <td>
    &nbsp;&nbsp;&nbsp;【 힐링 플레이리스트 추천 】<br>
     <ul>
      <li>
        크롤링으로 수집한 플레이리스트
       </li>
       <li>
        그 날의 키워드에 따라<br>
        랜덤 플레이리스트 추천
       </li>
       <li>
        Youtube Player API로<br>
        플레이리스트 영상 제공
       </li>
      </ul>
      &nbsp;&nbsp;&nbsp;【 힐링 어플 추천 】<br>
      <ul>
       <li>
        외부 어플 추천 및 연결 링크 제공
       </li>
      </ul>
     </td>
    </tr>
   </table>
 </details>
 
 <details>
  <summary>마이페이지 상세보기</summary>
   <table>
    <tr>
     <th>마이페이지</th>
     <th width="300">상세 기능</th>
    </tr>
    <tr>
     <td>
      <img src="https://github.com/user-attachments/assets/48837fce-1245-42ce-946d-840cc2f80181" width="500">
     <td>
      <ul>
       <li>회원정보 수정</li>
       <li>【 My Journal 】<br>
            나의 일기를 월별, 감정분류별로<br>
            최신순/오래된 순으로 확인 가능
       </li>
       <li>【 My Mission 】<br>
            출석 미션과 일기 작성 미션으로<br>
            획득 성공한 별자리 확인 가능
       </li>
       <li>【 My Emotion 】<br>
            작성한 일기의 감정 분포와<br>
            공감 글의 감정 분포 확인 가능
       </li>
      </ul>
     </td>
    </tr>
   </table>
 </details>
 
 <details>
  <summary>관리자 페이지 상세보기</summary>
   <table>
    <tr>
     <th>관리자 페이지</th>
     <th width="300">상세 기능</th>
    </tr>
    <tr>
     <td>
      <img src="https://github.com/user-attachments/assets/5792457a-87eb-4f53-a604-b8926add4940" width="500"><br>
     </td>
     <td>
      &nbsp;&nbsp;&nbsp;【 사이트 실시간 현황 페이지 】<br>
      <ul>
       <li>
        오늘의 사이트의 사용자 수 통계
       </li>
       <li>
        전체 회원의 이벤트 참여도 통계
       </li>
       <li>
        일기의 방과 공감의 방의<br>
        서비스별 감정 분포 통계
       </li>
       <li>
        전 통계 차트 PDF 다운로드 가능
       </li>
      </ul>
      &nbsp;&nbsp;&nbsp;【 회원 관리 페이지 】<br>
      <ul>
       <li>
        회원 현황 확인 및 관리
       </li>
       <li>
        스팸 계정 일괄 차단 기능
       </li>
       <li>
        탈퇴 계정 수정 불가
       </li>
      </ul>
      &nbsp;&nbsp;&nbsp;【 회원 통계 페이지 】<br>
      <ul>
       <li>
        특정 기간별로<br>
        회원가입률 및 탈퇴율 확인 가능
       </li>
      </ul>
      &nbsp;&nbsp;&nbsp;【 감정 통계 페이지 】<br>
      <ul>
       <li>
        오늘의 일기 감정분포 및<br>
        오늘의 공감의 방 감정분포 확인
       </li>
       <li>
        전체 일기 감정 추이 및<br>
        전체 공감의 방 감정 추이 확인
       </li>
       <li>
        전 통계 차트 PDF 다운로드 가능
       </li>
      </ul>
     </td>
    </tr>
    <tr>
     <td>
      <img src="https://github.com/user-attachments/assets/8dad1317-c264-4848-bcf1-08aa84923dbd" width="500">
     </td>
     <td>
      &nbsp;&nbsp;&nbsp;【 공감글 관리 페이지 】<br>
      <ul>
       <li>
        악성글 필터링 수동 처리 기능
       </li>
       <li>
        공감글 일괄 처리 기능
       </li>
       <li>
        공감글 상세 내용 확인
       </li>
      </ul>
      &nbsp;&nbsp;&nbsp;【 이벤트 관리 페이지 】<br>
      <ul>
       <li>
        이벤트 등록 및 수정, 삭제 가능
       </li>
      </ul>
      &nbsp;&nbsp;&nbsp;【 이벤트 참여율 페이지 】<br>
      <ul>
       <li>
        이벤트별 특정 기간(월별, 연도별)<br>
        참여율 통계 확인 가능
       </li>
       <li>
        오늘의 이벤트 참여율 통계
       </li>
       <li>
        분기별 이벤트 참여율 통계
       </li>
      </ul>
     </td>
    </tr>
   </table>
 </details> 
</b>

<br>
<h2 id=12>💬 회고</h2>

###### *일기의 방과 공감의 방에서 글이 등록되면 AI 모델이 동작해야하는데 예측값을 반환하는 과정에서 지연시간이 생겼다. 그래서 비동기 처리와 별도의 스레드로 작업을 하게 해서 서비스를 이용하는데 큰 지장이 없도록 구현하였다. 이 과정에서 비동기와 스레드에 대한 이해가 한층 깊어지는 계기가 되었다.*
###### *알림 기능을 구현할 때, Interceptor를 활용하여 알림 상태를 갱신하는 작업을 진행했지만, 오류가 발생하면 모든 페이지에 영향을 미치는 문제가 있어 어려움을 겪었다.*
###### *이러한 오류는 서비스 전체의 구조를 제대로 이해하지 못하면 수정하는 데 많은 시간이 소요되기 때문에, 시스템 구조에 대한 깊은 이해가 얼마나 중요한지 다시 한번 깨닫는 계기가 되었다.*
###### *또한, 팀장 역할을 병행하며 개발을 진행하다 보니 충분한 작업 시간을 확보하지 못한 점이 아쉬웠다. 하지만 팀원들을 도와주며 함께 문제를 해결하는 과정에서 많은 것을 배울 수 있었고, 그만큼 보람찬 경험이었다.*
