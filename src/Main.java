import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
        * A BufferedReader helps us read streams from the Reader class seamlessly (All at one go!). It
        * is able to read characters, entire lines of  text from a file or arrays.
        *
        * One should note that reading and writing is an expensive  process each time
        * a character or word has to be returned. This means that we perform an I/O operation
        * (reaching out to the file, where ever it is) each time. This can becomes computationaly expensive
        * over a period of time.
        *
        * Let's explore the BufferedReader.
        * The BufferedReader class takes as it's parameter a [Reader] Object.
        *
        * Remember a stream is a constant flow of data. In this case, it's a constant flow of
        * characters (including whitespace) */

        BufferedReader bf = new BufferedReader(new FileReader("fizzbuzz.txt"));

        //Lets read the stream provided by FileReader.
        String reader;
        while((reader = bf.readLine()) != null){
            System.out.println(reader);
        }

        BufferedReader bf2 = new BufferedReader(new FileReader("fizzbuzz.txt"), 1);

        /*
        We can also specify the buffer size of the BufferedReader. Although it is not recommended we may find scenarios
        Where we need to control how much being placed into the buffer at a particular time.
        */
        while((reader = bf2.readLine()) != null){
            System.out.println(reader);
        }

        /*A InputStream bridges a byte stream into a character stream
        * decodes a byte stream into a character stream. This is useful
        * for reading from files and over network devices. The bytes that
        * read are decoded into a charset (Character encoding W --> 1010111,
        * done using 16 bits)
        *  specified by the user */

        FileInputStream fileInputStream = new FileInputStream("fizzbuzz.txt");

        // Outputs bytes of numbers
        int inputStreamReader;
        while((inputStreamReader = fileInputStream.read()) != -1) {

            System.out.print(inputStreamReader + " ");
        }
    }
}
