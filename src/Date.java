public class Date extends RegexOption {

   private final String MONTH = "((0?[1-9])|([1][0-2]))";
   private final String DAY = "((3[0-1])|([1-2][0-9])|(0?[1-9]))";
   private final String YEAR = "([0-9]{0,3}[0-9])";
         
   public Date() {
   
      prompt = "Please enter a date(MM-DD-YYYY): ";
      regexPattern = MONTH + "[ -]" + DAY + "[ -]" + YEAR;
   }
}