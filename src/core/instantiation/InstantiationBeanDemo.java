package core.instantiation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Javargon
 *
 */
public class InstantiationBeanDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("core/instantiation/applicationContext.xml");
		
		System.out.println("Instantiation with a constructor-");
		HelloWorld hw = ctx.getBean("helloWorld", HelloWorld.class);
		hw.sayHello();
		
		System.out.println("\nInstantiation with a static factory method-");
		PlatformManager manager = ctx.getBean("manager", PlatformManager.class);
		manager.doSomething();

		System.out.println("\nInstantiation with a instance factory method-");
		HelloWorld hworld = ctx.getBean("hworld", HelloWorld.class);
		hworld.sayHello();
	}

}
