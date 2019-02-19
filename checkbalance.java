import java.util.Scanner;
public class checkbalance{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String balance;
		System.out.print("Enter a string: ");
		balance = sc.nextLine();

		CheckBalance(balance);
	}
	public static void CheckBalance(String S){
		int pcount = 0;
		int ccount = 0;
		int scount = 0;
		for(int i = 0; i < S.length(); i++){
			if(S.charAt(i) == '('){
				pcount++;
			}
			if(S.charAt(i) == ')'){
				pcount--;
			}
			if(S.charAt(i) == '{'){
				ccount++;
			}
			if(S.charAt(i) == '}'){
				ccount--;
			}
			if(S.charAt(i) == '['){
				scount++;
			}
			if(S.charAt(i) == ']'){
				scount--;
			}
		}
		if(pcount == 0 && ccount == 0 && scount == 0){
			System.out.println("String Balanced");
		}
		else{
			System.out.println("String Unbalanced");
		}
	}
}
