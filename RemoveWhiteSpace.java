import java.util.Scanner;

public class RemoveWhiteSpace {

    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch)){
                sb = sb.append(ch);
            }
        }

        System.out.println(sb);

        sc.close();
    }
    
}
