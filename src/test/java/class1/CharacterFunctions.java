package class1;

public class CharacterFunctions {
    public static void main(){
        //character should come in single quotes
        char c1='4';
        System.out.println(Character.isDigit(c1));
        System.out.println(Character.isLowerCase(c1));

        c1='t';
        System.out.println(Character.toUpperCase(c1));
        System.out.println(Character.isLetterOrDigit(c1));

       c1='p';
        System.out.println(Character.toString(c1));
        System.out.println(Character.isDigit(c1));

        c1=' ';
        System.out.println(Character.isWhitespace(c1));

        c1='5';
        //convert character to integer
        System.out.println(Character.getNumericValue(c1));






    }
}
