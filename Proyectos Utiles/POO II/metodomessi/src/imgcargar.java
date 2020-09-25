import javax.swing.*; import java.awt.*; import java.awt.image.BufferedImage; import javax.imageio.ImageIO;
public final class imgcargar extends JPanel{
    public int x1=458;
    public int x2=458;
    public int y1=410;
    public int y2=410;
   
    private BufferedImage estadio,barca,messi,balon;
    public imgcargar(){cargarImagen();}
    public void cargarImagen(){
    try{
         //estadio=ImageIO.read(getClass().getClassLoader().getResource("estadio2.jpg"));
        barca=ImageIO.read(getClass().getClassLoader().getResource("barca.jpg"));
        messi=ImageIO.read(getClass().getClassLoader().getResource("messi.gif"));
        balon=ImageIO.read(getClass().getClassLoader().getResource("balon.gif"));
    }catch(Exception e){  
      System.out.println("No se ha encontrado");     
        }//for
      }//while
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(barca, 0,0, getWidth(), getHeight(), this);
        //g.drawImage(estadio, 0,0, 275, 183, this);
        g.drawImage(messi, 260,495, 40, 63, this);  //g.drawImage(messi, 578,460, 40, 63, this); //arquero
        g.drawImage(messi, x1,y1, 40, 63, this);            //g.drawImage(messi, 458,410, 40, 63, this); //defensa
        g.drawImage(messi, x2+20,y1+50, 40, 63, this);     //g.drawImage(messi, 478,460, 40, 63, this);  //defensacentral
        g.drawImage(messi, x2+60,y1+110, 40, 63, this);    //g.drawImage(messi, 518,520, 40, 63, this);  //defensacentral
        g.drawImage(messi, x1+100,y1+200, 40, 63, this);   //g.drawImage(messi, 558,610, 40, 63, this);  //defensa
        g.drawImage(messi, x1+100,410, 40, 63, this);     //g.drawImage(messi, 578,405, 40, 63, this);   //volanteizq
        g.drawImage(messi, 578, y1+50, 40, 63, this);  //g.drawImage(messi, 578,460, 40, 63, this); //volantecen
        g.drawImage(messi, x1+180,y1+110, 40, 63, this);  //g.drawImage(messi, 638,520, 40, 63, this);  //volantecen
        g.drawImage(messi, x1+265,y1+190, 40, 63, this);  //g.drawImage(messi, 718,600, 40, 63, this);  //volanteder
        g.drawImage(messi, x1+280,y1+45, 40, 63, this);  //g.drawImage(messi, 708,455, 40, 63, this);  //del
        g.drawImage(messi, x1+297,y1+105, 40, 63, this);  //g.drawImage(messi, 755,515, 40, 63, this);  //del
        g.drawImage(balon, x1+325, x2+150, 10, 15, this);
       

    }
} 




