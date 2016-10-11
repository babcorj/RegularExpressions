import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.InputMismatchException;
import java.io.*;
import java.util.Scanner;

public class RegexTester {

   public static void main(String[] args) {
      
      boolean optionIsValid;
      Matcher inputMatcher;
      Pattern optionPattern = Pattern.compile("[a-lA-LqQ]{1}");
      Pattern inputPattern;
      RegexOption category;
      RegexOptionFactory factory = new RegexOptionFactory();
      String input = "",
             option = "";
      Scanner kb = new Scanner(System.in);

      System.out.println("Table of Contents\n" +
            "a. Social Security Number\n" +
            "b. US Phone number\n" +
            "c. E-mail address\n" +
            "d. Name on a class roster\n" +
            "e. Date in MM-DD-YYYY format\n" +
            "f. House address\n" +
            "g. City followed by state followed by zip\n" +
            "h. Military time\n" +
            "i. US Currency\n" +
            "j. URL\n" +
            "k. A password that contains at least 10 characters\n" +
            "   and includes at least one upper case character,\n" +
            "   lower case character, digit, punctuation mark,\n" +
            "   and does not have more than 3 consecutive lower\n" +
            "   case characters\n" +
            "l. All words containing an odd number of alphabetic\n" +
            "   characters, ending in 'ion'\n" +
            "q. quit\n");
      
      while(!option.equalsIgnoreCase("q")) {
         option = "";
         optionIsValid = false;
   
         while(!optionIsValid) {
            System.out.print("Please choose an option: ");
            try {
               String s = kb.nextLine();
               int len = s.length();
               if(len > 1 || len == 0) {
                  throw new InputMismatchException("Please enter ONE character");
               }
               else {
                  option = s.substring(0,1);
               }
               Matcher m = optionPattern.matcher(option);
               optionIsValid = m.matches();
               if(optionIsValid == false) {
                  throw new InputMismatchException("Input has to be A-L or q to quit");
               }
            }
            catch(InputMismatchException e) {
               System.out.println(e);
            }
         }//end while
         
         if(!option.equalsIgnoreCase("q")) {
            category = factory.make(option);
            inputPattern = Pattern.compile(category.getPattern());
            System.out.print(category.getPrompt());
            input = kb.nextLine();
            inputMatcher = inputPattern.matcher(input);
            System.out.print(option + ". ");

            if(inputMatcher.matches()) {
               System.out.println("SUCCESS!");
            }
            else {
               System.out.println("FAIL!");
            }
         }
      }//end while
   }
}