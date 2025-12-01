package beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

//using @Component annotation for creating beans,
//you can only have one bean of this type in the context
@Component
public class MyOtherServiceWithInit {

    private String name;

    @PostConstruct
    void init(){
        this.name = "MyOtherServiceInit";
    }

    public String sayHello(){
        return "Hello from MyOtherService with name: " + name;
    }
}
