package com.codestates.practicegithubActiondeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
public String hello() {
        return "<html>\n" +
                "<body>\n" +
                "<h1 style=\"color: red\">Hello Siyeong World !!</h1>\n" +
                "<h1 style=\"color: orange\">Hello Siyeong World !!</h1>\n" +
                "<h1 style=\"color: yellow\">Hello Siyeong World !!</h1>\n" +
                "<h1 style=\"color: green\">Hello Siyeong World !!</h1>\n" +
                "<h1 style=\"color: blue\">Hello Siyeong World !!</h1>\n" +
                "<h1 style=\"color: navy\">Hello Siyeong World !!</h1>\n" +
                "<h1 style=\"color: purple\">Hello Siyeong World !!</h1>\n" +
                "</body>\n" +
                "</html>";
    }

}
