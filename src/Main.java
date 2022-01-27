import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print("Type a number: ");
			Integer number = sc.nextInt();
			list.add(number);
		}
	
		for(int i = 0 ; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		
		sc.close();
	}
}
