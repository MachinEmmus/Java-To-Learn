import java.io.IOException;
import javax.swing.*;
public class ventana extends JFrame{
     public int x1=458;
    public int x2=100;
    public int y1=400;
    public int y2=100;
    public ventana() throws IOException{
        super("Imagen");
        this.setSize(500, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        imgcargar img=new imgcargar();
        add(img);
        this.setVisible(true);
        while(true){
        for (int i=x1; i<600; i++){
               if(img.x1==i)
               {
               //    img.x2 = i + 3;
            }
          //  else
                img.x1=i;
            repaint();
          try
              {
            Thread.sleep(40);
              }   //try
             catch(InterruptedException e) {e.printStackTrace();}
         
        }  //for
          }      //while
         }
        }
