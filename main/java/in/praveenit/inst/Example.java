package in.praveenit.inst;

public class Example {
	
	    static int count ;

	    // Static Method
	    static void displayCount() {
	        System.out.println("Count: " + count);
	    }

	    public static void main(String[] args) {
	    	//Example.count;
	        //Example.count = 5;  // Access static variable using class name
	        displayCount(); // Calling static method without object
	    }
	}


