package com.albert.limitservice.controller;

import com.albert.limitservice.beans.Limits;
import com.albert.limitservice.config.LimitsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LimitsController {

    @Autowired
    LimitsConfig limitsConfig;

    @GetMapping("/limits")
    public Limits retrieveLimits(){

        return new Limits(limitsConfig.getMinimum(), limitsConfig.getMaximum());
    }
}
