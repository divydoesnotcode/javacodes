import java.io.*;

public class File_reader {
    static void main() {
        // BufferedReader + FileReader : Best for reading text files line
        try(BufferedReader reader = new BufferedReader(new FileReader("test.txt")))
        {
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File cannot be found");
        }
        catch (IOException e){
            System.out.println("Cannot read file");
        }
    }
}
