import java.util.Scanner;

public class Main {
	
    public static void main(String args[]) {
    	Scanner s = new Scanner(System.in);
        
    	int soma = 0;
		int X = s.nextInt();
		int Y = s.nextInt();

		if (X < Y) {
			for (int i = X + 1; i < Y; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		} else {
			for (int i= Y + 1; i < X; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		}
		System.out.println(soma);
    }
	
}