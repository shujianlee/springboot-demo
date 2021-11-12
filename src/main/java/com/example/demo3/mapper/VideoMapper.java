package com.example.demo3.mapper;

import com.example.demo3.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class VideoMapper {
    private static Map<Integer, Video> map = new HashMap<>();

    static {
        map.put(1, new Video(1,"标题1", new Date()));
        map.put(2, new Video(2,"标题2", new Date()));
        map.put(3, new Video(3,"标题3", new Date()));
        map.put(4, new Video(4,"标题4", new Date()));
        map.put(5, new Video(5,"标题5", new Date()));
        map.put(6, new Video(6,"标题E6", new Date()));
    }

    public List<Video> list(){
        List<Video> list = new ArrayList<>();
        list.addAll(map.values());
        return list;
    }
}
