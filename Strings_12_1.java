package let_us_java;

public class Strings_12_1 {
    public static void main(String args[]){
        String[] str = {
            "We will teach you how to....",
            "Move a mountain",
            "Erase the past",
            "Make a million",
            "...all through java!"
        };

        String str1="how to";
        String str2="java";
        for(int i=0;i<str.length;i++){
            if(str[i].contains(str1)){
                str[i]=str[i].replace(str1,str2);
                
            }
        }
        for(String s:str){
            System.out.println(s);
        }
        
    }
}
