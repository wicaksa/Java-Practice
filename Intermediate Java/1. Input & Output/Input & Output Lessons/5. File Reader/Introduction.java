import java.io.FileReader;
import java.io.IOException;

public class Introduction {
    public static void main(String[] args) throws IOException {
        String path = "./input.txt";

        // 1. Import the two classes from the java.io package needed here.
        // In your main method declaration, throw the IOException.

        // 2. Declare a FileReader object using path, which points to the relative path
        // of input.txt.
        // Name the FileReader something something pertinent.

        FileReader reader = new FileReader(path);

        // 3. Now it’s time to access our file! To do so:
        // Create a counter variable set to 0
        // Write a while loop

        int count = 0;

        while ((count = reader.read()) != -1) {
            System.out.print((char) count);
        }

        // 4. Finally, close your FileInputStream object.
        reader.close();
    }
}