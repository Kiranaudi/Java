import java.io.*;
public class FlieRead {

	public static void main(String[] args) {
		try {
			FileOutputStream f=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Vajiram and Yellow Book\\kiran.txt");
			//String s="welcome to java file writing";
			byte[] b= {3,4,5,6};
			f.write(b);
	
	f.close();
			//FileWriter ff=new FileWriter("kiran.txt");
			//ff.write("365525");
			//ff.close();
			
	
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
