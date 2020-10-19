package ui.quanLyXeMay;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GD_XemChiTietXeMay extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnQuayLai;
	private JButton btnSua;
	private JPanel pnlAnh;
	private JLabel lblAnh;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtHarleyDavion;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField txtXeCnTay;
	private JTextField txtVitNam;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Create the panel.
	 */
	public GD_XemChiTietXeMay() {
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

		JLabel lblThemXe = new JLabel("Xem chi tiết xe máy");
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
		
		Box horizontalBox_5 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_5);
		
		Component rigidArea_11 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_5.add(rigidArea_11);
		
		pnlAnh = new JPanel();
		pnlAnh.setPreferredSize(new Dimension(300, 200));
		horizontalBox_5.add(pnlAnh);
		pnlAnh.setLayout(new BoxLayout(pnlAnh, BoxLayout.X_AXIS));
		
		lblAnh = new JLabel("IMG");
		lblAnh.setPreferredSize(new Dimension(300, 200));
		lblAnh.setMaximumSize(new Dimension(700, 700));
		lblAnh.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pnlAnh.add(lblAnh);
		
		Box verticalBox_1 = Box.createVerticalBox();
		horizontalBox_5.add(verticalBox_1);
		
		Box horizontalBox_9 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_9);
		
		Component rigidArea_9_2 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_9.add(rigidArea_9_2);
		
		JLabel lblNewLabel = new JLabel("Mã xe");
		lblNewLabel.setPreferredSize(new Dimension(90, 40));
		lblNewLabel.setMaximumSize(new Dimension(100, 40));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_9.add(lblNewLabel);
		
		Component rigidArea_10 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10.setPreferredSize(new Dimension(10, 20));
		horizontalBox_9.add(rigidArea_10);
		
		textField = new JTextField();
		textField.setText("XM123456");
		textField.setPreferredSize(new Dimension(170, 40));
		textField.setMaximumSize(new Dimension(2147483647, 40));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setEditable(false);
		textField.setColumns(5);
		horizontalBox_9.add(textField);
		
		Component rigidArea_9_8_2_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_9_8_2_1.setPreferredSize(new Dimension(30, 20));
		rigidArea_9_8_2_1.setMaximumSize(new Dimension(40, 20));
		horizontalBox_9.add(rigidArea_9_8_2_1);
		
		JLabel lblTnXe = new JLabel("Tên xe");
		lblTnXe.setPreferredSize(new Dimension(90, 40));
		lblTnXe.setMaximumSize(new Dimension(100, 40));
		lblTnXe.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_9.add(lblTnXe);
		
		Component rigidArea_10_1_5 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_1_5.setPreferredSize(new Dimension(10, 20));
		horizontalBox_9.add(rigidArea_10_1_5);
		
		textField_1 = new JTextField();
		textField_1.setPreferredSize(new Dimension(500, 40));
		textField_1.setMaximumSize(new Dimension(2147483647, 40));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(15);
		horizontalBox_9.add(textField_1);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox_9.add(horizontalGlue_3);
		
		Component rigidArea_9_8_2_1_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_9_8_2_1_1.setPreferredSize(new Dimension(30, 20));
		rigidArea_9_8_2_1_1.setMaximumSize(new Dimension(40, 20));
		horizontalBox_9.add(rigidArea_9_8_2_1_1);
		
		JLabel lblHng = new JLabel("Hãng");
		lblHng.setPreferredSize(new Dimension(70, 40));
		lblHng.setMaximumSize(new Dimension(100, 40));
		lblHng.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_9.add(lblHng);
		
		Component rigidArea_10_1_5_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_1_5_1.setPreferredSize(new Dimension(10, 20));
		horizontalBox_9.add(rigidArea_10_1_5_1);
		
		txtHarleyDavion = new JTextField();
		txtHarleyDavion.setText("Harley davisions");
		txtHarleyDavion.setPreferredSize(new Dimension(200, 40));
		txtHarleyDavion.setMaximumSize(new Dimension(2147483647, 40));
		txtHarleyDavion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtHarleyDavion.setColumns(7);
		horizontalBox_9.add(txtHarleyDavion);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_1.setPreferredSize(new Dimension(40, 40));
		rigidArea_1.setMaximumSize(new Dimension(40, 40));
		verticalBox_1.add(rigidArea_1);
		
		Box horizontalBox_9_1 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_9_1);
		
		Component rigidArea_9_3 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_9_1.add(rigidArea_9_3);
		
		JLabel lblLoiXe_1 = new JLabel("Loại xe");
		lblLoiXe_1.setPreferredSize(new Dimension(90, 40));
		lblLoiXe_1.setMaximumSize(new Dimension(100, 40));
		lblLoiXe_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_9_1.add(lblLoiXe_1);
		
		Component rigidArea_10_6 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_6.setPreferredSize(new Dimension(10, 20));
		horizontalBox_9_1.add(rigidArea_10_6);
		
		txtXeCnTay = new JTextField();
		txtXeCnTay.setColumns(7);
		txtXeCnTay.setText("Xe côn tay");
		txtXeCnTay.setPreferredSize(new Dimension(120, 40));
		txtXeCnTay.setMaximumSize(new Dimension(250, 40));
		txtXeCnTay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtXeCnTay.setEditable(false);
		horizontalBox_9_1.add(txtXeCnTay);
		
		Component rigidArea_9_8_2_2 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_9_8_2_2.setPreferredSize(new Dimension(30, 20));
		rigidArea_9_8_2_2.setMaximumSize(new Dimension(40, 20));
		horizontalBox_9_1.add(rigidArea_9_8_2_2);
		
		JLabel lblDngXe = new JLabel("Dòng xe");
		lblDngXe.setPreferredSize(new Dimension(90, 40));
		lblDngXe.setMaximumSize(new Dimension(100, 40));
		lblDngXe.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_9_1.add(lblDngXe);
		
		Component rigidArea_10_1_6 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_1_6.setPreferredSize(new Dimension(10, 20));
		horizontalBox_9_1.add(rigidArea_10_1_6);
		
		textField_2 = new JTextField();
		textField_2.setPreferredSize(new Dimension(600, 40));
		textField_2.setMaximumSize(new Dimension(600, 40));
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(12);
		horizontalBox_9_1.add(textField_2);
		
		Component rigidArea_9_8_2_2_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_9_8_2_2_1.setPreferredSize(new Dimension(95, 20));
		rigidArea_9_8_2_2_1.setMaximumSize(new Dimension(40, 20));
		horizontalBox_9_1.add(rigidArea_9_8_2_2_1);
		
		JLabel lblXutS_1 = new JLabel("Xuất sứ");
		lblXutS_1.setPreferredSize(new Dimension(90, 40));
		lblXutS_1.setMaximumSize(new Dimension(100, 40));
		lblXutS_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_9_1.add(lblXutS_1);
		
		Component rigidArea_10_1_6_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_1_6_1.setPreferredSize(new Dimension(10, 20));
		horizontalBox_9_1.add(rigidArea_10_1_6_1);
		
		txtVitNam = new JTextField();
		txtVitNam.setText("Việt nam");
		txtVitNam.setPreferredSize(new Dimension(150, 40));
		txtVitNam.setMaximumSize(new Dimension(2147483647, 40));
		txtVitNam.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtVitNam.setEditable(false);
		txtVitNam.setColumns(4);
		horizontalBox_9_1.add(txtVitNam);
		
		Component horizontalGlue_6 = Box.createHorizontalGlue();
		horizontalBox_9_1.add(horizontalGlue_6);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_2.setPreferredSize(new Dimension(40, 40));
		rigidArea_2.setMaximumSize(new Dimension(40, 40));
		verticalBox_1.add(rigidArea_2);
		
		Box horizontalBox_9_2 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_9_2);
		
		Component rigidArea_9_4 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_9_2.add(rigidArea_9_4);
		
		JLabel lblPhnKhi = new JLabel("Số phân khối");
		lblPhnKhi.setPreferredSize(new Dimension(135, 40));
		lblPhnKhi.setMaximumSize(new Dimension(150, 40));
		lblPhnKhi.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_9_2.add(lblPhnKhi);
		
		Component rigidArea_10_7 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_7.setPreferredSize(new Dimension(15, 20));
		horizontalBox_9_2.add(rigidArea_10_7);
		
		textField_4 = new JTextField();
		textField_4.setText("150");
		textField_4.setPreferredSize(new Dimension(60, 40));
		textField_4.setMaximumSize(new Dimension(60, 40));
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setEditable(false);
		textField_4.setColumns(4);
		horizontalBox_9_2.add(textField_4);
		
		Component rigidArea_9_8_2_3 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_9_8_2_3.setPreferredSize(new Dimension(30, 20));
		rigidArea_9_8_2_3.setMaximumSize(new Dimension(40, 20));
		horizontalBox_9_2.add(rigidArea_9_8_2_3);
		
		JLabel lblSLng = new JLabel("Số lượng");
		lblSLng.setPreferredSize(new Dimension(90, 40));
		lblSLng.setMaximumSize(new Dimension(100, 40));
		lblSLng.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_9_2.add(lblSLng);
		
		Component rigidArea_10_7_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_7_1.setPreferredSize(new Dimension(10, 20));
		horizontalBox_9_2.add(rigidArea_10_7_1);
		
		textField_3 = new JTextField();
		textField_3.setText("2000");
		textField_3.setPreferredSize(new Dimension(60, 40));
		textField_3.setMaximumSize(new Dimension(60, 40));
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setEditable(false);
		textField_3.setColumns(3);
		horizontalBox_9_2.add(textField_3);
		
		Component rigidArea_9_8_2_3_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_9_8_2_3_1.setPreferredSize(new Dimension(50, 20));
		rigidArea_9_8_2_3_1.setMaximumSize(new Dimension(40, 20));
		horizontalBox_9_2.add(rigidArea_9_8_2_3_1);
		
		JLabel lblTnXe_3 = new JLabel("Màu xe");
		lblTnXe_3.setPreferredSize(new Dimension(90, 40));
		lblTnXe_3.setMaximumSize(new Dimension(100, 40));
		lblTnXe_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_9_2.add(lblTnXe_3);
		
		Component rigidArea_10_1_7 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_1_7.setPreferredSize(new Dimension(10, 20));
		horizontalBox_9_2.add(rigidArea_10_1_7);
		
		textField_5 = new JTextField();
		textField_5.setPreferredSize(new Dimension(200, 40));
		textField_5.setMaximumSize(new Dimension(250, 40));
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setColumns(11);
		horizontalBox_9_2.add(textField_5);
		
		Component horizontalGlue_7 = Box.createHorizontalGlue();
		horizontalBox_9_2.add(horizontalGlue_7);
		
		Component horizontalGlue_5 = Box.createHorizontalGlue();
		horizontalBox_9_2.add(horizontalGlue_5);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_3.setPreferredSize(new Dimension(40, 40));
		rigidArea_3.setMaximumSize(new Dimension(40, 40));
		verticalBox_1.add(rigidArea_3);
		
		Box horizontalBox_9_3 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_9_3);
		
		Component rigidArea_9_6 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_9_3.add(rigidArea_9_6);
		
		JLabel lblNewLabel_4 = new JLabel("Giá nhập");
		lblNewLabel_4.setPreferredSize(new Dimension(90, 40));
		lblNewLabel_4.setMaximumSize(new Dimension(100, 40));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_9_3.add(lblNewLabel_4);
		
		Component rigidArea_10_8 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_8.setPreferredSize(new Dimension(10, 20));
		horizontalBox_9_3.add(rigidArea_10_8);
		
		textField_6 = new JTextField();
		textField_6.setText("Xe côn tay");
		textField_6.setPreferredSize(new Dimension(120, 40));
		textField_6.setMaximumSize(new Dimension(250, 40));
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.setColumns(9);
		horizontalBox_9_3.add(textField_6);
		
		Component rigidArea_9_8_2_4 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_9_8_2_4.setPreferredSize(new Dimension(40, 20));
		rigidArea_9_8_2_4.setMaximumSize(new Dimension(40, 20));
		horizontalBox_9_3.add(rigidArea_9_8_2_4);
		
		JLabel lblBoHnh_1 = new JLabel("Bảo hành");
		lblBoHnh_1.setPreferredSize(new Dimension(100, 40));
		lblBoHnh_1.setMaximumSize(new Dimension(150, 40));
		lblBoHnh_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_9_3.add(lblBoHnh_1);
		
		Component rigidArea_10_1_8 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_1_8.setPreferredSize(new Dimension(10, 20));
		horizontalBox_9_3.add(rigidArea_10_1_8);
		
		textField_7 = new JTextField();
		textField_7.setText("2000");
		textField_7.setPreferredSize(new Dimension(60, 40));
		textField_7.setMaximumSize(new Dimension(60, 40));
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_7.setEditable(false);
		textField_7.setColumns(3);
		horizontalBox_9_3.add(textField_7);
		
		Component rigidArea_9_8_2_4_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_9_8_2_4_1.setPreferredSize(new Dimension(100, 20));
		rigidArea_9_8_2_4_1.setMaximumSize(new Dimension(40, 20));
		horizontalBox_9_3.add(rigidArea_9_8_2_4_1);
		
		JLabel lblHSBn_1 = new JLabel("Hệ số bán");
		lblHSBn_1.setPreferredSize(new Dimension(100, 40));
		lblHSBn_1.setMaximumSize(new Dimension(100, 40));
		lblHSBn_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_9_3.add(lblHSBn_1);
		
		Component rigidArea_10_1_1_2_1_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_1_1_2_1_1.setPreferredSize(new Dimension(30, 20));
		rigidArea_10_1_1_2_1_1.setMaximumSize(new Dimension(30, 20));
		horizontalBox_9_3.add(rigidArea_10_1_1_2_1_1);
		
		textField_8 = new JTextField();
		textField_8.setPreferredSize(new Dimension(50, 40));
		textField_8.setMaximumSize(new Dimension(80, 40));
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_8.setColumns(3);
		horizontalBox_9_3.add(textField_8);
		
		Component horizontalGlue_8 = Box.createHorizontalGlue();
		horizontalBox_9_3.add(horizontalGlue_8);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_4.setPreferredSize(new Dimension(40, 40));
		rigidArea_4.setMaximumSize(new Dimension(40, 40));
		verticalBox_1.add(rigidArea_4);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_1);
		
		Component rigidArea_9_6_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_1.add(rigidArea_9_6_1);
		
		JLabel lblSKhung = new JLabel("Số khung");
		lblSKhung.setPreferredSize(new Dimension(100, 40));
		lblSKhung.setMaximumSize(new Dimension(100, 40));
		lblSKhung.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_1.add(lblSKhung);
		
		textField_9 = new JTextField();
		textField_9.setText("Xe côn tay");
		textField_9.setPreferredSize(new Dimension(120, 40));
		textField_9.setMaximumSize(new Dimension(250, 40));
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_9.setColumns(9);
		horizontalBox_1.add(textField_9);
		
		Component rigidArea_9_8_1_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_9_8_1_1.setPreferredSize(new Dimension(50, 20));
		rigidArea_9_8_1_1.setMaximumSize(new Dimension(40, 20));
		horizontalBox_1.add(rigidArea_9_8_1_1);
		
		JLabel lblSSn = new JLabel("Số sườn");
		lblSSn.setPreferredSize(new Dimension(95, 40));
		lblSSn.setMaximumSize(new Dimension(100, 40));
		lblSSn.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_1.add(lblSSn);
		
		textField_10 = new JTextField();
		textField_10.setText("Xe côn tay");
		textField_10.setPreferredSize(new Dimension(120, 40));
		textField_10.setMaximumSize(new Dimension(250, 40));
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_10.setColumns(9);
		horizontalBox_1.add(textField_10);
		
		Component rigidArea_13_2 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_13_2.setPreferredSize(new Dimension(40, 20));
		horizontalBox_1.add(rigidArea_13_2);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_1);
		
		Component rigidArea_9_12 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_1.add(rigidArea_9_12);
		
		Component rigidArea_14 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_5.add(rigidArea_14);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox_5.add(horizontalGlue_2);
		
		Component rigidArea_4_2 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_4_2.setPreferredSize(new Dimension(40, 40));
		rigidArea_4_2.setMaximumSize(new Dimension(40, 40));
		verticalBox.add(rigidArea_4_2);

		Box horizontalBox_6 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_6);

		Component rigidArea_9_4_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_6.add(rigidArea_9_4_1);

		JLabel lblMT = new JLabel("Mô tả");
		lblMT.setVerticalAlignment(SwingConstants.TOP);
		lblMT.setMaximumSize(new Dimension(100, 400));
		lblMT.setPreferredSize(new Dimension(90, 200));
		lblMT.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_6.add(lblMT);

		Component rigidArea_10_5_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_10_5_1.setPreferredSize(new Dimension(10, 20));
		horizontalBox_6.add(rigidArea_10_5_1);

		JScrollPane scrollPane = new JScrollPane();
		horizontalBox_6.add(scrollPane);

		JTextArea txtMoTa = new JTextArea();
		txtMoTa.setMargin(new Insets(10, 10, 10, 10));
		txtMoTa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		scrollPane.setViewportView(txtMoTa);

		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_6.add(rigidArea_5);
		
		Component rigidArea_4_2_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_4_2_1.setPreferredSize(new Dimension(40, 40));
		rigidArea_4_2_1.setMaximumSize(new Dimension(40, 40));
		verticalBox.add(rigidArea_4_2_1);

		Box horizontalBox_7 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_7);

		Component rigidArea_15 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_7.add(rigidArea_15);

		btnQuayLai = new JButton("Quay lại");
		btnQuayLai.setForeground(Color.WHITE);
		btnQuayLai.setBackground(Color.RED);
		btnQuayLai.setPreferredSize(new Dimension(150, 50));
		btnQuayLai.setMaximumSize(new Dimension(150, 50));
		btnQuayLai.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_7.add(btnQuayLai);

		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalBox_7.add(horizontalGlue);

		Component rigidArea_17 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_17.setPreferredSize(new Dimension(30, 20));
		horizontalBox_7.add(rigidArea_17);

		btnSua = new JButton("Sửa");
		btnSua.setForeground(Color.WHITE);
		btnSua.setBackground(new Color(0, 128, 0));
		btnSua.setPreferredSize(new Dimension(170, 50));
		btnSua.setMaximumSize(new Dimension(170, 50));
		btnSua.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_7.add(btnSua);

		Component rigidArea_16 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_7.add(rigidArea_16);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox.add(verticalGlue);

		dangKiSuKien();
	}

	public void dangKiSuKien() {
		btnSua.addActionListener(this);
		btnQuayLai.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if (o.equals(btnQuayLai)) {
			this.removeAll();
			this.setLayout(new BorderLayout());
			this.add(new GD_XeMay());
			this.validate();
			this.repaint();
		}else if (o.equals(btnSua)) {
			this.removeAll();
			this.setLayout(new BorderLayout());
			this.add(new GD_CapNhatXeMay());
			this.validate();
			this.repaint();
		}

	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
