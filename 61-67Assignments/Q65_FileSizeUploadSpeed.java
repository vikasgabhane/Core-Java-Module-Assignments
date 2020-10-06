package Day10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Q65_FileSizeUploadSpeed {

	public static void main(String[] args) {

        // this image is around 140kb
        String fileName = "C:\\Users\\admin\\Desktop\\img.jpg";
        printFileSizeNIO(fileName);

    }

    public static void printFileSizeNIO(String fileName) {

        Path path = Paths.get(fileName);

        try {

            // size of a file (in bytes)
            long bytes = Files.size(path);
            System.out.println(String.format("%,d bytes", bytes));
            System.out.println(String.format("%,d kilobytes", bytes / 1024));
            
            System.out.println(String.format("%d, seconds need to upload file", (bytes / 1024) / 256));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
