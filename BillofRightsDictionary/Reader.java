import java.util.Scanner;
/**
 * Write a description of class Reader here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Reader
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a known constitutional right: ");
        String str = input.nextLine();
        while(str.equals("quit") == false){
            System.out.println(search(str));
            System.out.print("Enter a known constitutional right: ");
            str = input.nextLine();
        }
    }

    public static String search(String s){
        if(s.toLowerCase().contains("speech") || s.toLowerCase().contains("press")|| s.toLowerCase().contains("religion")||s.toLowerCase().contains("assembl"))
            return "First Amendment";
        else if(s.toLowerCase().contains("arms") || s.toLowerCase().contains("guns"))
            return "Second Amendment";
        else if(s.toLowerCase().contains("housing") || s.toLowerCase().contains("soldiers"))
            return "Third Amendment";
        else if(s.toLowerCase().contains("search") || s.toLowerCase().contains("seizure") || s.toLowerCase().contains("warrant") ||  s.toLowerCase().contains("probable cause"))
            return "Fourth Amendment";
        else if(s.toLowerCase().contains("life") || s.toLowerCase().contains("liberty")|| s.toLowerCase().contains("property")|| s.toLowerCase().contains("jeopardy")|| s.toLowerCase().contains("due process"))
            return "Fifth Amendment";
        else if(s.toLowerCase().contains("trial")){
            if(s.toLowerCase().contains("civil") || s.toLowerCase().contains("common")){
                return "Seventh Amendment";
            }
            return "Sixth Amendment";
        }
        else if(s.toLowerCase().contains("witness") || s.toLowerCase().contains("accusation")|| s.toLowerCase().contains("counsel")){
            return "Sixth Amendement";

        }

        else if(s.toLowerCase().contains("bail") || s.toLowerCase().contains("punishment"))
            return "Eighth Amendment";
        else if(s.toLowerCase().contains("deny") || s.toLowerCase().contains("disparage")|| s.toLowerCase().contains("people"))
            return "Ninth Amendment";
        else if(s.toLowerCase().contains("delegated") || s.toLowerCase().contains("reserved"))
            return "Tenth Amendment";
        else
            return "not in the Bill of Rights";
    }
}
