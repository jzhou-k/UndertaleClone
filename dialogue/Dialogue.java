import java.util.Scanner;

public class Dialogue {

    public static void main(String[] args){
        String[] dialogue = {"never", "gonna", "give","you","up"};
        Scanner sc = new Scanner(System.in);
        int i = 0;
        char keepGoing = 'c';
        
        while(keepGoing == 'c' && i < 5){
            System.out.println(dialogue[i]);
            keepGoing = sc.next().charAt(0);
            i++;
        }

    }

}



