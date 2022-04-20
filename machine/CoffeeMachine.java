package machine;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Coffee coffee=new Coffee();
        Scanner scanner=new Scanner(System.in);
        for(;;) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String s = scanner.next();
            if(Objects.equals(s,"exit")){
                return;
            }
            Method method = coffee.getClass().getMethod(s);
            method.invoke(coffee);
        }
    }
}
