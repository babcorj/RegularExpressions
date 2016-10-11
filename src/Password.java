public class Password extends RegexOption {
   
   public Password() {

      prompt = "Please enter a password that contains at least 10 characters\n" +
               "and includes at least one uppercase character, lowercase\n" +
               "character, digit, and punctuation mark. Make sure the password\n" +
               "does not have more than 3 consecutive lowercase characters: ";
      regexPattern = "(^(?=.*[A-Z]+)(?=.*[a-z]+)(?!.*[a-z]{3})(?=.*[0-9]+)"+
                     "(?=.*[,.;:!?]+))([a-zA-Z0-9,.;:!?]{10,32}$)";
   }
}