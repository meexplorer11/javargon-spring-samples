package core.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Javargon
 *
 */
public class LifecycleDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("core/lifecycle/applicationContext.xml");
		ctx.getBean("hworld", HelloWorld.class);
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
