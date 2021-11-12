package com.example.demo3.controller;

import com.example.demo3.domain.Video;
import com.example.demo3.service.VideoService;
import com.example.demo3.util.JSONData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/pub/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("list")
    public JSONData list(){
        List<Video> list = videoService.list();
        ObjectMapper objectMapper = new ObjectMapper();
        String x = null;
        try {
            x = objectMapper.writeValueAsString(list);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(x);
        List list1 = null;
        try {
            list1 = objectMapper.readValue(x, List.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return JSONData.buildSuccess(list1);
    }

    @PostMapping("save")
    public JSONData save(@RequestBody Video video){
        System.out.println(video.toString());
        return JSONData.buildSuccess(video);
    }

}
