package abdul.cdi.examples;

import javax.enterprise.context.RequestScoped;

 


public class HelloImpl implements Hello {

    public HelloImpl() {
        System.out.println("Helli Impl Constructor is called");
    }



    @Override
    public String sayHello(String name) {
        return "Hello "+name;
    }

}
