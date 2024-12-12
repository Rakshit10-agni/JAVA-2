package pkg1;

public class R21 {

	    public static void main(String[] args) {
	    	double angle1;
	    	for(int j=0;j<12;j++) {
	    		for(int i=0;i<12;i++) {
		    		angle1=(90-(j*30))+(i*30)-(i*2.5);
		    		System.out.println(Math.abs(angle1%360));	
		    	}
		    	System.out.println();
	    	}
	}
}	    
