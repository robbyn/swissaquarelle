package ch.swissaquarelle.svc;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    private int count;

    @Override
    public String getMessage() {
        return "Hello from service (" + ++count + ")";
    }
}
