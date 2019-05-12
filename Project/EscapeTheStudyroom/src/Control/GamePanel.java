package Control;

import javax.swing.*;
import java.awt.*;
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
    }

    public String getTextField(){
        return textPanel.getText();
    }

    private void setLabelText(JTextArea fuckoff, String txt){
        if(fuckoff.getText().length()>1024) {
            fuckoff.setText(fuckoff.getText().substring(fuckoff.getText().length() - 1024) + "\r\n  " + txt);
        }else{
            fuckoff.setText(fuckoff.getText()+ "\r\n" + txt);
        }
    }
}
