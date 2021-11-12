package com.example.demo3.domain;

import java.io.Serializable;

/**
 * @ClassName: com.example.demo3.domain$.Chapter$.java
 * @author: james
 * @date: 2021/7/24 9:32
 * @description:
 */
public class Chapter implements Serializable {

    private int id;
    private int videoId;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", videoId=" + videoId +
                ", title='" + title + '\'' +
                '}';
    }
}
