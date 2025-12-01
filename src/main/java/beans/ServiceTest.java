package beans;

import org.springframework.stereotype.Service;

@Service
public class ServiceTest {

    private String message = "Hello from ServiceTest";

    public String showMessage(){
        return message;
    }
}
