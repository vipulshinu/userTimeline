package com.users.userTimelineProject.service;

import com.users.userTimelineProject.controller.PostService;
import com.users.userTimelineProject.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class PostServiceImpl {

    public Post[] getAllPosts(String url){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type","application/json;charset=utf-8");
        HttpEntity entity = new HttpEntity(headers);
        ResponseEntity<Post[]> response = restTemplate.exchange(url, HttpMethod.GET,entity, Post[].class);
        return response.getBody();
    }

    public Map<String,Set<Integer>>  getuserIds(String url) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type","application/json;charset=utf-8");
        HttpEntity entity = new HttpEntity(headers);
        ResponseEntity<Post[]> response = restTemplate.exchange(url, HttpMethod.GET,entity, Post[].class);
        Set<Integer> postData = new HashSet<>();

        Map<String,Set<Integer>> postResponse = new HashMap<>();
        for(int i=0;i<response.getBody().length;i++){
            postData.add(response.getBody()[i].getUserId());
            postResponse.put("UniqueIds:",postData);
        }
        postResponse.put("Count", Collections.singleton(postData.size()));
        return postResponse;
    }

    public List<Post> getUpdatedData(String url,Post post){
        List<Post> updatedPostData = Arrays.asList(getAllPosts(url));
        updatedPostData.get(3).setBody(post.getBody());
        updatedPostData.get(3).setTitle(post.getTitle());

        return updatedPostData;
    }

    public int getCount() {
        return PostService.class.getDeclaredMethods().length;
    }
}
