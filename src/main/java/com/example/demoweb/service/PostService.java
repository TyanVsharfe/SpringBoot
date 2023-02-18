package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private ArrayList<Post> posts;

    PostService() {
        posts = new ArrayList<>(Arrays.asList(
                new Post(0L,"Оригинальную Fallout теперь можно установить на смартфон", new Date()),
                new Post(1L,"Microsoft подтвердила сбой приложений Windows 11 из-за драйверов Intel", new Date()),
                new Post(2L,"Apple ограничит использование порта USB-C в iPhone 15", new Date()))
        );
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long) posts.size(),text, new Date()));
    }
}
