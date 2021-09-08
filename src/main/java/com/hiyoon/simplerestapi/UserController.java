package com.hiyoon.simplerestapi;

import com.hiyoon.simplerestapi.vo.UserVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
public class UserController {

    @GetMapping(value = "/v1/{name}")
    public UserVo userV1(@PathVariable("name") String name) throws InterruptedException {
        log.info("############# userV1. name: {}", name);
        Thread.sleep(2 * 1000);
        return UserVo.builder()
                .id(name)
                .nodeId("node v1: " + name)
                .build();
    }

    @GetMapping(value = "/v2/{name}")
    public UserVo userV2(@PathVariable("name") String name) throws InterruptedException {
        log.info("############# userV2. name: {}", name);
        Thread.sleep(2 * 1000);
        return UserVo.builder()
                .id(name)
                .nodeId("node v2: " + name)
                .build();
    }
}
