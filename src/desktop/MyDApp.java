package desktop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyDApp extends JFrame {
    private JPanel myApp;
    private JButton toplaButton;
    private JButton cixButton;
    private JTextField a;
    private JTextField b;
    private JButton vurButton;
    private JButton bolButton;
    private JButton button4;
    private JLabel result;

    public MyDApp() {
        toplaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer integer=Integer.parseInt(a.getText())+Integer.parseInt(b.getText());
                result.setText(String.valueOf(integer));
                System.out.println(result);
            }
        });
        cixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer integer=Integer.parseInt(a.getText())-Integer.parseInt(b.getText());
                result.setText(String.valueOf(integer));
                System.out.println(result);
            }
        });
        vurButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer integer=Integer.parseInt(a.getText())*Integer.parseInt(b.getText());
                result.setText(String.valueOf(integer));
                System.out.println(result);
            }
        });
        bolButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer integer=Integer.parseInt(a.getText())/Integer.parseInt(b.getText());
                result.setText(String.valueOf(integer));
                System.out.println(result);
            }
        });

    }
    public static void main(String[] args) {
        MyDApp myDApp=new MyDApp();
        myDApp.setContentPane(myDApp.myApp);
        myDApp.setSize(600,800);
        myDApp.setVisible(true);
        myDApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
