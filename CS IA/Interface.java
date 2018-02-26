import javax.swing.*;
import java.awt.event.*;

public class Interface{

  public void init(){
    JButton buttonS= new JButton("Start");
    add(buttonS, SOUTH);
    addActionListeners();
  }
  public void actionPerformed(ActionEvent e){
    if(e.getActionCommand().equals("Start")){
      
    }
  }
}
