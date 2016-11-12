package core.namingBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Javargon
 *
 */
public class NamingBeanDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("core/namingBean/applicationContext.xml");
		
		//get by fully qualified class name, when there is no name or id given in applicationContext.xml
		System.out.println("Accessing by class name-");
		HelloWorld hw1 = ctx.getBean("core.namingBean.HelloWorld", HelloWorld.class);
		hw1.sayHello();

		//get by id
		System.out.println("\nAccessing by ID-");
		HelloWorld hw2 = ctx.getBean("id1", HelloWorld.class);
		hw2.sayHello();
		
		//get by either name when multiple names are given
		System.out.println("\nAccessing by name-");
		HelloWorld hw3 = ctx.getBean("name1", HelloWorld.class);
		hw3.sayHello();
		HelloWorld hw4 = ctx.getBean("name2", HelloWorld.class);
		hw4.sayHello();
	}

}
