package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] sArr = str.split(" ");
        StringBuilder result = new StringBuilder();
        for(String s : sArr){
            result.append(parse(s)).append(" ");
        }
        return result.toString().substring(0,result.length()-1);
    }

    public String parse(String str){
        if( isV(str.charAt(0)) )
            return str+"way";
        else{
            int trim = 0;
            String tail = "";
            for(char c :str.toCharArray()){
                if(!isV(c)){
                    tail += c+"";
                    trim++;
                }else
                    break;
            }

            String res = str.substring(trim);
            return res+tail+"ay";
        }
    }

    public boolean isV (char c){
        return c == 'a' || c == 'A' ||
                c == 'e' || c == 'E' ||
                c == 'i' || c == 'I' ||
                c == 'o' || c == 'O' ||
                c == 'u' || c == 'U';
    }
}
