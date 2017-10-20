import java.util.*;
public class Palindrome{
  public static boolean checkpalindrome(String word){
    word= word.toLowerCase();
    int len=word.length();
    char[] arr= new char[len];
    for(int i=0; i<len; i++){
      arr[i]=word.charAt(i);
    }
    //if()
    for(int i=0; i<len; i++){
      if(arr[i]!=arr[len-i-1]){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args){
    System.out.println("Welcome to Palindrome Tester \nWhat word would you like to test? \nTo quit the test type -1" );
    Scanner input=new Scanner(System.in);
    String response= input.nextLine();
    while(!response.equals("-1")){
      if(checkpalindrome(response)){
        System.out.println("Woah! Tha's a Palindrome!");
      }
      else{
        System.out.println("You should know that is not a Palindrome...");
      }
      System.out.println("What other word would you like to test? \nTo quit the test type -1");
      Scanner input2= new Scanner(System.in);
      response= input2.nextLine();
    }
  }
}
