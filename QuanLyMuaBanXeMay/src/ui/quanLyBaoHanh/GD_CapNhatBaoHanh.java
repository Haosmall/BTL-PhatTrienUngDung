package ui.quanLyBaoHanh;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class GD_CapNhatBaoHanh extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnLuu;
	private JTable tblBaoHanh;
	private JButton btnQuayLai;

	/**
	 * Create the panel.
	 */
	public GD_CapNhatBaoHanh() {
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(1300, 900));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		Box verticalBox = Box.createVerticalBox();
		add(verticalBox);

		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);

		JPanel pnlThemXe = new JPanel();
		pnlThemXe.setBackground(new Color(0, 128, 0));
		pnlThemXe.setPreferredSize(new Dimension(1300, 50));
		pnlThemXe.setMaximumSize(new Dimension(32767, 50));
		horizontalBox.add(pnlThemXe);
		pnlThemXe.setLayout(new BoxLayout(pnlThemXe, BoxLayout.X_AXIS));

		JLabel lblThemXe = new JLabel("Phiếu bảo hành");
		lblThemXe.setMaximumSize(new Dimension(37217, 50));
		lblThemXe.setPreferredSize(new Dimension(1300, 50));
		lblThemXe.setHorizontalTextPosition(SwingConstants.CENTER);
		lblThemXe.setHorizontalAlignment(SwingConstants.CENTER);
		lblThemXe.setForeground(Color.WHITE);
		lblThemXe.setFont(new Font("Tahoma", Font.BOLD, 25));
		pnlThemXe.add(lblThemXe);

		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		rigidArea.setMaximumSize(new Dimension(40, 40));
		rigidArea.setPreferredSize(new Dimension(40, 40));
		verticalBox.add(rigidArea);

		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);

		Component rigidArea_9 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_1.add(rigidArea_9);

		JLabel lblNewLabel = new JLabel("Mã bảo hành:");
		lblNewLabel.setPreferredSize(new Dimension(150, 40));
		lblNewLabel.setMaximumSize(new Dimension(100, 40));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_1.add(lblNewLabel);

		Component rigidArea_10 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10.setPreferredSize(new Dimension(10, 20));
		horizontalBox_1.add(rigidArea_10);

		JLabel lblBh = new JLabel("BH123456");
		lblBh.setPreferredSize(new Dimension(120, 40));
		lblBh.setMaximumSize(new Dimension(100, 40));
		lblBh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_1.add(lblBh);

		Component rigidArea_9_8_2 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_9_8_2.setPreferredSize(new Dimension(30, 20));
		rigidArea_9_8_2.setMaximumSize(new Dimension(40, 20));
		horizontalBox_1.add(rigidArea_9_8_2);

		Component horizontalGlue_5_2 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_5_2);

		JLabel lblMHpng = new JLabel("Mã hợp đồng:");
		lblMHpng.setPreferredSize(new Dimension(150, 40));
		lblMHpng.setMaximumSize(new Dimension(100, 40));
		lblMHpng.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_1.add(lblMHpng);

		Component rigidArea_10_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_1.setPreferredSize(new Dimension(10, 20));
		horizontalBox_1.add(rigidArea_10_1);

		JLabel lblBh_1 = new JLabel("BH123456");
		lblBh_1.setPreferredSize(new Dimension(120, 40));
		lblBh_1.setMaximumSize(new Dimension(100, 40));
		lblBh_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_1.add(lblBh_1);

		Component horizontalGlue_5_3 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_5_3);

		Component rigidArea_9_8_2_2 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_9_8_2_2.setPreferredSize(new Dimension(30, 20));
		rigidArea_9_8_2_2.setMaximumSize(new Dimension(40, 20));
		horizontalBox_1.add(rigidArea_9_8_2_2);

		JLabel lblNewLabel_1_3 = new JLabel("Mã NV kĩ thuật:");
		lblNewLabel_1_3.setPreferredSize(new Dimension(170, 40));
		lblNewLabel_1_3.setMaximumSize(new Dimension(100, 40));
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_1.add(lblNewLabel_1_3);

		Component rigidArea_10_2_3 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_2_3.setPreferredSize(new Dimension(10, 20));
		horizontalBox_1.add(rigidArea_10_2_3);

		JLabel lblBh_2_3 = new JLabel("BH123456");
		lblBh_2_3.setPreferredSize(new Dimension(120, 40));
		lblBh_2_3.setMaximumSize(new Dimension(100, 40));
		lblBh_2_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_1.add(lblBh_2_3);

		Component horizontalGlue_5 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_5);

		Component rigidArea_12 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_1.add(rigidArea_12);

		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_1.setMaximumSize(new Dimension(40, 40));
		rigidArea_1.setPreferredSize(new Dimension(40, 40));
		verticalBox.add(rigidArea_1);

		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);

		Component rigidArea_9_5 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2.add(rigidArea_9_5);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Mã khách hàng:");
		lblNewLabel_1_3_1.setPreferredSize(new Dimension(170, 40));
		lblNewLabel_1_3_1.setMaximumSize(new Dimension(100, 40));
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_2.add(lblNewLabel_1_3_1);
		
		Component rigidArea_10_2_3_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_2_3_1.setPreferredSize(new Dimension(10, 20));
		horizontalBox_2.add(rigidArea_10_2_3_1);
		
		JLabel lblBh_2_3_1 = new JLabel("BH123456");
		lblBh_2_3_1.setPreferredSize(new Dimension(120, 40));
		lblBh_2_3_1.setMaximumSize(new Dimension(100, 40));
		lblBh_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_2.add(lblBh_2_3_1);
		
		Component rigidArea_9_5_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2.add(rigidArea_9_5_1);

		JLabel lblNewLabel_1 = new JLabel("Tên khách hàng:");
		lblNewLabel_1.setPreferredSize(new Dimension(170, 40));
		lblNewLabel_1.setMaximumSize(new Dimension(100, 40));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_2.add(lblNewLabel_1);

		Component rigidArea_10_2 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_2.setPreferredSize(new Dimension(10, 20));
		horizontalBox_2.add(rigidArea_10_2);

		JLabel lblBh_2 = new JLabel("Nguyễn Trần Nhật Hào");
		lblBh_2.setPreferredSize(new Dimension(300, 40));
		lblBh_2.setMaximumSize(new Dimension(100, 40));
		lblBh_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_2.add(lblBh_2);

		Component rigidArea_9_8_2_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_9_8_2_1.setPreferredSize(new Dimension(30, 20));
		rigidArea_9_8_2_1.setMaximumSize(new Dimension(40, 20));
		horizontalBox_2.add(rigidArea_9_8_2_1);

		JLabel lblMHpng_1 = new JLabel("Số điện thoại:");
		lblMHpng_1.setPreferredSize(new Dimension(170, 40));
		lblMHpng_1.setMaximumSize(new Dimension(100, 40));
		lblMHpng_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_2.add(lblMHpng_1);

		Component rigidArea_10_1_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_1_1.setPreferredSize(new Dimension(10, 20));
		horizontalBox_2.add(rigidArea_10_1_1);

		JLabel lblBh_1_1 = new JLabel("0123456789");
		lblBh_1_1.setPreferredSize(new Dimension(120, 40));
		lblBh_1_1.setMaximumSize(new Dimension(100, 40));
		lblBh_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_2.add(lblBh_1_1);

		Component rigidArea_9_8_2_1_3 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_9_8_2_1_3.setPreferredSize(new Dimension(30, 20));
		rigidArea_9_8_2_1_3.setMaximumSize(new Dimension(40, 20));
		horizontalBox_2.add(rigidArea_9_8_2_1_3);

		JLabel lblNewLabel_1_1_1 = new JLabel("Ngày mua xe:");
		lblNewLabel_1_1_1.setPreferredSize(new Dimension(150, 40));
		lblNewLabel_1_1_1.setMaximumSize(new Dimension(100, 40));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_2.add(lblNewLabel_1_1_1);

		Component rigidArea_10_2_1_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_2_1_1.setPreferredSize(new Dimension(10, 20));
		horizontalBox_2.add(rigidArea_10_2_1_1);

		JLabel lblBh_2_1_1 = new JLabel("19/10/2020");
		lblBh_2_1_1.setPreferredSize(new Dimension(120, 40));
		lblBh_2_1_1.setMaximumSize(new Dimension(100, 40));
		lblBh_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_2.add(lblBh_2_1_1);

		Component horizontalGlue_5_1 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_5_1);

		Component rigidArea_13 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2.add(rigidArea_13);

		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_2.setMaximumSize(new Dimension(40, 40));
		rigidArea_2.setPreferredSize(new Dimension(40, 40));
		verticalBox.add(rigidArea_2);

		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_3);

		Component rigidArea_11_2 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3.add(rigidArea_11_2);

		JLabel lblNewLabel_1_1 = new JLabel("Địa chỉ:");
		lblNewLabel_1_1.setPreferredSize(new Dimension(80, 40));
		lblNewLabel_1_1.setMaximumSize(new Dimension(100, 40));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_3.add(lblNewLabel_1_1);

		Component rigidArea_10_2_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_2_1.setPreferredSize(new Dimension(10, 20));
		horizontalBox_3.add(rigidArea_10_2_1);

		JLabel lblBh_2_1 = new JLabel(
				"............................................................................................");
		lblBh_2_1.setPreferredSize(new Dimension(500, 40));
		lblBh_2_1.setMaximumSize(new Dimension(100, 40));
		lblBh_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_3.add(lblBh_2_1);

		Component rigidArea_9_8_2_1_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_9_8_2_1_1.setPreferredSize(new Dimension(30, 20));
		rigidArea_9_8_2_1_1.setMaximumSize(new Dimension(40, 20));
		horizontalBox_3.add(rigidArea_9_8_2_1_1);

		JLabel lblMHpng_1_1 = new JLabel("Mã xe:");
		lblMHpng_1_1.setPreferredSize(new Dimension(80, 40));
		lblMHpng_1_1.setMaximumSize(new Dimension(100, 40));
		lblMHpng_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_3.add(lblMHpng_1_1);

		Component rigidArea_10_1_1_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_1_1_1.setPreferredSize(new Dimension(10, 20));
		horizontalBox_3.add(rigidArea_10_1_1_1);

		JLabel lblBh_1_1_1 = new JLabel("XM123456");
		lblBh_1_1_1.setPreferredSize(new Dimension(120, 40));
		lblBh_1_1_1.setMaximumSize(new Dimension(100, 40));
		lblBh_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_3.add(lblBh_1_1_1);

		Component rigidArea_9_8_2_1_1_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_9_8_2_1_1_1.setPreferredSize(new Dimension(30, 20));
		rigidArea_9_8_2_1_1_1.setMaximumSize(new Dimension(40, 20));
		horizontalBox_3.add(rigidArea_9_8_2_1_1_1);

		JLabel lblNewLabel_1_2_1 = new JLabel("Tên xe:");
		lblNewLabel_1_2_1.setPreferredSize(new Dimension(80, 40));
		lblNewLabel_1_2_1.setMaximumSize(new Dimension(100, 40));
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_3.add(lblNewLabel_1_2_1);

		Component rigidArea_10_2_2_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_2_2_1.setPreferredSize(new Dimension(10, 20));
		horizontalBox_3.add(rigidArea_10_2_2_1);

		JLabel lblBh_2_2_1 = new JLabel("Honda Air Blade 2020");
		lblBh_2_2_1.setPreferredSize(new Dimension(250, 40));
		lblBh_2_2_1.setMaximumSize(new Dimension(100, 40));
		lblBh_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_3.add(lblBh_2_2_1);

		Component horizontalGlue_5_1_1 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_5_1_1);

		Component rigidArea_13_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3.add(rigidArea_13_1);
		
		Component rigidArea_3_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_3_1.setPreferredSize(new Dimension(40, 40));
		rigidArea_3_1.setMaximumSize(new Dimension(40, 40));
		verticalBox.add(rigidArea_3_1);
		
		Box horizontalBox_3_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_3_1);
		
		Component rigidArea_11_2_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3_1.add(rigidArea_11_2_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Địa chỉ:");
		lblNewLabel_1_1_2.setPreferredSize(new Dimension(80, 40));
		lblNewLabel_1_1_2.setMaximumSize(new Dimension(100, 40));
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_3_1.add(lblNewLabel_1_1_2);
		
		Component rigidArea_10_2_1_2 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_2_1_2.setPreferredSize(new Dimension(10, 20));
		horizontalBox_3_1.add(rigidArea_10_2_1_2);
		
		JLabel lblBh_2_1_2 = new JLabel("............................................................................................");
		lblBh_2_1_2.setPreferredSize(new Dimension(500, 40));
		lblBh_2_1_2.setMaximumSize(new Dimension(100, 40));
		lblBh_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_3_1.add(lblBh_2_1_2);
		
		Component rigidArea_9_8_2_1_1_2 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_9_8_2_1_1_2.setPreferredSize(new Dimension(30, 20));
		rigidArea_9_8_2_1_1_2.setMaximumSize(new Dimension(40, 20));
		horizontalBox_3_1.add(rigidArea_9_8_2_1_1_2);
		
		JLabel lblMHpng_1_1_1 = new JLabel("Mã xe:");
		lblMHpng_1_1_1.setPreferredSize(new Dimension(80, 40));
		lblMHpng_1_1_1.setMaximumSize(new Dimension(100, 40));
		lblMHpng_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_3_1.add(lblMHpng_1_1_1);
		
		Component rigidArea_10_1_1_1_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_1_1_1_1.setPreferredSize(new Dimension(10, 20));
		horizontalBox_3_1.add(rigidArea_10_1_1_1_1);
		
		JLabel lblBh_1_1_1_1 = new JLabel("XM123456");
		lblBh_1_1_1_1.setPreferredSize(new Dimension(120, 40));
		lblBh_1_1_1_1.setMaximumSize(new Dimension(100, 40));
		lblBh_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_3_1.add(lblBh_1_1_1_1);
		
		Component rigidArea_9_8_2_1_1_1_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_9_8_2_1_1_1_1.setPreferredSize(new Dimension(30, 20));
		rigidArea_9_8_2_1_1_1_1.setMaximumSize(new Dimension(40, 20));
		horizontalBox_3_1.add(rigidArea_9_8_2_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Tên xe:");
		lblNewLabel_1_2_1_1.setPreferredSize(new Dimension(80, 40));
		lblNewLabel_1_2_1_1.setMaximumSize(new Dimension(100, 40));
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_3_1.add(lblNewLabel_1_2_1_1);
		
		Component rigidArea_10_2_2_1_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_2_2_1_1.setPreferredSize(new Dimension(10, 20));
		horizontalBox_3_1.add(rigidArea_10_2_2_1_1);
		
		JLabel lblBh_2_2_1_1 = new JLabel("Honda Air Blade 2020");
		lblBh_2_2_1_1.setPreferredSize(new Dimension(250, 40));
		lblBh_2_2_1_1.setMaximumSize(new Dimension(100, 40));
		lblBh_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_3_1.add(lblBh_2_2_1_1);
		
		Component horizontalGlue_5_1_1_1 = Box.createHorizontalGlue();
		horizontalBox_3_1.add(horizontalGlue_5_1_1_1);
		
		Component rigidArea_13_1_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3_1.add(rigidArea_13_1_1);

		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_3.setMaximumSize(new Dimension(40, 40));
		rigidArea_3.setPreferredSize(new Dimension(40, 40));
		verticalBox.add(rigidArea_3);

		Box horizontalBox_4 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_4);

		Component rigidArea_9_10 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_4.add(rigidArea_9_10);

		JLabel lblMHpng_1_2 = new JLabel("Thông tin bảo hành:");
		lblMHpng_1_2.setPreferredSize(new Dimension(220, 40));
		lblMHpng_1_2.setMaximumSize(new Dimension(100, 40));
		lblMHpng_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_4.add(lblMHpng_1_2);

		Component horizontalGlue_5_1_2 = Box.createHorizontalGlue();
		horizontalBox_4.add(horizontalGlue_5_1_2);

		Component rigidArea_9_12 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_4.add(rigidArea_9_12);

		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_4.setMaximumSize(new Dimension(40, 40));
		rigidArea_4.setPreferredSize(new Dimension(40, 20));
		verticalBox.add(rigidArea_4);

		Box horizontalBox_6 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_6);

		Component rigidArea_9_4_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_6.add(rigidArea_9_4_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(1260, 5));
		horizontalBox_6.add(scrollPane);

		tblBaoHanh = new JTable();
		tblBaoHanh.setPreferredSize(new Dimension(1260, 150));
		tblBaoHanh.setIntercellSpacing(new Dimension(5, 5));
		tblBaoHanh.setRowMargin(2);
		tblBaoHanh.setRowHeight(25);
		tblBaoHanh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tblBaoHanh.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "H\u1EC7 th\u1ED1ng phanh", null, null},
			},
			new String[] {
				"STT", "Danh m\u1EE5c b\u1EA3o h\u00E0nh", "V\u1EC7 sinh", "Thay th\u1EBF"
			}
		));
		tblBaoHanh.getColumnModel().getColumn(0).setPreferredWidth(36);
		tblBaoHanh.getColumnModel().getColumn(1).setPreferredWidth(150);
		tblBaoHanh.getColumnModel().getColumn(2).setPreferredWidth(300);
		scrollPane.setViewportView(tblBaoHanh);

		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_6.add(rigidArea_5);

		Component rigidArea_6 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_6.setMaximumSize(new Dimension(40, 40));
		rigidArea_6.setPreferredSize(new Dimension(40, 40));
		verticalBox.add(rigidArea_6);

		Box horizontalBox_7 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_7);

		Component rigidArea_15 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_7.add(rigidArea_15);

		 btnQuayLai = new JButton("Quay lại");
		btnQuayLai.setPreferredSize(new Dimension(150, 50));
		btnQuayLai.setMaximumSize(new Dimension(120, 50));
		btnQuayLai.setForeground(Color.WHITE);
		btnQuayLai.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnQuayLai.setBackground(Color.RED);
		horizontalBox_7.add(btnQuayLai);

		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalBox_7.add(horizontalGlue);

		btnLuu = new JButton("Lưu");
		btnLuu.setForeground(Color.WHITE);
		btnLuu.setBackground(new Color(0, 128, 0));
		btnLuu.setPreferredSize(new Dimension(170, 50));
		btnLuu.setMaximumSize(new Dimension(120, 50));
		btnLuu.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_7.add(btnLuu);

		Component rigidArea_16 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_7.add(rigidArea_16);

		Component verticalGlue = Box.createVerticalGlue();
		verticalBox.add(verticalGlue);

		dangKiSuKien();
	}

	public void dangKiSuKien() {
		btnLuu.addActionListener(this);
		btnQuayLai.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if (o.equals(btnLuu)) {
//			this.removeAll();
//			this.setLayout(new BorderLayout());
//			this.add(new GD_XeMay());
//			this.validate();
//			this.repaint();
		}else if (o.equals(btnQuayLai)) {
			this.removeAll();
			this.setLayout(new BorderLayout());
			this.add(new GD_BaoHanh());
			this.validate();
			this.repaint();
		}

	}
}
