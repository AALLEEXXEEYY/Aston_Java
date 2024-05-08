package json;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public static void appendToFile(String content, String filename)  {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(content + System.lineSeparator());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<String> readAllFromFile(String filename)  {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return lines;
    }
}