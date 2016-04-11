package abdul.cdi.examples;
import javax.inject.Inject;

public class CDITester {

	private @Inject Hello hello;

    public String print() {
        System.out.println( hello.sayHello("Ramki"));
		return hello.sayHello("Abdul");
    }
    
    

}
