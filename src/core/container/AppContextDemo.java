package core.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Javargon
 *
 */
public class AppContextDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("core/container/applicationContext.xml");
		HelloWorld hw = ctx.getBean("helloBean", HelloWorld.class);
		hw.sayHello();
	}

}
