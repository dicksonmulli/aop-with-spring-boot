package com.practice.aspect.domain;

import org.springframework.stereotype.Component;

@Component
public class SampleAdder {
    public SampleAdder() {
    }

    public int add(int a, int b) {
        return a + b;
    }
}
