package pkg1;

public class R18 {

	public static void main(String[] args) {
		double angle1;
		for(int j=3;j>0;j--) {
			for(int i=0;i<12;i++) {
				angle1=((30*j)+i*30)-(i*2.5);
				System.out.println(angle1%360);
			}
			System.out.println();
		}
		
		
		
		

	}

}
