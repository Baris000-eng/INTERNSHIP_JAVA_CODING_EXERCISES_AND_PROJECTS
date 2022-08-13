package baris.kaplan.Events;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Button extends JButton implements MouseListener {
    List <MouseListen> lis = new ArrayList<MouseListen>();

    public List<MouseListen> getList(){
        return lis;
    }

    public void setList(List<MouseListen>lis){
        this.lis = lis;
    }

    public void addMouseClickListener(MouseListen ml){
            lis.add(ml);
    }
    public void removeMouseClickListener(MouseListen ml){
            lis.remove(ml);
    }


    public void click(){
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //create a format object
        Date d = new Date();
        ClickEvent ce = new ClickEvent(this, 2, f.format(d)); //call format function with formatter object with the date object parameter
        MouseListen[] copy;
        synchronized (this){
            copy = lis.toArray(new MouseListen[0]);
        }

        for(MouseListen ml: lis){
            ml.mouseClicked(ce);
        }


    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

