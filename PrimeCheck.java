public class PrimeCheck{
	public static void main(String[] args){
		int n= 29;
		boolean isPrime=True;
		if (n<=1){
			isPrime=false;
		}else{
			for(int i=2;i<=n/2;i++){
				if(n%i==0){
					isPrime=false;
					break;
				}
			}
		}
		if(isPrime){
			system.out.println(n+"is a prime number");
		}else{
			system.out.println(n+"is not a prime number");
		}
	}
}