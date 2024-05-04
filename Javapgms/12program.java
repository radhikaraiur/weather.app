class StringDemo {
    public static void main(String arg[]) {
        String s1 = new String("gpt athani");
        String s2 = "GPT ATHANI";
        System.out.println("The string s1 is : " + s1);
        System.out.println("The string s2 is : " + s2);
        System.out.println("Length of the string s1 is : " + s1.length());
        System.out.println("Length of the string s2 is : " + s2.length());
        System.out.println("The String s1 in Upper Case : " + s1.toUpperCase());
        System.out.println("The String s2 in Lower Case : " + s2.toLowerCase());
        System.out.println("The first occurrence of a is at the position : " + s1.indexOf('a'));
        System.out.println("s1 equals to s2 : " + s1.equals(s2));
        System.out.println("s1 equals ignore case to s2 : " + s1.equalsIgnoreCase(s2));
        System.out.println("Character at an index of 6 is :" + s1.charAt(6));
        String s3 = s1.substring(4, 8);
        System.out.println("Extracted substring is :" + s3);
        System.out.println("After Replacing a with b in s1 : " + s1.replace('a', 'b'));
        System.out.println("After string concat :" + s1.concat(" Karnataka"));
        String s4 = " This is a book "; // White space before This word.
        System.out.println("The string s4 is :" + s4);
        System.out.println("After string trim :" + s4.trim());
        int result = s1.compareTo(s2);
        System.out.println("After compareTo");
        if (result == 0)
            System.out.println(s1 + " is equal to " + s2);
        else if (result > 0)
            System.out.println(s1 + " is greater than " + s2);
        else
            System.out.println(s1 + " is smaller than " + s2);
    }
}
