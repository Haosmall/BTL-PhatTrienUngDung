package ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import ui.quanLyHoaDon.GD_ChiTietHoaDon;
import ui.quanLyKhachHang.GD_ThemKhachHang;
import ui.quanLyXeMay.GD_ChiTietXeMay;

public class GD_TrangChu extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtTimKiem;
	private JTable tblXe;
	private JTextField txtTrang;
	private JTextField txtSoLuong;
	private JPanel pnlChiTietXe;
	private JPanel pnlThongTinXe;
	private JLabel lblThongTinXe;
	private JLabel lblTimKiem;
	private JComboBox<String> cboTimKiem;
	private JButton btnDau;
	private JButton btnTruoc;
	private JButton btnSau;
	private JButton btnCuoi;
	private JLabel lblSoLuong;
	private JButton btnThem;
	private JPanel pnlChiTietHoaDon;
	private JPanel pnlThongTinHoaDon;
	private JLabel lblThongTinHoaDon;
	private JLabel lblMaHoaDon;
	private JTextField txtSoCMT;
	private JTextField txtSoDienThoai;
	private JTable tblHoaDon;
	private JTextField txtTienKhachTra;
	private JButton btnThanhToan;
	private JButton btnSua;
	private JButton btnTaoMoi;
	private JButton btnXoa;
	private JButton btnXemChiTiet;
	private JButton btnThemKH;

	/**
	 * Create the panel.
	 */
	public GD_TrangChu() {
		setBackground(Color.YELLOW);
		setPreferredSize(new Dimension(1300, 900));
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		Box horizontalBox = Box.createHorizontalBox();
		add(horizontalBox);

		pnlChiTietXe = new JPanel();
		pnlChiTietXe.setBackground(Color.WHITE);
		pnlChiTietXe.setPreferredSize(new Dimension(650, 900));
		horizontalBox.add(pnlChiTietXe);
		pnlChiTietXe.setLayout(new BoxLayout(pnlChiTietXe, BoxLayout.X_AXIS));

		Box verticalBox = Box.createVerticalBox();
		pnlChiTietXe.add(verticalBox);

		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);

		pnlThongTinXe = new JPanel();
		pnlThongTinXe.setBackground(new Color(30, 144, 255));
		pnlThongTinXe.setPreferredSize(new Dimension(650, 50));
		pnlThongTinXe.setMaximumSize(new Dimension(32767, 50));
		horizontalBox_1.add(pnlThongTinXe);
		pnlThongTinXe.setLayout(new BoxLayout(pnlThongTinXe, BoxLayout.X_AXIS));

		lblThongTinXe = new JLabel("Thông tin xe máy");
		lblThongTinXe.setPreferredSize(new Dimension(650, 50));
		lblThongTinXe.setMaximumSize(new Dimension(2000, 50));
		lblThongTinXe.setForeground(new Color(255, 255, 255));
		lblThongTinXe.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblThongTinXe.setHorizontalAlignment(SwingConstants.CENTER);
		pnlThongTinXe.add(lblThongTinXe);

		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_2);

		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);

		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2.add(rigidArea_1);

		lblTimKiem = new JLabel("Tìm kiếm: ");
		lblTimKiem.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_2.add(lblTimKiem);

		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2.add(rigidArea);

		cboTimKiem = new JComboBox<String>();
		cboTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cboTimKiem.setModel(new DefaultComboBoxModel(new String[] { "Tên xe", "Mã xe" }));
		cboTimKiem.setMaximumSize(new Dimension(250, 40));
		cboTimKiem.setPreferredSize(new Dimension(100, 50));
		horizontalBox_2.add(cboTimKiem);

		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2.add(rigidArea_3);

		txtTimKiem = new JTextField();
		txtTimKiem.setPreferredSize(new Dimension(250, 40));
		txtTimKiem.setMaximumSize(new Dimension(400, 40));
		horizontalBox_2.add(txtTimKiem);
		txtTimKiem.setColumns(10);

		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2.add(rigidArea_4);

		Component rigidArea_7 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_7);

		Box horizontalBox_2_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2_2);

		Component rigidArea_1_2 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2_2.add(rigidArea_1_2);

		JLabel lblHng = new JLabel("Hãng:");
		lblHng.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_2_2.add(lblHng);

		Component rigidArea_1_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2_2.add(rigidArea_1_1);

		JComboBox<String> cboHang = new JComboBox<String>();
		cboHang.setModel(new DefaultComboBoxModel(new String[] { "Tất cả", "Honda", "Yamaha", "SYM", "Suzuki",
				"Piaggio", "Ducati", "Kawasaki", "Harley Davidson" }));
		cboHang.setPreferredSize(new Dimension(100, 50));
		cboHang.setMaximumSize(new Dimension(250, 40));
		cboHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_2_2.add(cboHang);

		Component rigidArea_1_3 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2_2.add(rigidArea_1_3);

		JLabel lblLoiXe = new JLabel("Loại xe:");
		lblLoiXe.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_2_2.add(lblLoiXe);

		Component rigidArea_3_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2_2.add(rigidArea_3_1);

		JComboBox<String> cboLoaiXe = new JComboBox<String>();
		cboLoaiXe.setModel(
				new DefaultComboBoxModel(new String[] { "Tất cả", "Xe số", "Xe tay ga", "Xe côn tay", "Xe mô tô" }));
		cboLoaiXe.setPreferredSize(new Dimension(100, 50));
		cboLoaiXe.setMaximumSize(new Dimension(250, 40));
		cboLoaiXe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_2_2.add(cboLoaiXe);

		Component rigidArea_4_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2_2.add(rigidArea_4_1);

		Component rigidArea_7_2 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_7_2);

		Box horizontalBox_2_2_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2_2_1);

		Component rigidArea_1_4 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2_2_1.add(rigidArea_1_4);

		JLabel lblDngXe = new JLabel("Dòng xe:");
		lblDngXe.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_2_2_1.add(lblDngXe);

		Component rigidArea_1_1_1 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_1_1_1.setPreferredSize(new Dimension(5, 20));
		horizontalBox_2_2_1.add(rigidArea_1_1_1);

		JComboBox<String> cboDongXe = new JComboBox<String>();
		cboDongXe.setModel(new DefaultComboBoxModel(
				new String[] { "Tất cả", "Wave", "Winner", "Air Blade", "SH", "Vision", "Lead", "Cub" }));
		cboDongXe.setPreferredSize(new Dimension(50, 50));
		cboDongXe.setMaximumSize(new Dimension(250, 40));
		cboDongXe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_2_2_1.add(cboDongXe);

		Component rigidArea_1_5 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2_2_1.add(rigidArea_1_5);

		JLabel cboXuatSu = new JLabel("Xuất sứ:");
		cboXuatSu.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_2_2_1.add(cboXuatSu);

		Component rigidArea_3_1_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2_2_1.add(rigidArea_3_1_1);

		JComboBox<String> cboTimKiem_1_1_1 = new JComboBox<String>();
		cboTimKiem_1_1_1.setModel(new DefaultComboBoxModel(
				new String[] { "Tất cả", "Việt Nam", "Nhật Bản", "Hàn Quốc", "Trung Quốc", "Mỹ", "Đức", "Thái Lan" }));
		cboTimKiem_1_1_1.setPreferredSize(new Dimension(100, 50));
		cboTimKiem_1_1_1.setMaximumSize(new Dimension(250, 40));
		cboTimKiem_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_2_2_1.add(cboTimKiem_1_1_1);

		Component rigidArea_4_1_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_2_2_1.add(rigidArea_4_1_1);

		Component rigidArea_7_1 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_7_1);

		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_3);

		Component rigidArea_6 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3.add(rigidArea_6);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(610, 300));
		horizontalBox_3.add(scrollPane);

		tblXe = new JTable();
		tblXe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tblXe.setPreferredSize(new Dimension(610, 450));
		tblXe.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null, null }, },
				new String[] { "M\u00E3 xe", "T\u00EAn xe", "H\u00E3ng", "Nh\u00E0 cung c\u1EA5p",
						"S\u1ED1 l\u01B0\u1EE3ng", "Gi\u00E1", "B\u1EA3o h\u00E0nh" }));
		tblXe.getColumnModel().getColumn(0).setPreferredWidth(69);
		tblXe.getColumnModel().getColumn(1).setPreferredWidth(102);
		tblXe.getColumnModel().getColumn(3).setPreferredWidth(90);
		tblXe.getColumnModel().getColumn(4).setPreferredWidth(63);
		tblXe.getColumnModel().getColumn(5).setPreferredWidth(73);
		tblXe.getColumnModel().getColumn(6).setPreferredWidth(66);
		scrollPane.setViewportView(tblXe);

		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3.add(rigidArea_5);

		Component rigidArea_9 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_9);

		Box horizontalBox_4 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_4);

		Component rigidArea_10 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_4.add(rigidArea_10);

		btnDau = new JButton("");
		btnDau.setBackground(Color.LIGHT_GRAY);
		btnDau.setMinimumSize(new Dimension(20, 20));
		btnDau.setMaximumSize(new Dimension(40, 40));
		btnDau.setPreferredSize(new Dimension(50, 50));
		horizontalBox_4.add(btnDau);

		Component rigidArea_11 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_4.add(rigidArea_11);

		btnTruoc = new JButton("");
		btnTruoc.setBackground(Color.LIGHT_GRAY);
		btnTruoc.setMinimumSize(new Dimension(20, 20));
		btnTruoc.setPreferredSize(new Dimension(50, 50));
		btnTruoc.setMaximumSize(new Dimension(40, 40));
		horizontalBox_4.add(btnTruoc);

		Component rigidArea_12_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_4.add(rigidArea_12_1);

		txtTrang = new JTextField();
		txtTrang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTrang.setHorizontalAlignment(SwingConstants.CENTER);
		txtTrang.setText("1");
		txtTrang.setPreferredSize(new Dimension(50, 40));
		txtTrang.setMaximumSize(new Dimension(50, 40));
		horizontalBox_4.add(txtTrang);
		txtTrang.setColumns(3);

		Component rigidArea_11_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_4.add(rigidArea_11_1);

		btnSau = new JButton("");
		btnSau.setBackground(Color.LIGHT_GRAY);
		btnSau.setMinimumSize(new Dimension(20, 20));
		btnSau.setPreferredSize(new Dimension(50, 50));
		btnSau.setMaximumSize(new Dimension(40, 40));
		horizontalBox_4.add(btnSau);

		Component rigidArea_11_2 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_4.add(rigidArea_11_2);

		btnCuoi = new JButton("");
		btnCuoi.setBackground(Color.LIGHT_GRAY);
		btnCuoi.setMinimumSize(new Dimension(20, 20));
		btnCuoi.setPreferredSize(new Dimension(50, 50));
		btnCuoi.setMaximumSize(new Dimension(40, 40));
		horizontalBox_4.add(btnCuoi);

		Component rigidArea_11_3 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_4.add(rigidArea_11_3);

		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalBox_4.add(horizontalGlue);

		btnXemChiTiet = new JButton("Chi tiết");
		horizontalBox_4.add(btnXemChiTiet);
		btnXemChiTiet.setPreferredSize(new Dimension(150, 50));
		btnXemChiTiet.setMaximumSize(new Dimension(200, 50));
		btnXemChiTiet.setForeground(Color.WHITE);
		btnXemChiTiet.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnXemChiTiet.setBackground(Color.LIGHT_GRAY);

		Component rigidArea_12 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_4.add(rigidArea_12);

		Component rigidArea_8 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_8);

		Box horizontalBox_5 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_5);

		Component rigidArea_13 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_5.add(rigidArea_13);

		btnThemKH = new JButton("Thêm KH");
		horizontalBox_5.add(btnThemKH);
		btnThemKH.setPreferredSize(new Dimension(150, 40));
		btnThemKH.setMaximumSize(new Dimension(200, 50));
		btnThemKH.setForeground(Color.WHITE);
		btnThemKH.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnThemKH.setBackground(Color.LIGHT_GRAY);

		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox_5.add(horizontalGlue_1);

		lblSoLuong = new JLabel("Số lượng:");
		lblSoLuong.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_5.add(lblSoLuong);

		Component rigidArea_13_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_5.add(rigidArea_13_1);

		txtSoLuong = new JTextField();
		txtSoLuong.setText("1");
		txtSoLuong.setPreferredSize(new Dimension(40, 40));
		txtSoLuong.setMaximumSize(new Dimension(40, 40));
		txtSoLuong.setHorizontalAlignment(SwingConstants.CENTER);
		txtSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSoLuong.setColumns(3);
		horizontalBox_5.add(txtSoLuong);

		Component rigidArea_12_2 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_5.add(rigidArea_12_2);

		btnThem = new JButton("Thêm");
		horizontalBox_5.add(btnThem);
		btnThem.setIcon(new ImageIcon(GD_TrangChu.class.getResource("/img/baseline_add_shopping_cart_white_18dp.png")));
		btnThem.setForeground(Color.WHITE);
		btnThem.setBackground(new Color(30, 144, 255));
		btnThem.setPreferredSize(new Dimension(150, 50));
		btnThem.setMaximumSize(new Dimension(200, 50));
		btnThem.setFont(new Font("Tahoma", Font.BOLD, 20));

		Component rigidArea_15_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_5.add(rigidArea_15_1);

		Component rigidArea_8_1 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox.add(rigidArea_8_1);

		Box horizontalBox_5_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_5_1);

		Box horizontalBox_5_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_5_2);

		pnlChiTietHoaDon = new JPanel();
		pnlChiTietHoaDon.setBackground(Color.WHITE);
		pnlChiTietHoaDon.setPreferredSize(new Dimension(650, 900));
		horizontalBox.add(pnlChiTietHoaDon);
		pnlChiTietHoaDon.setLayout(new BoxLayout(pnlChiTietHoaDon, BoxLayout.X_AXIS));

		Box verticalBox_1 = Box.createVerticalBox();
		pnlChiTietHoaDon.add(verticalBox_1);

		Box horizontalBox_2_1 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_2_1);

		pnlThongTinHoaDon = new JPanel();
		pnlThongTinHoaDon.setPreferredSize(new Dimension(650, 50));
		pnlThongTinHoaDon.setMaximumSize(new Dimension(32767, 50));
		pnlThongTinHoaDon.setBackground(new Color(0, 128, 0));
		horizontalBox_2_1.add(pnlThongTinHoaDon);
		pnlThongTinHoaDon.setLayout(new BoxLayout(pnlThongTinHoaDon, BoxLayout.X_AXIS));

		lblThongTinHoaDon = new JLabel("Thông tin hóa đơn");
		lblThongTinHoaDon.setPreferredSize(new Dimension(650, 50));
		lblThongTinHoaDon.setMaximumSize(new Dimension(2000, 50));
		lblThongTinHoaDon.setHorizontalAlignment(SwingConstants.CENTER);
		lblThongTinHoaDon.setForeground(Color.WHITE);
		lblThongTinHoaDon.setFont(new Font("Tahoma", Font.BOLD, 25));
		pnlThongTinHoaDon.add(lblThongTinHoaDon);

		Component rigidArea_17 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_1.add(rigidArea_17);

		Box horizontalBox_3_1 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_3_1);

		JLabel lblMaHoaDon_1 = new JLabel("Mã hóa đơn:");
		lblMaHoaDon_1.setPreferredSize(new Dimension(150, 40));
		lblMaHoaDon_1.setMaximumSize(new Dimension(300, 40));
		lblMaHoaDon_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_3_1.add(lblMaHoaDon_1);

		Component rigidArea_19 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3_1.add(rigidArea_19);

		lblMaHoaDon = new JLabel("HD123456");
		lblMaHoaDon.setMaximumSize(new Dimension(300, 40));
		lblMaHoaDon.setPreferredSize(new Dimension(150, 40));
		lblMaHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_3_1.add(lblMaHoaDon);

		Component rigidArea_20 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3_1.add(rigidArea_20);

		JLabel lblNgayLap_1 = new JLabel("Ngày lập HD:");
		lblNgayLap_1.setPreferredSize(new Dimension(150, 40));
		lblNgayLap_1.setMaximumSize(new Dimension(150, 40));
		lblNgayLap_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_3_1.add(lblNgayLap_1);

		Component rigidArea_19_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3_1.add(rigidArea_19_1);

		JLabel lblNgayLap = new JLabel("20-20-2020");
		lblNgayLap.setMaximumSize(new Dimension(150, 40));
		lblNgayLap.setPreferredSize(new Dimension(150, 40));
		lblNgayLap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_3_1.add(lblNgayLap);

		Component rigidArea_20_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3_1.add(rigidArea_20_1);

		Component rigidArea_18 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_1.add(rigidArea_18);

		Box horizontalBox_4_1 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_4_1);

		JLabel lblSoCMT = new JLabel("Số CMT:");
		lblSoCMT.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_4_1.add(lblSoCMT);

		Component rigidArea_19_2 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_4_1.add(rigidArea_19_2);

		txtSoCMT = new JTextField();
		txtSoCMT.setPreferredSize(new Dimension(250, 40));
		txtSoCMT.setMaximumSize(new Dimension(400, 40));
		txtSoCMT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSoCMT.setColumns(15);
		horizontalBox_4_1.add(txtSoCMT);

		Component rigidArea_20_2 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_4_1.add(rigidArea_20_2);

		JLabel lblHTnKh_1 = new JLabel("Tên KH:");
		lblHTnKh_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_4_1.add(lblHTnKh_1);

		Component rigidArea_19_1_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_4_1.add(rigidArea_19_1_1);

		JLabel lblHTnKh = new JLabel("Nguyễn Trần Nhật Hào");
		lblHTnKh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_4_1.add(lblHTnKh);

		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox_4_1.add(horizontalGlue_3);

		Component rigidArea_20_1_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_4_1.add(rigidArea_20_1_1);

		Component rigidArea_17_1 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_1.add(rigidArea_17_1);

		Box horizontalBox_3_1_1 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_3_1_1);

		JLabel lblSinThoi = new JLabel("Số điện thoại:");
		lblSinThoi.setMaximumSize(new Dimension(300, 40));
		lblSinThoi.setPreferredSize(new Dimension(150, 40));
		lblSinThoi.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_3_1_1.add(lblSinThoi);

		Component rigidArea_19_3 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3_1_1.add(rigidArea_19_3);

		txtSoDienThoai = new JTextField();
		txtSoDienThoai.setPreferredSize(new Dimension(250, 40));
		txtSoDienThoai.setMaximumSize(new Dimension(400, 40));
		txtSoDienThoai.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSoDienThoai.setColumns(10);
		horizontalBox_3_1_1.add(txtSoDienThoai);

		Component rigidArea_20_3 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3_1_1.add(rigidArea_20_3);

		JLabel lblNgySinh = new JLabel("Ngày sinh:");
		lblNgySinh.setPreferredSize(new Dimension(150, 40));
		lblNgySinh.setMaximumSize(new Dimension(85, 40));
		lblNgySinh.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_3_1_1.add(lblNgySinh);

		Component rigidArea_19_1_2 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3_1_1.add(rigidArea_19_1_2);

		JLabel lblNamSinh = new JLabel("20-20-2020");
		lblNamSinh.setMaximumSize(new Dimension(85, 40));
		lblNamSinh.setPreferredSize(new Dimension(150, 40));
		lblNamSinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_3_1_1.add(lblNamSinh);

		Component horizontalGlue_4 = Box.createHorizontalGlue();
		horizontalBox_3_1_1.add(horizontalGlue_4);

		Component rigidArea_20_1_2 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3_1_1.add(rigidArea_20_1_2);

		Component rigidArea_17_2 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_1.add(rigidArea_17_2);

		Box horizontalBox_3_1_2 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_3_1_2);

		JLabel lblDiaChi_1 = new JLabel("Địa chỉ:");
		lblDiaChi_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_3_1_2.add(lblDiaChi_1);

		Component rigidArea_21_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3_1_2.add(rigidArea_21_1);

		JLabel lblDiaChi = new JLabel("..................................................");
		lblDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		horizontalBox_3_1_2.add(lblDiaChi);

		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox_3_1_2.add(horizontalGlue_2);

		Component rigidArea_21 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3_1_2.add(rigidArea_21);

		Component rigidArea_17_3 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_1.add(rigidArea_17_3);

		Box horizontalBox_3_1_3 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_3_1_3);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setPreferredSize(new Dimension(630, 195));
		horizontalBox_3_1_3.add(scrollPane_1);

		tblHoaDon = new JTable();
		tblHoaDon.setPreferredSize(new Dimension(630, 310));
		tblHoaDon.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null, null, null, null }, },
				new String[] { "STT", "M\u00E3 xe", "T\u00EAn xe", "H\u00E3ng", "M\u00E0u", "s\u1ED1 l\u01B0\u1EE3ng",
						"Gi\u00E1 b\u00E1n", "B\u1EA3o h\u00E0nh" }));
		tblHoaDon.getColumnModel().getColumn(0).setPreferredWidth(36);
		tblHoaDon.getColumnModel().getColumn(1).setPreferredWidth(67);
		tblHoaDon.getColumnModel().getColumn(2).setPreferredWidth(110);
		tblHoaDon.getColumnModel().getColumn(4).setPreferredWidth(90);
		tblHoaDon.getColumnModel().getColumn(5).setPreferredWidth(61);
		tblHoaDon.getColumnModel().getColumn(6).setPreferredWidth(85);
		tblHoaDon.getColumnModel().getColumn(7).setPreferredWidth(63);
		scrollPane_1.setViewportView(tblHoaDon);

		Component rigidArea_22 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3_1_3.add(rigidArea_22);

		Component rigidArea_17_4 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_1.add(rigidArea_17_4);

		Box horizontalBox_3_1_4 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_3_1_4);

		JPanel pnlThanhToan = new JPanel();
		pnlThanhToan.setBorder(
				new TitledBorder(null, "Thanh to\u00E1n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlThanhToan.setPreferredSize(new Dimension(500, 200));
		horizontalBox_3_1_4.add(pnlThanhToan);
		pnlThanhToan.setLayout(new BoxLayout(pnlThanhToan, BoxLayout.X_AXIS));

		Box verticalBox_3 = Box.createVerticalBox();
		pnlThanhToan.add(verticalBox_3);

		Box horizontalBox_6 = Box.createHorizontalBox();
		verticalBox_3.add(horizontalBox_6);

		JLabel lblTongTien_1 = new JLabel("Tổng tiền:");
		lblTongTien_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_6.add(lblTongTien_1);

		Component rigidArea_25 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_6.add(rigidArea_25);

		JLabel lblTongTien = new JLabel("1.500.000.000");
		lblTongTien.setForeground(Color.RED);
		lblTongTien.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_6.add(lblTongTien);

		JLabel lblVn = new JLabel("  VNĐ");
		lblVn.setForeground(Color.RED);
		lblVn.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_6.add(lblVn);

		Component rigidArea_30 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_3.add(rigidArea_30);

		Box horizontalBox_7 = Box.createHorizontalBox();
		verticalBox_3.add(horizontalBox_7);

		JLabel lblTienKhachTra = new JLabel("Khách trả:");
		lblTienKhachTra.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_7.add(lblTienKhachTra);

		Component rigidArea_25_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_7.add(rigidArea_25_1);

		txtTienKhachTra = new JTextField();
		txtTienKhachTra.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTienKhachTra.setMaximumSize(new Dimension(2147483647, 50));
		txtTienKhachTra.setPreferredSize(new Dimension(100, 50));
		txtTienKhachTra.setColumns(10);
		horizontalBox_7.add(txtTienKhachTra);

		Component rigidArea_31 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_3.add(rigidArea_31);

		Box horizontalBox_8 = Box.createHorizontalBox();
		verticalBox_3.add(horizontalBox_8);

		JLabel lblTienThoi = new JLabel("Tiền trả lại:");
		lblTienThoi.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_8.add(lblTienThoi);

		Component rigidArea_25_2 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_8.add(rigidArea_25_2);

		JLabel lblTongTien_2 = new JLabel("1.500.000");
		lblTongTien_2.setForeground(Color.RED);
		lblTongTien_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_8.add(lblTongTien_2);

		JLabel lblVn_1 = new JLabel("  VNĐ");
		lblVn_1.setForeground(Color.RED);
		lblVn_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		horizontalBox_8.add(lblVn_1);

		Component rigidArea_23 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_3_1_4.add(rigidArea_23);

		Box verticalBox_2 = Box.createVerticalBox();
		horizontalBox_3_1_4.add(verticalBox_2);

		Box horizontalBox_9 = Box.createHorizontalBox();
		verticalBox_2.add(horizontalBox_9);

		btnXoa = new JButton("Xóa");
		btnXoa.setBackground(new Color(255, 0, 0));
		btnXoa.setIcon(
				new ImageIcon(GD_TrangChu.class.getResource("/img/baseline_remove_shopping_cart_white_18dp.png")));
		btnXoa.setPreferredSize(new Dimension(110, 50));
		btnXoa.setMaximumSize(new Dimension(200, 50));
		btnXoa.setForeground(Color.WHITE);
		btnXoa.setFont(new Font("Tahoma", Font.BOLD, 18));
		horizontalBox_9.add(btnXoa);

		Component rigidArea_27 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_9.add(rigidArea_27);

		btnTaoMoi = new JButton("Tạo mới");
		btnTaoMoi.setBackground(new Color(30, 144, 255));
		btnTaoMoi.setMaximumSize(new Dimension(200, 50));
		btnTaoMoi.setPreferredSize(new Dimension(180, 50));
		btnTaoMoi.setForeground(Color.WHITE);
		btnTaoMoi.setFont(new Font("Tahoma", Font.BOLD, 18));
		horizontalBox_9.add(btnTaoMoi);

		Component rigidArea_28 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_9.add(rigidArea_28);

		Component rigidArea_29 = Box.createRigidArea(new Dimension(20, 20));
		rigidArea_29.setMaximumSize(new Dimension(40, 40));
		rigidArea_29.setPreferredSize(new Dimension(40, 40));
		verticalBox_2.add(rigidArea_29);

		Box horizontalBox_10 = Box.createHorizontalBox();
		verticalBox_2.add(horizontalBox_10);

		btnSua = new JButton("Sửa");
		btnSua.setBackground(new Color(30, 144, 255));
		btnSua.setIcon(new ImageIcon(GD_TrangChu.class.getResource("/img/baseline_edit_white_18dp.png")));
		btnSua.setPreferredSize(new Dimension(110, 50));
		btnSua.setMaximumSize(new Dimension(200, 50));
		btnSua.setForeground(Color.WHITE);
		btnSua.setFont(new Font("Tahoma", Font.BOLD, 18));
		horizontalBox_10.add(btnSua);

		Component rigidArea_27_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_10.add(rigidArea_27_1);

		btnThanhToan = new JButton("Thanh toán");
		btnThanhToan.setBackground(new Color(0, 128, 0));
		btnThanhToan
				.setIcon(new ImageIcon(GD_TrangChu.class.getResource("/img/baseline_monetization_on_white_18dp.png")));
		btnThanhToan.setMaximumSize(new Dimension(200, 50));
		btnThanhToan.setPreferredSize(new Dimension(180, 50));
		btnThanhToan.setForeground(Color.WHITE);
		btnThanhToan.setFont(new Font("Tahoma", Font.BOLD, 18));
		horizontalBox_10.add(btnThanhToan);

		Component rigidArea_28_1 = Box.createRigidArea(new Dimension(20, 20));
		horizontalBox_10.add(rigidArea_28_1);

		Component rigidArea_17_5 = Box.createRigidArea(new Dimension(20, 20));
		verticalBox_1.add(rigidArea_17_5);

		dangKiSuKien();
	}

	private void dangKiSuKien() {
		btnCuoi.addActionListener(this);
		btnDau.addActionListener(this);
		btnSau.addActionListener(this);
		btnSua.addActionListener(this);
		btnTaoMoi.addActionListener(this);
		btnThanhToan.addActionListener(this);
		btnThem.addActionListener(this);
		btnThemKH.addActionListener(this);
		btnTruoc.addActionListener(this);
		btnXemChiTiet.addActionListener(this);
		btnXoa.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o.equals(btnThanhToan)) {
			new GD_ChiTietHoaDon().setVisible(true);
		} else if (o.equals(btnXemChiTiet)) {
			new GD_ChiTietXeMay().setVisible(true);
		} else if (o.equals(btnThemKH)) {
			new GD_ThemKhachHang().setVisible(true);
		}
	}

}
