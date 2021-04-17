package NewNIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
//            FileInputStream file = new FileInputStream("data.txt");
//            FileChannel channel = file.getChannel();

            // grabs the file.
            Path dataPath = FileSystems.getDefault().getPath("data.txt");

            // writes a new line the the dataPath -- gets bytes then set to UTF-8. SOO append is to add to file, default is to truncate the file.
            Files.write(dataPath, "\nLine 5".getBytes("UTF-8"), StandardOpenOption.APPEND);

            // reading a text data by line!
            List<String> lines = Files.readAllLines(dataPath);
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
