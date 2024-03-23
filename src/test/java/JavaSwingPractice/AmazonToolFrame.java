package JavaSwingPractice;

import java.awt.Color;
import java.awt.FlowLayout;
//import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class AmazonToolFrame {

	JFrame frame;
	JMenuBar menuBar;
	JMenu File, Edit, Help,PEdit;
	JMenuItem New,open,save,saveAs,Cut,copy,past,selectAll,Version, MoreHelp;
	JMenuItem PNew, POpen,PSave,PSaveAs;
	JSeparator Separator;
	JProgressBar ProgressBar;
	JOptionPane optionPaneFinance,ConfirmPane, MessagePage, InputPane;
	JButton button,button2,button3,button4,button5;
	JLabel label,label2,label3,placeholderLabel;
	JTextArea textArea;
	ImageIcon image;
	JPasswordField password;
	JCheckBox crorepati,lakhpati;
	JTable table1;
	JScrollPane scrollPaneForTable1;
	JPopupMenu PopupMenu;

	AmazonToolFrame() {

		// ------------------Frame--------------------//
		frame = new JFrame("Hellow");
		PopupMenu=new JPopupMenu("Edit");
		//Separator=new JSeparator();
		PEdit=new JMenu("Edit");
		PNew=new JMenuItem("New");
		POpen=new JMenuItem("Open");
		PSave=new JMenuItem("Save");
		PSaveAs=new JMenuItem("Save As");
		
		PEdit.add(PNew);
		PEdit.addSeparator();
		PEdit.add(POpen);
		PEdit.addSeparator();
		PEdit.add(PSave);
		PEdit.addSeparator();
		PEdit.add(PSaveAs);
		PopupMenu.add(PEdit);
		frame.add(PopupMenu);
		
		frame.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(SwingUtilities.isRightMouseButton(e)) {
					PopupMenu.show(frame,e.getX(),e.getY());
				}
			}
		});
		
		//--------------------JMenu-------------------//
		File=new JMenu("File");
		New=new JMenuItem("New");
		open=new JMenuItem("Open");
		save=new JMenuItem("save");
		saveAs=new JMenuItem("Save As");
		File.add(New);
		File.addSeparator();
		File.add(open);
		File.addSeparator();
		File.add(save);
		File.addSeparator();
		File.add(saveAs);
//		frame.add(File);
		
		Edit=new JMenu("Edit");
		Cut=new JMenuItem("Cut");
		copy=new JMenuItem("Copy");
		past=new JMenuItem("Past");
		selectAll=new JMenuItem("Select All");
		Edit.add(Cut);
		Edit.addSeparator();
		Edit.add(copy);
		Edit.addSeparator();
		Edit.add(past);
		Edit.addSeparator();
		Edit.add(selectAll);
//		frame.add(Edit);
		
		Help=new JMenu("Help");
		Version=new JMenuItem("Version");
		MoreHelp=new JMenuItem("More Help");
		Help.add(Version);
		Help.addSeparator();
		Help.add(MoreHelp);
		
		menuBar=new JMenuBar();
		menuBar.add(File);
		menuBar.add(Edit);
		menuBar.add(Help);
		
		frame.add(menuBar);
		frame.setJMenuBar(menuBar);

		// -----------------Button ------------------//
		button = new JButton("1");
		button.setBounds(50, 50, 30, 20);
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (label3 != null) {
					frame.remove(label3);
				}
