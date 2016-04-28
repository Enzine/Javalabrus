package ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.util.Scanner;
import javax.swing.*;
import logic.Lab;
import logic.Owner;
import logic.Storyteller;
import utility.MoodMaker;
import utility.TxtReader;

public class Ui implements Runnable {

    private JFrame frame;
    private Storyteller st = new Storyteller();

    public Ui() {
    }

    @Override
    public void run() {
        frame = new JFrame("Silly Naked Furry Bellybutton Pets<3");
        frame.setPreferredSize(new Dimension(500, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        JButton exit = new JButton("Exit");
        exit.addActionListener(new ExitListener(frame));
        container.add(exit, BorderLayout.SOUTH);
        
        container.add(new JButton("Save"), BorderLayout.NORTH);
        
        container.add(new JTextArea("Traits"), BorderLayout.EAST);
        
        JTextArea storyArea = new JTextArea("story here");
        container.add(storyArea, BorderLayout.WEST);
        
        container.add(new JLabel(), BorderLayout.CENTER);
        //JLabel(Icon image)

//        container.add(new JButton("Oletuspaikka (Center)"));
    }

    public JFrame getFrame() {
        return frame;
    }
}
