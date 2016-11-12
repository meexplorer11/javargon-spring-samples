package core.annotation.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Javargon
 *
 */
public class AutowiredDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("core/annotation/autowired/applicationContext.xml");
		HelloWorld hw = ctx.getBean("hworld", HelloWorld.class);
		hw.printAll();
	}

}
