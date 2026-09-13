// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


class Main{
    void AnagramCheckLogic(String str1, String str2){
        char[] charsArray1 = str1.toCharArray();
        Arrays.sort(charsArray1);

        char[] charsArray2 = str2.toCharArray();
        Arrays.sort(charsArray2);
        String sortedStr1 = new String(charsArray1);
        String sortedStr2 = new String(charsArray2);

        if(sortedStr1.equals(sortedStr2)){
            System.out.println("Anagram");
        }

        else{
            System.out.print("Not an Anagram");
        }




    }
}

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String str1 = sc.nextLine().toLowerCase();
        System.out.println("Enter the second String");
        String str2 = sc.nextLine().toLowerCase();


        Main mn = new Main();
        mn.AnagramCheckLogic(str1, str2);


        sc.close();


    }
    
}
