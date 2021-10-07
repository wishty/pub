package com.nlab.lab.springboot.service.posts;

import com.nlab.lab.springboot.domain.posts.PostsRepository;
import com.nlab.lab.springboot.web.dto.PostsSavaRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSavaRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
