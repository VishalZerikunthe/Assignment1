package Zeri;

public class StringReverse1 {
    public static void main(String[] args) {
        String str="Java is a programming language";
        char []charArray=str.toCharArray();
        for (int i = charArray.length-1; i >=0  ; i--) {
            System.out.print(str.charAt(i));
        }
    }
}

class StringReverse2{
    public static void main(String[] args) {
        String str="Java is a programming language",res="";
        for (int i = 0; i <str.length() ; i++) {
             res=str.charAt(i)+res;
        }
        System.out.println(res);
    }
}

class StringReverse3{
    public static void main(String[] args) {
        String str="Java is a programming language";
        StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
