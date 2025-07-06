public class LeapYearCheck{
	public static void main(String[] args){
		int y=2024;
		if((y%4==0&&y%100!=0)||(y%400==0)){
			system.out.println(y+"is a leap year");
		}else{
			system.out.println(y+ "is not a leap year  ");
		}
	}
}