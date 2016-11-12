package core.lifecycle;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 
 * @author Javargon
 *
 */
public class HelloWorld implements InitializingBean, BeanPostProcessor{
	private String message;
	
	public HelloWorld(String message) {
		System.out.println("Constructor - Before setting property......");
		this.message = message;
		System.out.println("Constructor - After  setting property......");
	}
	
	public void sayHello() {
		System.out.println("Hello World!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean - afterPropertiesSet() called");
	}
	
	public void init() {
		System.out.println("XML - init method called");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("postConstruct method called");
	}

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("BeanPostProcessor - postProcessAfterInitialization() called");
		return null;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("BeanPostProcessor - postProcessBeforeInitialization() called");
		return null;
	}
}
