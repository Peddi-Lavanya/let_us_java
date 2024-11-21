package let_us_java;

public class Strings_12_3 {
    public static void main(String args[]){
        String str[]={
                        "Hey lava are you okay",
                        "I think you may get hurt",
                        "I am always with you please share with meh"
        };
        
        String result="";
        for (String s : str) {
            char[] chars = s.toCharArray();
            for (char c : chars) {
                if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                      c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                    result += c;
                }
            }
        }

        System.out.println(result);
    }
}
