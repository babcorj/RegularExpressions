public class MilitaryTime extends RegexOption {
   
   private final String HOUR = "(([01][0-9])|(2[0-3]))";
   private final String MINUTE = "([0-5][0-9])";
   private final String SECOND = MINUTE;
   private final String DELIMETER = "[ :.]?";
   
   public MilitaryTime() {
   
      prompt = "Please enter the time (military with seconds): ";
      regexPattern = HOUR + DELIMETER + MINUTE + DELIMETER + SECOND;
   }
}