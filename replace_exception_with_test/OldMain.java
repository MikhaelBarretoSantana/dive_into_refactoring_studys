package replace_exception_with_test;

import java.util.EmptyStackException;
import java.util.Stack;

public class OldMain {
    
}

class ResourcePool {
    private Stack available;
    private Stack allocated;

    public Resource getResource() {
        Resource result;

        try {
            result = (Resource) available.pop();
            allocated.push(result);
            return result;
        } catch (EmptyStackException e) {
            result = new Resource();
            allocated.push(result);
            return result;
        }
    }
}
