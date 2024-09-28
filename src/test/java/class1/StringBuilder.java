public void main() {
    StringBuilder s1 = new StringBuilder("New world");
    System.out.println(s1);

    s1.append("Today is good evening"); //add to the original string
    System.out.println(s1);

    s1.delete(7, 8); // delete character between 7th and 10th index position
    s1.deleteCharAt(10);// delete character at 10th position

    s1.insert(15, "old data"); //this will insert the string called "old data" in the 15th index position of s1.

    System.out.println(s1.capacity());// default capacity of string is 16, this displays maximum how much capacity a sting can handle
    //it will increase the size as the string size increases
    s1.ensureCapacity(100);// ensures the minimum capacity of the string builder is 100

    System.out.println(s1.reverse());//prints the string in reverse order
    System.out.println(s1.replace(10,25,"Name"));
    System.out.println(s1.repeat(3,7));

    String s3="welcome";
    StringBuilder s4 = new StringBuilder(s3); //convert string to string builder
            String s5="My data";
    System.out.println(s5.contentEquals(s4));//  checks the content is same in s5 with s4 in string builder

//String buffer is thread safe and synchronized
}
