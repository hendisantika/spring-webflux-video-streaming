package com.hendisantika.springwebfluxvideostreaming.controller;

import com.hendisantika.springwebfluxvideostreaming.service.StreamingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

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
public class StreamingController {

    private final StreamingService streamingService;
}
