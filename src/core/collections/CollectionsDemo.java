package core.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Javargon
 *
 */
public class CollectionsDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("core/collections/applicationContext.xml");
		
		System.out.println("Using collections-");
		CollectionUtil cu = ctx.getBean("cu", CollectionUtil.class);
		cu.printCollection();
	}

}
