
import javax.swing.*;

// importing java swing package 




public class Swing17 
{
         Swing17()


         {

              JFrame f = new JFrame("Scroll bar example ");

              //creating an object f in class JFrame 

              JScrollBar js= new JScrollBar();

              js.setBounds(100,100,50,100);

              f.add(js);

              f.setSize(400,400);

              f.setLayout(null);

              f.setVisible(true);

         }


         public static void main(String[] args) 
         
         {
                 new Swing17();
         }
}
