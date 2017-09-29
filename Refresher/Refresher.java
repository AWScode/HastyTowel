import java.util.*;

public class Refresher{
  public static void main(String args[]){
    //set the main method

ArrayList<String> highRisk= new ArrayList<>();
ArrayList<String> middleRisk= new ArrayList<>();
ArrayList<String> lowRisk=new ArrayList<>();
//make a new list for each level of risk

    File file= new File("topics.txt");
//open the file which names “topics.txt”
    Scanner text= new Scanner(file);
//read infos from the file
    HashMap<String, Integer> list= new HashMap<>();
//create a list for recording frequency of each topic
    for(text.hasNextLine()){
      String topic =text.nextLine();
      if(list.containsKey(topic)){
        int count=list.get(topic);
        list.put(topic, count++);
      }
      else{
        list.put(topic,1);
      }
    }
//calculate the frequency of each topic

    for(String word: list.keySet()){
      if(list.get(word)<3){
	lowRisk.add(word);

      }
      else if(list.get(word)>=3 && list.get(word)<5){
        	middleRisk.add(word);
      }
      else{
       	highRisk.add(word);
      }
    }
System.out.println(“java Refresher”);
System.out.println(“You find yourself stranded at the watercooler with Jenny and Bill. What do you say? (choose: \“low-risk\”, \“high-risk\”, or \“middle-risk\” ” );
    Scanner input = new Scanner (System.in);
    String order = input.nextLine();
Random rand= new Random();
    if (order.equals("low-risk")){
	Int max= lowRisk.length();
	Int num= rand.nextInt(max-1);
String topic= lowRisk.get(num);
      System.out.println("So how did " + topic + " go?");
      System.out.println("Oh, it was going well.");
    }
    else if (order.equals("middle-risk")){
      System.out.println("");
    }
    else if (order.equals("high-risk")){
      System.out.println("");
    }
    else {
      System.out.println("invalid input");
    }



  }
}
