package abdul.cdi.examples;

import java.math.BigDecimal;

import org.cdisource.beancontainer.BeanContainer;
import org.cdisource.beancontainer.BeanContainerManager;


public class AtmMain {

	static BeanContainer beanContainer =  BeanContainerManager.getInstance();

	public static void main(String[] args) throws Exception {
		/*AutomatedTellerMachine atm = (AutomatedTellerMachine) beanContainer
				.getBeanByName("atm");*/

		AutomatedTellerMachine atm = beanContainer.getBeanByType(AutomatedTellerMachine.class);
		atm.deposit(new BigDecimal("1.00"));

	}

}
