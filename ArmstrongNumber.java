public class ArmstrongNumber{
	public static void main( String[] args){
	int n= 153; //predefined number
	int on=n;
	int r=0;
	// Count number of digits
	int digits=0;
	int temp=n;
	while(temp!=0){
		digits++;
		temp/=10;
	}
	//Calculate sum of digits raised to the power of digits
	temp=n;
	while(temp!=0){
		int digit= temp%10;
		r+= Math.pow(digit,digits);
		temp/=10;
	}
	//Check if armstrong
	if(r==on){
		system.out.println(on+ "is an armstrong number");
	}else{
		system.out.println(on+ "is not a armsgtrong number");
		}
	}
}