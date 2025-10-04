package linkedList.doubly;

//DoublyLinkedList.java
public class LinkedList {
 private Node head;
 private Node tail;
 private int size;

 public LinkedList() {
     this.head = null;
     this.tail = null;
     this.size = 0;
 }

 // Insert at beginning
 public void insertAtBeginning(String city, String state, String pincode) {
     Node newNode = new Node(city, state, pincode);
     if (head == null) {
         createLinkedList(newNode);
     } else {
         newNode.next = head;
         head.prev = newNode;
         head = newNode;
     }
     size++;
 }

 // Insert at end
 public void insertAtEnd(String city, String state, String pincode) {
     Node newNode = new Node(city, state, pincode);
     if (isEmpty()) {
         createLinkedList(newNode);
     } else {
         tail.next = newNode;
         newNode.prev = tail;
         tail = newNode;
     }
     size++;
 }

 // Insert at index
 public void insertAt(int index, String city, String state, String pincode) {
     Node newNode = new Node(city, state, pincode);

     if (isEmpty()) {
         createLinkedList(newNode);
         return;
     }

     if (index == 0) {
         insertAtBeginning(city, state, pincode);
         return;
     }

     if (index >= size) {
         insertAtEnd(city, state, pincode);
         return;
     }

     Node current = head;
     while (index > 0) {
         current = current.next;
         index--;
     }

     current.prev.next = newNode;
     newNode.prev = current.prev;
     newNode.next = current;
     current.prev = newNode;

     size++;
 }

 // Delete at end
 public void deleteAtEnd() {
     if (isEmpty()) {
         System.out.println("The list is empty, nothing to delete.");
         return;
     }

     if (head == tail) {
         head = tail = null;
     } else {
         tail = tail.prev;
         tail.next = null;
     }
     size--;
 }

 // Delete at beginning
 public void deleteAtBegin() {
     if (isEmpty()) {
         System.out.println("The list is empty, nothing to delete.");
         return;
     }

     if (head == tail) {
         head = tail = null;
     } else {
         head = head.next;
         head.prev = null;
     }
     size--;
 }

 // Delete at index
 public void deleteAt(int index) {
     if (isEmpty()) {
         System.out.println("The list is empty, nothing to delete.");
         return;
     }

     if (index == 0) {
         deleteAtBegin();
         return;
     }

     if (index >= size) {
         deleteAtEnd();
         return;
     }

     Node current = head;
     while (index > 0) {
         current = current.next;
         index--;
     }

     current.prev.next = current.next;
     current.next.prev = current.prev;

     size--;
 }

 // Remove by value (city)
 public void removeAt(String value) {
     int index = search(value);
     if (index != -1) {
         deleteAt(index);
     } else {
         System.out.println("Value '" + value + "' not found in the list.");
     }
 }

 // Search by city
 public int search(String value) {
     if (isEmpty()) {
         System.out.println("The list is empty.");
         return -1;
     }

     Node current = head;
     int index = 0;
     while (current != null) {
         if (current.city.equals(value)) {
             System.out.println("Value '" + value + "' found at index " + index + ".");
             return index;
         }
         current = current.next;
         index++;
     }
     System.out.println("Value '" + value + "' not found in the list.");
     return -1;
 }

 // Traversal (forward + backward)
 public void traversal() {
     System.out.print("Forward: ");
     Node current = head;
     while (current != null) {
         System.out.print(current.city + " -> ");
         current = current.next;
     }
     System.out.println("None");

     System.out.print("Backward: ");
     current = tail;
     while (current != null) {
         System.out.print(current.city + " -> ");
         current = current.prev;
     }
     System.out.println("None");
 }

 // Helpers
 public boolean isEmpty() {
     return head == null;
 }

 private void createLinkedList(Node newNode) {
     head = tail = newNode;
 }
}

