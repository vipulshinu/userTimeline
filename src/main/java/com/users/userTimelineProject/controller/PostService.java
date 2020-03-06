package com.users.userTimelineProject.controller;

import com.users.userTimelineProject.model.Post;
import com.users.userTimelineProject.model.PostDetails;
import com.users.userTimelineProject.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.swing.text.html.HTML;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
public class PostService {

    @Autowired
     private PostServiceImpl postServiceImpl;

   final static String url = "http://jsonplaceholder.typicode.com/posts";

   //get All Post Data
    @GetMapping("/getAllPosts")
    public Post[] getAllPosts(){
        return postServiceImpl.getAllPosts(url);
    }

    //Count Application endpoints
    @GetMapping("/countEndpoints")
    public int getCount(){
        return postServiceImpl.getCount();
    }

    //get Distinct User IDs
    @GetMapping("/getUserIds")
    public Map<String, Set<Integer>> getDistinctUserIds(){
        return postServiceImpl.getuserIds(url);
    }

    //Update the 4th Json Data of the post list.
    @PutMapping("/updatedList")
    public List<Post> updatePostList(@RequestBody Post post){
        return postServiceImpl.getUpdatedData(url,post);
    }
}
