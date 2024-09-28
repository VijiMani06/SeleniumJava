import java.lang.constant.Constable;
import java.sql.SQLOutput;

public class StringConcepts {

    // Main Function
    public static void main(String args[])
    {
        String s1 = "My first string to practice";
        System.out.println(s1);
        //prints the value stored in the variable
        // Position starts with the index=0

        System.out.println(s1.length());
        System.out.println(s1.isEmpty());// checks the given string is empty or not, in this case returns false.

        String st = " ";
        System.out.println(st.isBlank());// checks the given string is empty or have whitespace

        System.out.println(s1.replace("first","second"));
        System.out.println(s1.startsWith("My"));
        System.out.println(s1.endsWith("ti")); //false
        System.out.println(s1.endsWith("PRACTICING"));//false becos it is case sensitive and spelling wrong
        System.out.println(s1.toUpperCase().endsWith("PRACTICE"));
        System.out.println(s1.charAt(5));
        //System.out.println(s1.charAt(200));// indexOutOfBound exception error
        System.out.println(s1.substring(6)); // starts from the index position 6
        System.out.println(s1.substring(4,20));// between 4 and 20 index
        System.out.println(s1.indexOf("f"));//3 rd position
        System.out.println(s1.indexOf("string"));//this word is in 9th position
        System.out.println(s1.indexOf("to",2));//the position of "to" is in 16th position from the index 2,it counts from index 2
        System.out.println(s1.indexOf("to",2,27));//this word is in 16th position between the index 2 to 27
        System.out.println(s1.lastIndexOf("string")); // 9th position from the 0 (last occurance)
        System.out.println(s1.lastIndexOf('r'));// last occurrence of 'r'
        // lastIndexOf will not work for range like begin and endIndex
        System.out.println(s1.trim());//Removes the whitespace in start and end of a string
        System.out.println(s1.strip());//Removes the whitespace in start and end of a string
        System.out.println(s1.stripLeading());//Removes the whitespace in beginning of a string
        System.out.println(s1.stripTrailing());//Removes the whitespace in end of a string

        String s2 = "This is \n newline character y\tou se\se"; //Newline , tab space, single space(escape characters)
        System.out.println(s2);

        String s3 = "This is \nnewline character you see";
        System.out.println(s3.translateEscapes());// print string as it is without any escape characters
        System.out.println(s3);

        String s4 = "My name is Vj";
        String s5 = "My name is vj";
        System.out.println(s4.equals(s5)); // returns false because the string is case sensitive
        System.out.println(s4.equalsIgnoreCase(s5)); //returns True because of the IgnoreCase
        System.out.println(s4.compareToIgnoreCase(s5));// check both the strings are same or not, if same returns 0 ,if first string is greater
        // than second string returns 1, if less than -1 (compares the ascii value)

        System.out.println(s4.codePointAt(4)); // prints the ascii value of the 4th character
        System.out.println(s4.concat("world")); // joins the word "world" with s4 value

        String s6="hello friend";
        System.out.println(s6.hashCode());//prints exact location of the string in the memory

        System.out.println(s6.indent(4)); // add number of white spaces to the string in the beginning
        System.out.println(s6.strip()); //removes white spaces created by indent

        System.out.println(s6.replace('h','f')); //replaces the string or char first occurance
        System.out.println(s6.replaceFirst("hello","welcome"));

        //cloning a string

        String s8 = s6.intern(); //intern() refers to the memory and take the value of s6 from there and store in s8 from the string pool
        System.out.println(s8);
        System.out.println(s6==s8); // == checks the memory reference of the string and = checks the content of the string
        //Stringpool is nothing but it is the place where it will store all string values inside the heap memory which is where the program will execute.
        //constant string is the one which we cannot change the value and nor we can concatenate

        Constable s9 = "Hello world";

        System.out.println(s9);

        //Strings are immutable because if it is mutable anyone can change any value. So for security reasons, password protection it is immutable
    // is try to change it will create another memory reference  and not take the existing one for same values.

        //but string builders are mutable > It is another set of functions > continue in next concepts















    }
    }