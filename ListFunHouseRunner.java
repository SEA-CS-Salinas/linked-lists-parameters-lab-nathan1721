import static java.lang.System.*;

public class ListFunHouseRunner {
    public static void main(String[] args) {
        ListNode z = new ListNode("go",
                new ListNode("on",
                        new ListNode("at",
                                new ListNode("34",
                                        new ListNode("2.1",
                                                new ListNode("-a-2-1",
                                                        new ListNode("up",
                                                                new ListNode("over", null)))))))));

        out.println("Lab15b Test Code\n\n");

        out.println("Original list values\n");
        ListFunHouse.print(z);
        out.println();

        out.println("num nodes = " + ListFunHouse.nodeCount(z));

        out.println("\nList values after calling nodeCount\n");
        ListFunHouse.print(z);
        out.println();

        ListFunHouse.doubleFirst(z);
        out.println("\nList values after calling doubleFirst\n");
        ListFunHouse.print(z);
        out.println();

        ListFunHouse.doubleLast(z);
