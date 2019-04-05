import Parser.*;
import Items.*;

import javax.swing.*;
import java.util.Scanner;
import java.awt.*;

public class Game {

    private static Items items = new Items();
    private static String text = "";
    private static JTextPane lbl = new JTextPane();

    public static void main(String [] args){
        ItemInitializer.init();
        JFrame frame = new JFrame();
        frame.setBounds(100,100,640,800);
        JTextPane textPanel = new JTextPane();
        frame.add(textPanel);
        textPanel.setBounds(50,frame.getY()-50,540,50);
        frame.add(lbl);
        lbl.setBounds(50,frame.getY()-200,540,400);
        lbl.setText("Yeet Yeet Yeet Yeet Yeet Yeet");
        doEverything();
        frame.setVisible(true);
        Scanner scannerInsert = new Scanner(System.in);
        String insert = scannerInsert.next();
        System.out.println(insert);
        scannerInsert.close();
    }

    public static void addTestItems(){

    }

    private static void doEverything(){
        examineAll();
        useAll();
        takeAll();
    }

    private static void setLabelText(JTextPane fuckoff, String txt){
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