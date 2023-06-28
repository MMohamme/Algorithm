/**
 * @author Mohammad
 */

package de.hska.iwi.ads.solution.tree;

import de.hska.iwi.ads.dictionary.AbstractBinaryTree;

public class BinarySearchTree<K extends Comparable<K>, V> extends AbstractBinaryTree<K, V> {
    public V put(K key, V value) {
        int compare = 0;
        Node newnode = new Node(key, value);

        Node checknode = root;
        if (root == null) {
            root = newnode;
            this.size = 1;
            return null;
        }
        while (true) {
            compare = checknode.entry.getKey().compareTo(key);
            if (compare == 0) {
                V ret = checknode.entry.getValue();
                checknode.entry.setValue(value);
                return ret;
            } else {
                if (compare < 0) {
                    if (checknode.left == null) {
                        checknode.left = newnode;
                        this.size++;
                        return null;
                    } else {
                        checknode = checknode.left;
                    }
                } else {
                    if (checknode.right == null) {
                        checknode.right = newnode;
                        this.size++;
                        return null;
                    } else {
                        checknode = checknode.right;
                    }
                }
            }
        }
    }

    public V get(Object o) {
        K key = (K)o;
        int compare;
        Node checknode = root;
        while (true) {
            if (checknode == null) {
                return null;
            }
            compare = checknode.entry.getKey().compareTo(key);
            if (compare == 0) {
                return checknode.entry.getValue();
            } else if (compare < 0) {
                checknode = checknode.left;
            } else {
                checknode = checknode.right;
            }
        }
    }
    //public static void main(String[] args) {
//        BinarySearchTree<Integer, String> tree = new BinarySearchTree<>();
//        tree.put(1, "eins");
//        System.out.println(tree.get(1));
//    }
}
