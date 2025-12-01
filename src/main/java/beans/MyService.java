package beans;

public class MyService {

    private String name;

    public String sayHello(){
        return "Im the service " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MyService{" +
                "name='" + name + '\'' +
                '}';
    }
}
