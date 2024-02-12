package bjm.ci.cd.project.controller;

import bjm.ci.cd.project.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;
    @GetMapping("")
    public String hello(){
        return "hello ";
    }

    @PostMapping("/add")
    public void addMember(@RequestParam(value = "nickname") String nickname){
        memberService.addMember(nickname);
    }
}
