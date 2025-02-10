import static java.lang.System.*;

public class ListFunHouse {
    // Prints the entire list
    public static void print(ListNode list) {
        ListNode current = list;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    // Returns the number of nodes in the list
    public static int nodeCount(ListNode list) {
        int count = 0;
        ListNode current = list;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    // Creates a new node with the same value as the first node and adds it to the list
    public static void doubleFirst(ListNode list) {
        if (list != null) {
            list = new ListNode(list.getValue(), list);
        }
    }

    // Creates a new node with the same value as the last node and adds it to the end
    public static void doubleLast(ListNode list) {
        if (list == null) return;

        ListNode current = list;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new ListNode(current.getValue(), null));
    }

    // Removes every other node from the list
    public static void skipEveryOther(ListNode list) {
        if (list == null) return;

        ListNode current = list;
        while (current != null && current.getNext() != null) {
            current.setNext(current.getNext().getNext());
            current = current.getNext();
        }
    }

    // Sets the value of every x-th node in the list
    public static void setXthNode(ListNode list, int x, Comparable value) {
        if (x <= 0 || list == null) return;

        ListNode current = list;
        int count = 1;

        while (current != null) {
            if (count % x == 0) {
                current.setValue(value);
            }
            current = current.getNext();
            count++;
        }
    }

    // Removes every x-th node in the list
    public static void removeXthNode(ListNode list, int x) {
        if (x <= 1 || list == null) return;

        ListNode current = list;
        ListNode prev = null;
        int count = 1;

        while (current != null) {
            if (count % x == 0) {
                if (prev != null) {
                    prev.setNext(current.getNext());
                } else {
                    list = current.getNext();
                }
            } else {
                prev = current;
            }
            current = current.getNext();
            count++;
        }
    }
}
