import java.util.*;
public class ReverseStringUsingInbuiltMethod {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the new string: ");
        String str = sc.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println(reversed);

        sc.close();  
    

    }
    
}
