package com.company.consolcalc.gui;

import com.company.consolcalc.Application;
import com.company.consolcalc.service.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIApplication implements Application {

    static JLabel result;
    static JTextField num1;
    static JTextField num2;
    static JTextField operation;

    @Override
    public void run() {
        JFrame jFrame = new JFrame("Calculator");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        JPanel jPanel = new JPanel();
        num1 = new JTextField(20);
        num2 = new JTextField(20);
        operation = new JTextField(10);
        JButton jButton = new JButton("Calculate");
        result = new JLabel();

        jButton.addActionListener(new CalcAction());

        jPanel.add(num1);
        jPanel.add(num2);
        jPanel.add(operation);
        jPanel.add(jButton);
        jPanel.add(result);

        jFrame.add(jPanel);
    }

    private static class CalcAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
//            int result = Integer.parseInt(num1.getText()) + Integer.parseInt(num1.getText());
//            GUIApplication.result.setText("Result " + result);
            String operation = GUIApplication.operation.getText();
            double num1 = Double.parseDouble(GUIApplication.num1.getText());
            double num2 = Double.parseDouble(GUIApplication.num2.getText());

            double result = Calculator.calc(num1, num2, operation);

            GUIApplication.result.setText("Result = " + result);
        }
    }
}
