package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class Exercise_2 {

    public static void main(String[] args) throws IOException{

        String s;

        String fileReadPath = "src/labs_examples/input_output/files/KtoD.txt";
        String fileWritePath = "src/labs_examples/input_output/files/KtoD_2.txt";

        // Create and use a FileReader wrapped in a BufferedReader.
        try (BufferedReader br = new BufferedReader(new FileReader(fileReadPath));
                BufferedWriter bw = new BufferedWriter(new FileWriter(fileReadPath)))
        {
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}

