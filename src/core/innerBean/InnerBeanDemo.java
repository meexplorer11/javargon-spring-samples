package core.innerBean;

/**
 * 
 * @author Javargon
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeanDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("core/innerBean/applicationContext.xml");
		
		System.out.println("Accessing Inner Bean-");
		HelloWorld hw1 = ctx.getBean("hworld", HelloWorld.class);
		hw1.sayHello();
	}

}
