import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WorkWithFiles {
    public static void main(String[] args) {

        File file = new File("file.txt");

        // CREATE FILE
        try {

            /*
             * NOT NECESSARY THIS PART CAUSE WRITER CREATE THE FILE
             * 
             * 
             * boolean created = file.createNewFile();
             * if (created) {
             * System.out.println("File was created successfully.");
             * } else {
             * System.out.println("File was NOT created.");
             * }
             */

            FileWriter writer = new FileWriter(file);
            writer.write("Hello, Bryan. This is a test file!");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // READ FILE
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("FILE NAME: " + file.getName());
        System.out.println("PATH: " + file.getAbsolutePath());
        System.out.println("FILE SIZE: " + file.length());

        // DELETE FILE
        file.delete();
    }
}