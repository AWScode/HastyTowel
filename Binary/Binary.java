import java.util.*;
import java.io.*;
public class Binary {
  static String num1;
  static String num2;
  public static void main(String[] args){
      Binary test = new Binary();
      while(true){
        System.out.println("Input first binary number :");
        Scanner input1= new Scanner(System.in);
        num1= input1.nextLine();

        System.out.println("Input second binary number :");
        Scanner input2= new Scanner(System.in);
        num2= input2.nextLine();

        System.out.println("Choose: add, substract, multiply, divide (type 1 to quit)");
        Scanner input3=new Scanner(System.in);
        char operator= input3.next().charAt(0);

        if(operator=='a' || operator=='A'){
            System.out.println(test.addition());
        }
        else if(operator=='s' || operator=='S'){
            System.out.println(test.substraction());
        }
        else if(operator=='m' || operator=='M'){
            System.out.println(test.multiply());
        }
        else if(operator=='D' || operator=='d'){
            System.out.println(test.division());
        }
        else if(operator=='1'){
          System.out.println("The program has ended as you have requested.");
          break;
        }
        else{
          System.out.println("Invalid inputs please try again.");
        }
      }
    }

    public String addition(){
        int a = Integer.parseInt(num1, 2);
        int b = Integer.parseInt(num2, 2);
        int sum = a+b;
        return Integer.toBinaryString(sum);
    }

    public String substraction(){
        int a = Integer.parseInt(num1, 2);
        int b = Integer.parseInt(num2, 2);
        int diff = a+b;
        return Integer.toBinaryString(diff);
    }

    public String multiply(){
        int a = Integer.parseInt(num1, 2);
        int b = Integer.parseInt(num2, 2);
        int prod = a*b;
        return Integer.toBinaryString(prod);
    }

    public String division(){
        int a = Integer.parseInt(num1, 2);
        int b = Integer.parseInt(num2, 2);
        int result =a/b;
        return Integer.toBinaryString(result);
    }
}
