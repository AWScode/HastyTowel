import java.util.*;
import java.lang.*; //Math
/*
  Program name: Binary.java
  Program description: a calculator for binary numbers
  Programmer: Nerissa Lien
  Version: 12/ 9/ 17
*/
public class Binary{
  static int[] bin1=new int[8];
  static int[] bin2=new int[8];
  int[] result=new int[8];
  int[] remainder= new int[8];

  public static void main(String[] args){
    while(true){
      Binary test=new Binary();
      //setting up inputs
      System.out.println("Input first 8-bits-binary number :");
      Scanner input1= new Scanner(System.in);
      String num1= input1.nextLine();

      System.out.println("Input second 8-bits-binary number :");
      Scanner input2= new Scanner(System.in);
      String num2= input2.nextLine();
      //converting inputs to binary arrays
      test.number(num1, num2);
      //setting up operators
      System.out.println("Choose: add, substract, multiply, divide");
      Scanner input3= new Scanner(System.in);
      char operator= input3.next().charAt(0);

      if(operator=='a' || operator=='A'){
        System.out.println(Arrays.toString(test.addition(bin1,bin2)));
      }
      else if(operator=='s' || operator=='S'){
          System.out.println(Arrays.toString(test.substraction(bin1,bin2)));
      }
      else if(operator=='m' || operator=='M'){
          System.out.println(Arrays.toString(test.multiply()));
      }
      else if(operator=='d' || operator=='D'){
          System.out.println(Arrays.toString(test.division())+"\n Remainder: "+Arrays.toString(test.getRemainder()));
      }
      else{
          System.out.println("Invalid operator.");
      }

      System.out.println("Continue? (Yes or No)");
      Scanner input4=new Scanner(System.in);
      char con = input4.next().charAt(0);
      if(con=='n'|| con=='N'){
        System.out.println("Bye");
        break;
      }
    }
  }

  //converting the String input to integer array
  public void number(String a, String b){
    for(int i=0; i<a.length(); i++){
      bin1[8-a.length()+i]=(int)a.charAt(i)-'0';
    }
    for(int i=0; i<b.length(); i++){
      bin2[8-b.length()+i]=(int)b.charAt(i)-'0';
    }
  }

  //Method for adding the two binary inputs
  public int[] addition(int[] a, int[] b){
    boolean overflow=false;
    for(int i=7; i>=0; i--){
      if(a[i]==b[i]){
        result[i]=0;
        if(overflow){
          result[i]=1;
          overflow=false;
        }
        if(a[i]==1){
          overflow=true;
        }
      }
      else{
        result[i]=1;
        if(overflow){
          result[i]=0;
          overflow=true;
        }
      }
    }
    return result;
  }

  //Method for minusing the two binary inputs
  public int[] substraction(int[] a, int[] b){
    int[] negBin2= new int[8];
    int[] complement= new int[] {0,0,0,0,0,0,0,1};

    for(int i=0; i<8; i++){
      if(b[i]==0){
        negBin2[i]=1;
      }
      else{
        negBin2[i]=0;
      }
    }
    negBin2=Arrays.copyOf(addition(negBin2,complement),8);
    return addition(a, negBin2);
  }

  //Method for multiplying the two binary inputs
  public int[] multiply(){
    result= new int[]{0,0,0,0,0,0,0,0};
    int mut=0;
    int[] newresult= new int[8];
    //find the multiplier
    for(int i=7; i>=0 ; i--){
      mut+=bin2[i]*(int)Math.pow(2,7-i);
    }
    //multiplication is just a loop of addition
    //be aware array is a object "copyOf" prevent the value being overwrite
    for(int i=1; i<=mut; i++){
      newresult=Arrays.copyOf(result,8);
      result=Arrays.copyOf(addition(newresult, bin1),8);
    }
    return result;
  }

  //Method for dividing the two binary inputs
  public int[] division(){
    remainder=Arrays.copyOf(bin1,8);
    int count=0;
    while(true){
      int[] newresult=Arrays.copyOf(remainder,8);
      remainder=Arrays.copyOf(substraction(newresult, bin2),8);
      if(remainder[0]!=1){
        count++;
      }
      else if(remainder[0]==1){
        remainder=Arrays.copyOf(newresult,8);
        break;
      }
    }
    for(int i=0; i<8; i++){
      int binary= count/(int)Math.pow(2,7-i);
      count=count%(int)Math.pow(2,7-i);
      result[i]=binary;
    }
    return result;
  }
  public int[] getRemainder(){
    return remainder;
  }
}
