import java.awt.*;
import java.awt.event.*;
class FirstApp extends WindowAdapter implements ActionListener {
    Frame cal;
    Label l;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, add, sub, mul, div, mod, clr, del, dot, neg, eq;
    double xd, num1,  num2, ans;

    FirstApp(){
        cal = new Frame("First Calculator");
        cal.setSize(375,500);
        cal.setLayout(null);
        cal.setVisible(true);
        cal.setBackground(Color.BLUE);
        cal.addWindowListener(this);

        l = new Label();
        l.setBackground(Color.BLACK);
        l.setBounds(50, 50, 260, 60);
        l.setForeground(Color.GRAY);

        b1 = new  Button("1");
        b1.setBounds(50,340,50,50);
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.GRAY);
        b2 =  new  Button("2");
        b2.setBounds(120,340,50,50);
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.GRAY);
        b3  =  new  Button("3");
        b3.setBounds(190,340,50,50);
        b3.addActionListener(this);
        b3.setForeground(Color.GRAY);
        b3.setBackground(Color.BLACK);
        b4   =  new  Button("4");
        b4.setBounds(50,270,50,50);
        b4.addActionListener(this);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.GRAY);
        b5 =   new  Button("5");
        b5.setBounds(120,270,50,50);
        b5.addActionListener(this);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.GRAY);
        b6 =    new  Button("6");
        b6.setBounds(190,270,50,50);
        b6.addActionListener(this);
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.GRAY);
        b7 = new   Button("7");
        b7.setBounds(50,200,50,50);
        b7.addActionListener(this);
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.GRAY);
        b8 = new Button("8");
        b8.setBounds(120,200,50,50);
        b8.addActionListener(this);
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.GRAY);
        b9 = new Button("9");
        b9.setBounds(190,200,50,50);
        b9.addActionListener(this);
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.GRAY);
        b0 =  new Button("0");
        b0.setBounds(120,410,50,50);
        b0.addActionListener(this);
        b0.setBackground(Color.BLACK);
        b0.setForeground(Color.GRAY);
        add = new  Button("+");
        add.setBounds(260,340,50,50);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.GRAY);
        sub  = new Button("-");
        sub.setBounds(260,270,50,50);
        sub.addActionListener(this);
        sub.setBackground(Color.BLACK);
        sub.setForeground(Color.GRAY);
        mul  = new Button("*");
        mul.setBounds(260,200,50,50);
        mul.addActionListener(this);
        mul.setBackground(Color.BLACK);
        mul.setForeground(Color.GRAY);
        div = new Button("/");
        div.setBounds(260,130,50,50);
        div.addActionListener(this);
        div.setBackground(Color.BLACK);
        div.setForeground(Color.GRAY);
        mod  = new Button("%");
        mod.setBounds(190,130,50,50);
        mod.addActionListener(this);
        mod.setBackground(Color.BLACK);
        mod.setForeground(Color.GRAY);
        clr = new  Button("Clr");
        clr.setBounds(50,130,65,50);
        clr.addActionListener(this);
        clr.setBackground(Color.BLACK);
        clr.setForeground(Color.GRAY);
        del = new  Button("Del");
        del.setBounds(120,130,50,50);
        del.addActionListener(this);
        del.setBackground(Color.BLACK);
        del.setForeground(Color.GRAY);
        dot  = new Button(".");
        dot.setBounds(190,410,50,50);
        dot.addActionListener(this);
        dot.setBackground(Color.BLACK);
        dot.setForeground(Color.GRAY);
        neg  = new Button("+/-");
        neg.setBounds(50,410,50,50);
        neg.addActionListener(this);
        neg.setBackground(Color.BLACK);
        neg.setForeground(Color.GRAY);
        eq = new Button("=");
        eq.setBounds(245,410,65,50);
        eq.addActionListener(this);
        eq.setBackground(Color.BLACK);
        eq.setForeground(Color.GRAY);

        cal.add(l);
        cal.add(b1);
        cal.add(b2);
        cal.add(b3);
        cal.add(b4);
        cal.add(b5);
        cal.add(b6);
        cal.add(b7);
        cal.add(b8);
        cal.add(b9);
        cal.add(b0);
        cal.add(add);
        cal.add(sub);
        cal.add(mul);
        cal.add(div);
        cal.add(mod);
        cal.add(clr);
        cal.add(del);
        cal.add(neg);
        cal.add(dot);
        cal.add(eq);
    }
     
    public void windowClosing(WindowEvent e) {
        cal.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        String get, set;

        if(e.getSource()==b1){
            get = l.getText();
            set = get  + "1";
            l.setText(set);
        }

        if(e.getSource()==b2){
            get = l.getText();
            set = get  + "2";
            l.setText(set);
        }

        if(e.getSource()==b3){
            get = l.getText();
            set = get  + "3";
            l.setText(set);
        }

        if(e.getSource()==b4){
            get = l.getText();
            set = get  + "4";
            l.setText(set);
        }

        if(e.getSource()==b5){
            get = l.getText();
            set = get  + "5";
            l.setText(set);
        }

        if(e.getSource()==b6){
            get = l.getText();
            set = get  + "6";
            l.setText(set);
        }

        if(e.getSource()==b7){
            get = l.getText();
            set = get  + "7";
            l.setText(set);
        }

        if(e.getSource()==b8){
            get = l.getText();
            set = get  + "8";
            l.setText(set);
        }

        if(e.getSource()==b9){
            get = l.getText();
            set = get  + "9";
            l.setText(set);
        }

        if(e.getSource()==b0){
            get = l.getText();
            set = get  + "0";
            l.setText(set);
        }

        if(e.getSource()==dot){
            get = l.getText();
            set = get  + ".";
            l.setText(set);
        }

        if(e.getSource()==neg){
            get = l.getText();
            set =  "-" + get;
            l.setText(set);
        }

        if(e.getSource()==del){
            get = l.getText();
            try {
            set = get.substring(0, get.length()-1);
            } catch  (StringIndexOutOfBoundsException e1) {return;}
            l.setText(set);
        }

        if(e.getSource()==add){
            try {
                num1 =  Double.parseDouble(l.getText());
            } catch (NumberFormatException  cal) {
                l.setText("Invalid Format");
                return;
            }
            set = " ";
            l.setText(set);
            ans  = 1;
        }

        if(e.getSource()==sub){
            try {
                num1 =  Double.parseDouble(l.getText());
            } catch (NumberFormatException  cal) {
                    l.setText("Invalid Format");
                    return;
                }
            set = "";
            l.setText(set);
            ans  = 2;
        }

        if(e.getSource()==mul){
            try {
                num1 =  Double.parseDouble(l.getText());
            } catch (NumberFormatException  cal) {
                    l.setText("Invalid Format");
                    return;
                }
            set = "";
            l.setText(set);
            ans  = 3;
        }

        if(e.getSource()==div){
            try {
                num1 =  Double.parseDouble(l.getText());
            } catch (NumberFormatException  cal) {
                    l.setText("Invalid Format");
                    return;
                }
            set = "";
            l.setText(set);
            ans  = 4;
        }

        if(e.getSource()==mod){
            try {
                num1 =  Double.parseDouble(l.getText());
            } catch (NumberFormatException  cal) {
                    l.setText("Invalid Format");
                    return;
                }
            set =  "";
            l.setText(set);
            ans  = 5;
        }

        if(e.getSource()==eq){
            try {
                num2 =  Double.parseDouble(l.getText());
            } catch (Exception cal){
                l.setText("Enter  a number");
                return;
            }

            if(ans==1){xd = num1 +  num2;}
            if(ans==2){xd = num1  -  num2;}
            if(ans==3){xd =  num1  *  num2;}
            if(ans==4){xd  =  num1  /  num2;}
            if(ans==5){xd  =  num1  %  num2;}
            l.setText(String.valueOf(xd));
        }

        if(e.getSource()==clr){
            num1 = 0;
            num2 = 0;
            ans =  0;
            xd  = 0;
            set = "";
            l.setText(set);
        }
    }
    public static void main(String[] args) {
        new  FirstApp();
    }
}