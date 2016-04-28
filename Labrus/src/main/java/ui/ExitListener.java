package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class ExitListener implements ActionListener {
    private JFrame jframe;

    public ExitListener(JFrame jframe) {
        this.jframe = jframe;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        jframe.dispose();
    }
}