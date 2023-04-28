import java.io.FileWriter;
import java.io.IOException;

public class Introduction {
    public static void main(String[] args) throws IOException {
        // Your code here:

        // 1. Add an import statement to the top of the file to bring in
        // FileWriter and IOException.
        // As with before, have the main method throw the IOException.

        // 2. Declare a FileWriter object using "output.txt",
        // which will be the name of our file.

        FileWriter output = new FileWriter("output.txt");

        // 3. Now it's time to write to our file! In the following order:
        // - Create a string named outputText and set it to any message.
        // - Use the .write() method to write the message to the file.

        String outputText = "Hello World";
        output.write(outputText);

        // 4. Finally, close your FileWriter object to ensure your message
        // gets flushed from the buffer and into your file.
        output.close();

    }
}