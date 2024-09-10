package aaaaa;
import java.awt.event.MouseEvent;

public class Control extends StaticBackground{
    
    public double xAxis =-1;  /* x-coordinate  */
    public double yAxis =-2;  /* y-coordinate */

    void mousePress(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();
        
     if(x>22 && x<172 && y>702 && y<742){
            StartingClass.State="menu";
        }
    }
}
