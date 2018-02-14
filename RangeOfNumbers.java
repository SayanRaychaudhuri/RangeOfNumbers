import java.util.*;
public class RangeOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Start? ");
		String start = input.nextLine();
		
		System.out.print("End? ");
		String end = input.nextLine();
		
		int Start = Integer.valueOf(start);
		int End = Integer.valueOf(end);
		
		boolean ascending = Start<=End;
		boolean descending = Start>=End;
		String numString1 = "";
		String numString2 = "";
		
			if (ascending) {
				for (int i=Start;i<=End;i++) {
					numString1 += String.valueOf(i)+", ";
				}
				System.out.print(numString1.substring(0,numString1.length()-2));
			} else if (descending){
				for (int j=Start;j>=End;j--) {
					numString2 += String.valueOf(j)+", ";
				}
				System.out.println(numString2.substring(0,numString2.length()));
			}
	}
}