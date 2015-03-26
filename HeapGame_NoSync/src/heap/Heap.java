package heap;

/**
 *
 * @author apavel
 */
public class Heap {
    
    String top;
    
    public Heap() {
    }
    
    public void putOnHeap(String card) {
        top = card;
    }
    
    public String takeFromHeap() {
        return top;
    }
    
}
