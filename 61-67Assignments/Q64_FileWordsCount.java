package Day10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q64_FileWordsCount {

	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("D:\\CDAC LAB\\JAVA\\Java\\src\\Day10\\my.txt");
		InputStreamReader input = new InputStreamReader(fis); 
        BufferedReader reader = new BufferedReader(input);
        int cntWord=0;
        String s=null;
        while((s = reader.readLine()) != null) 
        { 
        	String wordList[] = s.split("\\s+");
            	
            cntWord += wordList.length;
        }
        
        System.out.println(cntWord+" Total words in File");
	}

}
