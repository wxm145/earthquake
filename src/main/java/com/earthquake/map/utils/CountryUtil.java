package com.earthquake.map.utils;

/**
 * @author wangxiaomiao
 * @create 2022-08-09 23:26
 */
public class CountryUtil {

    public static String getCountryNameCnEnCodeByCountryCode(String countryCode) {
        String countryName = null;
        switch (countryCode) {
            case "美国":
                countryName = "United State,US";
                break;
            case "英国":
                countryName = "United Kingdom,GB";
                break;
            case "德国":
                countryName = "Germany,DE";
                break;
            case "加拿大":
                countryName = "Canada,CA";
                break;
            case "日本":
                countryName = "Japan,JP";
                break;
            case "西班牙":
                countryName = "Spain,ES";
                break;
            case "法国":
                countryName = "France,FR";
                break;
            case "意大利":
                countryName = "Italy,IT";
                break;
            case "中国":
                countryName = "China,CN";
                break;
            case "奥地利":
                countryName = "Austria,AT";
                break;
            case "澳大利亚":
                countryName = "Australian,AU";
                break;
            case "瑞士":
                countryName = "Switzerland,CH";
                break;
            case "埃及":
                countryName = "Egypt,EG";
                break;
            case "芬兰":
                countryName = "Finland,FI";
                break;
            case "印度":
                countryName = "India,IN";
                break;
            case "爱尔兰":
                countryName = "Ireland,IE";
                break;
            case "印度尼西亚":
                countryName = "Indonesia,ID";
                break;
            case "柬埔寨":
                countryName = "Cambodia,KH";
                break;
            case "韩国":
                countryName = "Korea,KR";
                break;
            case "墨西哥":
                countryName = "Mexico,MX";
                break;
            case "荷兰":
                countryName = "Holland,NL";
                break;
            case "挪威":
                countryName = "Norway,NO";
                break;
            case "缅甸":
                countryName = "Burma,MM";
                break;
            case "菲律宾":
                countryName = "Philippines,PH";
                break;
            case "比利时":
                countryName = "Belgium,BE";
                break;
            case "圭亚那":
                countryName = "Guyana,GY";
                break;
            case "瑞典":
                countryName = "Sweden,SE";
                break;
            case "巴拉圭":
                countryName = "Paraguay,PY";
                break;
            case "乌克兰":
                countryName = "Ukraine,UA";
                break;
            case "秘鲁":
                countryName = "Peru,PE";
                break;
            case "阿联酋":
                countryName = "United Arab Emirates,AE";
                break;
            case "越南":
                countryName = "Vietnam,VN";
                break;
            case "索马里":
                countryName = "Somalia,SO";
                break;
            case "老挝":
                countryName = "Laos,LA";
                break;
            case "科威特":
                countryName = "Kuwait,KW";
                break;
            case "马来西亚":
                countryName = "Malaysia,MY";
                break;
            case "丹麦":
                countryName = "Denmark,DK";
                break;
            case "巴基斯坦":
                countryName = "Pakistan,PK";
                break;
            case "泰国":
                countryName = "Thailand,TH";
                break;
            case "匈牙利":
                countryName = "HUNGARY,HU";
                break;
            case "拉脱维亚":
                countryName = "Latvia,LV";
                break;
            case "俄罗斯":
                countryName = "Russia,RU";
                break;
            case "捷克":
                countryName = "Czech Republic,CZ";
                break;
            case "波兰":
                countryName = "Poland,PL";
                break;
            case "白俄罗斯":
                countryName = "Belarus,BY";
                break;
            case "立陶宛":
                countryName = "Lithuania,LT";
                break;
            case "卢森堡":
                countryName = "Luxembourg,LU";
                break;
            case "安道尔":
                countryName = "Andorra,AD";
                break;
            case "安提瓜":
                countryName = "Antigua and Barbuda,AG";
                break;
            case "罗马尼亚":
                countryName = "Romania,RO";
                break;
            case "亚美尼亚":
                countryName = "Armenia,AM";
                break;
            case "佛得角":
                countryName = "Cape Verde,CV";
                break;
            case "阿尔及利亚":
                countryName = "Algeria,DZ";
                break;
            case "东帝汶":
                countryName = "Timor-Leste,TL";
                break;
            case "毛里求斯":
                countryName = "Mauritius,MU";
                break;
            case "赞比亚":
                countryName = "Zambia,ZM";
                break;
            case "圣巴泰勒米":
                countryName = "St. Barthelemy,BL";
                break;
            case "圣马丁":
                countryName = "St. Martin,SX";
                break;
            case "巴林":
                countryName = "Bahrain,BH";
                break;
            case "冈比亚":
                countryName = "Gambia,GM";
                break;
            case "马尔代夫":
                countryName = "Maldives,MV";
                break;
            case "库克群岛":
                countryName = "Cook Islands,CK";
                break;
            case "留尼汪岛":
                countryName = "Reunion Island,RE";
                break;
            case "伊拉克":
                countryName = "Iraq,IQ";
                break;
            case "格林纳达":
                countryName = "Grenada,GD";
                break;
            case "密克罗尼西亚":
                countryName = "Micronesia,Federated States of,FM";
                break;
            case "委内瑞拉":
                countryName = "Venezuela,VE";
                break;
            case "新喀里多尼亚":
                countryName = "New Caledonia,NC";
                break;
            case "尼泊尔":
                countryName = "Nepal,NP";
                break;
            case "摩尔多瓦共和国":
                countryName = "Moldova,MD";
                break;
            case "梵蒂冈":
                countryName = "Vatican City(Italy),VA";
                break;
            case "瓜德罗普岛":
                countryName = "Guadeloupe,GP";
                break;
            case "关岛":
                countryName = "Guam,GU";
                break;
            case "纳米比亚":
                countryName = "Namibia,NA";
                break;
            case "卡塔尔":
                countryName = "Qatar,QA";
                break;
            case "马约特岛岛":
                countryName = "Mayotte,YT";
                break;
            case "黑山":
                countryName = "Montenegro,ME";
                break;
            case "不丹":
                countryName = "Bhutan,BT";
                break;
            case "乌兹别克斯坦":
                countryName = "Uzbekistan,UZ";
                break;
            case "瓦利斯群岛和富图纳群岛":
                countryName = "Wallis & Futuna Islands,WF";
                break;
            case "约旦":
                countryName = "Jordan,JO";
                break;
            case "马其顿":
                countryName = "Macedonia(FYROM),MK";
                break;
            case "布基纳法索":
                countryName = "Burkina Faso,BF";
                break;
            case "尼日尔":
                countryName = "Niger,NE";
                break;
            case "威尔士（英国）":
                countryName = "Wales(United Kingdom),WL";
                break;
            case "格鲁吉亚":
                countryName = "Georgia,GE";
                break;
            case "冰岛":
                countryName = "Iceland,IS";
                break;
            case "厄立特里亚":
                countryName = "Eritrea,ER";
                break;
            case "科摩罗":
                countryName = "Comoros,KM";
                break;
            case "塞内加尔":
                countryName = "Senegal,SN";
                break;
            case "爱沙尼亚":
                countryName = "Estonia,EE";
                break;
            case "澳门":
                countryName = "Macau,MO";
                break;
            case "斯洛文尼亚":
                countryName = "Slovenia,SI";
                break;
            case "乌干达":
                countryName = "Uganda,UG";
                break;
            case "津巴布韦":
                countryName = "Zimbabwe,ZW";
                break;
            case "乍得":
                countryName = "Chad,TD";
                break;
            case "格陵兰岛":
                countryName = "Greenland,GL";
                break;
            case "阿富汗":
                countryName = "Afghanistan,AF";
                break;
            case "刚果人民共和国":
                countryName = "Congo,Democratic Republic of,CD";
                break;
            case "蒙古":
                countryName = "Mongolia,MN";
                break;
            case "毛里塔尼亚":
                countryName = "Mauritania,MR";
                break;
            case "哥伦比亚":
                countryName = "Colombia,CO";
                break;
            case "特立尼达和多巴哥":
                countryName = "Trinidad & Tobago,TT";
                break;
            case "苏格兰":
                countryName = "Scotland(United Kingdom),SF";
                break;
            case "中非共和国":
                countryName = "Central African Republic,CF";
                break;
            case "直布罗陀":
                countryName = "Gibraltar,GI";
                break;
            case "开曼群岛":
                countryName = "Cayman Islands,KY";
                break;
            case "尼加拉瓜":
                countryName = "Nicaragua,NI";
                break;
            case "多哥":
                countryName = "Togo,TG";
                break;
            case "赤道几内亚":
                countryName = "Equatorial Guinea,GQ";
                break;
            case "圣基茨":
                countryName = "St. Kitts and Nevis,KN";
                break;
            case "托尔托拉岛（英属处女岛）":
                countryName = "Tortola(British Virgin Islands),ZZ";
                break;
            case "坦桑尼亚共和国":
                countryName = "Tanzania,United Republic of,TZ";
                break;
            case "肯尼亚":
                countryName = "Kenya,KE";
                break;
            case "马绍尔群岛":
                countryName = "Marshall Islands,MH";
                break;
            case "哈萨克斯坦":
                countryName = "Kazakhstan,KZ";
                break;
            case "沙特阿拉伯":
                countryName = "Saudi Arabia,SA";
                break;
            case "文莱":
                countryName = "Brunei Darussalam,BN";
                break;
            case "叙利亚":
                countryName = "Syrian Arab Republic,SY";
                break;
            case "洪都拉斯":
                countryName = "Honduras,HN";
                break;
            case "巴布亚新几内亚":
                countryName = "Papua New Guinea,PG";
                break;
            case "海地":
                countryName = "Haiti,HT";
                break;
            case "圣马力诺":
                countryName = "San Marino,SM";
                break;
            case "马拉维":
                countryName = "Malawi,MW";
                break;
            case "喀麦隆":
                countryName = "Cameroon,CM";
                break;
            case "马达加斯加":
                countryName = "Madagascar,MG";
                break;
            case "葡萄牙":
                countryName = "Portugal,PT";
                break;
            case "哥斯达黎加":
                countryName = "Costa Rica,CR";
                break;
            case "百慕大":
                countryName = "Bermuda,BM";
                break;
            case "苏里南":
                countryName = "Suriname,SR";
                break;
            case "所罗门群岛":
                countryName = "Solomon Islands,SB";
                break;
            case "大溪地":
                countryName = "Tahiti(French Polynesia),TA";
                break;
            case "库拉索":
                countryName = "Curacao,CW";
                break;
            case "中国台湾":
                countryName = "Taiwan,TW";
                break;
            case "塞拉里昂":
                countryName = "Sierra Leone,SL";
                break;
            case "特鲁克岛（密克罗尼西亚联邦）":
                countryName = "Truk(Micronesia Federated States of),TU";
                break;
            case "联盟群岛（圣文森特和格林纳丁斯群岛）":
                countryName = "Union Islands(St. Vincent & the Grenadines),UI";
                break;
            case "圣托马斯（美属维尔京群岛）":
                countryName = "St. Thomas(U.S. Virgin Islands),VL";
                break;
            case "诺福克":
                countryName = "Norfolk Island(Australia),NF";
                break;
            case "危地马拉":
                countryName = "Guatemala,GT";
                break;
            case "保加利亚":
                countryName = "Bulgaria,BG";
                break;
            case "波纳佩岛（密克罗尼西亚联邦）":
                countryName = "Ponape(Micronesia Federated States of),PO";
                break;
            case "阿鲁巴岛":
                countryName = "Aruba,AW";
                break;
            case "厄瓜多尔":
                countryName = "Ecuador,EC";
                break;
            case "塞尔维亚":
                countryName = "Serbia,RS";
                break;
            case "巴哈马":
                countryName = "Bahamas,BS";
                break;
            case "玻利维亚":
                countryName = "Bolivia,BO";
                break;
            case "帕劳":
                countryName = "Palau,PW";
                break;
            case "吉尔吉斯斯坦":
                countryName = "Kirghizia(Kyrgyzstan),KG";
                break;
            case "特克斯和凯科斯群岛":
                countryName = "Turks & Caicos Islands,TC";
                break;
            case "圣卢西亚":
                countryName = "St. Lucia,LC";
                break;
            case "阿塞拜疆":
                countryName = "Azerbaijan,AZ";
                break;
            case "马耳他":
                countryName = "Malta,MT";
                break;
            case "布隆迪":
                countryName = "Burundi,BI";
                break;
            case "安哥拉":
                countryName = "Angola,AO";
                break;
            case "塞浦路斯":
                countryName = "Cyprus,CY";
                break;
            case "巴西":
                countryName = "Brazil,BR";
                break;
            case "西萨摩亚":
                countryName = "Samoa Western,WS";
                break;
            case "奥兰群岛":
                countryName = "Aland Island(Finland),AX";
                break;
            case "利比里亚":
                countryName = "Liberia,LR";
                break;
            case "法罗群岛":
                countryName = "Faroe Islands,FO";
                break;
            case "圣约翰（美属维尔京群岛）":
                countryName = "St. John(U.S. Virgin Islands),UV";
                break;
            case "新加坡":
                countryName = "Singapore,SG";
                break;
            case "尼日利亚":
                countryName = "Nigeria,NG";
                break;
            case "巴拿马":
                countryName = "Panama,PA";
                break;
            case "吉布提":
                countryName = "Djibouti,DJ";
                break;
            case "斯威士兰":
                countryName = "Swaziland,SZ";
                break;
            case "多米尼加共和国":
                countryName = "Dominican Republic,DO";
                break;
            case "摩斯雷（密克罗尼西亚联邦）":
                countryName = "Kosrae(Micronesia Federated States of),KO";
                break;
            case "莫桑比克":
                countryName = "Mozambique,MZ";
                break;
            case "美国萨摩亚群岛":
                countryName = "American Samoa,AS";
                break;
            case "乌拉圭":
                countryName = "Uruguay,UY";
                break;
            case "科特迪瓦共和国":
                countryName = "Republic Of Ivory Coast,KT";
                break;
            case "阿尔巴尼亚":
                countryName = "Albania,AL";
                break;
            case "刚果":
                countryName = "Congo,CG";
                break;
            case "安圭拉":
                countryName = "Anguilla,AI";
                break;
            case "卢旺达":
                countryName = "Rwanda,RW";
                break;
            case "希腊":
                countryName = "Greece,GR";
                break;
            case "博茨瓦纳":
                countryName = "Botswana,BW";
                break;
            case "克罗地亚":
                countryName = "Croatia,HR";
                break;
            case "塞舌尔":
                countryName = "Seychelles,SC";
                break;
            case "新西兰":
                countryName = "New Zealand,NZ";
                break;
            case "法属波利尼西亚":
                countryName = "French Polynesia,PF";
                break;
            case "马里":
                countryName = "Mali,ML";
                break;
            case "瓦努阿图":
                countryName = "Vanuatu,VU";
                break;
            case "北马里亚纳群岛":
                countryName = "Northern Mariana Islands,MP";
                break;
            case "土耳其":
                countryName = "Turkey,TR";
                break;
            case "波斯尼亚黑塞哥维那":
                countryName = "Bosnia and Herzegovina,BA";
                break;
            case "利比亚":
                countryName = "Libyan Arab Jamahiriya,LY";
                break;
            case "萨尔瓦多":
                countryName = "El Salvador,SV";
                break;
            case "突尼斯":
                countryName = "Tunisia,TN";
                break;
            case "圣克里斯托佛岛及尼维斯岛":
                countryName = "St. Christopher(St. Kitts),SW";
                break;
            case "阿根廷":
                countryName = "Argentina,AR";
                break;
            case "也门":
                countryName = "Yemen,Republic of,YE";
                break;
            case "塔吉克斯坦":
                countryName = "Tajikistan,TJ";
                break;
            case "加蓬":
                countryName = "Gabon,GA";
                break;
            case "斐济":
                countryName = "Fiji,FJ";
                break;
            case "几内亚":
                countryName = "Guinea,GN";
                break;
            case "加纳":
                countryName = "Ghana,GH";
                break;
            case "孟加拉国":
                countryName = "Bangladesh,BD";
                break;
            case "图瓦卢":
                countryName = "Tuvalu,TV";
                break;
            case "雅浦（密克罗尼西亚联邦）":
                countryName = "Yap(Micronesia,Federated States of),YA";
                break;
            case "列支敦士登":
                countryName = "Liechtenstein,LI";
                break;
            case "塞班岛":
                countryName = "Saipan(Northern Mariana Islands),SP";
                break;
            case "黎巴嫩":
                countryName = "Lebanon,LB";
                break;
            case "马提尼克岛":
                countryName = "Martinique,MQ";
                break;
            case "南非":
                countryName = "South Africa,ZA";
                break;
            case "贝宁":
                countryName = "Benin,BJ";
                break;
            case "阿曼":
                countryName = "Oman,OM";
                break;
            case "汤加":
                countryName = "Tonga,TO";
                break;
            case "斯洛伐克":
                countryName = "Slovakia,SK";
                break;
            case "巴巴多斯":
                countryName = "Barbados,BB";
                break;
            case "摩洛哥":
                countryName = "Morocco,MA";
                break;
            case "以色列":
                countryName = "Israel,IL";
                break;
            case "斯里兰卡":
                countryName = "Sri Lanka,LK";
                break;
            case "博内尔":
                countryName = "Bonaire,St. Eustatius,Saba,BQ";
                break;
            case "波多黎各":
                countryName = "Puerto Rico,PR";
                break;
            case "蒙特塞拉特":
                countryName = "Montserrat,MS";
                break;
            case "土库曼斯坦":
                countryName = "Turkmenistan,TM";
                break;
            case "基里巴斯":
                countryName = "Kiribati,KI";
                break;
            case "几内亚比绍":
                countryName = "Guinea-Bissau,GW";
                break;
            case "加那利群岛":
                countryName = "Canary Islands(Spain),IC";
                break;
            case "法属圭亚那":
                countryName = "French Guiana,GF";
                break;
            case "莱索托":
                countryName = "Lesotho,LS";
                break;
            case "泽西岛":
                countryName = "Jersey(Channel Islands),JE";
                break;
            case "多米尼加":
                countryName = "Dominica,DM";
                break;
            case "埃塞俄比亚":
                countryName = "Ethiopia,ET";
                break;
            case "伯利兹":
                countryName = "Belize,BZ";
                break;
            case "根西岛":
                countryName = "Guernsey(Channel Islands),GG";
                break;
            case "牙买加":
                countryName = "Jamaica,JM";
                break;
            case "北爱尔兰":
                countryName = "Northern Ireland(United Kingdom),NB";
                break;
            case "智利":
                countryName = "Chile,CL";
                break;
            case "苏丹":
                countryName = "Sudan,SD";
                break;
            case "科特迪瓦（象牙海岸）":
                countryName = "ivory coast,CI";
                break;
            case "荷属安的列斯群岛":
                countryName = "Netherlands antilles,AN";
                break;
            case "科科斯群岛":
                countryName = "Cocos(Keeling) Islands,CC";
                break;
            case "古巴":
                countryName = "Cuba,CU";
                break;
            case "摩纳哥":
                countryName = "Monaco,MC";
                break;
            case "圣文森特岛":
                countryName = "St. Vincent & the Grenadines,VC";
                break;
            case "香港":
                countryName = "HongKong,HK";
                break;
            case "伊朗":
                countryName = "Iran,Iran";
                break;
            case "刚果民主共和国":
                countryName = "Democratic Republic of the Congo,drc";
                break;
            case "南乔治亚和南桑威奇群岛":
                countryName = "South Georgia and South Sandwich Islands,";
                break;
            case "南极洲":
                countryName = "Antarctica, ";
                break;
            case "南苏丹":
                countryName = "South Sudan,";
                break;
            case "土库曼":
                countryName = "Turkmen,";
                break;
            case "圣基茨和尼维斯":
                countryName = "Saint Kitts and Nevis,";
                break;
            case "坦桑尼亚":
                countryName = "Tanzania,";
                break;


            case "多米尼克":
                countryName = "dominica,";
                break;
            case "安提瓜和巴布达":
                countryName = "Antigua and Barbuda,";
                break;
            case "斯瓦尔巴群岛和扬巴延岛":
                countryName = "Svalbard and Jan Mayen,";
                break;
            case "格陵兰":
                countryName = "Greenland,";
                break;
            case "波黑":
                countryName = "Bosnia and Herzegovina,";
                break;
            case "瓜德罗普":
                countryName = "Guadeloupe,";
                break;
            case "瓦利斯和富图纳群岛":
                countryName = "Wallis and Futuna Islands,";
                break;
            case "科索沃":
                countryName = "Kosovo,";
                break;
            case "美属维尔京群岛":
                countryName = "Virgin Islands,";
                break;
            case "英属印度洋领地":
                countryName = "the Indian Ocean,";
                break;
            case "赫德岛和麦克唐纳群岛":
                countryName = "Hurd island and MacDonald Islands,";
                break;
            case "马提尼克":
                countryName = "Tanzania,HK";
                break;
            default:
                countryName = countryCode;
                break;
        }
        return countryName;
    }

}
