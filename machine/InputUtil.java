package machine;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class InputUtil {
    static Scanner scanner=new Scanner(System.in);
    public static int InputInt(){
        int i;
            for(;;) {
                try {
                    i = Integer.parseInt(Input());
                    return i;
                } catch (Exception e) {
                    System.out.println("Error in input, please re-enter");
                    continue;
                }
            }
    }
    private static String Input(){
        return scanner.nextLine();
    }
}
