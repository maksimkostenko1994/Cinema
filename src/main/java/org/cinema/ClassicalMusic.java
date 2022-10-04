package org.cinema;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {

    @PostConstruct
    public void onInit() {
        System.out.println("Do my init!");
    }

    @PreDestroy
    public void onDestroy() {
        System.out.println("Do my destroy!");
    }

    @Override
    public String getSong() {
        return "Angels of Sorrow";
    }
}
