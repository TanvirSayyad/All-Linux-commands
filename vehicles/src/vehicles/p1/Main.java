package vehicles.p1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in)){
		
		Cars car1=new Cars();
		Cars car2=new Cars();
		Cars car3=new Cars();
		bikes b1=new bikes();
		bikes b2=new bikes();
		bikes b3=new bikes();
		
		
		car1.name="maruti";
		car2.name="BMW";
		car3.name="xuv";
		
		b1.name="TVS";
		b2.name="ducati";
		b3.name="suzuki";
		
		b1.cost="290000";
		b2.cost="233456";
		b3.cost="40000";
		
		
	car1.cost="290000";
		car2.cost="233456";
		car3.cost="40000";
		
		while(true) {
		System.out.println("what you want to buy");
		
		System.out.println("1 for car and 2 for bike");

		int choice;
		System.out.println("enter your choice");
		choice=sc.nextInt();
		if(choice==1) {
			System.out.println(" chose one cars 3 models");
			System.out.println("1.maruti");
			System.out.println("2.BMW");
			System.out.println("3.xuv");
			
			int n;
			n=sc.nextInt();
			if(n==1) {
				
				System.out.println("cost of maruti is"+car1.cost);
			}
			else if(n==2){
				
				System.out.println("cost of bmw is"+car2.cost);
			}else if(n==3){
				
			    System.out.println("cost of xuv"+car3.cost);;
			}
			
			else System.out.println("select option in between 1 to 3");
			
			
		}
		else if (choice==2) {
			System.out.println("chose bike model");
			System.out.println("1.TVS");
			System.out.println("2.ducati");
			System.out.println("3.suzuki");
			int a;
			a=sc.nextInt();
			
			if(a==1) {
				System.out.println("cost of TVS is"+b1.cost);
			}else if(a==2) {
				System.out.println("cost of ducati is"+b2.cost);
				
			}else if(a==3) {
				System.out.println("cost of suzuki is"+b3.cost);
			}
			else System.out.println("enter valid option between 1-3");
			
			
		}
		}
	}
	}
}


