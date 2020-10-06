package Day10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Q67_ReadFromBinaryFile {

	public static void main(String[] args)  {
		
		try {
			FileInputStream fis = new FileInputStream("D:\\CDAC LAB\\JAVA\\Java\\src\\Day10\\shopping.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Object p =  ois.readObject();
			
			ois.close();
			fis.close();
			
			System.out.println(p.toString());

		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}
