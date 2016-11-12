package core.lazyInit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Javargon
 *
 */
public class LazyInitDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("core/lazyInit/applicationContext.xml");
		
		System.out.println("Init now-");
		ctx.getBean("lazy", HelloWorld.class);
	}

}
