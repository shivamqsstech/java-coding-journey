import java.util.Scanner;


class ToggleCaseCodeClass{
    public static void CaseToggleCode(String str){
        StringBuilder sb = new StringBuilder();

        for(char ch: str.toCharArray()){
            if(Character.isUpperCase(ch)){
                char lowerCase = Character.toLowerCase(ch);
                sb.append(lowerCase);       
            
            }
            else if(Character.isLowerCase(ch)){
                char upperCase = Character.toUpperCase(ch);
                sb.append(upperCase);
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println("The new String is: " + sb);

        
    }
}

public class ToggleCase {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        ToggleCaseCodeClass.CaseToggleCode(str);

        sc.close();

    }
    
}
