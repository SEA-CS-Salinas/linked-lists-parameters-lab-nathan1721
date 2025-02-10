import static java.lang.System.*;

/**
 * Runner class to test ListFunHouse methods.
 * Author: Nathan Carrillo
 */
public class ListFunHouseRunner {
    public static void main(String[] args) {
        // Create a linked list with sample values
        ListNode z = new ListNode("go",
                new ListNode("on",
                        new ListNode("at",
                                new ListNode("34",
                                        new ListNode("2.1",
                                                new ListNode("-a-2-1",
                                                        new ListNode("up",
                                                                new ListNode("over", null)))))))));

        out.println("Lab15b Test Code\n\n");

        // Print the original list
        out.println("Original list values");
        ListFunHouse.print(z);
        out.println();

        // Count and display the number of nodes
        out.println("num nodes = " + ListFunHouse.nodeCount(z));

        out.println("\nList values after calling nodeCount");
        ListFunHouse.print(z);
        out.println();

        // Double the first node
        ListFunHouse.doubleFirst(z);
        out.println("\nList values after calling doubleFirst");
        ListFunHouse.print(z);
        out.println();

        // Double the last node
        ListFunHouse.doubleLast(z);
        out.println("\nList values after calling doubleLast");
        ListFunHouse.print(z);
        out.println();

        // Remove every second node
        ListFunHouse.removeXthNode(z, 2);
        out.println("\nList values after calling removeXthNode(2)");
        ListFunHouse.print(z);
        out.println();

        // Set every second node's value to "one"
        ListFunHouse.setXthNode(z, 2, "one");
        out.println("\nList values after calling setXthNode(2, one)");
        ListFunHouse.print(z);
        out.println();
    }
}
