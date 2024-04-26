package controller;

import java.util.Scanner;

public class IntStringController {
    public int IntController(){
        Scanner scanner = new Scanner(System.in);
        String buffSting = scanner.nextLine();
        int buffInt = 0;
        try {
            buffInt = Integer.parseInt(buffSting);
        }
        catch (NumberFormatException e){
            System.out.println("Error in number");
            IntStringController intStringController = new IntStringController();
            intStringController.IntController();
        }
        return buffInt;
    }
    public String StringController(){
        Scanner scanner = new Scanner(System.in);
        String buffSting = scanner.nextLine();
        return buffSting;
    }
}
