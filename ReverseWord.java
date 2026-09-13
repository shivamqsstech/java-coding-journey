import java.util.Arrays;
import java.util.Scanner;


class Main{
    void ReverseWordCode(String str1){
        String[] words = str1.split(" ");
        System.out.println(Arrays.toString(words));
    }
}

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");

        String str1 = sc.nextLine();

        Main mn = new Main();
        mn.ReverseWordCode(str1);
        sc.close();
    }
    
}
