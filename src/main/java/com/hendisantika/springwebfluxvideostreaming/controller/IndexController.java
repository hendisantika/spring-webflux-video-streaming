package com.hendisantika.springwebfluxvideostreaming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-webflux-video-streaming
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 9/18/23
 * Time: 05:07
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("streaming")
public class IndexController {
    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/2")
    public String index2() {
        return "index2";
    }


}
