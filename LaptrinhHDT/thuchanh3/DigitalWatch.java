import javax.swing.*;
import java.text.*;
import java.util.*;

public class DigitalWatch implements Runnable {
    JFrame f;
    JFrame f1;
    Thread t = null;
    String timeString = "";
    String timeString1 = "";
    JButton b;
    JButton l;
    DigitalWatch() {
        f = new JFrame();
// f1 = new JFrame();
t = new Thread(this);
t.start();

b = new JButton();
b.setBounds(100, 100, 100, 50);
l = new JButton();
l.setBounds(300, 200, 200, 222);

f.add(b);
f.setSize(300, 400);
f.setLayout(null);
f.setVisible(true);
    }
    public void run() {
        try {
            while (true) {
                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
// Date date = cal.getTime();
timeString = formatter.format(new Date());
printTime();
SimpleDateFormat formatter1 = new SimpleDateFormat("hh:mm:ss");
timeString1 = formatter1.format(new Date());
t.sleep(1000);
// interval given in milliseconds
            }
        } catch (Exception e) {
        }
    }

    public void printTime() {
        b.setText(timeString);
// l.setText(timeString1);
    }
    public static void main(String[] args) {
        new DigitalWatch();
    }
}