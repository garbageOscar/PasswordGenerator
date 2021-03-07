import java.util.Random;
import java.util.Scanner;

class HelloWorld {
    // Your program begins with a call to main().
    // Prints "Hello World!" to the terminal window. - hacked by gOscar
    public static void main(String[] args) {
        int startValue = 33;    
	int character;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter password length: 8, 12, 16 (recommended), 24, 36, 128");
        int length = input.nextInt();
        System.out.println("(boolean) Would you like extended ASCII characters (ride or die)?");
        boolean fullAscii = input.nextBoolean();
        input.close();
        
        Random rand = new Random();
        if (!fullAscii) {
            int endValue = 126;
            String password = "";
            for (int a = 0; a <= length; a++) {
                password = password + (char) (rand.nextInt(endValue - startValue) + startValue);
            }
            System.out.println("Hello World!!! Password is: ***   " + password + "   ***");
        } else {
            int endValue = 255;
            String password = "";
            int a = 0;
            
            character = (rand.nextInt(endValue - startValue) + startValue);

            while (a < length) {                
				while (character == 128) {
                    character = (rand.nextInt(endValue - startValue) + startValue);
                }
                password = password + (char) (rand.nextInt(endValue - startValue) + startValue);
                character = (rand.nextInt(endValue - startValue) + startValue);
                a++;
            }
            
            System.out.println("Hello World!!! Password is: ***   " + password + "   ***");
        
        }
    }
}
