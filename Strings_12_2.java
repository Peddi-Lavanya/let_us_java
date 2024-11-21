package let_us_java;

public class Strings_12_2 {
    public static void main(String args[]){
        String s[]={
            "To err is human...",
            "But to really mess things up....",
            "One needs to know java!!"
        };
        for(int i=0;i<s.length;i++){
            s[i]=new StringBuilder(s[i]).reverse().toString();

        }
        for(String str:s){
            System.out.println(str);
        }
    }
}
