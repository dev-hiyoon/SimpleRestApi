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
@RequestMapping(value = "/simple")
@RequiredArgsConstructor
public class SimpleRestController {

    @GetMapping(value = "/{name}")
    public UserVo delay(@PathVariable("name") String name) throws InterruptedException {
        log.info("############# delayResponse. name: {}", name);
        Thread.sleep(2 * 1000);
        return UserVo.builder()
                .id(name)
                .nodeId("node" + name)
                .build();
    }
}
