import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
public class FramePrincipal extends JFrame {

	/**
	 *
	 */
	FramePrincipal(){
			
			setSize(1000,1000);
			//setLayout(new GridLayout(1,2));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setResizable(true);
			
			Container c1 = new Container();
			add(c1);
			c1.setPreferredSize(new Dimension(1000,1000));
			c1.setMaximumSize(new Dimension(1000,1000));
			JScrollPane scrollFrame = new JScrollPane(c1);

			scrollFrame.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			c1.setAutoscrolls(true);
			this.add(scrollFrame);
	}
}
