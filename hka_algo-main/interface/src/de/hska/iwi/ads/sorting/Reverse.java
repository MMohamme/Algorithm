package de.hska.iwi.ads.sorting;



public interface Reverse<E extends Comparable<E>> {

  /**
 
   
   * @param a    Feld, in dem die Werte umgedreht werden sollen
   * @param from Anfangsindex mit 0 <= from < to
   * @param to   Endindex mit from < to <= a.length - 1
   */
  void reverse(E [] a, int from, int to);
}
