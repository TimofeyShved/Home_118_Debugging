package com.AWT;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame jFrame = getFrame(); // создаём форму
        JPanel jPanel = new JPanel(); // панеь
        jFrame.add(jPanel);  // соединяем
        JButton button = new JButton("click"); // создаём кнопку
        button.setDebugGraphicsOptions(DebugGraphics.LOG_OPTION); // вывод логов по кнопке
        jPanel.add(button); // добавляем на панель

        RepaintManager.currentManager(jFrame.getRootPane()).setDoubleBufferingEnabled(true); // для отоброжения всех изменений на форме
        ((JComponent)jFrame.getContentPane()).setDebugGraphicsOptions(DebugGraphics.LOG_OPTION);
    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){}; // создание формы
        jFrame.setVisible(true); // видимость
        jFrame.setBounds(200,200,400,200); // размеры
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие
        return jFrame; // вернуть форму на вызов
    }
}
