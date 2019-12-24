package com.leona.webservice.web;

import com.leona.webservice.domain.posts.PostsRepository;
import com.leona.webservice.dto.posts.PostsSaveRequestDto;
import com.leona.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class webRestController {

    private PostsService postsService;
    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello() {

        return "HelloWorld";
    }

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto) {
        return postsService.save(dto);
    }
}
