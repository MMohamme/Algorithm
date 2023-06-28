package de.hska.iwi.ads.sorting;

public abstract class AbstractMergesort<E extends Comparable<E>> implements Sort<E> {
  
  protected E [] b;

  @Override
  public void sort(E [] a) {
    b = a.clone();
    mergesort(a, 0, a.length - 1);
  }

  protected abstract void mergesort(E [] a, int left, int right);  
  
}
