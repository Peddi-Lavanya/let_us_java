package let_us_java;
import java.util.*;
public class inheritance_13_1 {
String str;
public inheritance_13_1(String str){
    this.str=str;
}
public int length(){
    return str.length();
}
public String toUpper(){
    return str.toUpperCase();
}
public String toLower(){
    return str.toLowerCase();
}

    public static void main(String args[]){
        inheritance_13_1 in=new inheritance_13_1("LaVanyA");
        System.out.println("length of the string is:"+in.length());
        String lowerCaseString=in.toLower();
        System.out.println("the string with lower casse is:"+lowerCaseString);
        String upperCaseString=in.toUpper();
        System.out.println("the string with upper casse is:"+upperCaseString);
    }
}
