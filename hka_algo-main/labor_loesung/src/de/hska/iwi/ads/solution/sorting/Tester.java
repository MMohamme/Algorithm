/**
 * @author scbe1048
 */

package de.hska.iwi.ads.solution.sorting;

public class Tester implements Comparable<Tester> {

	public int x;
	public int y;
	
	
	public Tester(int x, int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public int compareTo(Tester o) {
		return this.x-o.x;
		

	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Tester) {
			Tester u = (Tester) o;
			if(this.x== u.x &&this.y==u.y) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
			}
		
	}

}
