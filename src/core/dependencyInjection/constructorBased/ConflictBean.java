package core.dependencyInjection.constructorBased;

/**
 * 
 * @author Javargon
 *
 */
public class ConflictBean {

	private String param;
	private boolean flag;
	
	public ConflictBean(String param, boolean flag) {
		this.param = param;
		this.flag = flag;
	}
}
