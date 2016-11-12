package core.dependencyInjection.setterBased;

/**
 * 
 * @author Javargon
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("core/dependencyInjection/setterBased/applicationContext.xml");
		
		System.out.println("Constructor injection-");
		HelloWorld hw1 = ctx.getBean("hworld", HelloWorld.class);
		hw1.sayHello();
	}

}
