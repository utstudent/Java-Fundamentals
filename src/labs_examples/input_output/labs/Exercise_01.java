package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Exercise_1 {
    public static void main(String[] args) {

        String fileReadPath = "src/labs_examples/input_output/files/KtoD.txt";
        String fileWritePath = "src/labs_examples/input_output/files/KtoD_1.txt";

        try (BufferedOutputStream bfOut = new BufferedOutputStream(new FileOutputStream(fileWritePath));
             BufferedInputStream bfIn = new BufferedInputStream(new FileInputStream(fileReadPath))){

            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bfIn.read(buffer)) != -1) {
                String str  = new String(buffer,0, bytesRead);

                bfOut.write(buffer,0, bytesRead);
                System.out.print(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}