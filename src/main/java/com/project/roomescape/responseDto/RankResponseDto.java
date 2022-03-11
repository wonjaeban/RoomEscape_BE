package com.project.roomescape.responseDto;

import lombok.Getter;

@Getter
public class RankResponseDto {
    private String teamName;
    private String time;
    private Integer userNum;
    private String comment;
    private Long roomId;



    public RankResponseDto(String teamName, String time, Integer userNum, String comment, Long roomId) {
        this.teamName = teamName;
        this.time = time;
        this.userNum = userNum;
        this.comment = comment;
        this.roomId = roomId;
    }



}
