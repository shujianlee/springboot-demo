package com.example.demo3;

import com.example.demo3.service.VideoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.nio.charset.Charset;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Demo3Application.class}) //启动整个springboot⼯程
@AutoConfigureMockMvc
public class VideoTest {
    @Autowired
    private VideoService videoService;
    @Autowired
    private MockMvc mockMvc;

//    @Before
//    public void testOne() {
//        System.out.println("test Before");
//    }

    @Test
    public void testTwo() throws Exception {

        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/pub/video/list"))
                .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
        System.out.println("返回状态："+mvcResult.getResponse().getStatus());

        String contentAsString = mvcResult.getResponse().getContentAsString(Charset.forName("UTF-8"));
        System.out.println(contentAsString);
    }
//
//    @After
//    public void testThree() {
//        System.out.println("test After");
//    }

}
