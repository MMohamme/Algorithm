/**
 * @author wejo1037
 */

package de.hska.iwi.ads.solution.tree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;





public class BinarySearchTreeTest extends de.hska.iwi.ads.dictionary.MapTest {

    private Map<Integer, String> tree;

	@Override
	public Map<Integer, String> createMap() {
		return new BinarySearchTree<Integer, String>();
	}

    
    @BeforeEach()
	void setUp2() {
		tree = createMap();
		tree.put(6, "Sechs");
		tree.put(3, "Drei");
		tree.put(1, "Eins");
		tree.put(7, "Sieben");
		tree.put(8, "Acht");
		tree.put(4, "Vier");
		tree.put(2, "Zwei");
		//System.out.println(tree);
	}
    @Test
	void commonTestDictionary2() {
		assertNotNull(tree);
		assertEquals("Eins", tree.get(1));
	
	}

}