import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string whose vowels and Consonants u want to count");
        String str = sc.nextLine().toLowerCase();
        String vowel = "aeiou";
        int vowelCount =0;
        int consonantCount = 0;

        for(char ch : str.toCharArray()){

            if(vowel.toLowerCase().indexOf(ch) != -1){
                vowelCount+=1;
            }
            else if (Character.isLetter(ch)){
                consonantCount+=1;
            }
            
        }

        System.out.println("Total no of Vowels are: " +  vowelCount);
        System.out.println("No of Consonats are: " + consonantCount);

        sc.close();
    }
    
}
