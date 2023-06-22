package com.codershub.learnspring.examplec1;

import org.springframework.stereotype.Component;

@Component
public interface DataService {
    int[] retrieveData();
}
