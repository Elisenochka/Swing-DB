import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.*;

/**
 * Created by Romych on 01.04.2016.
 */
public class MyWindow extends JFrame {
public static JTextArea ta = new JTextArea();
    public MyWindow(){
        setTitle("My first window");
        setSize(400,400);
        setLocation(1200,200);
        //setLayout(new BorderLayout(0,20));
        //setBackground(Color.BLACK);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        final JTextArea jta = new JTextArea();
        JButton jb1 = new JButton("Send");
        //add(jb1, BorderLayout.NORTH);
        //JButton jb2 = new JButton("JButtton #2");
        //add(jb2, BorderLayout.SOUTH);

        jta.setFont(new Font("Times New Roman", Font.ITALIC,14));
        //add(jta, BorderLayout.CENTER);
        jta.setBackground(Color.lightGray);
        add(jta);
        final JTextField jtf = new JTextField();
        JTable jt = new JTable();
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new BorderLayout());
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BorderLayout());
        add(southPanel,BorderLayout.SOUTH);
        add(northPanel,BorderLayout.NORTH);
        southPanel.setLayout(new BorderLayout());
        southPanel.add(jtf, BorderLayout.CENTER);
        northPanel.add(jt, BorderLayout.CENTER);
        southPanel.add(jb1, BorderLayout.EAST);
        jb1.setMnemonic(KeyEvent.KEY_PRESSED);
        //JRootPane rp = SwingUtilities.getRootPane(jb1);
        //rp.setDefaultButton(jb1);

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.append(jtf.getText() + '\n');
                //;
                jta.append(ta.getText());
                jtf.setText("");

            }
        });

        setVisible(true);


    }

}
