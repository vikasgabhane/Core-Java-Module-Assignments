package Day10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q63_FileWordTCount {

	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("D:\\CDAC LAB\\JAVA\\Java\\src\\Day10\\my.txt");
		InputStreamReader input = new InputStreamReader(fis); 
        BufferedReader reader = new BufferedReader(input);
        int cnt=0;
        String s=null;
        while((s = reader.readLine()) != null) 
        { 
        	for(int i=0;i<s.length();i++)
            {
            	if(s.charAt(i)=='t')
            	{
            		cnt++;
            	}
            }
        }
        
        System.out.println(cnt+" times t occure");
	}

}
