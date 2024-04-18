package com.example.project.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MetaDto {

    @JsonProperty("total_count") // json 으로 받을 때, 같은 key 인걸 맵핑시켜줌. 스네어 표기법 -> 카멜표기법으로 바꿔줌.
    private Integer totalCount;
}
