package com.hiyoon.simplerestapi;

import com.hiyoon.simplerestapi.vo.RepoVo;
import com.hiyoon.simplerestapi.vo.UserVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/repos")
@RequiredArgsConstructor
public class RepoController {

    @GetMapping(value = "/{repoId}")
    public RepoVo repo(@PathVariable("repoId") String repoId) throws InterruptedException {
        log.info("############# repo. name: {}", repoId);
        Thread.sleep(2 * 1000);
        return RepoVo.builder()
                .id(repoId)
                .nodeId("node: " + repoId)
                .fullName("fullName" + repoId)
                .name("name" + repoId)
                .nextPageYn(Integer.valueOf(repoId) > 3 ? "N" : "Y")
                .build();
    }
}
