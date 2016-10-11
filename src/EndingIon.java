public class EndingIon extends RegexOption {
   
   public EndingIon() {

      prompt = "Please enter a word containing an odd number of\n" +
               "alphabetic characters, ending in 'ion: ";
      regexPattern = "(?i)([a-z]{1}([a-z]{2})+ion)";
   }
}