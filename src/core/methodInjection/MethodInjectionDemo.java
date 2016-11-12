package core.methodInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Javargon
 *
 */
public class MethodInjectionDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("core/methodInjection/applicationContext.xml");
		
		HelloWorld hw = ctx.getBean("singletonBean", HelloWorld.class);
		
		Message m1 = hw.createMessage();
		Message m2 = hw.createMessage();
		System.out.println("(m1 == m2) = "+(m1 == m2));
	}

}
