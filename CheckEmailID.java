
package checkemail;

/**
 *
 * @author Shaikah AlMoqbel.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {
private static final String regex = "^(.+)@(.+)$";

 public static void main(String[] args) {
        
         List<String> emails = new ArrayList<String>();
       //  Test valid email addresses
       emails.add("Shaikah@Hotmail.com");
       emails.add("simplilearn@Training.com");
       emails.add("Noerply@simplilearn.org");
       // Test invalid email addresses
       emails.add("simplilearn.example.com");
       emails.add("Shaikah#example.com");
       emails.add("@simplilearn.me.org");

       //initialize the Pattern object
       Pattern pattern = Pattern.compile(regex);
       //searching for occurrences of regex
       for (String value : emails) {
       Matcher matcher = pattern.matcher(value);

      System.out.println("The Email address " + value + " is " + (matcher.matches() ? "valid" : "invalid"));
    }
    
}
}