package beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE) //another form of declaring prototype scope
public class InstanceRepository {

    public void save(String comment){
        System.out.println(comment);
    }
}
