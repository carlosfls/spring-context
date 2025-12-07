package beans;

import java.util.UUID;

public class InstanceService {

    private final String id;

    public InstanceService() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }
}
