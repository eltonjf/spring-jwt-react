package com.example.springjwtreact.payload;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class VoteRequest {
    @NotNull
    private Long choiceId;

}
