package app.labs.mypage.controller;

import java.util.List;
import java.util.Map;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import app.labs.mypage.service.MyPageService;
import app.labs.register.model.Member;
import app.labs.register.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MyPageController {

    @Autowired
    private MemberService memberService;
    
    // @Autowired
    // private MyPageService myPageService;

    @GetMapping("/mypage")
    public String showMyPage(HttpSession session, Model model) {
        String memberId = (String) session.getAttribute("memberid");
        if (memberId == null) {
            return "redirect:/login";
        }
        // Member member = memberService.findByUserId(memberId);
        // model.addAttribute("member", member);
        return "thymeleaf/mypage/mypage";
    }

    @GetMapping("/mypage/edit")
    public String editMyPage(Model model, HttpSession session,
            RedirectAttributes redirectAttributes) {
        String memberId = (String) session.getAttribute("memberid");
        if (memberId == null) {
            return "redirect:/login";
        }

        // 프로필 이미지 처리
        try {
            Member member = memberService.getMember(memberId);
            if (member.getMemberProfile() != null) {
                String memberProfileBase64 = Base64.getEncoder().encodeToString(member.getMemberProfile());
                model.addAttribute("memberProfileImage", "data:image/jpeg;base64," + memberProfileBase64);
            }
            model.addAttribute("member", member);
            return "thymeleaf/mypage/mypage_edit";
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/home";
        }
    }

    @PostMapping("/mypage/update")
    public String updateMyPage(Member member, HttpSession session, RedirectAttributes redirectAttributes) {
        String memberId = (String) session.getAttribute("memberid");
        member.setMemberId(memberId);
        try {
            if (member.getMemberProfile_mpf() != null && !member.getMemberProfile_mpf().isEmpty()) {
                member.setMemberProfile(member.getMemberProfile_mpf().getBytes());
                log.info("사용자 프로필 이미지 처리 완료");
            }
            memberService.updateMember(member);
            redirectAttributes.addFlashAttribute("message", "정보가 수정되었습니다!!");
        } catch (Exception e) {
            log.error("회원정보 수정 중 오류 발생: ");
            e.printStackTrace();
            return "redirect:/mypage/edit";
        }
        return "redirect:/mypage/edit";
    }

    @GetMapping("/mypage/journal")
    public String editMyPage(HttpSession session, Model model) {
        String memberId = (String) session.getAttribute("memberid");
        if (memberId == null) {
            return "redirect:/login";
        }
        return "thymeleaf/mypage/mypage_journal";
    }
}
