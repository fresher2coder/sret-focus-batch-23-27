package linkedList.singly;

//LinkedList.java
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
         head = tail = newNode;
     } else {
         newNode.next = head;
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

     Node prev = null;
     Node current = head;
     while (index > 0) {
         prev = current;
         current = current.next;
         index--;
     }
     prev.next = newNode;
     newNode.next = current;
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
         Node current = head;
         while (current.next != tail) {
             current = current.next;
         }
         current.next = null;
         tail = current;
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

     Node prev = null;
     Node current = head;
     while (index > 0) {
         prev = current;
         current = current.next;
         index--;
     }
     prev.next = current.next;
     size--;
 }

 // Remove node by city name
 public void removeAt(String value) {
     int index = search(value);
     if (index != -1) {
         deleteAt(index);
     } else {
         System.out.println("Value '" + value + "' not found in the list.");
     }
 }

 // Search by city name
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

 // Reverse list
 public void reverse() {
     Node prev = null;
     Node current = head;
     Node nextNode = (head != null) ? head.next : null;

     while (nextNode != null) {
         current.next = prev;
         prev = current;
         current = nextNode;
         nextNode = nextNode.next;
     }
     if (current != null) {
         current.next = prev;
         tail = head;
         head = current;
     }
 }

 // Traversal
 public void traversal() {
     Node current = head;
     while (current != null) {
         System.out.print(current.city + " -> ");
         current = current.next;
     }
     System.out.println("None");
 }

 public boolean isEmpty() {
     return head == null;
 }

 private void createLinkedList(Node newNode) {
     head = tail = newNode;
 }
}

