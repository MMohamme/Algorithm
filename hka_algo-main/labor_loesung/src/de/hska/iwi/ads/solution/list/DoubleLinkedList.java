
/**
 * @author Mohammad
 */

package de.hska.iwi.ads.solution.list;

import de.hska.iwi.ads.dictionary.AbstractDoubleLinkedList;
import java.util.AbstractMap.SimpleEntry;

public class DoubleLinkedList<K extends Comparable<K>, V> extends AbstractDoubleLinkedList<K, V> {


	public DoubleLinkedList() {
		size=0;
	}

    public V get(Object o) {
        @SuppressWarnings("unchecked")
        K searchkey = (K) o;
        ListElement test =  find(searchkey); 
        if(test == null) {
        	return null;
        }
        else {
        	return test.entry.getValue();
        }
    }

    private ListElement find(K key) {
        ListElement a = null;
        ListElement counter = this.head;
        while (true) {
            if (counter.entry.getKey().compareTo(key) == 0) {
                a = counter;
                break;
            }
            if (counter.next == null) {
                break;
            } else {
                counter = counter.next;
            }
        }
        return a;
    }

    public V put(K key, V value) {

        if (this.head == null) {
        	size++;
            SimpleEntry<K, V> newentry = new SimpleEntry<>(key, value);
            ListElement newelement = new ListElement(newentry, null, this.head);
            this.head = newelement;
            return null;
        }
        V a = null;
        ListElement checker = find(key);
        if (checker != null) {
        	
            a = checker.entry.getValue();
            checker.entry.setValue(value);
        } else {
        	size++;
            SimpleEntry<K, V> newentry = new SimpleEntry<>(key, value);
            ListElement newelement = new ListElement(newentry, null, this.head);
            newelement.next = this.head;
            this.head.previous = newelement;
            this.head = newelement;
        }
        return a;
    }

    // public static void main(String[] args) {
    //     DoubleLinkedList<Integer, String> testlist = new DoubleLinkedList<>();
    //     testlist.put(8, "hello world");
    //     testlist.put(9, "neun");
    //     testlist.put(2, "zweiu");
    //     testlist.put(1, "eins");
    //     testlist.put(4, "view");
    //     System.out.println(testlist.get(8));
    // }
}
