import java.util.Scanner;

class DigitOnlyChecker {

    public void ActualDigitCheckingCode(String str){
        boolean isDigitOnly = !str.isEmpty();

        for(char ch: str.toCharArray()){
            if(!Character.isDigit(ch)){
                isDigitOnly = false;
                break;
            }
        }
        
    System.out.println("Is it only Digit:" +isDigitOnly );


    }




    public class Main{
        public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           String str = sc.nextLine();

           DigitOnlyChecker digitChecker = new DigitOnlyChecker();
           digitChecker.ActualDigitCheckingCode(str);

            sc.close();

        }
    }
    
}
