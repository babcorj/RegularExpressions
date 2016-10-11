public class CityStateZip extends RegexOption {
   
   private final String CITY = "[a-zA-Z '.]{1,64}";
   private final String ZIP = "(([0-9]{5})([-][0-9]{4})?)";
   private final String STATE =
"(?i)((alabama)|(ala.)|(al)|(alaska)|(ak)|(american samoa)|(as)|(arizona)|(ariz.)|"+
"(az)|(arkansas)|(ark.)|(ar)|(california)|(calif.)|(ca)|(colorado)|(colo.)|"+
"(co)|(connecticut)|(conn.)|(ct)|(delaware)|(del.)|(de)|(district of columbia)|"+
"(dist. of columbia)|(d.c.)|(dc)|(florida)|(fla.)|(fl)|(georgia)|(ga.)|(ga)|"+
"(guam)|(gu)|(hawaii)|(hi)|(idaho)|(id)|(illinois)|(ill.)|(il)|(indiana)|(ind.)|"+
"(in)|(iowa)|(ia)|(kansas)|(kans.)|(ks)|(kentucky)|(ky.)|(ky)|(louisiana)|(la.)|"+
"(la)|(maine)|(me)|(maryland)|(md.)|(md)|(marshall islands)|(mh)|(massachusetts)|"+
"(mass.)|(ma)|(michigan)|(mich.)|(mi)|(micronesia)|(fm)|(minnesota)|(minn.)|"+
"(mn)|(mississippi)|(miss.)|(ms)|(missouri)|(mo.)|(mo)|(montana)|(mont.)|(mt)|"+
"(nebraska)|(nebr.)|(ne)|(nevada)|(nev.)|(nv)|(new hampshire)|(n.h.)|(nh)|"+
"(new jersey)|(n.j.)|(nj)|(new mexico)|(n.m.)|(nm)|(new york)|(n.y.)|(ny)|"+
"(north carolina)|(n.c.)|(nc)|(north dakota)|(n.d.)|(nd)|(northern marianas)|"+
"(mp)|(ohio)|(oh)|(oklahoma)|(okla.)|(ok)|(oregon)|(ore.)|(or)|(palau)|(pw)|"+
"(pennsylvania)|(pa.)|(pa)|(puerto rico)|(p.r.)|(pr)|(rhode island)|(r.i.)|"+
"(ri)|(south carolina)|(s.c.)|(sc)|(south dakota)|(s.d.)|(sd)|(tennessee)|"+
"(tenn.)|(tn)|(texas)|(tex.)|(tx)|(utah)|(ut)|(vermont)|(vt.)|(vt)|(virginia)|"+
"(va.)|(va)|(virgin islands)|(v.i.)|(vi)|(washington)|(wash.)|(wa)|"+
"(west virginia)|(w.va.)|(wv)|(wisconsin)|(wis.)|(wi)|(wyoming)|(wyo.)|(wy))";

   public CityStateZip() {

      prompt = "Please enter a city, state, and zipcode: ";
      regexPattern = CITY + "[ ]" + STATE + "[,][ ]" + ZIP;
   }
}