package pkg1;
import java.io.File;

public class R15 {

	public static void main(String[] args) {
		String dir1="";
		File f1;
		
		for(int i=1;i<11;i++) {
			dir1="TABLES/Friend"+i;
		    f1=new File(dir1);
			f1.mkdir();
		}
		
		
		
	}

}
