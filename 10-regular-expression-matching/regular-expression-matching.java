import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Solution {
    public boolean isMatch(String s, String p) {
        Pattern pattern = Pattern.compile(p);
        Matcher m = pattern.matcher(s);
        return m.matches();
    }
}