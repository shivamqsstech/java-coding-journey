import java.util.Scanner;

public class ReversingString {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string u want to reverse: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i = str.length()-1 ; i>=0; i--){
            sb.append(str.charAt(i));
        }

        System.out.println(sb);


        sc.close();

    }
    
}
