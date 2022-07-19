
import java.util.Scanner;

public class MasterTheorem{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arrStr  = sc.nextLine().split(" ");
		int[] arrInt = changeTypeToInteger(arrStr);
		masterTheorem(arrInt);;
 		sc.close();
	}
	
	public static void masterTheorem(int[] arrInt ) {
		double log = Math.log(arrInt[0]) / Math.log(arrInt[1]);
		
		if(log > arrInt[2]) {
			System.out.println("T(n) = theta(n * log n)");
		}else if(log < arrInt[2]) {
			System.out.println("T(n) = theta(n**"+ arrInt[2]+")");
		}else {
			System.out.println("T(n) = theta(n**"+ arrInt[2] +" * log n)");
		}
	}
	
	public static int[] changeTypeToInteger(String[] arrayStr) {
		int[] ArrayInt = new int[arrayStr.length];
		for (int i = 0; i < ArrayInt.length; i++) {
			ArrayInt[i] = Integer.parseInt(arrayStr[i]);
		}
		return ArrayInt;
	}
	
	
	
	
	
}
