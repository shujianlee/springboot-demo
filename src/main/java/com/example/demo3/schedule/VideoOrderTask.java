package com.example.demo3.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @package: com.example.demo3.schedule
 * @ClassName: VideoOrderTask
 * @author: james
 * @date: 2021-08-02 23:17
 * @version: V1.0.1
 * @description:
 */
@Component
public class VideoOrderTask {
    private int i =0;
//    @Scheduled(fixedRate = 2000)
    @Scheduled(cron="*/1 * * * * *")
    public void p(){
        i++;
        System.out.println(i);
    }
}
