package day4;

public class ElseIfDemo {
 
   public static void main(String[] args) {
	   int bloodPressureNumebr=110;
	   if(bloodPressureNumebr>120) {
		   System.out.println("High blood pressure");
	   }
	   else if(bloodPressureNumebr>90) {
		   System.out.println("Above Normal.");
	   }
	   else if(bloodPressureNumebr>70) {
		   System.out.println("Normal.");
		   
	   }else {
		   System.out.println("Low.");
	   }
	   
	   System.out.println("======Done=============");
	
}
}
