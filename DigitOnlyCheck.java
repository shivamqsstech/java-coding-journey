import java.util.Scanner;

public class DigitOnlyCheck {

    public void digitChecker(String str){

        boolean isDigitOnly = !str.isEmpty();

        for(char ch : str.toCharArray()){
            if(!Character.isDigit(ch)){
                isDigitOnly =false;
                break;
            }
        }

        System.out.println("Is entered string digit only : " + isDigitOnly);

    }

  


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit");
        String str = sc.nextLine();


        DigitOnlyCheck digitOnlyCheck = new DigitOnlyCheck();
        digitOnlyCheck.digitChecker(str);


        sc.close();


    }
    
}
