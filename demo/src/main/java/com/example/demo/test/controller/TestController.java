package com.example.demo.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/home")
    public String home() {

        return "index.html";
    }

    @ResponseBody
    @RequestMapping("/valueTest")
    public String valueTest(){
        String val = "Test String";
        return val;
    }

    @RequestMapping("/test")
    public ModelAndView test(){
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name", "lyricalzy");

        List<String> testList = new ArrayList<>();
        testList.add("a");
        testList.add("b");
        testList.add("c");

        mav.addObject("list", testList);

        logger.trace("Trace Level Test");
        logger.debug("DEBUG Level Test");
        logger.info("INFO Level Test");
        logger.warn("WARN Level Test");
        logger.error("ERROR Level Test");

        return mav;
    }
}
