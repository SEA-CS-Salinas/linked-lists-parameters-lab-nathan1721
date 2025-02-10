/**
 * Interface representing a linkable node in a linked list.
 * Author: Nathan Carrillo
 */
public interface Linkable {
    Comparable getValue(); // Returns the value of the node
    Linkable getNext(); // Returns the next node in the list
    void setNext(Linkable next); // Sets the next node in the list
    void setValue(Comparable value); // Sets the value of the node
}
