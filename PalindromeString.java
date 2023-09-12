package Zeri;

public class PalindromeString {
    public static void main(String[] args) {
        String str="Java is a programming language", res="";
        for (int i = 0; i <str.length() ; i++) {
            res=str.charAt(i)+res;
        }
        System.out.println(res);
        if(str.equals(res)){
            System.out.println("palindrome String");
        }
        else{
            System.out.println("not a palindrome String");
        }
    }
}

class StringPalindrome2{
    public static void main(String[] args) {
        String str="abbbbbbbbbba";
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String res=sb.toString();
        if(str.equals(res)){
            System.out.println("Palindrone String");
        }
        else{
            System.out.println("not palindrome string");
        }
    }
}