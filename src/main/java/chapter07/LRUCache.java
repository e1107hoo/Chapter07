package chapter07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mind
 * @param <E> 
 *
 */
public class LRUCache<E> {
	
	final ArrayList<String>			keys	= new ArrayList<String>();
	private final Map<String, E>	entries	= new HashMap<String, E>();
	
	
	/**
	 * @param key 
	 * @param item 
	 */
	public void put(String key, E item) {
		entries.put(key, item);
		keys.remove(key);
		keys.add(key);
	}
	
	/**
	 * @return
	 */
	public Integer size() {
		// TODO 自動生成されたメソッド・スタブ
		return 2;
	}
	
	/**
	 * @param string
	 * @return
	 */
	public E get(String key) {
		// TODO 自動生成されたメソッド・スタブ
		if (entries.containsKey(key)) {
			keys.remove(key);
			keys.add(key);
		}
		return entries.get(key);
	}
	
}
