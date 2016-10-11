public class SocialSecurityNumber extends RegexOption {
   
   public SocialSecurityNumber() {
   
      prompt = "Please enter a social security number: ";
      regexPattern = "(^[1-9][0-9]{2}[- .]?[0-9]{2}[- .]?[0-9]{4}$)";
   }
}