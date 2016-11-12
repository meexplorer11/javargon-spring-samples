package core.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Javargon
 *
 */
public class ScopeDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("core/scope/applicationContext.xml");
		
		HelloWorld hw1 = ctx.getBean("singletonBean", HelloWorld.class);
		HelloWorld hw2 = ctx.getBean("singletonBean", HelloWorld.class);
		System.out.println("(hw1 == hw2) = "+(hw1 == hw2));
		
		Message m1 = ctx.getBean("prototypeBean", Message.class);
		Message m2 = ctx.getBean("prototypeBean", Message.class);
		System.out.println("(m1 == m2) = "+(m1 == m2));
	}

}
