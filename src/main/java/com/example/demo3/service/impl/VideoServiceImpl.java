package com.example.demo3.service.impl;

import com.example.demo3.domain.Video;
import com.example.demo3.mapper.VideoMapper;
import com.example.demo3.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;
    @Override
    /**
     *@params:  * @param 
     *@Return: java.util.List<com.example.demo3.domain.Video>
     * @date: 2021/7/24 1:29
     * @description:
     */
    public List<Video> list() {
        return videoMapper.list();
    }
    
    //
    public Video get(String sss){
        return new Video();
    }
}
