package class1;

public class MethodDeclarations {
    public static void main(String[] args){
        method1();
        method2();
        int a=10;
        int b=20;

        System.out.println(sumofTwonumbers(a,b));
        //inside this static block we can call static and non-static methods, variables...etc

    }
        //Method is the collection of statements that are grouped together to perform a specific task
        //Syntax
        //accessSpecifier/accessModifier returnType methodName(parameters);

        // There are 4 types of access specifiers
        // Public(can call the method anywhere in the project) , Private(can only use within that class), Protected and Default

        // The types of returnType are
        //Void (if the value returned is empty), integer(int), character(char), Boolean(Boolean), float (float), double(double)

        private static void method1()
        {
            //we can call this method only inside the same class.
            System.out.println("This is method1");
        }
        public static void method2()
        {
            // we can call this method anywhere inside the package since it is public
            System.out.println("This is method2");

        }
        //we cannot give same name and same parameters to two methods. If we give 2 same names but different parameters then that is called method overloading
      //  public static int sumofTwonumbers(int a, int b){

    //}

    public static int sumofTwonumbers(int a, int b){
        return a+b;
    }
    public static int sumofTwonumbers(int a, int b, int c){ //this is method overloading
        return a+b;}



    }

