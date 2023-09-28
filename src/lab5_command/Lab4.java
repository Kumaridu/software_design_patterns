package lab5_command;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/* ************************************
 *
 *  Lab4.  
 *
 * ************************************/

public class Lab4 extends JFrame {

    private VStack stack = new VStack();// the stack object

    private String pushstring="  "; // the string to push on the stack
	private CommandManager commandManager = new CommandManager();

	//
	JButton JButtonPush = new JButton();
	JButton JButtonPop = new JButton();
	JButton JButtonUndo = new JButton();
	JButton JButtonRedo = new JButton();
	JButton JButtonClear = new JButton();
	JList JList1 = new JList();

	 Mediator mediator = new Mediator(commandManager, stack, JButtonPush, JButtonPop,
							JButtonRedo, JButtonUndo, JButtonClear);

	//
    
	public Lab4 () {
		// set mediator to colleagues
		stack.setMediator(mediator);
		commandManager.setMediator(mediator);

		setTitle("Stack Application"); 
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(480,300);
		setVisible(false);

		JButtonPush.setText("Push");
		getContentPane().add(JButtonPush);
		JButtonPush.setBounds(38,48,110,30);

		JButtonPop.setText("Pop");
		getContentPane().add(JButtonPop);
		JButtonPop.setBounds(38,98,110,30);

		JButtonUndo.setText("Undo");
		getContentPane().add(JButtonUndo);
		JButtonUndo.setBounds(38,144,110,30);

//		JButtonRedo.setText("Redo");
//		getContentPane().add(JButtonRedo);
//		JButtonRedo.setBounds(38,190,110,30);

		JButtonClear.setText("Clear");
		getContentPane().add(JButtonClear);
		JButtonClear.setBounds(38,190,110,30);

		JScrollPane scrollPane = new JScrollPane(JList1);
		JList1.setListData(stack.getStackVector());
		scrollPane.setBounds(218,38,160,200);

		getContentPane().add(scrollPane);

		SymWindow aSymWindow = new SymWindow();
		this.addWindowListener(aSymWindow);
		SymAction lSymAction = new SymAction();

		JButtonPush.addActionListener(lSymAction);
		JButtonPop.addActionListener(lSymAction);
		JButtonUndo.addActionListener(lSymAction);
		JButtonRedo.addActionListener(lSymAction);
		JButtonClear.addActionListener(lSymAction);
	
	}

	static public void main(String args[]) {
		try {
		    // Add the following code if you want the Look and Feel
		    // to be set to the Look and Feel of the native system.
		  
		    try {
		        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		    } 
		    catch (Exception e) { 
		    }

			//Create a new instance of our application's frame, and make it visible.
			(new Lab4()).setVisible(true);
		} 
		catch (Throwable t) {
			t.printStackTrace();
			//Ensure the application exits with an error condition.
			System.exit(1);
		}
	}



	void exitApplication() {
		try {
		    	this.setVisible(false);    // hide the Frame
		    	this.dispose();            // free the system resources
		    	System.exit(0);            // close the application
		} catch (Exception e) {
		}
	}

	class SymWindow extends WindowAdapter {
		public void windowClosing(WindowEvent event)
		{
			Object object = event.getSource();
			if (object == Lab4.this)
				JFrame1_windowClosing(event);
		}
	}

	void JFrame1_windowClosing(WindowEvent event) {
		// to do: code goes here.
			 
		JFrame1_windowClosing_Interaction1(event);
	}

	void JFrame1_windowClosing_Interaction1(WindowEvent event) {
		try {
			this.exitApplication();
		} catch (Exception e) {
		}
	}

	class SymAction implements ActionListener {
		public void actionPerformed(ActionEvent event)
		{
			Object object = event.getSource();
			if (object == JButtonPush)
				JButtonPush_actionPerformed(event);
			else if (object == JButtonPop)
				JButtonPop_actionPerformed(event);
			else if (object == JButtonUndo)
				JButtonUndo_actionPerformed(event);
			else if (object == JButtonRedo)
				JButtonRedo_actionPerformed(event);
			else if (object == JButtonClear)
				JButtonClear_actionPerformed(event);
			
		}
	}

	void JButtonPush_actionPerformed(ActionEvent event) {
	    pushstring= "";
	    PushDialog dialog = new PushDialog(this); //ask the user what to push
	    dialog.setVisible(true);
	    if (!pushstring.equals("")) // after the dialog is closed,
			commandManager.submit(new PushCommand(stack, pushstring));
		refreshJList();

	}

	void JButtonPop_actionPerformed(ActionEvent event) {
		//stack.pop();
		commandManager.submit(new PopCommand(stack));
		refreshJList();
	}

	void JButtonUndo_actionPerformed(ActionEvent event) {
		commandManager.undo();
		refreshJList();
		// to do: code goes here.
	}

	void JButtonRedo_actionPerformed(ActionEvent event) {
		commandManager.redo();
		refreshJList();
		// to do: code goes here.
	}

	void JButtonClear_actionPerformed(ActionEvent event) {
		commandManager.submit(new ClearCommand(stack));
		refreshJList();
	}

	private void refreshJList() {
		JList1.setListData(stack.getStackVector()); // refresh the JList
		this.repaint();
	}
	
	public void setPushString (String string){
	    pushstring = string;
	}
	

}
