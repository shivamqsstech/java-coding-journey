import java.util.HashMap;
import java.util.Scanner;

class Main{
    char  countCharacter(String str){

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch: str.toCharArray()){

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }

        for(char ch: str.toCharArray()){
            if(map.get(ch)==1){
                return ch;
            }
        }


        return 0;

    }
}

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine().toLowerCase();

        Main mn = new Main();
        char ans = mn.countCharacter(str);
        System.out.println("The firste non-repeating character is : " + ans);
        sc.close();

    }
    
}
