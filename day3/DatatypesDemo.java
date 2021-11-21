package day3;

public class DatatypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a,b,c,d;
		
		a=500;
		b=2700;
		c=900;
		d=400;
		int gtNumner=getMaxnumber(a, b);
		gtNumner=getMaxnumber(gtNumner, c);
		gtNumner=getMaxnumber(gtNumner, b);
		gtNumner=getMaxnumber(gtNumner,d);
		
		System.out.println(gtNumner);
		
		
		
		
	}
	
	private static int getMaxnumber(int a, int b) {
		if(a>b) {
			return a;
			
		}else {
			return b;
		}
		
	}

}
