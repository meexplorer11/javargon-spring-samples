package core.lifecycle;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;

public class DisposeBean implements DisposableBean{

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean - destroy() called");
	}
	
	public void xmlDestroy() {
		System.out.println("xml - destroy() called");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("@PreDestroy called");
	}

}
