package recursion;

public class TowerOfHanoi {

    // Recursive method to solve Tower of Hanoi
    public void toh(char src, char aux, char des, int disk) {
    	
    	if(disk==0)
    		return;
    	
    	toh(src, des, aux, disk-1);
    	System.out.println("Move disk" + disk + " from " + src + " to " + des);
    	toh(aux, src, des, disk-1);
        
    }

    public static void main(String[] args) {
        TowerOfHanoi toh = new TowerOfHanoi();

        int numDisks = 3;
        
        toh.toh('A', 'B', 'C', numDisks);
       
    }
}

