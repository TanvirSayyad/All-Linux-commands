package mobile.p2;

import java.util.Scanner;

class buy{
	
	String price;
	String name;
	
}
class sell extends buy{
	int old;
	
}
public class Mobile {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
		
		buy by1=new buy();
		buy by2=new buy();
		buy by3=new buy();
		buy by4=new buy();
		buy by5=new buy();
		
		by1.name="iphone";
		by2.name="samsung";
		by3.name="lava";
		by4.name="notthing";
		by1.price="87800";
		by2.price="25345";
		by3.price="8700";
		by4.price="25245";
		
		sell s1=new sell();
		sell s2=new sell();
		
		sell s3=new sell();
		sell s4=new sell();
		s1.name="iphone";
		s2.name="realme";
		s3.name="nothing";
		s4.name="lava";
		
		s1.price="30000";
		s2.price="4000";
		s3.price="9000";
		s4.price="2000";
		while(true) {
		int choice;
		System.out.println("choice what you want");
		System.out.println(" 1.buy  and 2.sell ");
		choice=sc.nextInt();
		
		
		if(choice==1) {
			System.out.println("welcome in buy mobile");
			System.out.println("1.iphone");
			System.out.println("2.samsung");
			System.out.println("3.lava");
			System.out.println("4.nothing");
			
			int n;
			n=sc.nextInt();
			
		if(n==1) {
			System.out.println("the price of iphone"+by1.price);
		}else if(n==2) {
			System.out.println("price of samsung"+by2.price);
			
			
		}else if(n==3) {
			System.out.println("priuce of lava"+by3.price);
		}else if (n==4) {
			System.out.println("price of nothhing"+by4.price);
			
		}else System.out.println("enter valid option");
			
		}else if(choice==2) {
			
			
			
			System.out.println("welcome in selling mobile");
			System.out.println("press_1.iphone");
			System.out.println("press_2.realme");
			System.out.println("press_3.nothing");
			System.out.println("press_4.lava");
			
			int n=sc.nextInt();
			
			if(n==1) {
				System.out.println("price of iphone"+s1.price);
				
				
			}else if(n==2) {
				System.out.println("price of realme"+s2.price);
			}else if(n==3) {
				System.out.println("price of notthing"+s3.price);
			}else if(n==4) {
				System.out.println("price of lava"+s4.price);
			}else System.out.println("none of in list");
			
		}
		
		}
		
		
	}
	}

}
