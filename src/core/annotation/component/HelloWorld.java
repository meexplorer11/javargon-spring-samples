package core.annotation.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Javargon
 *
 */

@Component //default name will be class name in camel case i.e. helloWorld
@Scope("prototype")
public class HelloWorld{
	
	public void sayHello() {
		System.out.println("Hello World!");
	}
}
