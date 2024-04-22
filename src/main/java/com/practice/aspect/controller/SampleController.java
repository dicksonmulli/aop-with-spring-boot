package com.practice.aspect.controller;

import com.practice.aspect.AspectApplication;
import com.practice.aspect.domain.SampleAdder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class SampleController {

    private final SampleAdder sampleAdder;
    private final Logger logger = LoggerFactory.getLogger(AspectApplication.class);

    @Autowired
    public SampleController(SampleAdder sampleAdder) {
        this.sampleAdder = sampleAdder;
    }

    @GetMapping("/add")
    public int addNumbers() {
        int sum = sampleAdder.add(1, 2);
        logger.error("*********** sum = {}", sum);
        return sum;
    }
}
