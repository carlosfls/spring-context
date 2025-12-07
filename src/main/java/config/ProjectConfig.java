package config;

import beans.CommentService;
import beans.InstanceService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@ComponentScan(basePackages = "beans")
@Configuration
public class ProjectConfig {

    //In resume spring singleton is not with the type we can have 2 singleton instances of CommentService
    //because we declared with different names. This is util because we can create for example one bean of
    //the service for dev and another for prod environment.

    //Spring creates a singleton bean only 1 instance fo this bean for the entire application
    @Bean
    public CommentService commentService(){
        return new CommentService();
    }

    //Spring creates a singleton bean only 1 instance fo this bean for the entire application
    @Bean
    public CommentService commentService2(){
        return new CommentService();
    }

    //Spring creates a new instance bean for each request with this scope
    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public InstanceService instanceService(){
        return new InstanceService();
    }
}
