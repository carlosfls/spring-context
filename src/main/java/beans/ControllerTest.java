package beans;

import org.springframework.stereotype.Component;

@Component
public class ControllerTest {

    //autowiring beans from the context using constructor
    //spring takes the bean from the context and injects it into the constructor
    //the beast way of autowiring beans you can add immutability to the bean
    private final ServiceTest serviceTest;

    //spring will inject the bean into the constructor takes from the context an instance of ServiceTest and injects it
    public ControllerTest(ServiceTest serviceTest) {
        this.serviceTest = serviceTest;
    }

    public String sayHello(){
        return serviceTest.showMessage();
    }
}
