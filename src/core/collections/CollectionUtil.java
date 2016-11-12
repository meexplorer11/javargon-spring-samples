package core.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author Javargon
 *
 */
public class CollectionUtil {
	private List<String> strList;
	private List<Message> refList;
	private Set<String> strSet;
	private Set<Message> refSet;
	private Map<String, String> strMap;
	private Map<String, Message> refMap;
	
	public void setStrList(List<String> strList) {
		this.strList = strList;
	}
	public void setRefList(List<Message> refList) {
		this.refList = refList;
	}
	public void setStrSet(Set<String> strSet) {
		this.strSet = strSet;
	}
	public void setRefSet(Set<Message> refSet) {
		this.refSet = refSet;
	}
	public void setStrMap(Map<String, String> strMap) {
		this.strMap = strMap;
	}
	public void setRefMap(Map<String, Message> refMap) {
		this.refMap = refMap;
	}
	
	public void printCollection() {
		System.out.println("String List- "+Arrays.toString(strList.toArray()));
		System.out.println("Ref List- "+Arrays.toString(refList.toArray()));
		System.out.println("String Set- "+Arrays.toString(strSet.toArray()));
		System.out.println("Ref Set- "+Arrays.toString(refSet.toArray()));
		System.out.println("String Map- "+strMap.get("key"));
		System.out.println("Ref Map- "+refMap.get("key"));
	}
}
