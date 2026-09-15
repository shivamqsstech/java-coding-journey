import java.util.Scanner;


 class Main{

    int CountingLogic(String str){

        String[] strArray = str.split(" ");
        int count = 0;

        for(int i = 0; i<strArray.length; i++){
            count++;
        }

        return  count;
    }
 }

public class CountWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        Main mn = new Main();
        int result = mn.CountingLogic(str);
        System.out.print("The no of words in given string is: " + result);

        sc.close();

    }
    
}
