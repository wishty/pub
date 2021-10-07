package com.nlab.lab.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.net.ssl.SSLSession;

public interface PostsRepository extends JpaRepository<Posts, Long> {

}