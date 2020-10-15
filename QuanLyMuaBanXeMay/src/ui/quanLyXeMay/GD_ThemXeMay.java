package ui.quanLyXeMay;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.BoxLayout;

public class GD_ThemXeMay extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public GD_ThemXeMay() {
		setBackground(new Color(255, 0, 0));
		setPreferredSize(new Dimension(1300, 900));
		
		Box verticalBox = Box.createVerticalBox();
		add(verticalBox);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		JPanel pnlThongTinXe = new JPanel();
		horizontalBox.add(pnlThongTinXe);
		pnlThongTinXe.setLayout(new BoxLayout(pnlThongTinXe, BoxLayout.X_AXIS));
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_1);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_2);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_3);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_3);
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_4);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_4);
		
		Box horizontalBox_5 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_5);
		
		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_5);
		
		Box horizontalBox_6 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_6);
		
		Component rigidArea_6 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_6);
		
		Box horizontalBox_7 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_7);
		
		Component rigidArea_7 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_7);
		
		Box horizontalBox_8 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_8);
		
		Component rigidArea_8 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_8);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox.add(verticalGlue);

	}

}
