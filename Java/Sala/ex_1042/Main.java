import java.util.Scanner;
 
public class Main {
 
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
       
        int X, Y, Z, min1;
        int min2 = 0, min3 = 0;
        
        X = input.nextInt();
        Y = input.nextInt();
        Z = input.nextInt();

        min1 = Math.min(X, Math.min(Y, Z));

        if (min1 == X) {
            min2 = Math.min(Y, Z);
            min3 = Math.max(Y, Z);
        }

        else if (min1 == Y) {
            min2 = Math.min(X, Z);
            min3 = Math.max(X, Z);
        }
        else if (min1 == Z) {
            min2 = Math.min(X, Y);
            min3 = Math.max(X, Y);
        }
        System.out.print(min1+"\n"+min2+"\n"+min3+"\n\n");
        System.out.print(X+"\n"+Y+"\n"+Z+"\n");
 
    }
 
}
