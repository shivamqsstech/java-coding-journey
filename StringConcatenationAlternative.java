import java.util.Scanner;


class Main{

    public String Concat(String str1, String str2){
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);

        return sb.toString();

    }
}



public class StringConcatenationAlternative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string");
        String str2 = sc.nextLine();


        Main programLogic = new Main();
        String result = programLogic.Concat(str1, str2);
        System.out.print(result);

        sc.close();

    }
    
}
