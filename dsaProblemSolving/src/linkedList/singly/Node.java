package linkedList.singly;

//Node.java
public class Node {
 String city;
 String state;
 String pincode;
 Node next;

 public Node(String city, String state, String pincode) {
     this.city = city;
     this.state = state;
     this.pincode = pincode;
     this.next = null;
 }
}

