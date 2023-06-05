package com.hendisantika.springwebfluxvideostreaming.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-webflux-video-streaming
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/5/23
 * Time: 17:57
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@RequiredArgsConstructor
public class FunctionalEndPointConfig {

    private final StreamingService streamingService;
}
