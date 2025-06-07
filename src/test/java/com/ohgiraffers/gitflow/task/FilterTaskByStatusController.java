package com.ohgiraffers.gitflow.task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class FilterTaskByStatusController {

    @GetMapping("mark-task")
    public String markTask() {
        return "할일 완료 처리하는 기능 개발 초기화";
    }
}
