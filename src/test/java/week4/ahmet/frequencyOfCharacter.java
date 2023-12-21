package week4.ahmet;

public class frequencyOfCharacter {


    public static void main(String[] args) {
        FrequencyOfChars("AAABBCDD");
        FrequencyOfCharacter("AAABBCDD");
        System.out.println("unique(\"AAABBCDD\") = " + unique("AAABBCDD"));


        //String
        //Frequency of Characters
        //Write a return method that can find the frequency of
        //characters
        //Ex:
        //FrequencyOfChars ("AAABBCDD") ==> A3B2C1D2

    }

    public static void FrequencyOfChars(String str) {

        String result = "";  //A3B2C1D2

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); //A
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            if (result.contains("" + ch)) {
                continue;
            }
            result += ch + "" + count;
        }


        System.out.println("result = " + result);
    }


    public static void FrequencyOfCharacter(String character) {

        char ch = 'C';

        int count = 0;

        for (int i = 0; i < character.length(); i++) {

            if (character.charAt(i) == ch) {

                count++;
            }
        }
        System.out.println(count);
    }

    public static String unique(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result += ch + "";
            }
        }
        return result;


    }
}
