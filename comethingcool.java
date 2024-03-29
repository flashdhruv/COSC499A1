import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
public class comethingcool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test1());
		// this is a comment
	}
	
	public static boolean test1() {
		int output = digitSquareSum(7);
		if(output != Math.pow(7, 2)) {
			return false;
		}
		else {
			return true;
		}
	}

	public static int digitSquareSum(int n) {
		int temp = n;
		int length = String.valueOf(temp).length();
		int counter = 1;
		int sum = 0;
		
		if(length == 1) {
			return (int) Math.pow(n, 2);
		}
		while (counter <= length) {
			if(counter == 1) {
				int digit = n / (int)(Math.pow(10, length - counter));
				sum += Math.pow(digit, 2);
			}else {
				 int digit = (int) ((n / (Math.pow(10, length - counter))) % 10);
				
				sum += Math.pow(digit, 2);
			}
			counter++;
		}
		return sum;
		
    }

	public static File questionOne() throws Exception {
    	Map<Integer, Integer> map = new HashMap<>();
    	for (int i = 1; i <= 500; i++) {
    		map.put(i , digitSquareSum(i));
    	}
    	
    	    	
    	File file = new File("qhr.csv");
    	try {
    		FileWriter outputfile = new FileWriter(file,true);
    		
    		BufferedWriter bw = new BufferedWriter(outputfile);
    		PrintWriter pw = new PrintWriter(bw);
    		
    		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
    			pw.println(entry.getKey() + " " + entry.getValue());
    		}
    		pw.close();
    	}catch(Exception E) {
    		
    	}
		return file;
        
    }

}
