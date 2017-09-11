/*
  Project name: CoffeeShop
  Project description: this project simulates a basic coffee shop service
  Programmer: Nerissa Lien
  Version: Sep 11/ 2017
*/
import java.util.*;
public class CoffeeShop{
public static void main(String[] args) {
  //record order
  System.out.println("Welcome to NotStarbucks, may I take your order? \n Ex. 1 capuccino 2 hotchocolate");
  Scanner input= new Scanner(System.in);
  String order=input.nextLine();
  System.out.println("Can I have a name for that?");
  Scanner input2= new Scanner(System.in);
  String name= input2.nextLine();
  //print the final confirmation
  System.out.println("One moment please...");
  System.out.println(name + "! Your "+ order + " is ready.");
}

}
