import java.util.Scanner;

public class IsStringPallindrome {

    public  static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the string: ");

        String str = sc.nextLine().toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();

        if(str.equals(reversed)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        sc.close();

    }
    
}
