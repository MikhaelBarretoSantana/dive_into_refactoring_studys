package replace_exception_with_test;

import java.util.Stack;

public class Main {

}

class ResourcePool {
    private Stack available;
    private Stack allocated;

    public Resource getResource() {
        Resource result;

        if (available.isEmpty()) {
            result = new Resource();
        } else {
            result = (Resource) available.pop();
        }

        allocated.push(result);
        return result;
    }
}