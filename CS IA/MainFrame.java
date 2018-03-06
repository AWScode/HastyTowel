import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.*;
import java.util.ArrayList;



public class MainFrame extends JFrame{
    private JButton butt;
    private JButton butt2;
    private JTextField text;
    private Sign sign;

public static void main(String args[]){

      MainFrame frame =new MainFrame();
      //frame
      frame.createInterface();
      frame.setTitle("Sign In");
      frame.setSize(400,100);
      frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
      frame.setVisible(true);




    }


    public void createInterface(){
      MyListener listen= new MyListener();
      BorderLayout layout=new BorderLayout();
      //set layout mannager
      setLayout(layout);

      //sign=new Sign();
      //create swing components
      //west
      JLabel label=new JLabel("Your student ID number: ");
      //center
      text= new JTextField();
      text.setActionCommand("Enter");


      //east
      butt=new JButton("Enter");
      butt.addActionListener(listen);
      //south
      butt2=new JButton("End Sign In");
      butt2.addActionListener(listen);
      //add swing components to content panel
      Container c= getContentPane();
      c.add(label, layout.WEST);
      c.add(text, layout.CENTER);
      c.add(butt, layout.EAST);
      c.add(butt2,layout.SOUTH);
    }
    public class MyListener implements ActionListener{
      @Override
      public void actionPerformed(ActionEvent e){
        if(e.getSource()==butt){
          int id=Integer.parseInt(text.getText());
          sign.signIn(id);
          text.setText("");
        }
        else if(e.getSource()==butt2){
          sign.endSign();
          System.out.println(sign.getLateList().toString());
          sign.clearLateList();
        }
      }

    }

}
