package com.AWT;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton button = new JButton("click");
        button.setDebugGraphicsOptions(DebugGraphics.LOG_OPTION);
        jPanel.add(button);
    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setBounds(200,200,200,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}
