package hska.iwi.ads.solution.hashtable;

import de.hska.iwi.ads.dictionary.AbstractHashMap;

public class Hashtable<K extends Comparable<K>,V> extends AbstractHashMap<K, V> {

	public Hashtable(int capacity) {
		super(capacity);
		// TODO Auto-generated constructor stub
	}
	public V get(Object o) {
		K key = (K)o; 						// key wird zu K gecastet
		int i =0;
		int keyHash;
		do {
			keyHash= quadtatischSondiere( i,key);
			if (hashtable[keyHash]!=null&&hashtable[keyHash].getKey()==key) {
				return hashtable[keyHash].getValue();

			}
			i++;
		} while (hashtable[keyHash]!=null&& i<hashtable.length);
		return null;
	}
	

	public V put(K key, V value) {
		V ret;
		int keyHash; 
		int i =0;
		do {
			keyHash = quadtatischSondiere(i, key);	
			
			if (hashtable[keyHash]==null||hashtable[keyHash].getKey()==null) {
				SimpleEntry<K,V> newEntry =  new SimpleEntry<>(key,value);
				hashtable[keyHash] = newEntry;
				return null;
			} else if (hashtable[keyHash].getKey()==key) {
				SimpleEntry<K,V> newEntry =  new SimpleEntry<>(key,value);
				ret = hashtable[keyHash].getValue();
				hashtable[keyHash] = newEntry;
				return ret;
			}
			i++;
		} while (hashtable[keyHash]!=null&&i<hashtable.length);
		throw new de.hska.iwi.ads.dictionary.AbstractDictionary.DictionaryFullException();

	}
	private int quadtatischSondiere(int i, K key) {
		return (key.hashCode()+i*i)%hashtable.length;
	}
	
	
	//public static void main(String[] args) {
	////	Map.put(1, "Gärster");
	//	Map.put(1, "Müller");
	//	Map.put(123, "Riese");
	//	Map.put(1, "Heino");
		
	//	System.out.println(Map.get(1));
	//	System.out.println(Map.get(123));
		
		
	}

//}
