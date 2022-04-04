package components;

import org.springframework.stereotype.Component;

@Component
public class TargetComponent {
    public void targetMethod() {
        System.out.println("Executing some business logic");
//        throw new RuntimeException();
    }
}
