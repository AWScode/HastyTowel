import java.util.*;
import java.lang.*;
public class Binary{
  static int[] bin1=new int[8];
  static int[] bin2=new int[8];
  int[] result=new int[8];
  public static void main(String[] args){
    Binary test=new Binary();

    System.out.println("Input first binary number :");
    Scanner input1= new Scanner(System.in);
    String num1= input1.nextLine();

    System.out.println("Input second binary number :");
    Scanner input2= new Scanner(System.in);
    String num2= input2.nextLine();

    test.number(num1, num2);

  /*  System.out.println("Input second binary number :");
    Scanner input3= new Scanner(System.in);
    char operator= input3.next().charAt(0);
    */
    //  System.out.println(Arrays.toString(test.addition(bin1,bin2)));
      System.out.println(Arrays.toString(test.substraction()));
  /*
  if(operator=='a' || operator=='A'){
    System.out.println(Arrays.toString(test.addition()));
  }
  else if(operator=='s' || operator=='S'){
      System.out.println(Arrays.toString(test.substraction()));
    }
*/


  }

  public void number(String a, String b){
    for(int i=0; i<a.length(); i++){
      bin1[8-a.length()+i]=(int)a.charAt(i)-'0';
    }
    for(int i=0; i<b.length(); i++){
      bin2[8-b.length()+i]=(int)b.charAt(i)-'0';
    }
  }

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


  public int[] substraction(){
    int[] negBin2= new int[8];
    int[] complement= new int[] {0,0,0,0,0,0,0,1};

    for(int i=0; i<8; i++){
      if(bin2[i]==0){
        negBin2[i]=1;
      }
      else{
        negBin2[i]=0;
      }
    }
    negBin2=addition(negBin2,complement);
    System.out.println(Arrays.toString(negBin2));
    return addition(bin1, negBin2);
  }

  public int[] multiply(){
    int mut=0;
    for(int i=0; i<8 ; i++){
      mut+=bin2[i]*Math.pow(2,i);
    }
    System.out.println(mut);
    result=bins1;
    for(int i=1; i< mut; i++){
      result=addition(result, bin1);
    }
    //System.out.println(Arrays.toString(result));
    return result;
  /*  for(int i=0; i<8; i++){
      for(int j=0; j<8; j++){

      }
    }*/
  }
}
