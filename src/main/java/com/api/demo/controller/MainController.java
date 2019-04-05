package com.api.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletContext;

@RestController
public class MainController {
    @Autowired
    private ServletContext context;

    @Value("${api.version}")
    private String version;

    @RequestMapping("/")
    public String home() {
        return "SPRINGBOOT for JEUS7 - version " + version;
    }

    @RequestMapping("/version")
    public String getVersion() {
        return version;
    }

    @RequestMapping("/servlet-version")
    public String getServletVersion() {
        return context.getEffectiveMajorVersion() + "." + context.getEffectiveMinorVersion();
    }
}
