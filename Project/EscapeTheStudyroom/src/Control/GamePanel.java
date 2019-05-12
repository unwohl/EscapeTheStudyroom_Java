package Control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class GamePanel {

    private static String text = "";
    private static JTextArea lbl = new JTextArea();
    private static JTextField textPanel = new JTextField();

    public GamePanel(){
        JFrame frame = new JFrame();
        frame.setBounds(100,100,640,800);
        frame.add(textPanel);
        textPanel.setBounds(50,500,540,50);
        frame.add(lbl);
        frame.setBackground(Color.darkGray);
        lbl.setBackground(Color.GRAY);
        lbl.setLocation(200,200);
        lbl.setEnabled(false);
        frame.setVisible(true);
        lbl.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped( KeyEvent e ) {

            }

            @Override
            public void keyPressed( KeyEvent e ) {

            }

            @Override
            public void keyReleased( KeyEvent e ) {
                System.out.println(e.getKeyCode());
                if(e.getKeyCode() == 10){
                    String test = getTextField();
                    System.out.println("Enter has been pressed!");
                }
            }
        });
    }

    /**
     * Gets the Text in the Textfield and deletes the current text.
     * @return Returns the current text as a String.
     */
    public String getTextField(){
        String txt = textPanel.getText();
        textPanel.setText("");
        return txt;
    }

    public void setLabelText(String txt){
        if(lbl.getText().length()>1024) {
            lbl.setText(lbl.getText().substring(lbl.getText().length() - 1024) + "\r\n  " + txt);
        }else{
            lbl.setText(lbl.getText()+ "\r\n" + txt);
        }
    }
}
