package Tasks.IOStream;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class IOExample {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\hyka8\\Desktop\\animals.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("animals output.txt"));
            String line;
            while ((line = in.readLine()) != null) {
                List<String> items = Arrays.asList(line.split(","));
                System.out.println(line);
                for (String animal : items  ) {
                    if (!animal.substring(0, 1).equalsIgnoreCase("q")) {
                        out.write(animal);
                        out.write("\n");
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
