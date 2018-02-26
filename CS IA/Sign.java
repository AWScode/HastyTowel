import java.util.*;

public class Sign{
  private HashMap<Integer, Student> studentList;
  private ArrayList<String> lateList;

  public static void main(String[] args){

  }

  public void signIn(int studentId){
    for (Integer id : studentList.keySet()){
      if(studentId==id){
        Student a= studentList.get(id);
        a.setLate(false);
      }
    }
  }
  public void endSign(){
    for (Integer id : studentList.keySet()){
        Student a= studentList.get(id);
        if(a.getLate()==true){
          lateList.add(a.getName());
          a.addLateT();
          a.setLate(false);
        }
    }
  }

  public ArrayList getLateList(){
    return lateList;
  }

  public void clearLateList(){
    lateList.clear();
  }
}
