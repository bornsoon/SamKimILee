package app.labs.notice.interceptor;

import app.labs.notice.dao.NoticeRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Slf4j
@Component
@RequiredArgsConstructor // final 필드를 매개변수로 받는 생성자 자동 생성해줌
public class NoticeInterceptor implements HandlerInterceptor {

    private final NoticeRepository noticeRepository;

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        String memberId;
        log.info("NoticeInterceptor postHandle 호출됨");

        // Spring Boot 응답이 끝난 후 세션을 만들지 않도록 설정해야 오류 안남

        HttpSession session = request.getSession(false);  // 기존 세션만 사용하고 새로 생성하지 않음
        if (session != null) {
            memberId = (String) session.getAttribute("memberid");
            log.info("modelAndView: {}, memberId: {}", modelAndView, memberId); // 로그인 상태 로그
        } else {
            memberId = null;
            log.info("modelAndView: {}, 로그아웃 상태", modelAndView); // 로그아웃 상태 로그
        }
        if (modelAndView != null && !isRedirectView(modelAndView)) {
            if (memberId != null) {
                int count = noticeRepository.countNotice(memberId);
                log.info("읽지 않은 알림 수: {}", count);
//               modelAndView.addObject("hasNotice", count > 0);
                modelAndView.addObject("noticeCount", count);
            } else {
                log.info("알림 없음");
                modelAndView.addObject("hasNotice", false);
            }
        }

//       Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//       if (modelAndView != null && !isRedirectView(modelAndView) && authentication != null && authentication.getPrincipal() instanceof UserAccount) {
//           Account account = ((UserAccount)authentication.getPrincipal()).getAccount();
//           long count = notificationRepository.countByAccountAndChecked(account, false);
//           modelAndView.addObject("hasNotification", count > 0);
//       }
    }

    private boolean isRedirectView(ModelAndView modelAndView) {
        return modelAndView.getViewName().startsWith("redirect:") || modelAndView.getView() instanceof RedirectView;
    }

}
