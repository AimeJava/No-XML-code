package my;

import my.web.SpringWeb;

public class SpringWebInitializer implements SpringWeb {
    @Override
    public void config() {
        System.out.println("hello world");
    }
}
