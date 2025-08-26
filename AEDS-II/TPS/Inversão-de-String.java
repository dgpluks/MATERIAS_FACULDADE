//TP 2 - Q 3
import java.util.Scanner;
public class TP1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String str = "";
			str = scanner.nextLine();
		while(!str.equals("FIM")){
			for(int i = str.length()-1; i >= 0; i--){
				System.out.print(str.charAt(i));
			}
			System.out.println();
			str = scanner.nextLine();
		}
	}
}
