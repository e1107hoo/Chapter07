package chapter07;

import java.util.ArrayList;

/**
 * @author mind
 * @param <E> 
 *
 */
public class LRUCache<E> {
	
	final ArrayList<String>	keys	= new ArrayList<String>();
	
	
	/**
	 * @param string
	 * @param string2
	 */
	public void put(String key, E item) {
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
		
		return null;
	}
	
}
