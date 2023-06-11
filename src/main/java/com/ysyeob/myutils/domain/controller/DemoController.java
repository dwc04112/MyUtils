package com.ysyeob.myutils.domain.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class DemoController {

    @GetMapping("/")
    public String demoGetRequest(@RequestParam String number) {
        return String.format("[Demo Get Request] 성공적으로 요청이 들어왔습니다 %s",number);
    }
}
