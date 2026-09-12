import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string from whom u want to count the character");
        String str = sc.nextLine();
        System.out.println("Enter the target character");
        char target = sc.next().charAt(0);
        int noOfOccurence = 0;

        for(char ch : str.toCharArray()){
            if(ch == target){
                noOfOccurence+=1;
            }

        }
        System.out.print(target + " occured : " + noOfOccurence + "times");

        sc.close();

    }
    
}
