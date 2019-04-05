import Parser.*;
import Items.*;

import javax.swing.*;
import java.util.Scanner;
import java.awt.*;

public class Game {

    private static String text = "";
    private static JTextArea lbl = new JTextArea();
    public static JTextField textPanel = new JTextField();

    public static void main(String [] args){
        ItemInitializer.init();
        JFrame frame = new JFrame();
        frame.setBounds(100,100,640,800);
        frame.add(textPanel);
        textPanel.setBounds(50,500,540,50);
        frame.add(lbl);
        frame.setBackground(Color.darkGray);
        lbl.setBackground(Color.GRAY);
        lbl.setLocation(200,200);
        lbl.setEnabled(false);
        lbl.setText("Yeet Yeet Yeet Yeet Yeet Yeet");
        doEverything();
        frame.setVisible(true);
        Scanner scannerInsert = new Scanner(System.in);
        String insert = scannerInsert.next();
        System.out.println(insert);
        scannerInsert.close();
    }

    public static String getTextField(JTextField fuckoff){
        return fuckoff.getText();
    }

    public static void addTestItems(){

    }

    private static void doEverything(){
        examineAll();
        useAll();
        takeAll();
    }

    private static void setLabelText(JTextArea fuckoff, String txt){
        if(fuckoff.getText().length()>1024) {
            fuckoff.setText(fuckoff.getText().substring(fuckoff.getText().length() - 1024) + "\r\n  " + txt);
        }else{
            fuckoff.setText(fuckoff.getText()+ "\r\n" + txt);
        }
    }

    public static void examineAll(){
        for(Thing thing : Items.itemlist){
            text = thing.examine();
            setLabelText(lbl,text);
        }
    }

    public static void useAll(){
        for(Thing thing : Items.itemlist){
            text = thing.use();
            setLabelText(lbl,text);
        }
    }

    public static void takeAll(){
        for(Thing thing : Items.itemlist){
            text = thing.take();
            setLabelText(lbl,text);
        }
        for(Thing thing : Inventory.inventory){
            System.out.println(thing._name);
        }
    }
}