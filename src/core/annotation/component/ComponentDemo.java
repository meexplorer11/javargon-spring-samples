package core.annotation.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Javargon
 *
 */
public class ComponentDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("core/annotation/component/applicationContext.xml");
		HelloWorld h1 = ctx.getBean("helloWorld", HelloWorld.class);
		HelloWorld h2 = ctx.getBean("helloWorld", HelloWorld.class);
		System.out.println(h1 == h2);
	}

}
