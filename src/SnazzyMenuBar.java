//1.42- Creating Sub-Menus

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;


public class SnazzyMenuBar extends JMenuBar implements ActionListener {
		
		public SnazzyMenuBar(){
		JMenu first = new JMenu ("Menu 1");
		//Mnemonic
		first.setMnemonic(KeyEvent.VK_M);
		
		//Mnemonic
		JMenu second = new JMenu ("Menu 2");
		second.setMnemonic(KeyEvent.VK_E);
		
		JMenuItem bacon = new JMenuItem("BACONN!!", KeyEvent.VK_B);
		bacon.setActionCommand("baconjlkdsflsdjflf");
		bacon.addActionListener(this);
		
		JMenuItem cheese = new JMenuItem("CHEESE!!", KeyEvent.VK_C);
		cheese.setActionCommand("cheesejlkdsflsdjflf");
		cheese.addActionListener(this);
		
		//MENUye radio buton ekledik
		JRadioButtonMenuItem rb1 = new JRadioButtonMenuItem("choice 1");
		JRadioButtonMenuItem rb2 = new JRadioButtonMenuItem("choice 2");
		ButtonGroup group = new ButtonGroup();
		group.add(rb1);
		group.add(rb2);
		
		JMenu sub= new JMenu ("A submenu");
		JMenuItem test = new JMenuItem("Test!");
		sub.add(test);
		
		first.add(bacon);
		first.add(cheese);
		first.addSeparator();
		first.add(rb1);
		first.add(rb2);
		first.add(sub);
		
		add(first);
		add(second);
		
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.print("Menu Item" + e.getActionCommand() + "Selected");
		}
}
