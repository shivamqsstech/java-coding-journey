import java.util.Scanner;


class LengthCount{
    public static void Count(String str){

        int count =0;

        for(char ch: str.toCharArray()){
            System.out.print(ch);
            count+=1;
        }

        System.out.println("The length of the strings is: " + count);
    }

}



public class StringLength {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string whose length you want to count");
        String str = sc.nextLine();
        LengthCount.Count(str);
        sc.close();


    }
    
}
