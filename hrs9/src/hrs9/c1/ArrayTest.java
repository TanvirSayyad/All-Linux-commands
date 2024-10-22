package hrs9.c1;

public class ArrayTest {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,7};//in java arrays are the object
//   System.out.println(a);//output [I@2752f6e2 hascode	
   
   System.out.println(a[2]);

//dynamic array
   System.out.println("dynamic array");
   int b[]=new int[5];
   b[0]=101;
   b[1]=123;
   
   for (int v : b) 
   { 
       System.out.println(v);
   }
   
}
}
