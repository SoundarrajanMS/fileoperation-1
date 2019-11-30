import java.io.File;
import java.io.IOException;

public class Fileoperation {
	public static void main(String[] args) throws Throwable  {
		//to create sub folder
		File f= new File("E:\\Afile\\Bfile\\Cfile");
	boolean b = f.mkdirs();
			System.out.println(b);
		}
		
		/*//to create multiple subfolder
		File s=new File("D:\\javaa\\add\\sub\\test");
		boolean c= s.mkdirs();
		System.out.println(c);*/
		
	}


