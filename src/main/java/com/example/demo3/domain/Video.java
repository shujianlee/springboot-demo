package com.example.demo3.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Video implements Serializable {
	private String a ="测试";
    private int id;
    private String title;
    private String summary;
    private int price;
    @JsonProperty("cover_img")
    private String coverImg;
    @JsonProperty("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date createTime;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("chapter_list")
    private List<Chapter> chapterList;
    public Video() {

    }

    public Video(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Video(int id, String title, Date createTime) {
        this.id = id;
        this.title = title;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", price=" + price +
                ", coverImg='" + coverImg + '\'' +
                ", createTime=" + createTime +
                ", chapterList=" + chapterList +
                '}';
    }
}
