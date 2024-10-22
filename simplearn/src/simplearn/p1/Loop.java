package simplearn.p1;

public class Loop {
	public void forloop() {
		for(int i=1;i<=5;++i) {
			
			System.out.println("after pre_incr=="+i);
			
			if(i==5) {
				for(int j=5;j>=2;j--) {
					System.out.println(" if loop"+j);
				}
			}
		}
	}
	
	
public static void main(String[] args) {
	
	Loop lp=new Loop();
	lp.forloop();
	
}
}



//after post_incr==1
//after post_incr==2
//after post_incr==3
//after post_incr==4
//after post_incr==5