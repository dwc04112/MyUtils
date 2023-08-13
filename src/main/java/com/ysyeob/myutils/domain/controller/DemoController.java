package com.ysyeob.myutils.domain.controller;

import com.ysyeob.myutils.domain.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/demo")
public class DemoController {

    private final DemoService demoService;

    @GetMapping("/")
    public String demoGetRequest(@RequestParam String number) {
        return String.format("[Demo Get Request] 성공적으로 요청이 들어왔습니다 %s",number);
    }

    @GetMapping("/user/{userId}")
    public void getUserInfo(
            @PathVariable long userId
    ) {
        demoService.getUserInfo(userId);
    }
}
