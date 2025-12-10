import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_writing {
    static void main() throws IOException {
        // How to write in a file using java (4 popular options)

        // FileWriter = Good for small or medium,-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g.,Images, Audio Files)

        Scanner sc = new Scanner(System.in);
        try(FileWriter writer = new FileWriter("test.txt")){
            System.out.println("Enter things you want to enter in file : ");
            String inp = sc.nextLine();

            writer.write(inp);
            System.out.println("File has been written");
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate the file !!");
        }
        catch (IOException e){
            System.out.println("Could not write file");
        }
    }
}
