package baris.kaplan.Events;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class Form implements MouseListen {
     Button button = new Button();

     public Form() {

     }


     public void setButton(Button button){
         this.button = button;
     }

     public JButton getButton(){
         return button;
     }

    @Override
    public void mouseClicked(MouseEvent e) {
          System.out.println(e.getX() + " " + e.getY());
          System.out.println("Mouse is clicked");


    }



    @Override
    public void mouseClicked(ClickEvent clickEvent) {
        System.out.println("Click Date is: "+clickEvent.getDate()+"\n");
        System.out.println("Click ID is: "+clickEvent.getId()+"\n");
    }
}
