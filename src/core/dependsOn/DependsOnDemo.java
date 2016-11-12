package core.dependsOn;

/**
 * 
 * @author Javargon
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependsOnDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("core/dependsOn/applicationContext.xml");
		
		HelloWorld hw = ctx.getBean("hworld", HelloWorld.class);
		Message message = ctx.getBean("message", Message.class);
		System.out.println("Done !");
	}

}
