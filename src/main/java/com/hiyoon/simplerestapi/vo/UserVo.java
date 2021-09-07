package com.hiyoon.simplerestapi.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {
    private String login;
    private String id;
    @JsonProperty("node_id")
    private String nodeId;
}
