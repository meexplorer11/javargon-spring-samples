package core.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Javargon
 *
 */
public class InheritanceDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("core/inheritance/applicationContext.xml");
		
		//Can't get abstract bean from context
		/*Message m = ctx.getBean("message", Message.class);
		m.message();*/
		
		MailMessage mail = ctx.getBean("mail", MailMessage.class);
		mail.message();
	}

}
