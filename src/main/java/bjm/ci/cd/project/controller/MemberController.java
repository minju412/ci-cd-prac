package bjm.ci.cd.project.controller;

import bjm.ci.cd.project.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/add")
    public void addMember(@RequestParam(value = "nickname") String nickname){
        memberService.addMember(nickname);
    }
}
