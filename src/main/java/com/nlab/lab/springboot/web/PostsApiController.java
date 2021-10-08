package com.nlab.lab.springboot.web;

import com.nlab.lab.springboot.service.posts.PostsService;
import com.nlab.lab.springboot.web.dto.PostsSavaRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSavaRequestDto requestDto) {
        return postsService.save(requestDto);
    }

}
