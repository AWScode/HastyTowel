/*
Program Name: Refresher.java
Program description: output conversation result due to the level of risk
the user picked
Programmer: Kitty & Nerissa
Version: Oct 5
*/

import java.util.*;
import java.io.*;
public class Refresher{
  //set the main method
  public static void main(String args[]){
    //declare lists for each level of risk
    //ArrayList<String> highRisk;
    //ArrayList<String> middleRisk;
    //ArrayList<String> lowRisk;
    //HashMap<String, Integer> list;
    ArrayList<String> highRisk= new ArrayList<>();
    ArrayList<String> middleRisk= new ArrayList<>();
    ArrayList<String> lowRisk=new ArrayList<>();
    HashMap<String, Integer> list= new HashMap<>();

    File file= new File("topics.txt");
    //open the file which names “topics.txt”
    try{
      Scanner text= new Scanner(file);
      //create a list for recording frequency of each topic
      while(text.hasNextLine()){
        String topic =text.nextLine();
        if(list.containsKey(topic)){
          int count=list.get(topic);
          count++;
          list.put(topic, count);
        }
        else{
          list.put(topic,1);
        }
      }
    }
    catch( FileNotFoundException oops){
      System.out.println("File not found");
    }
    //calculate the frequency of each topic

    for(String word: list.keySet()){
      if(list.get(word)<3){
	      highRisk.add(word);
      }
      else if(list.get(word)>=3 && list.get(word)<5){
        middleRisk.add(word);
      }
      else{
       	lowRisk.add(word);
      }
    }

    //user inputs the level of risk
    System.out.println("You find yourself stranded at the watercooler with Jenny and Bill. What do you say?");
    System.out.println("write: low-risk, high-risk, or middle-risk ");
    Scanner input = new Scanner (System.in);
    String order = input.nextLine();
    Random rand= new Random();
    int lowMax= lowRisk.size();
    int middleMax= middleRisk.size();
    int highMax= highRisk.size();

    //picks on that risk topic to print out the conversation
    if (order.equals("low-risk")&& lowMax>0){
	    String topic= lowRisk.get(rand.nextInt(lowMax));
      System.out.println("So how did " + topic + " go?");
      System.out.println(" Jenny: Very well! Remember what I told you about the conflict that I had with Bill? We work out together now");
      System.out.println(" Bill: We will make it amazing! Also thank you so much for supporting us.");
      System.out.println(" You: You guys are rocking it! I’m so looking forward to your" + topic + "presentation next month!");
    }
    else if (order.equals("middle-risk")&& middleMax>0 ){
      String topic= middleRisk.get(rand.nextInt(middleMax));
      System.out.println("So how did " + topic + " go?");
      System.out.println("Bill: Hmm, I don’t know actually. My parents don’t let me to do so.");
      System.out.println("You: Maybe you can ask your teacher to talk to your parents. It is not a bad thing.");
      System.out.println("Bill: I tried, but the teacher who supervises me on this is not free recently.");
      System.out.println("You: Oh, I’m so sorry to hear that.");
      System.out.println("Bill: It’s ok…I can just find another thing to do.");

    }
    else if (order.equals("high-risk")&& highMax>0){
      String topic= highRisk.get(rand.nextInt(highMax));
      System.out.println("So how did " + topic + " go?");
      System.out.println("Jenny: Sorry, I don’t want to talk about that. My best friend broke up with me because of that.");
      System.out.println("You: Don’t worry about it so much. Look at my fingers. They turn green!!! (try to be funny)");
      System.out.println("Jack, I have no mood to play that…(leaves)");

    }
    else {
      System.out.println("Your option is not valid in this case, try again.");
    }
  }
}
