package linkedList.singly;

//LinkedListTester.java
public class Tester {
 public static void main(String[] args) {
     LinkedList trip = new LinkedList();

     // Insert at the end
     System.out.println("\nInsert at the end:");
     trip.insertAtEnd("Chennai", "TN", "600059");
     trip.insertAtEnd("Bangalore", "KT", "700059");
     trip.insertAtEnd("Hyderabad", "TL", "800059");
     trip.insertAtEnd("Mumbai", "MH", "900059");
     trip.traversal();

     // Insert at the beginning
     System.out.println("\nInsert at the beginning:");
     trip.insertAtBeginning("Kochin", "KR", "501254");
     trip.traversal();

     // Insert at a specific index
     System.out.println("\nInsert at index 0:");
     trip.insertAt(0, "Goa", "Goa", "125784");
     trip.traversal();

     System.out.println("\nInsert at the last index (index 6):");
     trip.insertAt(6, "Delhi", "Delhi", "215784");
     trip.traversal();

     System.out.println("\nInsert at index 5:");
     trip.insertAt(5, "Secundrabad", "TL", "412563");
     trip.traversal();

     // Delete from the beginning
     System.out.println("\nDelete at the beginning:");
     trip.deleteAtBegin();
     trip.traversal();

     // Delete from the end
     System.out.println("\nDelete at the end:");
     trip.deleteAtEnd();
     trip.traversal();

     // Delete at a specific index
     System.out.println("\nDelete at index 3:");
     trip.deleteAt(3);
     trip.traversal();

     // Remove by value
     System.out.println("\nRemove by value (Hyderabad):");
     trip.removeAt("Hyderabad");
     trip.traversal();

     System.out.println("\nRemove by value (Non-existent city):");
     trip.removeAt("Pune");
     trip.traversal();

     // Search for a value
     System.out.println("\nSearch for 'Mumbai':");
     trip.search("Mumbai");

     System.out.println("\nSearch for 'Pune':");
     trip.search("Pune");

     // Reverse
     System.out.println("\nReverse:");
     trip.traversal();
     trip.reverse();
     trip.traversal();
 }
}

