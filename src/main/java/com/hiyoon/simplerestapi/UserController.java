package com.hiyoon.simplerestapi;

import com.hiyoon.simplerestapi.vo.UserVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/users")
@RequiredArgsConstructor
public class UserController {

    @GetMapping(value = "/v1/{id}")
    public UserVo userV1(@PathVariable("id") String id) throws InterruptedException {
        log.info("############# userV1. id: {}", id);
        Thread.sleep(2 * 1000);
        return UserVo.builder()
                .id(id)
                .nodeId("node v1: " + id)
                .nextPageYn(Integer.valueOf(id) > 3 ? "N" : "Y")
                .build();
    }

    @GetMapping(value = "/v2/{id}")
    public UserVo userV2(@PathVariable("id") String id) throws InterruptedException {
        log.info("############# userV2. id: {}", id);
        Thread.sleep(2 * 1000);
        return UserVo.builder()
                .id(id)
                .nodeId("node v2: " + id)
                .nextPageYn(Integer.valueOf(id) > 3 ? "N" : "Y")
                .build();
    }
}
