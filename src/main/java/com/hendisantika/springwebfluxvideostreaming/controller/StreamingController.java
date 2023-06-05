package com.hendisantika.springwebfluxvideostreaming.controller;

import com.hendisantika.springwebfluxvideostreaming.service.StreamingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-webflux-video-streaming
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/5/23
 * Time: 18:00
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequiredArgsConstructor
@Slf4j
public class StreamingController {

    private final StreamingService streamingService;

    @GetMapping(value = "video/{title}", produces = "video/mp4")
    public Mono<Resource> getVideo(@PathVariable String title, @RequestHeader("Range") String range) {
        log.info(range);
        return streamingService.getVideo(title);
    }
}
