public abstract class RegexOption {

   String prompt,
          regexPattern;
   
   public RegexOption() {
      prompt = "Please enter regex input: ";
      regexPattern = "regexPattern";
   }
   
   public String getPrompt() {
      return prompt;
   }
   
   public String getPattern() {
      return regexPattern;
   }
}