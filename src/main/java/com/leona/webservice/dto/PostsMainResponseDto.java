package com.leona.webservice.dto;

import com.leona.webservice.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
public class PostsMainResponseDto {
    private Long id;
    private String title;
    private String author;
    private String modifiedDate;

    public PostsMainResponseDto(Posts entity) {
        id = entity.getId();
        title = entity.getTitle();
        author = entity.getAuthor();
        modifiedDate = toStringDateTime(entity.getModifiedDate());
    }

    private String toStringDateTime(LocalDateTime localDateTime) {
        if(localDateTime == null) {
            return "";
        }

        DateTimeFormatter fometter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return fometter.format(localDateTime);
    }
}
