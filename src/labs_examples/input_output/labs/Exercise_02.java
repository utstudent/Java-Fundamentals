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

        int c;

        String fileReadPath = "src/labs_examples/input_output/files/KtoD.txt";
        String fileWritePath = "src/labs_examples/input_output/files/KtoD_2.txt";

        // Create and use a FileReader wrapped in a BufferedReader.
        try (BufferedReader br = new BufferedReader(new FileReader(fileReadPath));
                BufferedWriter bw = new BufferedWriter(new FileWriter(fileWritePath)))
        {
            while((c = br.read()) != -1) {

                if ((char) c == 'a'){ // changing a into -
                    c = '-';
                }
                if ((char) c == 'e'){ // changing e into ~
                    c = '~';
                }
                if ((char) c == 'i'){ // changing i into #
                    c = '#';
                }
                if ((char) c == 'o'){ // changing o into %
                    c = '%';
                }
                if ((char) c == 'u'){ // chaning u into @
                    c = '@';
                }
                System.out.print((char) c);
                bw.write(c);
            }
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }

        System.out.println();
        System.out.println("---------------------------");
        System.out.println();
        try (BufferedReader br = new BufferedReader(new FileReader(fileWritePath)))
        {
            while((c = br.read()) != -1) {

                if ((char) c == '-'){
                    c = 'a';
                }
                if ((char) c == '~'){
                    c = 'e';
                }
                if ((char) c == '#'){
                    c = 'i';
                }
                if ((char) c == '%'){
                    c = 'o';
                }
                if ((char) c == '@'){
                    c = 'u';
                }
                System.out.print((char) c);
            }
         } catch (IOException exc){

        }
    }
}

