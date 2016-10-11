// SPECIAL RULES
   // Local characters <= 64
   // Hostname characters between dots <= 63
   // Entire email length <= 254
// LOCAL RULES
   // Can have dot (period) but not to start or consecutively
   // Can use percentile encoding for the appropriate characters
   // Can use quotes in local part with the following rules:
   //    a. The quotes begins and ends the local name
   //    b. They are dot separated in the specified manner
   //       ie. "JohnAdams"@domain.com
   //       ie. John."Jacob".Adams@domain.com
   // Can use comments before or after local name.
   //    ie. (comment)JohnAdams@domain.com
   //    ie. JohnAdams(comment)@domain.com
// DOMAIN RULES
   // Can use alphabet, numbers, dashes, and dots with the exceptions:
   //    a. Can not start or end hostname with dash
   //    b. Dots can not be contiguous with dashes or other dots

public class EmailAddress extends RegexOption {
   
   final String LOCAL_CHARSET = "(([a-z0-9#_~!$&'*+,;=:-])|" +
                                "(%2[A-C13-7])|(%3[A-D])|(%7E))";
   // Must pust VALID_DOT after a LOCAL_CHARSET to work
   final String VALID_DOT = "(" + LOCAL_CHARSET + "*[.]" + LOCAL_CHARSET + "+)";
   final String VALID_BUILD = "(" + LOCAL_CHARSET + "*|(" + LOCAL_CHARSET +
                              "*[.][\"](" + LOCAL_CHARSET + VALID_DOT + "?)+[\"][.]" +
                              LOCAL_CHARSET + "+)*|" + VALID_DOT + "*)";
   final String COMMENT = "([(]" + LOCAL_CHARSET + "+[)])";
   final String BASIC = "(((" + LOCAL_CHARSET + VALID_BUILD + "){1,64})|" +
                        "([\"](" + LOCAL_CHARSET + VALID_DOT + "?){1,62}[\"]))";
   final String LOCAL = "((" + COMMENT + "?" + BASIC + ")|(" + BASIC +
                        COMMENT + "?))";
   final String IP_ADDRESS = "((25[0-5]|2[0-4][0-9]|[01][0-9]{2})\\.){3}" +
                             "(25[0-5]|2[0-4][0-9]|[01][0-9]{2})";
   final String HOSTNAME_CHARSET = "(([a-z0-9]+([-][a-z0-9]+)*){1,63}(\\.[a-z0-9]{1,63})*)";
   final String TLD_EXTENSION =
   "(\\.((AC)|(AD)|(AE)|(AERO)|(AF)|(AG)|(AI)|(AL)|(AM)|(AN)|(AO)|(AQ)|(AR)|(ARPA)|(AS)|(ASIA)|(AT)|(AU)|(AW)|(AX)|(AZ)|(BA)|"+
   "(BB)|(BD)|(BE)|(BF)|(BG)|(BH)|(BI)|(BIZ)|(BJ)|(BM)|(BN)|(BO)|(BR)|(BS)|(BT)|(BV)|(BW)|(BY)|(BZ)|(CA)|(CAT)|(CC)|(CD)|"+
   "(CF)|(CG)|(CH)|(CI)|(CK)|(CL)|(CM)|(CN)|(CO)|(COM)|(COOP)|(CR)|(CU)|(CV)|(CW)|(CX)|(CY)|(CZ)|(DE)|(DJ)|(DK)|(DM)|(DO)|"+
   "(DZ)|(EC)|(EDU)|(EE)|(EG)|(ER)|(ES)|(ET)|(EU)|(FI)|(FJ)|(FK)|(FM)|(FO)|(FR)|(GA)|(GB)|(GD)|(GE)|(GF)|(GG)|(GH)|(GI)|"+
   "(GL)|(GM)|(GN)|(GOV)|(GP)|(GQ)|(GR)|(GS)|(GT)|(GU)|(GW)|(GY)|(HK)|(HM)|(HN)|(HR)|(HT)|(HU)|(ID)|(IE)|(IL)|(IM)|(IN)|"+
   "(INFO)|(INT)|(IO)|(IQ)|(IR)|(IS)|(IT)|(JE)|(JM)|(JO)|(JOBS)|(JP)|(KE)|(KG)|(KH)|(KI)|(KM)|(KN)|(KP)|(KR)|(KW)|(KY)|(KZ)|"+
   "(LA)|(LB)|(LC)|(LI)|(LK)|(LR)|(LS)|(LT)|(LU)|(LV)|(LY)|(MA)|(MC)|(MD)|(ME)|(MG)|(MH)|(MIL)|(MK)|(ML)|(MM)|(MN)|(MO)|"+
   "(MOBI)|(MP)|(MQ)|(MR)|(MS)|(MT)|(MU)|(MUSEUM)|(MV)|(MW)|(MX)|(MY)|(MZ)|(NA)|(NAME)|(NC)|(NE)|(NET)|(NF)|(NG)|(NI)|(NL)|"+
   "(NO)|(NP)|(NR)|(NU)|(NZ)|(OM)|(ORG)|(PA)|(PE)|(PF)|(PG)|(PH)|(PK)|(PL)|(PM)|(PN)|(POST)|(PR)|(PRO)|(PS)|(PT)|(PW)|(PY)|"+
   "(QA)|(RE)|(RO)|(RS)|(RU)|(RW)|(SA)|(SB)|(SC)|(SD)|(SE)|(SG)|(SH)|(SI)|(SJ)|(SK)|(SL)|(SM)|(SN)|(SO)|(SR)|(ST)|(SU)|(SV)|"+
   "(SX)|(SY)|(SZ)|(TC)|(TD)|(TEL)|(TF)|(TG)|(TH)|(TJ)|(TK)|(TL)|(TM)|(TN)|(TO)|(TP)|(TR)|(TRAVEL)|(TT)|(TV)|(TW)|(TZ)|(UA)|"+
   "(UG)|(UK)|(US)|(UY)|(UZ)|(VA)|(VC)|(VE)|(VG)|(VI)|(VN)|(VU)|(WF)|(WS)|(XXX)|(YE)|(YT)|(ZA)|(ZM)|(ZW))$)";
   final String DOMAIN = HOSTNAME_CHARSET + TLD_EXTENSION;
   final String DOMAIN_FULL = "[@](" + IP_ADDRESS + "|" + DOMAIN + ")";
   
   public EmailAddress() {
   
      prompt = "Please enter a email address: ";
      regexPattern = "(?i)(" + LOCAL + DOMAIN_FULL + ")";
   }
}