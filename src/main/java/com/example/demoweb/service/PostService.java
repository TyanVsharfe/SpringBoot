package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts() {
        Post post1 = new Post("Оригинальную Fallout теперь можно установить на смартфон");
        Post post2 = new Post("Microsoft подтвердила сбой приложений Windows 11 из-за драйверов Intel");
        Post post3 = new Post("Apple ограничит использование порта USB-C в iPhone 15");

        return Arrays.asList(post1,post2,post3);
    }
}
