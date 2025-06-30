package array;

public class Array1D {
    private int[] arr;

    // Constructor
    public Array1D(int[] initialArray) {
        this.arr = initialArray;
    }

    // Display method
    public void printArray() {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // 1. Access element
    public int getElementAt(int index) {
        if (index < 0 || index >= arr.length)
            throw new IndexOutOfBoundsException("Invalid index");
        return arr[index];
    }

    // 2. Insert at beginning
    public void insertAtBeginning(int value) {
        int[] newArr = new int[arr.length + 1];
        newArr[0] = value;
        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        arr = newArr;
    }

    // 3. Insert at end
    public void insertAtEnd(int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = value;
        arr = newArr;
    }

    // 4. Insert at specific index
    public void insertAtIndex(int index, int value) {
        if (index < 0 || index > arr.length)
            throw new IndexOutOfBoundsException("Invalid index");

        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = value;
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        arr = newArr;
    }

    // 5. Delete from beginning
    public void deleteFromBeginning() {
        if (arr.length == 0) return;
        int[] newArr = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        arr = newArr;
    }

    // 6. Delete from end
    public void deleteFromEnd() {
        if (arr.length == 0) return;
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    // 7. Delete from specific index
    public void deleteFromIndex(int index) {
        if (index < 0 || index >= arr.length)
            throw new IndexOutOfBoundsException("Invalid index");

        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        arr = newArr;
    }

    // 8. Left rotate by 1
    public void leftRotate() {
        if (arr.length == 0) return;
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
    }

    // 9. Right rotate by 1
    public void rightRotate() {
        if (arr.length == 0) return;
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    // Main method to test all operations
    public static void main(String[] args) {
    	
    	int []a;
    	int b[] = new int[4];
    	
        int[] initial = {10, 20, 30};
        Array1D ops = new Array1D(initial);

        System.out.println("Initial Array:");
        ops.printArray();

        System.out.println("Insert at Beginning (5):");
        ops.insertAtBeginning(5);
        ops.printArray();

        System.out.println("Insert at End (40):");
        ops.insertAtEnd(40);
        ops.printArray();

        System.out.println("Insert at Index 2 (99):");
        ops.insertAtIndex(2, 99);
        ops.printArray();

        System.out.println("Delete from Beginning:");
        ops.deleteFromBeginning();
        ops.printArray();

        System.out.println("Delete from End:");
        ops.deleteFromEnd();
        ops.printArray();

        System.out.println("Delete from Index 2:");
        ops.deleteFromIndex(2);
        ops.printArray();

        System.out.println("Left Rotation:");
        ops.leftRotate();
        ops.printArray();

        System.out.println("Right Rotation:");
        ops.rightRotate();
        ops.printArray();
    }
}
