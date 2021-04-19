package Paths;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        Path path = FileSystems.getDefault().getPath("WorkingDirectory.txt");
        printFile(path);

        Path filePath = FileSystems.getDefault().getPath("files","SubDirectory.txt");
        printFile(filePath);

        // outside path:
        Path outsidePath = Paths.get("C:\\Users\\swift\\projects\\Java\\InputOutput\\directions_big.txt");
        printFile(outsidePath);






    }


    private static void printFile(Path path){
        try(BufferedReader fileReader = Files.newBufferedReader(path)){
            String line;
            while((line = fileReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
