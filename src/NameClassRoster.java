/* Allowing the names to begin lowercase in case of non-conventional names
 * However, limiting the amount of space to 64 characters per name
 */
 
public class NameClassRoster extends RegexOption {
   
   public NameClassRoster() {
   
      prompt = "Please enter a name (Last name, First name, MI): ";
      regexPattern = "[a-zA-Z]{1,64}[,]?[ ][a-zA-Z]{1,64}[,]?[ ]([a-zA-Z]([ ][a-zA-Z])*)$";
   }
}