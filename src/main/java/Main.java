import beans.*;
import config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    /**
     * @Bean annotation is used for creating beans for adding them to the spring context
     * @Component etc. is another way of creating beans and adding them to the context
     */
    public static void main(String[] args) {
        //spring context
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //get bean from the context
        //calling boy name because we have two beans with the same name
        MyService myService = context.getBean("myService1", MyService.class);
        System.out.println(myService.sayHello());

        //get bean by name
        MyService myService2 = context.getBean("my-service-2", MyService.class);
        System.out.println(myService2.sayHello());

        //get default bean
        MyService defaultService = context.getBean(MyService.class);
        System.out.println(defaultService.sayHello());

        //get bean by type with stereotype annotation other forms of creating beans
        MyOtherService myOtherService = context.getBean(MyOtherService.class);
        System.out.println(myOtherService.sayHello());

        Person person = context.getBean(Person.class);
        System.out.println(person.getName());

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getName());

        //comparing references is the same spring reuses the same object not create twice
        System.out.print("Same object?:");
        System.out.println(person.getParrot() == parrot);

        //calling the wired service method
        ControllerTest controllerTest = context.getBean(ControllerTest.class);
        System.out.println(controllerTest.sayHello());
    }
}