//				frame.setSize(1000, 800);
				label2 = new JLabel("Button 1 pressed");
				label2.setBounds(50, 80, 150, 20);
				frame.add(label2);
				frame.revalidate();
				frame.repaint();
				String finance = "you want to become \n";
				if (lakhpati.isSelected() || crorepati.isSelected()) {
					if (lakhpati.isSelected()) {
						finance += "Lakh pati \n";
					}
					if (crorepati.isSelected()) {
						finance += "Crore pati \n";
					}
				} else {
					finance += "Nothing...you are useless....";
				}
				optionPaneFinance = new JOptionPane();
				optionPaneFinance.showMessageDialog(button, finance);
				password.setEchoChar('*');
			}
		});
		frame.add(button);

		button2 = new JButton("2");
		button2.setBounds(100, 50, 30, 20);
		button2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (label2 != null) {
					frame.remove(label2);
				}
				label3 = new JLabel("Button 2 pressed");
				label3.setBounds(50, 80, 150, 20);
				frame.add(label3);
				frame.revalidate();
				frame.repaint();
				textArea.setText(null);
				password.setEchoChar((char) 0);
			}
		});
		frame.add(button2);

		// -------------------- TextField -------------//

		final JTextField text = new JTextField(50);
		text.setBounds(45, 110, 200, 20);
		text.addFocusListener(new FocusListener() {

			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if (text.getText().length() > 0)
					placeholderLabel.setVisible(false);
				else
					placeholderLabel.setVisible(true);
			}

			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				placeholderLabel.setVisible(false);
				textArea.append(text.getText());
				frame.repaint();
			}
		});

		frame.add(text);

		placeholderLabel = new JLabel("Enter text here");
		placeholderLabel.setForeground(Color.LIGHT_GRAY);
		placeholderLabel.setBounds(53, 110, 150, 20);
		frame.add(placeholderLabel);

		// --------------- JTextArea ------------------//
		textArea = new JTextArea("This is the JTextArea", 5, 10);
		textArea.setBounds(50, 140, 200, textArea.getRows() * 20);
		textArea.setEnabled(false);
		frame.add(textArea);

		// -----------Password field-------------//
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(50, 250, 100, 20);
		frame.add(passwordLabel);

		password = new JPasswordField();
		password.setEchoChar('*');
		password.setBounds(120, 250, 150, 20);
		// password.addActionListener();
		frame.add(password);

		// --------------------Image ----------------//
		this.image = new ImageIcon("/Users/siddharthdalwaniya/Downloads/kittens-kisses.gif");
		this.label = new JLabel(image);
		label.setBounds(50, 100, image.getIconWidth(), image.getIconHeight());

		// -------------------JCheckBox--------------//
		crorepati = new JCheckBox("Crore pati");
		lakhpati = new JCheckBox("Lakh pati");
		crorepati.setBounds(50, 280, 100, 20);
		lakhpati.setBounds(150, 280, 100, 20);
		frame.add(crorepati);
		frame.add(lakhpati);

		// -------------------JTable ---------------//
		String data[][] = { { "Siddharth", "Dalwaniya" }, { "Priyanshu", "Rani" }, { "Minal", "Kambhaliya" } };
		String column[] = { "FirstName", "LastName" };
		table1 = new JTable(data, column);
		table1.setBounds(50, 310, 300, 50);
		table1.setCellSelectionEnabled(true);

		// frame.add(table1);
		scrollPaneForTable1 = new JScrollPane(table1);
		scrollPaneForTable1.setBounds(50, 310, 300, 80);
		frame.add(scrollPaneForTable1);

		// ------------fetch the selected cell of the table------------//
		ListSelectionModel select = table1.getSelectionModel();
		select.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		select.addListSelectionListener(new ListSelectionListener() {

			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub

				if (!e.getValueIsAdjusting()) {
					int[] rows = table1.getSelectedRows();
					int[] columns = table1.getSelectedColumns();

					for (int row : rows) {
						for (int column : columns) {
							System.out.println("Selected cells values are : " + table1.getValueAt(row, column));
						}
					}
				}
			}
		});

		// -------------JOption Pane Confirm dialog, Message dialog, input dialog box
		// ------------//
		button3 = new JButton("Confirm Dialog");
		button3.setBounds(50, 410, 80, 30);
		ConfirmPane = new JOptionPane();
		button3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int result = ConfirmPane.showConfirmDialog(button3, "Are able to see the confirm box?",
						"Confimr it please!!", JOptionPane.YES_NO_OPTION);
				if (result == ConfirmPane.YES_OPTION) {
					System.out.println("Yes option was selected in the confrim dialog box.");
				} else if (result == ConfirmPane.NO_OPTION) {
					System.out.println("No option was selected int he confirm dialog box.");
				}

			}
		});
		frame.add(button3);

		button4 = new JButton("Message Dialog");
		button4.setBounds(140, 410, 80, 30);
		button4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MessagePage = new JOptionPane();
				MessagePage.showMessageDialog(button4, "You are earning less!!", "Are you doing great?",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		frame.add(button4);

		button5 = new JButton("Input Dialog");
		button5.setBounds(240, 410, 80, 30);
		button5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				InputPane=new JOptionPane();
				String input=InputPane.showInputDialog(button5,"Please enter you name in the below box:","Who are you?",JOptionPane.OK_CANCEL_OPTION);
				
				if(input!=null) {
					System.out.println("The input give is: "+input);
				}
			}
		});
		frame.add(button5);
		
		//--------------------JProgressBar-------------------------//
		ProgressBar=new JProgressBar(0,1000);
		ProgressBar.setBounds(50,450,200,50);
		ProgressBar.setValue(0);
		ProgressBar.setStringPainted(false);
		frame.add(ProgressBar);
		
		
		// -------------- General about the frame -----------------//
		frame.setSize(500, 1000);
		frame.setTitle("Just a revision...");
		frame.setLayout(null);// new FlowLayout(FlowLayout.CENTER));
		frame.setVisible(true);
		frame.getContentPane().add(text, "placeholder 'Enter the name'");

	}
	
	public void Iterator() {
		int i=0;
		while(i<=1000) {
			ProgressBar.setValue(i);
			i+=10;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		while(i>0) {
			ProgressBar.setValue(i);
			i-=10;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Iterator();
	}

}
