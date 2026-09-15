import java.util.LinkedHashSet;
import java.util.Scanner;


class Duplicates{
    static String removeDuplicateChar(String str){

        LinkedHashSet<Character> set = new LinkedHashSet<>();


        for(char ch: str.toCharArray()){
            set.add(ch);
        }

        StringBuilder sb = new StringBuilder();

        for(char ch : set){
            sb.append(ch);
        }
        
        System.out.println(sb.toString());

        return str;
    }
}

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        Duplicates.removeDuplicateChar(str);

        sc.close();




    }
    
}
