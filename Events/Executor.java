package baris.kaplan.Events;

import java.awt.event.MouseEvent;

public class Executor {
    public static void main(String[] args){

        Form form = new Form();
        Button button = new Button();

        form.setButton(button);
        button.addMouseClickListener(form);
        button.addMouseClickListener(new MouseListen() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getX()+ " " + e.getY());
                System.out.println("Mouse is clicked 1!");
            }

            @Override
            public void mouseClicked(ClickEvent clickEvent) {
                System.out.println("Mouse is clicked 2!");
            }
        });
        button.click();

    }
}
