/*
Program name: Student.java
Program description: creates a student's information card
Programmer: Nerissa Lien
Version: 2/26/18
*/

public class Student{

  private String name;
  //student name

  private int id;
  //student ID number

  private String tieColor;
  //student tie color

  private int lateT;
  //Total times the student has been late

  private boolean late;
  //whether the student is currently late

  /*
    Constructor: to input student name, ID number, and tie color ahead
  */
  public Student(int id, String name, String tieColor){
    this.name=name;
    this.id=id;
    this.tieColor=tieColor;
    late=true;
  }

  /*
    This method is a setter to change the student name
  */
  public void setName(String name){
    this.name=name;
  }

  /*
    This method is a setter to change the student ID number
  */
  public void setId(int id){
    this.id=id;
  }

  /*
    This method is a setter to change the student tie color
  */
  public void setTie(String tieColor){
    this.tieColor=tieColor;
  }

  /*
    This method is a setter to change the total times the student has been late
  */
  public void setLateT(int lateT){
    this.lateT=lateT;
  }

  /*
    This method is a setter to change the late status of the student
  */
  public void setLate(boolean status){
    late=status;
  }

  /*
  */
  public void addLateT(){
    lateT++;
  }

  /*
    This method return student name
  */
  public String getName(){
      return name;
  }

  /*
    This method return student ID number
  */
  public int getId(){
    return id;
  }

  /*
    This method return student tie color
  */
  public String getTie(){
    return tieColor;
  }

  /*
    This method return the total times the student has been late
  */
  public int getLateTime(){
    return lateT;
  }

  /*
    This method return whether the student is currently late
    True for late; false for not late
  */
  public boolean getLate(){
    return late;
  }
}
