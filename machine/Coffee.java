package machine;

import java.util.Objects;
import java.util.Scanner;

public class Coffee {
    private int money;
    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCups;
    {
        water=400;
        milk=540;
        coffeeBeans=120;
        disposableCups=9;
        money=550;
    }

    public int getMoney() {
        return money;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public void remaining(){
        System.out.println("The coffee machine has:");
        System.out.println(getWater() + " ml of water");
        System.out.println(getMilk() + " ml of milk");
        System.out.println(getCoffeeBeans() + " g of coffee beans");
        System.out.println(getDisposableCups() + " disposable cups");
        System.out.println("$"+getMoney() + " of money");
        System.out.println();
    }

    public void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino,back - to main menu:");
        Scanner scanner=new Scanner(System.in);
        String flag=scanner.next();
        if(Objects.equals(flag,"back"))
            return;
        switch (flag){
            case "1":{
                this.cokeEspresso();
                break;
            }
            case "2":{
                this.cokeLatte();
                break;
            }
            case "3":{
                this.cokeCappuccino();
                break;
            }
            default:{
                System.out.println("Sorry,There is no coffee of this type");
            }
        }
        System.out.println();
    }
    public void fill(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add: ");
        water += InputUtil.InputInt();
        System.out.println("Write how many ml of milk you want to add: ");
        milk += InputUtil.InputInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        coffeeBeans += InputUtil.InputInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        disposableCups += InputUtil.InputInt();
        System.out.println();
    }

    public void take(){
        System.out.println("I gave you $"+money);
        money = 0;
        System.out.println();
    }
    private void cokeEspresso(){
        if(water < 250) {
            System.out.println("Sorry, not enough water!");
            return;
        }
        if(coffeeBeans < 16){
            System.out.println("Sorry, not enough coffee beans!");
            return;
        }
        if(disposableCups <= 0){
            System.out.println("Sorry, not enough disposable cups");
            return;
        }
        System.out.println("I have enough resources, making you a coffee!");
        water -= 250;
        coffeeBeans -= 16;
        disposableCups--;
        money += 4;
    }
    private void cokeLatte(){
        if(water < 350) {
            System.out.println("Sorry, not enough water!");
            return;
        }
        if(milk < 75){
            System.out.println("Sorry, not enough milk!");
            return;
        }
        if(coffeeBeans < 20){
            System.out.println("Sorry, not enough coffee beans!");
            return;
        }
        if(disposableCups <= 0){
            System.out.println("Sorry, not enough disposable cups");
            return;
        }
        System.out.println("I have enough resources, making you a coffee!");
        water -= 350;
        milk -= 75;
        coffeeBeans -= 20;
        disposableCups--;
        money += 7;
    }
    private void cokeCappuccino(){
        if(water < 200) {
            System.out.println("Sorry, not enough water!");
            return;
        }
        if(milk < 100){
            System.out.println("Sorry, not enough milk!");
            return;
        }
        if(coffeeBeans < 12){
            System.out.println("Sorry, not enough coffee beans!");
            return;
        }
        if(disposableCups <= 0){
            System.out.println("Sorry, not enough disposable cups");
            return;
        }
        System.out.println("I have enough resources, making you a coffee!");
        water -= 200;
        milk -= 100;
        coffeeBeans -= 12;
        disposableCups--;
        money += 6;
    }
}
