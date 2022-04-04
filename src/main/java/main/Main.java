package main;

import components.TargetComponent;
import config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        var target = context.getBean(TargetComponent.class);

        target.targetMethod();
    }
}
