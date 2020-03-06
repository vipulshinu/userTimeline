package com.users.userTimelineProject.controller;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.users.userTimelineProject.UserTimelineProjectApplicationTests;
import com.users.userTimelineProject.model.Post;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class PostServiceTest extends UserTimelineProjectApplicationTests {

    @Autowired
    WebApplicationContext webApplicationContext;

    MockMvc mockMvc;


    @Before
    public void setup(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

    }

    @Test
    public void getPostTest() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getAllPosts").contentType("application/json;charset=utf-8");
        MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();

        MockHttpServletResponse response = mvcResult.getResponse();

        Assert.assertEquals(200,response.getStatus());
    }

    @Test
    public void getEndpointsTest() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/countEndpoints");
        MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();

        MockHttpServletResponse response = mvcResult.getResponse();

        Assert.assertEquals("4",response.getContentAsString());
    }

    @Test
    public void getUniqueIdsTest() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getUserIds").contentType("application/json;charset=utf-8");
        MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();

        MockHttpServletResponse response = mvcResult.getResponse();

        Assert.assertEquals(200,response.getStatus());
    }


    @Test
    public void updateListTest() throws Exception {
        String postJson = "{\"title\":\"1800Flowers\",\"body\":\"1800Flowers\"}";
        RequestBuilder requestBuilder = MockMvcRequestBuilders.put("/updatedList").content(postJson).contentType("application/json;charset=utf-8");
        MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();

        MockHttpServletResponse response = mvcResult.getResponse();
        String post1 = response.getContentAsString();
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
         Post[] data = mapper.readValue(post1, Post[].class);
        Assert.assertEquals(200,response.getStatus());
        Assert.assertEquals("1800Flowers",data[3].getTitle());
        Assert.assertEquals("1800Flowers",data[3].getBody());
    }
}
