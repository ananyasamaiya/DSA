import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Solution {
    public boolean isValid(String word) {
        Pattern p = Pattern.compile("^(?=.*[aeiouAEIOU])(?=.*[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z])[a-zA-Z0-9]{3,}$");
        Matcher m = p.matcher(word);
        return m.matches();
    }
}