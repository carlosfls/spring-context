package beans;

import org.springframework.stereotype.Component;

//using @Component annotation for creating beans
@Component
public class MyOtherService {

    public String sayHello(){
        return "Hello from MyOtherService";
    }
}
