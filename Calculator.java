package swingdemo;

import java.awt.FlowLayout;
import javax.swing.*;//javax means java extended package

public class Calculator {

	public static void main(String[] args)
			{
				calc obj = new calc();

			}
		}

//extended the Jframe to get the frame window
//it follows card layout so you can see only the above label 
class calc extends JFrame 
{
			//declare everything outside to increase the scope
			JTextField inputname,input1,input2;
			JRadioButton male, female;
			JButton submit, add,subtract,divide,multiply;
			JLabel head ,head2,head3,head1,head4,head5;
			JCheckBox hobby1,hobby2;
			
				//constructor
				public calc()
				{
					//set the layout from default card to FlowLayout, Grid, Null 
					setLayout(new FlowLayout());
					
					  //for adding the text 
					  head1 = new JLabel("Greeting");
                      head  = new JLabel("Name");
                      head4  = new JLabel("Your Gender:    ");
                      head5  = new JLabel("Your Hobby:     ");
                      
					  head2 = new JLabel(" Swing Calculator ");
					  head3 = new JLabel("Result");
					  
					 //add text boxes for input
					 inputname = new JTextField(23);
					 input1 = new JTextField(23);
					 input2 = new JTextField(23);
					 
					 //radio buttons 
					 male = new JRadioButton("Male");
					 female = new JRadioButton("Female");
					 
					 //to make only one radio button to be clicked
					 ButtonGroup  bg = new ButtonGroup();
					 bg.add(male);
					 bg.add(female);
					 
					 //check boxes
					 hobby1 = new JCheckBox("Dancing");
					 hobby2 = new JCheckBox("Singing");
					
					 //button
					 submit = new JButton("                              Submit                              ");
					 
					 add = new JButton("          Add             " );
					 subtract = new JButton("        Subtract       ");
					 multiply = new JButton("        multiply        ");
					 divide = new JButton("        Division        ");
					
					 //add components on the frame
					 add(head);
					 add(inputname);
					 add(head4);
					 add(male);
					 add(female);
					 add(head5);
					 add(hobby1);
					 add(hobby2);
					 add(submit);
					 add(head1);
					 
					 add(head2);
					 add(input1);
					 add(input2);
					 add(add);
					 add(subtract);
					 add(multiply);
					 add(divide);
					 add(head3);
					
					//make the window visible
					setVisible(true);
					
					//size of window
					setSize(300,400);
					
					//for buttons 
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
					
					 submit.addActionListener(ae ->{
						    //gettext() method returns only string so type cast it
						    String name = inputname.getText();
						    if(male.isSelected())
						    {
						    	name = "WELCOME !! Mr. " + name ;
						    }
						    else 
						    {
						    	name = "WELCOME !! Ms. " + name;
						    }
						    if(hobby1.isSelected())
						    {
						    	name = name + " Dancer";
						    }
						    if(hobby2.isSelected())
						    {
						    	name = name + " Singer";
						    }
						    	
				
							head1.setText(name );						 
					 });
					 
					 add.addActionListener(ae ->{
						    //gettext() method returns only string so type cast it
						    int num1 = Integer.parseInt(input1.getText());
							int num2 = Integer.parseInt(input2.getText());		          
							int value = num1+num2;
							head3.setText(value +  " ");//convert the value to string 
						 
					 });
					 subtract.addActionListener(ae ->{
						    //gettext() method returns only string so type cast it
						    int num1 = Integer.parseInt(input1.getText());
							int num2 = Integer.parseInt(input2.getText());		          
							int value = num1 - num2;
							head3.setText(value +  " ");//convert the value to string 
						 
					 });
					 multiply.addActionListener(ae ->{
						    //gettext() method returns only string so type cast it
						    int num1 = Integer.parseInt(input1.getText());
							int num2 = Integer.parseInt(input2.getText());		          
							int value = num1 * num2;
							head3.setText(value +  " ");//convert the value to string 
						 
					 });
					 divide.addActionListener(ae ->{
						    //gettext() method returns only string so type cast it
						    int num1 = Integer.parseInt(input1.getText());
							int num2 = Integer.parseInt(input2.getText());		          
							int value = num1 / num2;
							head3.setText(value +  " ");//convert the value to string 
						 
					 });
				
				}

}

//boiler code as we can simply do lambda expression over here
//public void actionPerformed(ActionEvent ae)
//{
//	//gettext() method returns only string so type cast it
//	int num1 = Integer.parseInt(input1.getText());
//	int num2 = Integer.parseInt(input2.getText());
//
//	int value = num1+num2;
//	head3.setText(value +  " ");//convert the value to string 

//   adding events to make it working button but   action listener is an interface
//   enter.addActionListener(this);//this is the object of action listener and class 
// we know this action listener has only one method of action performed so why to define it use direct lambda
//   lambda expression  = works with functional interface and has only one abstract class.
//   we will use only method name and code logic here.