package config;

import beans.MyService;
import beans.Parrot;
import beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//using @ComponentScan annotation for scanning beans type components in the project
@ComponentScan(basePackages = "beans")
@Configuration
public class ProjectConfig {

    //you can create beans with the same type with @Bean annotation
    @Bean
    MyService myService1(){
        MyService myService = new MyService();
        myService.setName("Service 1");
        return myService;
    }

    @Bean(name = "my-service-2")
    MyService myService2(){
        MyService myService = new MyService();
        myService.setName("Service 2");
        return myService;
    }

    //if we have two beans with the same name, we can use @Primary
    // to define which one is the default one
    @Primary
    @Bean
    MyService defaultService(){
        MyService myService = new MyService();
        myService.setName("Default Service");
        return myService;
    }

    //WIRING BEANS
    @Bean
    Parrot parrot(){
        Parrot parrot = new Parrot();
        parrot.setName("Nemo");
        return parrot;
    }

    //USING DEPENDENCY INJECTION FROM SPRING FOR INJECTING THE PARROT OBJECT FROM THE CONTEXT
    @Bean
    Person person(Parrot parrot){
        Person person = new Person();
        person.setName("Carlos");
        person.setParrot(parrot);
        return person;
    }
}
