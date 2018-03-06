import java.io.*;
import java.util.*;


public class Sign{
  //holds the list of students who are late
  private ArrayList<String> lateList;
  //holds each student's file and can be searched by ID number
  private HashMap<Integer, Student> stuList;

  public static void main(String[] args){
    Sign sign=new Sign();
    sign.signIn(3451141);
    sign.signIn(12345678);
    sign.signIn(1234560);
    sign.endSign();
    System.out.println(sign.getLateList().toString());
  }


  //Class Sign constructor
  public Sign(){
		try{
      stuList=new HashMap<>();
      lateList=new ArrayList<>();
  		Scanner input= new Scanner(new File ("student.txt"));
  			while(input.hasNext()){
  				Student stu = new Student(input.nextInt(), input.next(), input.next());
  				stuList.put(stu.getId(), stu);
  			}
  			input.close();
  		}
  		catch(FileNotFoundException e){
  			System.out.println("Do not find file.");
  		}
  	}

  //Method SignIn takes in student ID number to reecord that the student is present in the student's file
  public void signIn(int studentId){
    boolean valid=false;
      for(Integer id : stuList.keySet()){
        if(studentId==id){
          Student a= stuList.get(id);
          a.setLate(false);
          valid=true;
        }
      }
    if(valid){
        valid=false;
    }
    else{
      System.out.println("Invalid number");
    }
  }

  //Method endSign stops students from beinng allowed to record themselves present from the late list
  public void endSign(){
    for (Integer id : stuList.keySet()){
        Student a= stuList.get(id);
        if(a.getLate()==true){
          lateList.add(a.getName());
          a.addLateT();
          a.setLate(false);
        }
    }
  }

  //Method getLateList returns the list of students who are late
  public ArrayList getLateList(){
    return lateList;
  }

  //Method clearLateList earase the late list of that day
  public void clearLateList(){
    lateList.clear();
  }
}
