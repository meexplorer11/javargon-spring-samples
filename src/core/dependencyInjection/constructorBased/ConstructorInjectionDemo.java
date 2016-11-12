package core.dependencyInjection.constructorBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Javargon
 *
 */
public class ConstructorInjectionDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("core/dependencyInjection/constructorBased/applicationContext.xml");
		
		System.out.println("Constructor injection-");
		HelloWorld hw1 = ctx.getBean("hworld", HelloWorld.class);
		hw1.sayHello();
		
		System.out.println("\nConstructor argument resolution-");
		ConflictBean byType = ctx.getBean("usingTypeValue", ConflictBean.class);
		ConflictBean byIndex = ctx.getBean("usingIndexValue", ConflictBean.class);
		ConflictBean byName = ctx.getBean("usingNameValue", ConflictBean.class);
		System.out.println("All instantiated and injected successfully.");
		
		System.out.println("Passing parameters to static factory method using constructor-arg");
		PlatformManager manager = ctx.getBean("manager", PlatformManager.class);
	}

}
