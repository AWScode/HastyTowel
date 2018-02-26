
public class Student{
  private String name;
  private int id;
  private String tieColor;
  private int lateT;
  private boolean late;

  public Student(String name, int id, String tieColor){
    this.name=name;
    this.id=id;
    this.tieColor=tieColor;
    late=true;
  }

  public void setName(String name){
    this.name=name;
  }

  public void setId(int id){
    this.id=id;
  }

  public void setTie(String tieColor){
    this.tieColor=tieColor;
  }

  public void setLateT(int lateT){
    this.lateT=lateT;
  }

  public void setLate(boolean status){
    late=status;
  }

  public void addLateT(){
    lateT++;
  }

  public String getName(){
      return name;
  }

  public int getId(){
    return id;
  }

  public String getTie(){
    return tieColor;
  }

  public int getLateTime(){
    return lateT;
  }

  public boolean getLate(){
    return late;
  }
}
