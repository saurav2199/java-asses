import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        try {
            // Writing to file
            FileWriter writer = new FileWriter("Sample.txt");

            writer.write("Welcome to Java File Handling\n");
            writer.write("This file is created using FileWriter.");

            writer.close();

            System.out.println("File created and data written successfully");

            // Reading from file
            FileReader reader = new FileReader("Sample.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            System.out.println("Contents of the file:");

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            reader.close();

        } 
        catch (IOException e)
         {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}