/**
 * @author Mohammad
 */

package hska.iwi.ads.solution.hashtable;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import hska.iwi.ads.solution.hashtable.Hashtable;

public class HashTableTest {

	private Hashtable<Integer, String> commonTestMap;

	public Hashtable<Integer, String> createMap() {
		return new Hashtable<Integer, String>(20);
	}

	@BeforeEach()
	void setUp() {
		commonTestMap = createMap();
		commonTestMap.put(6, "Sechs");
		commonTestMap.put(3, "Drei");
		commonTestMap.put(1, "Eins");
		commonTestMap.put(7, "Sieben");
		commonTestMap.put(8, "Acht");
		commonTestMap.put(4, "Vier");
		commonTestMap.put(2, "Zwei");
	}

	@Test
	void commonTestDictionary() {
		assertNotNull(commonTestMap);
		assertEquals("Eins", commonTestMap.get(1));
		assertEquals("Zwei", commonTestMap.get(2));
		assertEquals("Drei", commonTestMap.get(3));
		assertEquals("Vier", commonTestMap.get(4));
		assertEquals("Sechs", commonTestMap.get(6));
		assertEquals("Sieben", commonTestMap.get(7));
		assertEquals("Acht", commonTestMap.get(8));
	}

	@Test
	void testNull() {
		commonTestMap = createMap();
		assertNull(commonTestMap.get(123));
		commonTestMap.put(3, "Drei");
		assertNull(commonTestMap.get(55));
	}

	@Test
	void testOverride() {
		assertEquals("Zwei", commonTestMap.put(2, "ZWAI"));
		assertEquals("ZWAI", commonTestMap.put(2, "two"));
		assertEquals("Acht", commonTestMap.put(8, "eight"));
		assertEquals("eight", commonTestMap.get(8));
	}

	@Test
	void testFull() {
		Boolean tester = false;
		commonTestMap = new Hashtable<>(30);
		try {
			for (Integer i = 0; i < 50; i++) {
				commonTestMap.put(i, i.toString());
			}
		} catch (Exception e) {
			tester = true;
			assertTrue(e instanceof de.hska.iwi.ads.dictionary.AbstractDictionary.DictionaryFullException);
		}
		assertTrue(tester);
	}

	@Test
	void testDelete() {
		try {
			commonTestMap.remove(1);
		} catch (Exception e) {
			assertTrue(e instanceof UnsupportedOperationException);
		}
	}

}
