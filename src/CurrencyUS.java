public class CurrencyUS extends RegexOption {
   
   private final String CENT = "([0-9]{2})";
   private final String DOLLAR = "(([1-9][0-9]{0,2})(([,]?[0-9]{3}){0,9}))";
   
   public CurrencyUS() {

      prompt = "Please enter a dollar ammount (US): ";
      regexPattern = "[$]?((" + DOLLAR + "([.]" + CENT + ")?)|(0?([.]" + CENT + ")?))";
   }
}