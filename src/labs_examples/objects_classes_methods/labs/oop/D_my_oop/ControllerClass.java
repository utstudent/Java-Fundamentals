package labs_examples.objects_classes_methods.labs.oop.D_my_oop;
import java.util.Scanner;
import java.util.HashMap;
public class ControllerClass {
    public static void main(String[] args) {

        HashMap<String, String> dictionary = new HashMap<String,String>();

        dictionary.put("hello","Olá");
        dictionary.put("how are you doing?","Tudo bem?");
        dictionary.put("goodbye","Adeus");
        dictionary.put("good morning","Bom dia");
        dictionary.put("good afternoon","Boa tarde");
        dictionary.put("good night","Boa noite");
        dictionary.put("pardon me","Desculpe");
        dictionary.put("please","Por Favor");
        dictionary.put("excuse me","Com licença");
        dictionary.put("thank You","Obrigado");
        dictionary.put("sir","Senhor");
        dictionary.put("madam","Senhora");
        dictionary.put("pleasure to meet you","Muito prazer");
        dictionary.put("next to","ao lado de");
        dictionary.put("near","perto");
        dictionary.put("far","longe");
        dictionary.put("a coffee","um café");
        dictionary.put("water","água");
        dictionary.put("breakfast","o pequeno-almoço");
        dictionary.put("lunch","o almoço");
        dictionary.put("dinner","o jantar");
        dictionary.put("how much is it?","Quanto custa?");
        dictionary.put("one","Um");
        dictionary.put("two","Dois");
        dictionary.put("three","Três");
        dictionary.put("four","Quatro");
        dictionary.put("five","Cinco");
        dictionary.put("six","Seis");
        dictionary.put("seven","Sete");
        dictionary.put("eight","Oito");
        dictionary.put("nine","Nove");
        dictionary.put("ten","Dez");
        dictionary.put("yes","Sim");
        dictionary.put("no","Não");
        dictionary.put("can you help me?","Pode ajudar-me?");
        dictionary.put("all right,","Está bem");
        dictionary.put("do you speak English?","Fala inglês?");
        dictionary.put("i don't understand","Não entendo");

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Would you like to translate from Portuguese or from English?");
//        String translateLanguage = scanner.nextLine();

        while(true) {
            System.out.println("What word would you like to translate? ");
            String translatedWord = scanner.nextLine();

            System.out.println("~~~~~~~~~ " + dictionary.get(translatedWord) + " ~~~~~~~~~");
            System.out.println();

            System.out.println("Stop? y or n");
            String answer = scanner.nextLine();

            System.out.println();
            if(answer.equals("y")) {
                break;
            }
        }




    }
}
