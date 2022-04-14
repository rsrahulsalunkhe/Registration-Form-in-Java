import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2;
	JRadioButton male,female;
	JComboBox day,month,year;
	JTextArea ta1;
	JCheckBox terms;
	JButton submit;
	JLabel msg;
	JTextArea screen;

	MyFrame() {
		setTitle("Registration Form");
		setSize(700,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		l1 = new JLabel("Name :");
		l1.setBounds(20,50,100,20);
		c.add(l1);

		t1 = new JTextField();
		t1.setBounds(130,50,100,20);
		c.add(t1);

		l2 = new JLabel("Mobile :");
		l2.setBounds(20,100,100,20);
		c.add(l2);

		t2 = new JTextField();
		t2.setBounds(130,100,100,20);
		c.add(t2);

		l3 = new JLabel("Gender");
		l3.setBounds(20,150,100,20);
		c.add(l3);

		male = new JRadioButton("Male");
		female = new JRadioButton("Female");
		male.setBounds(130,150,80,20);
		female.setBounds(220,150,80,20);
		c.add(male);c.add(female);
		ButtonGroup gen = new ButtonGroup();
		gen.add(male);gen.add(female);

		l4 = new JLabel("DOB");
		l4.setBounds(20,200,100,20);
		c.add(l4);

		String days[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String months[] = {"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
		String years[] = {"2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000","1999","1998","1997","1996"};

		day = new JComboBox(days);
		month = new JComboBox(months);
		year = new JComboBox(years);
		day.setBounds(130,200,50,20);
		month.setBounds(190,200,50,20);
		year.setBounds(250,200,60,20);
		c.add(day);c.add(month);c.add(year);

		l5 = new JLabel("Address");
		l5.setBounds(20,250,100,20);
		c.add(l5);

		ta1 = new JTextArea();
		ta1.setBounds(130,240,200,50);
		c.add(ta1);

		terms = new JCheckBox("Please Accept terms and conditions");
		terms.setBounds(50,300,250,20);
		c.add(terms);

		submit = new JButton("Submit");
		submit.setBounds(150,350,80,20);
		c.add(submit);
		submit.addActionListener(this);

		screen = new JTextArea();
		screen.setBounds(350,50,300,300);
		c.add(screen);

		msg = new JLabel();
		msg.setBounds(20,400,250,20);
		c.add(msg);

		setVisible(true);
		}

		public void actionPerformed(ActionEvent e) {
			if(terms.isSelected()) {
				msg.setText("Registration Succesfull!");

				String name = t1.getText();
				String mobile = t2.getText();
				String gender = "male";
				if(female.isSelected()) {
					gender = "female";
					}
				String dob = day.getSelectedItem() + " " + month.getSelectedItem() + " " + year.getSelectedItem();
				String address = ta1.getText();

				screen.setText("Name : " + name + "\n" + "Mobiel : "+ mobile + "\n" + "Gender : " + gender + "\n" + "DOB : " + dob + "\n" + "Address : " + address);
				}
			else {
				msg.setText("accept Terms and Conditons to submit");
				screen.setText("");
				}
			}
	}

class RegistrationForm {
	public static void main(String args[]) {
		MyFrame f = new MyFrame();
		}
	}