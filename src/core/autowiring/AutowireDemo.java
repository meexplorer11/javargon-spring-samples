package core.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Javargon
 *
 */
public class AutowireDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("core/autowiring/applicationContext.xml");
		System.out.println("Autowire mode- None");
		HelloWorld hw1 = ctx.getBean("hworld1", HelloWorld.class);
		hw1.sayHello();
		
		System.out.println("\nAutowire mode- By Name");
		HelloWorld hw2 = ctx.getBean("hworld2", HelloWorld.class);
		hw2.sayHello();
		
		System.out.println("\nAutowire mode- By Type");
		HelloWorld hw3 = ctx.getBean("hworld3", HelloWorld.class);
		hw3.sayHello();
		
		System.out.println("\nAutowire mode- Constructor");
		HelloWorld hw4 = ctx.getBean("hworld4", HelloWorld.class);
		hw4.getRecipient();
	}

}
