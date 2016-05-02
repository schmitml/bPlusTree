import java.util.LinkedList;
import java.util.List;

/**
 * Created by schmitml on 5/2/16.
 */
public class BPlusTree {
    private int leafSize;

    public BPlusTree(int leafSize){
        this.leafSize = leafSize;

    }
    
    /**
     * TODO: Implement Size
     * @return number of integers stored in the tree.
     */
    public int size(){
       return 0;
    }

    /**
     * TODO: Implement Insert
     * @param n int to insert
     * @return boolean successful insert
     */
    public boolean insert(int n){
        return false;
    }

    /**
     * TODO: Implement Delete
     * @param n int to insert
     * @return int deleted
     */
    public int delete(int n){
        return 0;
    }


    /**
     * Pointers to leafs
     */
    class Node {
        int length;
        List<Leaf> leafs;

        public Node() {
            this.length = 0;
            leafs = new LinkedList<>();
        }
    }

    /**
     * Holds data
     */
    class Leaf extends Node {
        List<Integer> data;

        public Leaf() {
            this.length = 0;
            data = new LinkedList<>();
        }
    }
}
