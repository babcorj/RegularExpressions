public class HouseAddress extends RegexOption {
   
   private final String STREET_SUFFIX =
"(((ALLEE)|(ALLEY)|(ALLY)|(ALY)|(ANEX)|(ANNEX)|(ANNX)|(ANX)|(ARC)|(ARCADE)|(AV)|"+
"(AVE)|(AVEN)|(AVENU)|(AVENUE)|(AVN)|(AVNUE)|(BAYOO)|(BAYOU)|(BCH)|(BEACH)|(BEND)|"+
"(BND)|(BLF)|(BLUF)|(BLUFF)|(BLUFFS)|(BOT)|(BTM)|(BOTTM)|(BOTTOM)|(BLVD)|(BOUL)|"+
"(BOULEVARD)|(BOULV)|(BR)|(BRNCH)|(BRANCH)|(BRDGE)|(BRG)|(BRIDGE)|(BRK)|(BROOK)|"+
"(BROOKS)|(BURG)|(BURGS)|(BYP)|(BYPA)|(BYPAS)|(BYPASS)|(BYPS)|(CAMP)|(CP)|"+
"(CMP)|(CANYN)|(CANYON)|(CNYN)|(CAPE)|(CPE)|(CAUSEWAY)|(CAUSWA)|(CSWY)|(CEN)|(CENT)|"+
"(CENTER)|(CENTR)|(CENTRE)|(CNTER)|(CNTR)|(CTR)|(CENTERS)|(CIR)|(CIRC)|(CIRCL)|"+
"(CIRCLE)|(CRCL)|(CRCLE)|(CIRCLES)|(CLF)|(CLIFF)|(CLFS)|(CLIFFS)|(CLB)|(CLUB)|"+
"(COMMON)|(COMMONS)|(COR)|(CORNER)|(CORNERS)|(CORS)|(COURSE)|(CRSE)|(COURT)|"+
"(CT)|(COURTS)|(CTS)|(COVE)|(CV)|(COVES)|(CREEK)|(CRK)|(CRESCENT)|(CRES)|(CRSENT)|"+
"(CRSNT)|(CREST)|(CROSSING)|(CRSSNG)|(XING)|(CROSSROAD)|(CROSSROADS)|(CURVE)|"+
"(DALE)|(DL)|(DAM)|(DM)|(DIV)|(DIVIDE)|(DV)|(DVD)|(DR)|(DRIV)|(DRIVE)|(DRV)|(DR)|"+
"(IVES)|(EST)|(ESTATE)|(ESTATES)|(ESTS)|(EXP)|(EXPR)|(EXPRESS)|(EXPRESSWAY)|(EXPW)|"+
"(EXPY)|(EXT)|(EXTENSION)|(EXTN)|(EXTNSN)|(EXTS)|(FALL)|(FALLS)|(FLS)|(FERRY)|"+
"(FRRY)|(FRY)|(FIELD)|(FLD)|(FIELDS)|(FLDS)|(FLAT)|(FLT)|(FLATS)|(FLTS)|(FORD)|"+
"(FRD)|(FORDS)|(FOREST)|(FORESTS)|(FRST)|(FORG)|(FORGE)|(FRG)|(FORGES)|(FORK)|"+
"(FRK)|(FORKS)|(FRKS)|(FORT)|(FRT)|(FT)|(FREEWAY)|(FREEWY)|(FRWAY)|(FRWY)|(FWY)|"+
"(GARDEN)|(GARDN)|(GRDEN)|(GRDN)|(GARDENS)|(GDNS)|(GRDNS)|(GATEWAY)|(GATEWY)|"+
"(GATWAY)|(GTWAY)|(GTWY)|(GLEN)|(GLN)|(GLENS)|(GREEN)|(GRN)|(GREENS)|(GROV)|(GROVE)|"+
"(GRV)|(GROVES)|(HARB)|(HARBOR)|(HARBR)|(HBR)|(HRBOR)|(HARBORS)|(HAVEN)|"+
"(HVN)|(HT)|(HTS)|(HIGHWAY)|(HIGHWY)|(HIWAY)|(HIWY)|(HWAY)|(HWY)|(HILL)|(HL)|(HILLS)|"+
"(HLS)|(HLLW)|(HOLLOW)|(HOLLOWS)|(HOLW)|(HOLWS)|(INLT)|(IS)|(ISLAND)|(ISLND)|"+
"(ISLANDS)|(ISLNDS)|(ISS)|(ISLE)|(ISLES)|(JCT)|(JCTION)|(JCTN)|(JUNCTION)|(JUNCTN)|"+
"(JUNCTON)|(JCTNS)|(JCTS)|(JUNCTIONS)|(KEY)|(KY)|(KEYS)|(KYS)|(KNL)|(KNOL)|"+
"(KNOLL)|(KNLS)|(KNOLLS)|(LK)|(LAKE)|(LKS)|(LAKES)|(LAND)|(LANDING)|(LNDG)|"+
"(LNDNG)|(LANE)|(LN)|(LGT)|(LIGHT)|(LIGHTS)|(LF)|(LOAF)|(LCK)|(LOCK)|(LCKS)|(LOCKS)|"+
"(LDG)|(LDGE)|(LODG)|(LODGE)|(LOOP)|(LOOPS)|(MALL)|(MNR)|(MANOR)|(MANORS)|"+
"(MNRS)|(MEADOW)|(MDW)|(MDWS)|(MEADOWS)|(MEDOWS)|(MEWS)|(MILL)|(MILLS)|(MISSN)|"+
"(MSSN)|(MOTORWAY)|(MNT)|(MT)|(MOUNT)|(MNTAIN)|(MNTN)|(MOUNTAIN)|(MOUNTIN)|(MTIN)|"+
"(MTN)|(MNTNS)|(MOUNTAINS)|(NCK)|(NECK)|(ORCH)|(ORCHARD)|(ORCHRD)|(OVAL)|(OVL)|"+
"(OVERPASS)|(PARK)|(PRK)|(PARKS)|(PARKWAY)|(PARKWY)|(PKWAY)|(PKWY)|(PKY)|(PARKWAYS)|"+
"(PKWYS)|(PASS)|(PASSAGE)|(PATH)|(PATHS)|(PIKE)|(PIKES)|(PINE)|(PINES)|"+
"(PNES)|(PL)|(PLACE)|(PLAIN)|(PLN)|(PLAINS)|(PLNS)|(PLAZA)|(PLZ)|(PLZA)|(POINT)|(PT)|(POINTS)|"+
"(PTS)|(PORT)|(PRT)|(PORTS)|(PRTS)|(PR)|(PRAIRIE)|(PRR)|(RAD)|(RADIAL)|(RADIEL)|"+
"(RADL)|(RAMP)|(RANCH)|(RANCHES)|(RNCH)|(RNCHS)|(RAPID)|(RPD)|(RAPIDS)|"+
"(RPDS)|(REST)|(RST)|(RDG)|(RDGE)|(RIDGE)|(RDGS)|(RIDGES)|(RIV)|(RIVER)|(RVR)|(RIVR)|"+
"(RD)|(ROAD)|(ROADS)|(RDS)|(ROUTE)|(ROW)|(RUE)|(RUN)|(SHL)|(SHOAL)|(SHLS)|"+
"(SHOALS)|(SHOAR)|(SHORE)|(SHR)|(SHOARS)|(SHORES)|(SHRS)|(SKYWAY)|(SPG)|(SPNG)|"+
"(SPRING)|(SPRNG)|(SPGS)|(SPNGS)|(SPRINGS)|(SPRNGS)|(SPUR)|(SPURS)|(SQ)|(SQR)|"+
"(SQRE)|(SQU)|(SQUARE)|(SQRS)|(SQUARES)|(STA)|(STATION)|(STATN)|(STN)|(STRA)|(STRAV)|"+
"(STRAVEN)|(STRAVENUE)|(STRAVN)|(STRVN)|(STRVNUE)|(STREAM)|(STREME)|(STRM)|"+
"(STREET)|(STRT)|(ST)|(STR)|(STREETS)|(SMT)|(SUMIT)|(SUMITT)|(SUMMIT)|(TER)|(TERR)|"+
"(TERRACE)|(THROUGHWAY)|(TRACE)|(TRACES)|(TRCE)|(TRACK)|(TRACKS)|(TRAK)|(TRK)|"+
"(TRKS)|(TRAFFICWAY)|(TRAIL)|(TRAILS)|(TRL)|(TRLS)|(TRAILER)|(TRLR)|(TRLRS)|"+
"(TUNEL)|(TUNL)|(TUNLS)|(TUNNEL)|(TUNNELS)|(TUNNL)|(TRNPK)|(TURNPIKE)|(TURNPK)|"+
"(UNDERPASS)|(UN)|(UNION)|(UNIONS)|(VALLEY)|(VALLY)|(VLLY)|(VLY)|(VALLEYS)|(VLYS)|"+
"(VDCT)|(VIA)|(VIADCT)|(VIADUCT)|(VIEW)|(VW)|(VIEWS)|(VWS)|(VILL)|(VILLAG)|"+
"(VILLAGE)|(VILLG)|(VILLIAGE)|(VLG)|(VILLAGES)|(VLGS)|(VILLE)|(VL)|(VIS)|(VIST)|"+
"(VISTA)|(VST)|(VSTA)|(WALK)|(WALKS)|(WALL)|(WY)|(WAY)|(WAYS)|(WELL)|(WELLS)|"+
"(WLS)|"+
"([aA]llee)|([aA]lley)|([aA]lly)|([aA]ly)|([aA]nex)|([aA]nnex)|([aA]nnx)|([aA]nx)|([aA]rc)|([aA]rcade)|"+
"([aA]v)|([aA]ve)|([aA]ven)|([aA]venu)|([aA]venue)|([aA]vn)|([aA]vnue)|([bB]ayoo)|([bB]ayou)|([bB]ch)|([bB]each)|"+
"([bB]end)|([bB]nd)|([bB]lf)|([bB]luf)|([bB]luff)|([bB]luffs)|([bB]ot)|([bB]tm)|([bB]ottm)|([bB]ottom)|([bB]lvd)|"+
"([bB]oul)|([bB]oulevard)|([bB]oulv)|([bB]r)|([bB]rnch)|([bB]ranch)|([bB]rdge)|([bB]rg)|([bB]ridge)|([bB]rk)|"+
"([bB]rook)|([bB]rooks)|([bB]urg)|([bB]urgs)|([bB]yp)|([bB]ypa)|([bB]ypas)|([bB]ypass)|([bB]yps)|([cC]amp)|"+
"([cC]p)|([cC]mp)|([cC]anyn)|([cC]anyon)|([cC]nyn)|([cC]ape)|([cC]pe)|([cC]auseway)|([cC]auswa)|([cC]swy)|([cC]en)|"+
"([cC]ent)|([cC]enter)|([cC]entr)|([cC]entre)|([cC]nter)|([cC]ntr)|([cC]tr)|([cC]enters)|([cC]ir)|([cC]irc)|"+
"([cC]ircl)|([cC]ircle)|([cC]rcl)|([cC]rcle)|([cC]ircles)|([cC]lf)|([cC]liff)|([cC]lfs)|([cC]liffs)|([cC]lb)|"+
"([cC]lub)|([cC]ommon)|([cC]ommons)|([cC]or)|([cC]orner)|([cC]orners)|([cC]ors)|([cC]ourse)|([cC]rse)|([cC]ourt)|"+
"([cC]t)|([cC]ourts)|([cC]ts)|([cC]ove)|([cC]v)|([cC]oves)|([cC]reek)|([cC]rk)|([cC]rescent)|([cC]res)|"+
"([cC]rsent)|([cC]rsnt)|([cC]rest)|([cC]rossing)|([cC]rssng)|(xing)|([cC]rossroad)|([cC]rossroads)|([cC]urve)|"+
"([dD]ale)|([dD]l)|([dD]am)|([dD]m)|([dD]iv)|([dD]ivide)|([dD]v)|([dD]vd)|([dD]r)|([dD]riv)|([dD]rive)|([dD]rv)|"+
"([dD]rives)|([eE]st)|([eE]state)|([eE]states)|([eE]sts)|([eE]xp)|([eE]xpr)|([eE]xpress)|([eE]xpressway)|"+
"([eE]xpw)|([eE]xpy)|([eE]xt)|([eE]xtension)|([eE]xtn)|([eE]xtnsn)|([eE]xts)|([fF]all)|([fF]alls)|([fF]ls)|"+
"([fF]erry)|([fF]rry)|([fF]ry)|([fF]ield)|([fF]ld)|([fF]ields)|([fF]lds)|([fF]lat)|([fF]lt)|([fF]lats)|([fF]lts)|"+
"([fF]ord)|([fF]rd)|([fF]ords)|([fF]orest)|([fF]orests)|([fF]rst)|([fF]org)|([fF]orge)|([fF]rg)|([fF]orges)|"+
"([fF]ork)|([fF]rk)|([fF]orks)|([fF]rks)|([fF]ort)|([fF]rt)|([fF]t)|([fF]reeway)|([fF]reewy)|([fF]rway)|([fF]rwy)|"+
"([fF]wy)|([gG]arden)|([gG]ardn)|([gG]rden)|([gG]rdn)|([gG]ardens)|([gG]dns)|([gG]rdns)|([gG]ateway)|([gG]atewy)|"+
"([gG]atway)|([gG]tway)|([gG]twy)|([gG]len)|([gG]ln)|([gG]lens)|([gG]reen)|([gG]rn)|([gG]reens)|([gG]rov)|"+
"([gG]rove)|([gG]rv)|([gG]roves)|([hH]arb)|([hH]arbor)|([hH]arbr)|([hH]br)|([hH]rbor)|([hH]arbors)|([hH]aven)|"+
"([hH]vn)|([hH]t)|([hH]ts)|([hH]ighway)|([hH]ighwy)|([hH]iway)|([hH]iwy)|([hH]way)|([hH]wy)|([hH]ill)|([hH]l)|"+
"([hH]ills)|([hH]ls)|([hH]llw)|([hH]ollow)|([hH]ollows)|([hH]olw)|([hH]olws)|([iI]nlt)|([iI]s)|([iI]sland)|"+
"([iI]slnd)|([iI]slands)|([iI]slnds)|([iI]ss)|([iI]sle)|([iI]sles)|([jJ]ct)|([jJ]ction)|([jJ]ctn)|([jJ]unction)|"+
"([jJ]unctn)|([jJ]uncton)|([jJ]ctns)|([jJ]cts)|([jJ]unctions)|([kK]ey)|([kK]y)|([kK]eys)|([kK]ys)|([kK]nl)|"+
"([kK]nol)|([kK]noll)|([kK]nls)|([kK]nolls)|([lL]k)|([lL]ake)|([lL]ks)|([lL]akes)|([lL]and)|([lL]anding)|([lL]ndg)|"+
"([lL]ndng)|([lL]ane)|([lL]n)|([lL]gt)|([lL]ight)|([lL]ights)|([lL]f)|([lL]oaf)|([lL]ck)|([lL]ock)|([lL]cks)|"+
"([lL]ocks)|([lL]dg)|([lL]dge)|([lL]odg)|([lL]odge)|([lL]oop)|([lL]oops)|([mM]all)|([mM]nr)|([mM]anor)|([mM]anors)|"+
"([mM]nrs)|([mM]eadow)|([mM]dw)|([mM]dws)|([mM]eadows)|([mM]edows)|([mM]ews)|([mM]ill)|([mM]ills)|([mM]issn)|"+
"([mM]ssn)|([mM]otorway)|([mM]nt)|([mM]t)|([mM]ount)|([mM]ntain)|([mM]ntn)|([mM]ountain)|([mM]ountin)|"+
"([mM]tin)|([mM]tn)|([mM]ntns)|([mM]ountains)|([nN]ck)|([nN]eck)|([oO]rch)|([oO]rchard)|([oO]rchrd)|([oO]val)|"+
"([oO]vl)|([oO]verpass)|([pP]ark)|([pP]rk)|([pP]arks)|([pP]arkway)|([pP]arkwy)|([pP]kway)|([pP]kwy)|([pP]ky)|"+
"([pP]arkways)|([pP]kwys)|([pP]ass)|([pP]assage)|([pP]ath)|([pP]aths)|([pP]ike)|([pP]ikes)|([pP]ine)|([pP]ines)|"+
"([pP]nes)|([pP]l)|([pP]lace)|([pP]lain)|([pP]ln)|([pP]lains)|([pP]lns)|([pP]laza)|([pP]lz)|([pP]lza)|([pP]oint)|([pP]t)|"+
"([pP]oints)|([pP]ts)|([pP]ort)|([pP]rt)|([pP]orts)|([pP]rts)|([pP]r)|([pP]rairie)|([pP]rr)|([rR]ad)|([rR]adial)|"+
"([rR]adiel)|([rR]adl)|([rR]amp)|([rR]anch)|([rR]anches)|([rR]nch)|([rR]nchs)|([rR]apid)|([rR]pd)|([rR]apids)|"+
"([rR]pds)|([rR]est)|([rR]st)|([rR]dg)|([rR]dge)|([rR]idge)|([rR]dgs)|([rR]idges)|([rR]iv)|([rR]iver)|([rR]vr)|"+
"([rR]ivr)|([rR]d)|([rR]oad)|([rR]oads)|([rR]ds)|([rR]oute)|([rR]ow)|([rR]ue)|([rR]un)|([sS]hl)|([sS]hoal)|([sS]hls)|"+
"([sS]hoals)|([sS]hoar)|([sS]hore)|([sS]hr)|([sS]hoars)|([sS]hores)|([sS]hrs)|([sS]kyway)|([sS]pg)|([sS]png)|"+
"([sS]pring)|([sS]prng)|([sS]pgs)|([sS]pngs)|([sS]prings)|([sS]prngs)|([sS]pur)|([sS]purs)|([sS]q)|([sS]qr)|"+
"([sS]qre)|([sS]qu)|([sS]quare)|([sS]qrs)|([sS]quares)|([sS]ta)|([sS]tation)|([sS]tatn)|([sS]tn)|([sS]tra)|"+
"([sS]trav)|([sS]traven)|([sS]travenue)|([sS]travn)|([sS]trvn)|([sS]trvnue)|([sS]tream)|([sS]treme)|"+
"([sS]trm)|([sS]treet)|([sS]trt)|([sS]t)|([sS]tr)|([sS]treets)|([sS]mt)|([sS]umit)|([sS]umitt)|([sS]ummit)|([tT]er)|"+
"([tT]err)|([tT]errace)|([tT]hroughway)|([tT]race)|([tT]races)|([tT]rce)|([tT]rack)|([tT]racks)|([tT]rak)|"+
"([tT]rk)|([tT]rks)|([tT]rafficway)|([tT]rail)|([tT]rails)|([tT]rl)|([tT]rls)|([tT]railer)|([tT]rlr)|([tT]rlrs)|"+
"([tT]unel)|([tT]unl)|([tT]unls)|([tT]unnel)|([tT]unnels)|([tT]unnl)|([tT]rnpk)|([tT]urnpike)|([tT]urnpk)|"+
"([uU]nderpass)|([uU]n)|([uU]nion)|([uU]nions)|([vV]alley)|([vV]ally)|([vV]lly)|([vV]ly)|([vV]alleys)|"+
"([vV]lys)|([vV]dct)|([vV]ia)|([vV]iadct)|([vV]iaduct)|([vV]iew)|([vV]w)|([vV]iews)|([vV]ws)|([vV]ill)|([vV]illag)|"+
"([vV]illage)|([vV]illg)|([vV]illiage)|([vV]lg)|([vV]illages)|([vV]lgs)|([vV]ille)|([vV]l)|([vV]is)|"+
"([vV]ist)|([vV]ista)|([vV]st)|([vV]sta)|([wW]alk)|([wW]alks)|([wW]all)|([wW]y)|([wW]ay)|([wW]ays)|([wW]ell)|([wW]ells)|"+
"([wW]ls))[.]?)";

   private final String DIRECTION = "(([nN]([oOeEwW]|((orth)((west)|(east))?)|((ORTH)((WEST)|(EAST))?))?)|"+
                                    "([sS]([oOeEwW]|((outh)((west)|(east))?)|((OUTH)((WEST)|(EAST))?))?)|"+
                                    "([eE]([aA]|(ast)|(AST))?)|"+
                                    "([wW]([eE]|(est)|(EST))?))";

   private final String POST_SUFFIX = "(([,]?[ ](([#])|(Apt)|(APT)|(apt))[. ]?" +
                                      "(([1-9][0-9]{0,9})|([0-9a-zA-Z]{1,5})))?)";

   private final String PO_BOX = "([pP][.]?[ ]?[oO][.]?[ ]((box)|(BOX)|(Box))[ ]?"+
                                 "[1-9][0-9]{0,9})";

   public HouseAddress() {
   
      prompt = "Please enter a house address: ";
      regexPattern = "(((^[1-9][0-9]{0,9}[ ](([1-9][0-9]{0,9}((st)|(rd)|(th)|(nd))?)|"+
                     "([a-zA-Z .'-]{1,64}))([ ]" + STREET_SUFFIX + ")?([ ]" + DIRECTION + ")?)"+
                     POST_SUFFIX + ")|(" + "(^[1-9][0-9]{0,9}[ ](" + DIRECTION +
                     "[ ])?(([1-9][0-9]{0,9}" + "((st)|(rd)|(th)|(nd))?)|" + "([a-zA-Z .'-]{1,64}))([ ]" +
                     STREET_SUFFIX + ")?([ ]" + DIRECTION + ")?)" + POST_SUFFIX + ")|" +
                     PO_BOX + ")";
   }
}