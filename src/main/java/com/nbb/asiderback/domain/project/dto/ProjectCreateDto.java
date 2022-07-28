package com.nbb.asiderback.domain.project.dto;

import com.nbb.asiderback.domain.project.entity.Project;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public class ProjectCreateDto {

    @Getter
    @NoArgsConstructor
    public static class Request {

        private Integer ownerId;
        private String title;
        private String upperAddress;
        private String lowerAddress;
        private String contents;
        private LocalDateTime startDate;
        private LocalDateTime endDate;
        private Long logoFileId;
        private String teamColor;

        @Builder
        public Request (Integer ownerId, String title, String upperAddress, String lowerAddress,
                        String contents, LocalDateTime startDate, LocalDateTime endDate,
                        Long logoFileId, String teamColor) {
            this.ownerId = ownerId;
            this.title = title;
            this.upperAddress = upperAddress;
            this.lowerAddress = lowerAddress;
            this.contents = contents;
            this.startDate = startDate;
            this.endDate = endDate;
            this.logoFileId = logoFileId;
            this.teamColor = teamColor;
        }

        public Project toEntity() {
            return Project.builder()
                    .ownerId(ownerId)
                    .title(title)
                    .upperAddress(upperAddress)
                    .lowerAddress(lowerAddress)
                    .contents(contents)
                    .startDate(startDate)
                    .endDate(endDate)
                    .logoFileId(logoFileId)
                    .teamColor(teamColor)
                    .build();
        }
    }

    @Getter
    @NoArgsConstructor
    public static class Response {

        private Long id;
        private Integer ownerId;
        private String title;
        private String upperAddress;
        private String lowerAddress;
        private String contents;
        private LocalDateTime startDate;
        private LocalDateTime endDate;
        private Long logoFileId;
        private String teamColor;

        @Builder
        public Response(Long id, Integer ownerId, String title, String upperAddress,
                        String lowerAddress, String contents, LocalDateTime startDate,
                        LocalDateTime endDate, Long logoFileId, String teamColor) {
            this.id = id;
            this.ownerId = ownerId;
            this.title = title;
            this.upperAddress = upperAddress;
            this.lowerAddress = lowerAddress;
            this.contents = contents;
            this.startDate = startDate;
            this.endDate = endDate;
            this.logoFileId = logoFileId;
            this.teamColor = teamColor;
        }
    }
}
