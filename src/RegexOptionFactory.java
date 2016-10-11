public class RegexOptionFactory {

   public RegexOption make(String selection) {
   
      switch(selection) {
         case "a":
            return new SocialSecurityNumber();
         case "b":
            return new PhoneNumberUS();
         case "c":
            return new EmailAddress();
         case "d":
            return new NameClassRoster();
         case "e":
            return new Date();
         case "f":
            return new HouseAddress();
         case "g":
            return new CityStateZip();
         case "h":
            return new MilitaryTime();
         case "i":
            return new CurrencyUS();
         case "j":
            return new URL();
         case "k":
            return new Password();
         case "l":
            return new EndingIon();
      }
      return new RegexOptionNULL();
   }
}