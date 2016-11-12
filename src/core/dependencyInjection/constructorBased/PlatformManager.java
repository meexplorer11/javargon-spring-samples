package core.dependencyInjection.constructorBased;

public class PlatformManager {

	private PlatformManager() {
		//
	}
	
	public static PlatformManager getInstance(String name, int version) {
		System.out.println("Platform name- "+name+", version-"+version);
		return new PlatformManager();
	}
}
