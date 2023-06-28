/**
 * @author Mohammad
 */


package de.hska.iwi.ads.solution.list;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.dictionary.MapTest;

class TestDoubleLinkedList extends de.hska.iwi.ads.dictionary.MapTest {

	private Map<Integer, String> dictionary;
	@Override
	public Map<Integer,String> createMap() {
		return new DoubleLinkedList<>();
	}
	
	@Test
	void test1() {
	    dictionary = createMap();
	    
	    dictionary.put(5, "Fünf");
	    dictionary.put(3, "Drei");
	    dictionary.put(7, "Vier");
	    dictionary.put(11, "Elf");
	    dictionary.put(1, "Eins");
	    dictionary.put(9, "Neun");
	    assertEquals(6, dictionary.size());
	    assertEquals("Fünf", dictionary.get(5));
	  }

}

