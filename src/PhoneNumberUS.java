public class PhoneNumberUS extends RegexOption {
   
   public PhoneNumberUS() {
   
      prompt = "Please enter a phone number (United States): ";
      regexPattern = "((1-?)?(([(][2-9][0-9]{2}[)])|([2-9][0-9]{2}))-?[2-9][0-9]{2}-?[0-9]{4})";
      // If the user decideds to use the parentheses for the area code
      // it is mandatory that the opening parentheses have a corresponding
      // closing parentheses at the correct location
   }
}