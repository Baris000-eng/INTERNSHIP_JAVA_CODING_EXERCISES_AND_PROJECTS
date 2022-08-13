package baris.kaplan.Events;

import java.awt.event.MouseEvent;
import java.util.EventListener;

public interface MouseListen extends EventListener {


   void mouseClicked(MouseEvent e);

   void mouseClicked(ClickEvent clickEvent);







}
