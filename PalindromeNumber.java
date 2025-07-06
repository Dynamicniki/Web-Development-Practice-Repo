public class PalindromeNumber{
	public static void main(String [] args){
		int n=121;
		int on=n;
		int r=0;
		while(n!=0){
			int digit=n%10;
			r= r*10+digit;
			n= n/10;
		}
		if(on==r){
			system.out.println(on+ "is a palindrome");
		}else{
			system.out.println(on+ "is naot a palindrome");
		}
	}
}