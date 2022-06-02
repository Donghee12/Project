package Test;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Desktop;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class TEST extends JFrame implements MouseListener, MouseMotionListener, ActionListener {

	static JPanel MainPane;
	private JPanel contentPane, TitlePane;
	private JButton Menu1, Menu2, Menu3, Menu4;
	private JButton CalenderButton, InfoButton, MailButton, BrowseButton;
	private JLabel ExitButton;
	private JPanel Pane0, Pane1, Pane2, Pane3;
	private JLabel AccountLabel, SearchLabel, MailLabel, CalenderLabel;
	private int tx, ty;
	private JLabel a1,b1,c1,d1,e1,f1,g1,h1;
	private JLabel Label;
	private JPanel panel1, panel2, panel3, panel4, panel5, panel6;
	private JLabel btn1, btn2, btn3, btn4, btn5, btn6;
	private JLabel a11, b11, c11, d11, e11, f11, g11, h11;
	private JLabel lbl1, lbl1_1, lbl2, lbl2_1, lbl3, lbl3_1, lbl4, lbl4_1, lbl5, lbl5_1, lbl6, lbl6_1;
	private JPanel mapPane, pan5, pan5_1;
	private JLabel lblNewLabel_1;
	private JLabel test1, test2, test3, test4, test5;
	private String TYPE;
	private JLabel cost1;
	private JLabel cost2;
	private JLabel map;
	private JTable table;
	private JScrollPane scrollPane;
	private String id;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try { 
					TEST frame = new TEST();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void Switch_screen(JPanel p) {
		MainPane.removeAll();
		MainPane.add(p);
		MainPane.repaint();
		MainPane.revalidate();
	}

	public TEST() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TEST.class.getResource("/Image/IconImg.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 574);
		setLocation(700,200);
		setResizable(false);
		setUndecorated(true);
		contentPane = new GraPanel();
		contentPane.setBackground(new Color(51, 102, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setVisible(true);
		
		MainPane = new JPanel();
		MainPane.setBackground(Color.WHITE);
		MainPane.setBounds(170, 29, 695, 545);
		contentPane.add(MainPane);
		MainPane.setLayout(null);
		
		Pane0 = new JPanel();
		Pane0.setBounds(0, 0, 694, 545);
		MainPane.add(Pane0);
		Pane0.setLayout(null);
		Pane0.setBackground(Color.WHITE);
		
		a1 = new JLabel("");
		a1.addMouseListener(this);
		a1.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1.png")));
		a1.setBounds(35, 24, 130, 170);
		Pane0.add(a1);
		
		b1 = new JLabel("");
		b1.addMouseListener(this);
		b1.setIcon(new ImageIcon(TEST.class.getResource("/Image/b1.png")));
		b1.setBounds(196, 24, 130, 170);
		Pane0.add(b1);
		
		c1 = new JLabel("");
		c1.addMouseListener(this);
		c1.setIcon(new ImageIcon(TEST.class.getResource("/Image/c1.png")));
		c1.setBounds(370, 24, 130, 170);
		Pane0.add(c1);
		
		d1 = new JLabel("");
		d1.addMouseListener(this);
		d1.setIcon(new ImageIcon(TEST.class.getResource("/Image/d1.png")));
		d1.setBounds(532, 24, 130, 170);
		Pane0.add(d1);
		
		e1 = new JLabel("");
		e1.addMouseListener(this);
		e1.setIcon(new ImageIcon(TEST.class.getResource("/Image/e1.png")));
		e1.setBounds(35, 305, 130, 170);
		Pane0.add(e1);
		
		f1 = new JLabel("");
		f1.addMouseListener(this);
		f1.setIcon(new ImageIcon(TEST.class.getResource("/Image/f1.png")));
		f1.setBounds(196, 305, 130, 170);
		Pane0.add(f1);
		
		g1 = new JLabel("");
		g1.addMouseListener(this);
		g1.setIcon(new ImageIcon(TEST.class.getResource("/Image/g1.png")));
		g1.setBounds(370, 305, 130, 170);
		Pane0.add(g1);
		
		h1 = new JLabel("");
		h1.addMouseListener(this);
		h1.setIcon(new ImageIcon(TEST.class.getResource("/Image/h1.png")));
		h1.setBounds(532, 305, 130, 170);
		Pane0.add(h1);
		
		Label = new JLabel("원하시는 병원 진료과를 선택해주세요.");
		Label.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		Label.setBounds(132, 251, 423, 44);
		Pane0.add(Label);
		
		Pane1 = new JPanel();
		Pane1.setLayout(null);
		Pane1.setBackground(Color.WHITE);
		Pane1.setBounds(0, 0, 694, 545);
		MainPane.add(Pane1);
		
		panel1 = new JPanel();
		panel1.setBackground(SystemColor.control);
		panel1.setBounds(60, 76, 560, 50);
		Pane1.add(panel1);
		panel1.setLayout(null);
		
		btn1 = new JLabel("");
		btn1.addMouseListener(this);
		btn1.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn3.png")));
		btn1.setBounds(342, 0, 217, 50);
		panel1.add(btn1);
		
		lbl1 = new JLabel("");
		lbl1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lbl1.setBounds(15, 10, 75, 30);
		panel1.add(lbl1);
		
		lbl1_1 = new JLabel("Home 에서 진료과를 선택하세요.");
		lbl1_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lbl1_1.setBounds(100, 0, 295, 50);
		panel1.add(lbl1_1);
		
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(SystemColor.menu);
		panel2.setBounds(60, 150, 560, 50);
		Pane1.add(panel2);
		
		btn2 = new JLabel("");
		btn2.addMouseListener(this);
		btn2.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn3.png")));
		btn2.setBounds(342, 0, 217, 50);
		panel2.add(btn2);
		
		lbl2 = new JLabel("");
		lbl2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lbl2.setBounds(15, 10, 75, 30);
		panel2.add(lbl2);
		
		lbl2_1 = new JLabel("");
		lbl2_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lbl2_1.setBounds(100, 0, 295, 50);
		panel2.add(lbl2_1);
		
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBackground(SystemColor.menu);
		panel3.setBounds(60, 225, 560, 50);
		Pane1.add(panel3);
		
		btn3 = new JLabel("");
		btn3.addMouseListener(this);
		btn3.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn3.png")));
		btn3.setBounds(342, 0, 217, 50);
		panel3.add(btn3);
		
		lbl3 = new JLabel("");
		lbl3.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lbl3.setBounds(15, 10, 75, 30);
		panel3.add(lbl3);
		
		lbl3_1 = new JLabel("");
		lbl3_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lbl3_1.setBounds(100, 0, 295, 50);
		panel3.add(lbl3_1);
		
		panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBackground(SystemColor.menu);
		panel4.setBounds(60, 298, 560, 50);
		Pane1.add(panel4);
		
		btn4 = new JLabel("");
		btn4.addMouseListener(this);
		btn4.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn3.png")));
		btn4.setBounds(342, 0, 217, 50);
		panel4.add(btn4);
		
		lbl4 = new JLabel("");
		lbl4.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lbl4.setBounds(15, 10, 75, 30);
		panel4.add(lbl4);
		
		lbl4_1 = new JLabel("");
		lbl4_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lbl4_1.setBounds(100, 0, 295, 50);
		panel4.add(lbl4_1);
		
		panel5 = new JPanel();
		panel5.setLayout(null);
		panel5.setBackground(SystemColor.menu);
		panel5.setBounds(60, 372, 560, 50);
		Pane1.add(panel5);
		
		btn5 = new JLabel("");
		btn5.addMouseListener(this);
		btn5.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn3.png")));
		btn5.setBounds(342, 0, 217, 50);
		panel5.add(btn5);
		
		lbl5 = new JLabel("");
		lbl5.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lbl5.setBounds(15, 10, 75, 30);
		panel5.add(lbl5);
		
		lbl5_1 = new JLabel("");
		lbl5_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lbl5_1.setBounds(100, 0, 295, 50);
		panel5.add(lbl5_1);
		
		panel6 = new JPanel();
		panel6.setLayout(null);
		panel6.setBackground(SystemColor.menu);
		panel6.setBounds(60, 447, 560, 50);
		Pane1.add(panel6);
		
		btn6 = new JLabel("");
		btn6.addMouseListener(this);
		btn6.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn3.png")));
		btn6.setBounds(342, 0, 217, 50);
		panel6.add(btn6);
		
		lbl6 = new JLabel("");
		lbl6.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lbl6.setBounds(15, 10, 75, 30);
		panel6.add(lbl6);
		
		lbl6_1 = new JLabel("");
		lbl6_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lbl6_1.setBounds(100, 0, 295, 50);
		panel6.add(lbl6_1);
		
		Pane2 = new JPanel();
		Pane2.setLayout(null);
		Pane2.setBackground(Color.WHITE);
		Pane2.setBounds(0, 0, 694, 545);
		MainPane.add(Pane2);
		
		JPanel pan1 = new JPanel();
		pan1.setBackground(SystemColor.control);
		pan1.setBounds(44, 33, 50, 50);
		Pane2.add(pan1);
		pan1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(TEST.class.getResource("/Image/Hos.png")));
		pan1.add(lblNewLabel_2);
		
		JPanel pan2 = new JPanel();
		pan2.setBackground(SystemColor.control);
		pan2.setBounds(379, 33, 50, 50);
		Pane2.add(pan2);
		pan2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(TEST.class.getResource("/Image/Hos.png")));
		pan2.add(lblNewLabel_2_1, BorderLayout.CENTER);
		
		JPanel pan3 = new JPanel();
		pan3.setBackground(SystemColor.control);
		pan3.setBounds(44, 136, 50, 50);
		Pane2.add(pan3);
		pan3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setBackground(SystemColor.control);
		lblNewLabel_2_2.setIcon(new ImageIcon(TEST.class.getResource("/Image/Pho.png")));
		pan3.add(lblNewLabel_2_2, BorderLayout.CENTER);
		
		JPanel pan4 = new JPanel();
		pan4.setBackground(SystemColor.control);
		pan4.setBounds(379, 136, 50, 50);
		Pane2.add(pan4);
		pan4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2_2_1 = new JLabel("");
		lblNewLabel_2_2_1.setIcon(new ImageIcon(TEST.class.getResource("/Image/Doc.png")));
		pan4.add(lblNewLabel_2_2_1, BorderLayout.CENTER);
		
		pan5 = new JPanel();
		pan5.setBackground(SystemColor.control);
		pan5.setBounds(44, 225, 50, 50);
		Pane2.add(pan5);
		pan5.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TEST.class.getResource("/Image/Loc.png")));
		pan5.add(lblNewLabel_1, BorderLayout.CENTER);
		
		
		JPanel pan6 = new GraPanel();
		pan6.setBounds(44, 285, 605, 250);
		Pane2.add(pan6);
		pan6.setLayout(null);
		
		mapPane = new JPanel();
		mapPane.setBounds(12, 10, 581, 230);
		pan6.add(mapPane);
		mapPane.setLayout(new BorderLayout(0, 0));
		
		map = new JLabel("MAP");
		map.addMouseListener(this);
		map.setHorizontalAlignment(SwingConstants.CENTER);
		mapPane.add(map, BorderLayout.CENTER);
		
		JPanel pan1_1 = new JPanel();
		pan1_1.setBounds(44, 33, 294, 50);
		Pane2.add(pan1_1);
		pan1_1.setLayout(null);
		
		test1 = new JLabel("");
		test1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		test1.setBounds(65, 0, 250, 50);
		pan1_1.add(test1);
		
		JPanel pan2_1 = new JPanel();
		pan2_1.setBounds(379, 33, 270, 50);
		Pane2.add(pan2_1);
		pan2_1.setLayout(null);
		
		test2 = new JLabel("");
		test2.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		test2.setBounds(60, 0, 230, 50);
		pan2_1.add(test2);
		
		JPanel pan3_1 = new JPanel();
		pan3_1.setBounds(44, 136, 294, 50);
		Pane2.add(pan3_1);
		pan3_1.setLayout(null);
		
		test3 = new JLabel("");
		test3.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		test3.setBounds(65, 0, 250, 50);
		pan3_1.add(test3);
		
		JPanel pan4_1 = new JPanel();
		pan4_1.setBounds(379, 136, 270, 50);
		Pane2.add(pan4_1);
		pan4_1.setLayout(null);
		
		test4 = new JLabel("");
		test4.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		test4.setBounds(60, 0, 230, 50);
		pan4_1.add(test4);
		
		pan5_1 = new JPanel();
		pan5_1.setBounds(44, 225, 605, 50);
		Pane2.add(pan5_1);
		pan5_1.setLayout(null);
		
		test5 = new JLabel("");
		test5.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		test5.setBounds(65, 0, 527, 50);
		pan5_1.add(test5);
		
		Pane3 = new JPanel();
		Pane3.setLayout(null);
		Pane3.setBackground(Color.WHITE);
		Pane3.setBounds(0, 0, 694, 545);
		MainPane.add(Pane3);
		cost1 = new JLabel("< 병원비 조회 >");
		cost1.setHorizontalAlignment(SwingConstants.CENTER);
		cost1.setFont(new Font("맑은 고딕", Font.BOLD, 26));
		cost1.setBounds(12, 10, 670, 47);
		Pane3.add(cost1);
		
		cost2 = new JLabel("병원비 조회");
		cost2.setForeground(SystemColor.textHighlight);
		cost2.setHorizontalAlignment(SwingConstants.CENTER);
		cost2.setFont(new Font("맑은 고딕", Font.BOLD, 26));
		cost2.setBounds(12, 58, 670, 47);
		Pane3.add(cost2);
		
		JPanel panel = new GraPanel();
		panel.setBounds(12, 129, 670, 342);
		Pane3.add(panel);
		panel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 646, 322);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setBackground(SystemColor.control);
		table.setEnabled(false);
		table.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		scrollPane.setViewportView(table);
		JPanel SideMenuPane = new GraPanel();
		SideMenuPane.setBounds(0, 0, 170, 574);
		contentPane.add(SideMenuPane);
		SideMenuPane.setBackground(new Color(135, 206, 250));
		SideMenuPane.setLayout(null);
		
		InfoButton = new JButton("                     ");
		InfoButton.addActionListener(this);
		InfoButton.setBackground(new Color(135, 206, 250));
		InfoButton.setIcon(new ImageIcon(TEST.class.getResource("/Image/info.png")));
		InfoButton.setBounds(0, 110, 170, 40);
		InfoButton.setBorderPainted(false);
		InfoButton.setContentAreaFilled(false);
		InfoButton.setFocusPainted(false);
		SideMenuPane.add(InfoButton);
		
		
		MailButton = new JButton("                     ");
		MailButton.addActionListener(this);
		MailButton.setBackground(new Color(135, 206, 250));
		MailButton.setIcon(new ImageIcon(TEST.class.getResource("/Image/gmail.png")));
		MailButton.setBounds(0, 190, 170, 39);
		MailButton.setBorderPainted(false);
		MailButton.setFocusPainted(false);
		MailButton.setContentAreaFilled(false);
		SideMenuPane.add(MailButton);
		
		BrowseButton = new JButton("                     ");
		BrowseButton.addActionListener(this);
		BrowseButton.setBackground(new Color(135, 206, 250));
		BrowseButton.setIcon(new ImageIcon(TEST.class.getResource("/Image/internet.png")));
		BrowseButton.setBounds(0, 150, 170, 40);
		BrowseButton.setFocusPainted(false);
		BrowseButton.setBorderPainted(false);
		BrowseButton.setContentAreaFilled(false);
		SideMenuPane.add(BrowseButton);
		
		CalenderButton = new JButton("                     ");
		CalenderButton.addActionListener(this);
		CalenderButton.setBackground(new Color(135, 206, 250));
		CalenderButton.setIcon(new ImageIcon(TEST.class.getResource("/Image/calender.png")));
		CalenderButton.setBounds(0, 230, 170, 39);
		CalenderButton.setBorderPainted(false);
		CalenderButton.setContentAreaFilled(false);
		CalenderButton.setFocusPainted(false);
		SideMenuPane.add(CalenderButton);
		
		AccountLabel = new JLabel("ACCOUNT");
		AccountLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		AccountLabel.setForeground(Color.WHITE);
		AccountLabel.setBounds(75, 110, 90, 40);
		SideMenuPane.add(AccountLabel);
		
		SearchLabel = new JLabel("SEARCH");
		SearchLabel.setForeground(Color.WHITE);
		SearchLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		SearchLabel.setBounds(75, 150, 90, 40);
		SideMenuPane.add(SearchLabel);
		
		MailLabel = new JLabel("MAIL");
		MailLabel.setForeground(Color.WHITE);
		MailLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		MailLabel.setBounds(75, 190, 90, 40);
		SideMenuPane.add(MailLabel);
		
		CalenderLabel = new JLabel("CALENDER");
		CalenderLabel.setForeground(Color.WHITE);
		CalenderLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		CalenderLabel.setBounds(75, 230, 90, 40);
		SideMenuPane.add(CalenderLabel);
		
		Menu1 = new JButton();
		Menu1.setHorizontalAlignment(SwingConstants.RIGHT);
		Menu1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		Menu1.setText("HOME");
		Menu1.setForeground(Color.BLACK);
		Menu1.setBounds(15, 315, 156, 40);
		SideMenuPane.add(Menu1);
		Menu1.setBackground(Color.WHITE);
		Menu1.setBorderPainted(false);
		Menu1.setLayout(null);
		
		Menu2 = new JButton();
		Menu2.setForeground(Color.WHITE);
		Menu2.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		Menu2.setHorizontalAlignment(SwingConstants.RIGHT);
		Menu2.setText("병원 리스트");
		Menu2.setBounds(35, 375, 135, 40);
		SideMenuPane.add(Menu2);
		Menu2.setBackground(new Color(0,0,0,0));
		Menu2.setBorderPainted(false);
		Menu2.setContentAreaFilled(false);
		Menu2.setFocusPainted(false);
		Menu2.setLayout(null);
		
		Menu3 = new JButton();
		Menu3.setText("병원 정보");
		Menu3.setForeground(Color.WHITE);
		Menu3.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		Menu3.setHorizontalAlignment(SwingConstants.RIGHT);
		Menu3.setBounds(35, 420, 135, 40);
		SideMenuPane.add(Menu3);
		Menu3.setBackground(new Color(0,0,0,0));
		Menu3.setBorderPainted(false);
		Menu3.setContentAreaFilled(false);
		Menu3.setFocusPainted(false);
		Menu3.setLayout(null);
		
		Menu4 = new JButton();
		Menu4.setForeground(Color.WHITE);
		Menu4.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		Menu4.setHorizontalAlignment(SwingConstants.RIGHT);
		Menu4.setText("병원비 조회");
		Menu4.setBounds(35, 465, 135, 40);
		SideMenuPane.add(Menu4);
		Menu4.setBackground(new Color(0,0,0,0));
		Menu4.setBorderPainted(false);
		Menu4.setContentAreaFilled(false);
		Menu4.setFocusPainted(false);
		Menu4.setLayout(null);
		
		JLabel Logo = new JLabel("");
		Logo.setHorizontalAlignment(SwingConstants.CENTER);
		Logo.setIcon(new ImageIcon(TEST.class.getResource("/Image/Logo_B.png")));
		Logo.setBounds(0, 10, 170, 101);
		SideMenuPane.add(Logo);
		Menu4.addMouseListener(this);
		Menu3.addMouseListener(this);
		Menu2.addMouseListener(this);
		Menu1.addMouseListener(this);
		
		TitlePane = new JPanel();
		TitlePane.addMouseListener(this);
		TitlePane.addMouseMotionListener(this);
		TitlePane.setLayout(null);
		TitlePane.setBackground(new Color(0, 0, 0, 0));
		TitlePane.setBounds(0, 0, 865, 28);
		contentPane.add(TitlePane);
		
		ExitButton = new JLabel("");
		ExitButton.setHorizontalAlignment(SwingConstants.CENTER);
		ExitButton.setBounds(830, 0, 30, 30);
		TitlePane.add(ExitButton);
		ExitButton.addMouseListener(this);
		ExitButton.setIcon(new ImageIcon(TEST.class.getResource("/Image/close.png")));
		ExitButton.setBackground(new Color(0,0,0,0));
		
		Switch_screen(Pane0);
		
		a11 = new JLabel("");
		a11.addMouseListener(this);
		a11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
		a11.setBounds(35, 193, 130, 36);
		Pane0.add(a11);
		
		b11 = new JLabel("");
		b11.addMouseListener(this);
		b11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
		b11.setBounds(196, 193, 130, 36);
		Pane0.add(b11);
		
		c11 = new JLabel("");
		c11.addMouseListener(this);
		c11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
		c11.setBounds(370, 193, 130, 36);
		Pane0.add(c11);
		
		d11 = new JLabel("");
		d11.addMouseListener(this);
		d11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
		d11.setBounds(532, 193, 130, 36);
		Pane0.add(d11);
		
		e11 = new JLabel("");
		e11.addMouseListener(this);
		e11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
		e11.setBounds(35, 475, 130, 36);
		Pane0.add(e11);
		
		f11 = new JLabel("");
		f11.addMouseListener(this);
		f11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
		f11.setBounds(196, 475, 130, 36);
		Pane0.add(f11);
		
		g11 = new JLabel("");
		g11.addMouseListener(this);
		g11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
		g11.setBounds(370, 475, 130, 36);
		Pane0.add(g11);
		
		h11 = new JLabel("");
		h11.addMouseListener(this);
		h11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
		h11.setBounds(532, 475, 130, 36);
		Pane0.add(h11);
		
		
	
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		tx = e.getX();
		ty = e.getY();
		Object obj = e.getSource();
		if(obj == Menu1) {
			Menu1.setBackground(Color.WHITE);
			Menu1.setContentAreaFilled(true);
			Menu1.setForeground(Color.BLACK);
			Menu2.setForeground(Color.WHITE);
			Menu2.setBorderPainted(false);
			Menu2.setContentAreaFilled(false);
			Menu2.setFocusPainted(false);
			Menu3.setBorderPainted(false);
			Menu3.setContentAreaFilled(false);
			Menu3.setFocusPainted(false);
			Menu3.setForeground(Color.WHITE);
			Menu4.setForeground(Color.WHITE);
			Menu4.setBorderPainted(false);
			Menu4.setContentAreaFilled(false);
			Menu4.setFocusPainted(false);
			Switch_screen(Pane0);
		}else if(obj == Menu2) {
			Menu2.setBackground(Color.WHITE);
			Menu2.setContentAreaFilled(true);
			Menu2.setForeground(Color.BLACK);
			Menu4.setFocusPainted(false);
			Menu1.setForeground(Color.WHITE);
			Menu1.setBorderPainted(false);
			Menu1.setContentAreaFilled(false);
			Menu1.setFocusPainted(false);
			Menu3.setForeground(Color.WHITE);
			Menu3.setBorderPainted(false);
			Menu3.setContentAreaFilled(false);
			Menu3.setFocusPainted(false);
			Menu4.setForeground(Color.WHITE);
			Menu4.setBorderPainted(false);
			Menu4.setContentAreaFilled(false);
			Switch_screen(Pane1);
		}else if(obj == Menu3) {
			Menu3.setBackground(Color.WHITE);
			Menu3.setContentAreaFilled(true);
			Menu3.setForeground(Color.BLACK);
			Menu1.setForeground(Color.WHITE);
			Menu1.setBorderPainted(false);
			Menu1.setContentAreaFilled(false);
			Menu1.setFocusPainted(false);
			Menu2.setForeground(Color.WHITE);
			Menu2.setBorderPainted(false);
			Menu2.setContentAreaFilled(false);
			Menu2.setFocusPainted(false);
			Menu4.setForeground(Color.WHITE);
			Menu4.setBorderPainted(false);
			Menu4.setContentAreaFilled(false);
			Menu4.setFocusPainted(false);
			Switch_screen(Pane2);
		}else if(obj == Menu4) {
			Menu4.setBackground(Color.WHITE);
			Menu4.setContentAreaFilled(true);
			Menu4.setForeground(Color.BLACK);
			Menu1.setForeground(Color.WHITE);
			Menu1.setBorderPainted(false);
			Menu1.setContentAreaFilled(false);
			Menu1.setFocusPainted(false);
			Menu2.setForeground(Color.WHITE);
			Menu2.setBorderPainted(false);
			Menu2.setContentAreaFilled(false);
			Menu2.setFocusPainted(false);
			Menu3.setForeground(Color.WHITE);
			Menu3.setBorderPainted(false);
			Menu3.setContentAreaFilled(false);
			Menu3.setFocusPainted(false);
			Switch_screen(Pane3);
		}else if(obj == ExitButton) {
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				String sql ="DELETE from myinfo";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.executeUpdate();
			} catch (Exception e2) {
				
			}
			if(JOptionPane.showConfirmDialog(null, "정말 종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION) == 0) {
				System.exit(0);
			}
		}
		if(obj == a1) {
			TYPE = "brain";
			Switch_screen(Pane1);
			Menu2.setBackground(Color.WHITE);
			Menu2.setContentAreaFilled(true);
			Menu2.setForeground(Color.BLACK);
			Menu1.setForeground(Color.WHITE);
			Menu1.setBorderPainted(false);
			Menu1.setContentAreaFilled(false);
			Menu1.setFocusPainted(false);
			a1.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1.png")));
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state1 = conn.createStatement();
				Statement state2 = conn.createStatement();
				Statement state3 = conn.createStatement();
				Statement state4 = conn.createStatement();
				Statement state5 = conn.createStatement();
				Statement state6 = conn.createStatement();
				ResultSet rs1 = state1.executeQuery("select * from brain where id = '1'");
				ResultSet rs2 = state2.executeQuery("select * from brain where id = '2'");
				ResultSet rs3 = state3.executeQuery("select * from brain where id = '3'");
				ResultSet rs4 = state4.executeQuery("select * from brain where id = '4'");
				ResultSet rs5 = state5.executeQuery("select * from brain where id = '5'");
				ResultSet rs6 = state6.executeQuery("select * from brain where id = '6'");
					while(rs1.next()) {
						lbl1.setText(rs1.getString("type"));
						lbl1_1.setText(rs1.getString("name"));
					}while(rs2.next()) {
						lbl2.setText(rs2.getString("type"));
						lbl2_1.setText(rs2.getString("name"));
					}while(rs3.next()) {
						lbl3.setText(rs3.getString("type"));
						lbl3_1.setText(rs3.getString("name"));
					}while(rs4.next()) {
						lbl4.setText(rs4.getString("type"));
						lbl4_1.setText(rs4.getString("name"));
					}while(rs5.next()) {
						lbl5.setText(rs5.getString("type"));
						lbl5_1.setText(rs5.getString("name"));
					}while(rs6.next()) {
						lbl6.setText(rs6.getString("type"));
						lbl6_1.setText(rs6.getString("name"));
					}
					conn.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else if(obj == b1) {
			TYPE = "eye";
			Switch_screen(Pane1);
			Menu2.setBackground(Color.WHITE);
			Menu2.setContentAreaFilled(true);
			Menu2.setForeground(Color.BLACK);
			Menu1.setForeground(Color.WHITE);
			Menu1.setBorderPainted(false);
			Menu1.setContentAreaFilled(false);
			Menu1.setFocusPainted(false);
			b1.setIcon(new ImageIcon(TEST.class.getResource("/Image/b1.png")));
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state1 = conn.createStatement();
				Statement state2 = conn.createStatement();
				Statement state3 = conn.createStatement();
				Statement state4 = conn.createStatement();
				Statement state5 = conn.createStatement();
				Statement state6 = conn.createStatement();
				ResultSet rs1 = state1.executeQuery("select * from eye where id = '1'");
				ResultSet rs2 = state2.executeQuery("select * from eye where id = '2'");
				ResultSet rs3 = state3.executeQuery("select * from eye where id = '3'");
				ResultSet rs4 = state4.executeQuery("select * from eye where id = '4'");
				ResultSet rs5 = state5.executeQuery("select * from eye where id = '5'");
				ResultSet rs6 = state6.executeQuery("select * from eye where id = '6'");
					while(rs1.next()) {
						lbl1.setText(rs1.getString("type"));
						lbl1_1.setText(rs1.getString("name"));
					}while(rs2.next()) {
						lbl2.setText(rs2.getString("type"));
						lbl2_1.setText(rs2.getString("name"));
					}while(rs3.next()) {
						lbl3.setText(rs3.getString("type"));
						lbl3_1.setText(rs3.getString("name"));
					}while(rs4.next()) {
						lbl4.setText(rs4.getString("type"));
						lbl4_1.setText(rs4.getString("name"));
					}while(rs5.next()) {
						lbl5.setText(rs5.getString("type"));
						lbl5_1.setText(rs5.getString("name"));
					}while(rs6.next()) {
						lbl6.setText(rs6.getString("type"));
						lbl6_1.setText(rs6.getString("name"));
					}
					conn.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else if(obj == c1) {
			TYPE = "oriental";
			Switch_screen(Pane1);
			Menu2.setBackground(Color.WHITE);
			Menu2.setContentAreaFilled(true);
			Menu2.setForeground(Color.BLACK);
			Menu1.setForeground(Color.WHITE);
			Menu1.setBorderPainted(false);
			Menu1.setContentAreaFilled(false);
			Menu1.setFocusPainted(false);
			c1.setIcon(new ImageIcon(TEST.class.getResource("/Image/c1.png")));
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state1 = conn.createStatement();
				Statement state2 = conn.createStatement();
				Statement state3 = conn.createStatement();
				Statement state4 = conn.createStatement();
				Statement state5 = conn.createStatement();
				Statement state6 = conn.createStatement();
				ResultSet rs1 = state1.executeQuery("select * from oriental where id = '1'");
				ResultSet rs2 = state2.executeQuery("select * from oriental where id = '2'");
				ResultSet rs3 = state3.executeQuery("select * from oriental where id = '3'");
				ResultSet rs4 = state4.executeQuery("select * from oriental where id = '4'");
				ResultSet rs5 = state5.executeQuery("select * from oriental where id = '5'");
				ResultSet rs6 = state6.executeQuery("select * from oriental where id = '6'");
					while(rs1.next()) {
						lbl1.setText(rs1.getString("type"));
						lbl1_1.setText(rs1.getString("name"));
					}while(rs2.next()) {
						lbl2.setText(rs2.getString("type"));
						lbl2_1.setText(rs2.getString("name"));
					}while(rs3.next()) {
						lbl3.setText(rs3.getString("type"));
						lbl3_1.setText(rs3.getString("name"));
					}while(rs4.next()) {
						lbl4.setText(rs4.getString("type"));
						lbl4_1.setText(rs4.getString("name"));
					}while(rs5.next()) {
						lbl5.setText(rs5.getString("type"));
						lbl5_1.setText(rs5.getString("name"));
					}while(rs6.next()) {
						lbl6.setText(rs6.getString("type"));
						lbl6_1.setText(rs6.getString("name"));
					}
					conn.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else if(obj == d1) {
			TYPE = "skin";
			Switch_screen(Pane1);
			Menu2.setBackground(Color.WHITE);
			Menu2.setContentAreaFilled(true);
			Menu2.setForeground(Color.BLACK);
			Menu1.setForeground(Color.WHITE);
			Menu1.setBorderPainted(false);
			Menu1.setContentAreaFilled(false);
			Menu1.setFocusPainted(false);
			d1.setIcon(new ImageIcon(TEST.class.getResource("/Image/d1.png")));
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state1 = conn.createStatement();
				Statement state2 = conn.createStatement();
				Statement state3 = conn.createStatement();
				Statement state4 = conn.createStatement();
				Statement state5 = conn.createStatement();
				Statement state6 = conn.createStatement();
				ResultSet rs1 = state1.executeQuery("select * from skin where id = '1'");
				ResultSet rs2 = state2.executeQuery("select * from skin where id = '2'");
				ResultSet rs3 = state3.executeQuery("select * from skin where id = '3'");
				ResultSet rs4 = state4.executeQuery("select * from skin where id = '4'");
				ResultSet rs5 = state5.executeQuery("select * from skin where id = '5'");
				ResultSet rs6 = state6.executeQuery("select * from skin where id = '6'");
					while(rs1.next()) {
						lbl1.setText(rs1.getString("type"));
						lbl1_1.setText(rs1.getString("name"));
					}while(rs2.next()) {
						lbl2.setText(rs2.getString("type"));
						lbl2_1.setText(rs2.getString("name"));
					}while(rs3.next()) {
						lbl3.setText(rs3.getString("type"));
						lbl3_1.setText(rs3.getString("name"));
					}while(rs4.next()) {
						lbl4.setText(rs4.getString("type"));
						lbl4_1.setText(rs4.getString("name"));
					}while(rs5.next()) {
						lbl5.setText(rs5.getString("type"));
						lbl5_1.setText(rs5.getString("name"));
					}while(rs6.next()) {
						lbl6.setText(rs6.getString("type"));
						lbl6_1.setText(rs6.getString("name"));
					}
					conn.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else if(obj == e1) {
			TYPE = "dentist";
			Switch_screen(Pane1);
			Menu2.setBackground(Color.WHITE);
			Menu2.setContentAreaFilled(true);
			Menu2.setForeground(Color.BLACK);
			Menu1.setForeground(Color.WHITE);
			Menu1.setBorderPainted(false);
			Menu1.setContentAreaFilled(false);
			Menu1.setFocusPainted(false);
			e1.setIcon(new ImageIcon(TEST.class.getResource("/Image/e1.png")));
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state1 = conn.createStatement();
				Statement state2 = conn.createStatement();
				Statement state3 = conn.createStatement();
				Statement state4 = conn.createStatement();
				Statement state5 = conn.createStatement();
				Statement state6 = conn.createStatement();
				ResultSet rs1 = state1.executeQuery("select * from dentist where id = '1'");
				ResultSet rs2 = state2.executeQuery("select * from dentist where id = '2'");
				ResultSet rs3 = state3.executeQuery("select * from dentist where id = '3'");
				ResultSet rs4 = state4.executeQuery("select * from dentist where id = '4'");
				ResultSet rs5 = state5.executeQuery("select * from dentist where id = '5'");
				ResultSet rs6 = state6.executeQuery("select * from dentist where id = '6'");
					while(rs1.next()) {
						lbl1.setText(rs1.getString("type"));
						lbl1_1.setText(rs1.getString("name"));
					}while(rs2.next()) {
						lbl2.setText(rs2.getString("type"));
						lbl2_1.setText(rs2.getString("name"));
					}while(rs3.next()) {
						lbl3.setText(rs3.getString("type"));
						lbl3_1.setText(rs3.getString("name"));
					}while(rs4.next()) {
						lbl4.setText(rs4.getString("type"));
						lbl4_1.setText(rs4.getString("name"));
					}while(rs5.next()) {
						lbl5.setText(rs5.getString("type"));
						lbl5_1.setText(rs5.getString("name"));
					}while(rs6.next()) {
						lbl6.setText(rs6.getString("type"));
						lbl6_1.setText(rs6.getString("name"));
					}
					conn.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else if(obj == f1) {
			TYPE = "stom";
			Switch_screen(Pane1);
			Menu2.setBackground(Color.WHITE);
			Menu2.setContentAreaFilled(true);
			Menu2.setForeground(Color.BLACK);
			Menu1.setForeground(Color.WHITE);
			Menu1.setBorderPainted(false);
			Menu1.setContentAreaFilled(false);
			Menu1.setFocusPainted(false);
			f1.setIcon(new ImageIcon(TEST.class.getResource("/Image/f1.png")));
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state1 = conn.createStatement();
				Statement state2 = conn.createStatement();
				Statement state3 = conn.createStatement();
				Statement state4 = conn.createStatement();
				Statement state5 = conn.createStatement();
				Statement state6 = conn.createStatement();
				ResultSet rs1 = state1.executeQuery("select * from stom where id = '1'");
				ResultSet rs2 = state2.executeQuery("select * from stom where id = '2'");
				ResultSet rs3 = state3.executeQuery("select * from stom where id = '3'");
				ResultSet rs4 = state4.executeQuery("select * from stom where id = '4'");
				ResultSet rs5 = state5.executeQuery("select * from stom where id = '5'");
				ResultSet rs6 = state6.executeQuery("select * from stom where id = '6'");
					while(rs1.next()) {
						lbl1.setText(rs1.getString("type"));
						lbl1_1.setText(rs1.getString("name"));
					}while(rs2.next()) {
						lbl2.setText(rs2.getString("type"));
						lbl2_1.setText(rs2.getString("name"));
					}while(rs3.next()) {
						lbl3.setText(rs3.getString("type"));
						lbl3_1.setText(rs3.getString("name"));
					}while(rs4.next()) {
						lbl4.setText(rs4.getString("type"));
						lbl4_1.setText(rs4.getString("name"));
					}while(rs5.next()) {
						lbl5.setText(rs5.getString("type"));
						lbl5_1.setText(rs5.getString("name"));
					}while(rs6.next()) {
						lbl6.setText(rs6.getString("type"));
						lbl6_1.setText(rs6.getString("name"));
					}
					conn.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else if(obj == g1) {
			TYPE = "bone";
			Switch_screen(Pane1);
			Menu2.setBackground(Color.WHITE);
			Menu2.setContentAreaFilled(true);
			Menu2.setForeground(Color.BLACK);
			Menu1.setForeground(Color.WHITE);
			Menu1.setBorderPainted(false);
			Menu1.setContentAreaFilled(false);
			Menu1.setFocusPainted(false);
			g1.setIcon(new ImageIcon(TEST.class.getResource("/Image/g1.png")));
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state1 = conn.createStatement();
				Statement state2 = conn.createStatement();
				Statement state3 = conn.createStatement();
				Statement state4 = conn.createStatement();
				Statement state5 = conn.createStatement();
				Statement state6 = conn.createStatement();
				ResultSet rs1 = state1.executeQuery("select * from bone where id = '1'");
				ResultSet rs2 = state2.executeQuery("select * from bone where id = '2'");
				ResultSet rs3 = state3.executeQuery("select * from bone where id = '3'");
				ResultSet rs4 = state4.executeQuery("select * from bone where id = '4'");
				ResultSet rs5 = state5.executeQuery("select * from bone where id = '5'");
				ResultSet rs6 = state6.executeQuery("select * from bone where id = '6'");
					while(rs1.next()) {
						lbl1.setText(rs1.getString("type"));
						lbl1_1.setText(rs1.getString("name"));
					}while(rs2.next()) {
						lbl2.setText(rs2.getString("type"));
						lbl2_1.setText(rs2.getString("name"));
					}while(rs3.next()) {
						lbl3.setText(rs3.getString("type"));
						lbl3_1.setText(rs3.getString("name"));
					}while(rs4.next()) {
						lbl4.setText(rs4.getString("type"));
						lbl4_1.setText(rs4.getString("name"));
					}while(rs5.next()) {
						lbl5.setText(rs5.getString("type"));
						lbl5_1.setText(rs5.getString("name"));
					}while(rs6.next()) {
						lbl6.setText(rs6.getString("type"));
						lbl6_1.setText(rs6.getString("name"));
					}
					conn.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else if(obj == h1) {
			TYPE = "nose";
			Switch_screen(Pane1);
			Menu2.setBackground(Color.WHITE);
			Menu2.setContentAreaFilled(true);
			Menu2.setForeground(Color.BLACK);
			Menu1.setForeground(Color.WHITE);
			Menu1.setBorderPainted(false);
			Menu1.setContentAreaFilled(false);
			Menu1.setFocusPainted(false);
			h1.setIcon(new ImageIcon(TEST.class.getResource("/Image/h1.png")));
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state1 = conn.createStatement();
				Statement state2 = conn.createStatement();
				Statement state3 = conn.createStatement();
				Statement state4 = conn.createStatement();
				Statement state5 = conn.createStatement();
				Statement state6 = conn.createStatement();
				ResultSet rs1 = state1.executeQuery("select * from nose where id = '1'");
				ResultSet rs2 = state2.executeQuery("select * from nose where id = '2'");
				ResultSet rs3 = state3.executeQuery("select * from nose where id = '3'");
				ResultSet rs4 = state4.executeQuery("select * from nose where id = '4'");
				ResultSet rs5 = state5.executeQuery("select * from nose where id = '5'");
				ResultSet rs6 = state6.executeQuery("select * from nose where id = '6'");
					while(rs1.next()) {
						lbl1.setText(rs1.getString("type"));
						lbl1_1.setText(rs1.getString("name"));
					}while(rs2.next()) {
						lbl2.setText(rs2.getString("type"));
						lbl2_1.setText(rs2.getString("name"));
					}while(rs3.next()) {
						lbl3.setText(rs3.getString("type"));
						lbl3_1.setText(rs3.getString("name"));
					}while(rs4.next()) {
						lbl4.setText(rs4.getString("type"));
						lbl4_1.setText(rs4.getString("name"));
					}while(rs5.next()) {
						lbl5.setText(rs5.getString("type"));
						lbl5_1.setText(rs5.getString("name"));
					}while(rs6.next()) {
						lbl6.setText(rs6.getString("type"));
						lbl6_1.setText(rs6.getString("name"));
					}
					conn.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
		if(obj == btn1) {
			Switch_screen(Pane2);
			id = "1";
			btn1.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn3.png")));
			Menu3.setBackground(Color.WHITE);
			Menu3.setContentAreaFilled(true);
			Menu3.setForeground(Color.BLACK);
			Menu2.setForeground(Color.WHITE);
			Menu2.setBorderPainted(false);
			Menu2.setContentAreaFilled(false);
			Menu2.setFocusPainted(false);
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state1 = conn.createStatement();
				ResultSet rs1 = state1.executeQuery("select * from "+ TYPE +" where id = '1'");
					while(rs1.next()) {
						test1.setText(rs1.getString("name"));
						test2.setText(rs1.getString("type"));
						test3.setText(rs1.getString("callnum"));
						test4.setText(rs1.getString("specialty"));
						test5.setText(rs1.getString("address"));
						String test = rs1.getString("map");
						map.setIcon(new ImageIcon(TEST.class.getResource(test)));
					}conn.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else if(obj == btn2) {
			Switch_screen(Pane2);
			id = "2";
			Menu3.setBackground(Color.WHITE);
			Menu3.setContentAreaFilled(true);
			Menu3.setForeground(Color.BLACK);
			Menu2.setForeground(Color.WHITE);
			Menu2.setBorderPainted(false);
			Menu2.setContentAreaFilled(false);
			Menu2.setFocusPainted(false);
			btn2.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn3.png")));
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state1 = conn.createStatement();
				ResultSet rs1 = state1.executeQuery("select * from "+ TYPE +" where id = '2'");
					while(rs1.next()) {
						test1.setText(rs1.getString("name"));
						test2.setText(rs1.getString("type"));
						test3.setText(rs1.getString("callnum"));
						test4.setText(rs1.getString("specialty"));
						test5.setText(rs1.getString("address"));
						String test = rs1.getString("map");
						map.setIcon(new ImageIcon(TEST.class.getResource(test)));
					}conn.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else if(obj == btn3) {
			Switch_screen(Pane2);
			id = "3";
			btn3.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn3.png")));
			Menu3.setBackground(Color.WHITE);
			Menu3.setContentAreaFilled(true);
			Menu3.setForeground(Color.BLACK);
			Menu2.setForeground(Color.WHITE);
			Menu2.setBorderPainted(false);
			Menu2.setContentAreaFilled(false);
			Menu2.setFocusPainted(false);
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state1 = conn.createStatement();
				ResultSet rs1 = state1.executeQuery("select * from "+ TYPE +" where id = '3'");
					while(rs1.next()) {
						test1.setText(rs1.getString("name"));
						test2.setText(rs1.getString("type"));
						test3.setText(rs1.getString("callnum"));
						test4.setText(rs1.getString("specialty"));
						test5.setText(rs1.getString("address"));
						String url = rs1.getString("map");
						map.setIcon(new ImageIcon(TEST.class.getResource(url)));
					}conn.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else if(obj == btn4) {
			Switch_screen(Pane2);
			id = "4";
			btn4.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn3.png")));
			Menu3.setBackground(Color.WHITE);
			Menu3.setContentAreaFilled(true);
			Menu3.setForeground(Color.BLACK);
			Menu2.setForeground(Color.WHITE);
			Menu2.setBorderPainted(false);
			Menu2.setContentAreaFilled(false);
			Menu2.setFocusPainted(false);
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state1 = conn.createStatement();
				ResultSet rs1 = state1.executeQuery("select * from "+ TYPE +" where id = '4'");
					while(rs1.next()) {
						test1.setText(rs1.getString("name"));
						test2.setText(rs1.getString("type"));
						test3.setText(rs1.getString("callnum"));
						test4.setText(rs1.getString("specialty"));
						test5.setText(rs1.getString("address"));
						String url = rs1.getString("map");
						map.setIcon(new ImageIcon(TEST.class.getResource(url)));
					}conn.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else if(obj == btn5) {
			Switch_screen(Pane2);
			id = "5";
			btn5.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn3.png")));
			Menu3.setBackground(Color.WHITE);
			Menu3.setContentAreaFilled(true);
			Menu3.setForeground(Color.BLACK);
			Menu2.setForeground(Color.WHITE);
			Menu2.setBorderPainted(false);
			Menu2.setContentAreaFilled(false);
			Menu2.setFocusPainted(false);
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state1 = conn.createStatement();
				ResultSet rs1 = state1.executeQuery("select * from "+ TYPE +" where id = '5'");
					while(rs1.next()) {
						test1.setText(rs1.getString("name"));
						test2.setText(rs1.getString("type"));
						test3.setText(rs1.getString("callnum"));
						test4.setText(rs1.getString("specialty"));
						test5.setText(rs1.getString("address"));
						String url = rs1.getString("map");
						map.setIcon(new ImageIcon(TEST.class.getResource(url)));
					}conn.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else if(obj == btn6) {
			Switch_screen(Pane2);
			id = "6";
			btn6.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn3.png")));
			Menu3.setBackground(Color.WHITE);
			Menu3.setContentAreaFilled(true);
			Menu3.setForeground(Color.BLACK);
			Menu2.setForeground(Color.WHITE);
			Menu2.setBorderPainted(false);
			Menu2.setContentAreaFilled(false);
			Menu2.setFocusPainted(false);
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state1 = conn.createStatement();
				ResultSet rs1 = state1.executeQuery("select * from "+ TYPE +" where id = '6'");
					while(rs1.next()) {
						test1.setText(rs1.getString("name"));
						test2.setText(rs1.getString("type"));
						test3.setText(rs1.getString("callnum"));
						test4.setText(rs1.getString("specialty"));
						test5.setText(rs1.getString("address"));
						String url = rs1.getString("map");
						map.setIcon(new ImageIcon(TEST.class.getResource(url)));
					}conn.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
		if(obj == a11) {
			Switch_screen(Pane3);
			a11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state = conn.createStatement();
				String query = "select * from brain_pric";
				ResultSet rs = state.executeQuery(query);
				ResultSetMetaData rsmd = rs.getMetaData();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				int cols = rsmd.getColumnCount();
				String[] colName = new String[cols];
				for(int i = 0; i < cols; i++) {
					colName[i] = rsmd.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
					String type, price;
					while(rs.next()) {
						type = rs.getString(1);
						price = rs.getString(2);
						String[] row = {type, price};
						model.addRow(row);
					}
				}
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			cost2.setText("신경과");
			Menu4.setBackground(Color.WHITE);
			Menu4.setContentAreaFilled(true);
			Menu4.setForeground(Color.BLACK);
			Menu1.setForeground(Color.WHITE);
			Menu1.setBorderPainted(false);
			Menu1.setContentAreaFilled(false);
			Menu1.setFocusPainted(false);
		}else if(obj == b11) {
			Switch_screen(Pane3);
			b11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state = conn.createStatement();
				String query = "select * from eye_price";
				ResultSet rs = state.executeQuery(query);
				ResultSetMetaData rsmd = rs.getMetaData();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				int cols = rsmd.getColumnCount();
				String[] colName = new String[cols];
				for(int i = 0; i < cols; i++) {
					colName[i] = rsmd.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
					String type, price;
					while(rs.next()) {
						type = rs.getString(1);
						price = rs.getString(2);
						String[] row = {type, price};
						model.addRow(row);
					}
				}
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			cost2.setText("안과");
			Menu4.setBackground(Color.WHITE);
			Menu4.setContentAreaFilled(true);
			Menu4.setForeground(Color.BLACK);
			Menu1.setForeground(Color.WHITE);
			Menu1.setBorderPainted(false);
			Menu1.setContentAreaFilled(false);
			Menu1.setFocusPainted(false);
		}else if(obj == c11) {
			Switch_screen(Pane3);
			c11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state = conn.createStatement();
				String query = "select * from oriental_price";
				ResultSet rs = state.executeQuery(query);
				ResultSetMetaData rsmd = rs.getMetaData();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				int cols = rsmd.getColumnCount();
				String[] colName = new String[cols];
				for(int i = 0; i < cols; i++) {
					colName[i] = rsmd.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
					String type, price;
					while(rs.next()) {
						type = rs.getString(1);
						price = rs.getString(2);
						String[] row = {type, price};
						model.addRow(row);
					}
				}
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			cost2.setText("한의원");
			Menu4.setBackground(Color.WHITE);
			Menu4.setContentAreaFilled(true);
			Menu4.setForeground(Color.BLACK);
			Menu1.setForeground(Color.WHITE);
			Menu1.setBorderPainted(false);
			Menu1.setContentAreaFilled(false);
			Menu1.setFocusPainted(false);
		}else if(obj == d11) {
			Switch_screen(Pane3);
			d11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state = conn.createStatement();
				String query = "select * from skin_price";
				ResultSet rs = state.executeQuery(query);
				ResultSetMetaData rsmd = rs.getMetaData();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				int cols = rsmd.getColumnCount();
				String[] colName = new String[cols];
				for(int i = 0; i < cols; i++) {
					colName[i] = rsmd.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
					String type, price;
					while(rs.next()) {
						type = rs.getString(1);
						price = rs.getString(2);
						String[] row = {type, price};
						model.addRow(row);
					}
				}
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			cost2.setText("피부과");
			Menu4.setBackground(Color.WHITE);
			Menu4.setContentAreaFilled(true);
			Menu4.setForeground(Color.BLACK);
			Menu1.setForeground(Color.WHITE);
			Menu1.setBorderPainted(false);
			Menu1.setContentAreaFilled(false);
			Menu1.setFocusPainted(false);
		}else if(obj == e11) {
			Switch_screen(Pane3);
			e11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state = conn.createStatement();
				String query = "select * from dentist_price";
				ResultSet rs = state.executeQuery(query);
				ResultSetMetaData rsmd = rs.getMetaData();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				int cols = rsmd.getColumnCount();
				String[] colName = new String[cols];
				for(int i = 0; i < cols; i++) {
					colName[i] = rsmd.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
					String type, price;
					while(rs.next()) {
						type = rs.getString(1);
						price = rs.getString(2);
						String[] row = {type, price};
						model.addRow(row);
					}
				}
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			cost2.setText("치과");
			Menu4.setBackground(Color.WHITE);
			Menu4.setContentAreaFilled(true);
			Menu4.setForeground(Color.BLACK);
			Menu1.setForeground(Color.WHITE);
			Menu1.setBorderPainted(false);
			Menu1.setContentAreaFilled(false);
			Menu1.setFocusPainted(false);
		}else if(obj == f11) {
			Switch_screen(Pane3);
			f11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state = conn.createStatement();
				String query = "select * from stom_price";
				ResultSet rs = state.executeQuery(query);
				ResultSetMetaData rsmd = rs.getMetaData();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				int cols = rsmd.getColumnCount();
				String[] colName = new String[cols];
				for(int i = 0; i < cols; i++) {
					colName[i] = rsmd.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
					String type, price;
					while(rs.next()) {
						type = rs.getString(1);
						price = rs.getString(2);
						String[] row = {type, price};
						model.addRow(row);
					}
				}
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			cost2.setText("내과");
			Menu4.setBackground(Color.WHITE);
			Menu4.setContentAreaFilled(true);
			Menu4.setForeground(Color.BLACK);
			Menu1.setForeground(Color.WHITE);
			Menu1.setBorderPainted(false);
			Menu1.setContentAreaFilled(false);
			Menu1.setFocusPainted(false);
		}else if(obj == g11) {
			Switch_screen(Pane3);
			g11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state = conn.createStatement();
				String query = "select * from bone_price";
				ResultSet rs = state.executeQuery(query);
				ResultSetMetaData rsmd = rs.getMetaData();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				int cols = rsmd.getColumnCount();
				String[] colName = new String[cols];
				for(int i = 0; i < cols; i++) {
					colName[i] = rsmd.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
					String type, price;
					while(rs.next()) {
						type = rs.getString(1);
						price = rs.getString(2);
						String[] row = {type, price};
						model.addRow(row);
					}
				}
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			cost2.setText("정형외과");
			Menu4.setBackground(Color.WHITE);
			Menu4.setContentAreaFilled(true);
			Menu4.setForeground(Color.BLACK);
			Menu1.setForeground(Color.WHITE);
			Menu1.setBorderPainted(false);
			Menu1.setContentAreaFilled(false);
			Menu1.setFocusPainted(false);
		}else if(obj == h11) {
			Switch_screen(Pane3);
			h11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state = conn.createStatement();
				String query = "select * from nose_price";
				ResultSet rs = state.executeQuery(query);
				ResultSetMetaData rsmd = rs.getMetaData();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				int cols = rsmd.getColumnCount();
				String[] colName = new String[cols];
				for(int i = 0; i < cols; i++) {
					colName[i] = rsmd.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
					String type, price;
					while(rs.next()) {
						type = rs.getString(1);
						price = rs.getString(2);
						String[] row = {type, price};
						model.addRow(row);
					}
				}
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			cost2.setText("이비인후과");
			Menu4.setBackground(Color.WHITE);
			Menu4.setContentAreaFilled(true);
			Menu4.setForeground(Color.BLACK);
			Menu1.setForeground(Color.WHITE);
			Menu1.setBorderPainted(false);
			Menu1.setContentAreaFilled(false);
			Menu1.setFocusPainted(false);
		}
		
		if(obj == map) {
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.01:1521:XE","aban","1111");
				Statement state1 = conn.createStatement();
				ResultSet rs1 = state1.executeQuery("select * from "+ TYPE +" where id = '"+ id +"'");
					while(rs1.next()) {
						String url = rs1.getString("url");
						Desktop.getDesktop().browse(new URL(url).toURI());
					}conn.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
		
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {

	}
	@Override
	public void mouseEntered(MouseEvent e) {
		Object obj = e.getSource();
		if(obj == a1) {
			a1.setIcon(new ImageIcon(TEST.class.getResource("/Image/a2.png")));
		}else if(obj == b1) {
			b1.setIcon(new ImageIcon(TEST.class.getResource("/Image/b2.png")));
		}else if(obj == c1) {
			c1.setIcon(new ImageIcon(TEST.class.getResource("/Image/c2.png")));
		}else if(obj == d1) {
			d1.setIcon(new ImageIcon(TEST.class.getResource("/Image/d2.png")));
		}else if(obj == e1) {
			e1.setIcon(new ImageIcon(TEST.class.getResource("/Image/e2.png")));
		}else if(obj == f1) {
			f1.setIcon(new ImageIcon(TEST.class.getResource("/Image/f2.png")));
		}else if(obj == g1) {
			g1.setIcon(new ImageIcon(TEST.class.getResource("/Image/g2.png")));
		}else if(obj == h1) {
			h1.setIcon(new ImageIcon(TEST.class.getResource("/Image/h2.png")));
		}else if(obj == btn1) {
			btn1.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn4.png")));
		}else if(obj == btn2) {
			btn2.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn4.png")));
		}else if(obj == btn3) {
			btn3.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn4.png")));
		}else if(obj == btn4) {
			btn4.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn4.png")));
		}else if(obj == btn5) {
			btn5.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn4.png")));
		}else if(obj == btn6) {
			btn6.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn4.png")));
		}else if(obj == a11) {
			a11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_2.png")));
		}else if(obj == b11) {
			b11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_2.png")));
		}else if(obj == c11) {
			c11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_2.png")));
		}else if(obj == d11) {
			d11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_2.png")));
		}else if(obj == e11) {
			e11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_2.png")));
		}else if(obj == f11) {
			f11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_2.png")));
		}else if(obj == g11) {
			g11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_2.png")));
		}else if(obj == h11) {
			h11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_2.png")));
		}
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		Object obj = e.getSource();
		if(obj == a1) {
			a1.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1.png")));
		}else if(obj == b1) {
			b1.setIcon(new ImageIcon(TEST.class.getResource("/Image/b1.png")));
		}else if(obj == c1) {
			c1.setIcon(new ImageIcon(TEST.class.getResource("/Image/c1.png")));
		}else if(obj == d1) {
			d1.setIcon(new ImageIcon(TEST.class.getResource("/Image/d1.png")));
		}else if(obj == e1) {
			e1.setIcon(new ImageIcon(TEST.class.getResource("/Image/e1.png")));
		}else if(obj == f1) {
			f1.setIcon(new ImageIcon(TEST.class.getResource("/Image/f1.png")));
		}else if(obj == g1) {
			g1.setIcon(new ImageIcon(TEST.class.getResource("/Image/g1.png")));
		}else if(obj == h1) {
			h1.setIcon(new ImageIcon(TEST.class.getResource("/Image/h1.png")));
		}else if(obj == btn1) {
			btn1.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn3.png")));
		}else if(obj == btn2) {
			btn2.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn3.png")));
		}else if(obj == btn3) {
			btn3.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn3.png")));
		}else if(obj == btn4) {
			btn4.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn3.png")));
		}else if(obj == btn5) {
			btn5.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn3.png")));
		}else if(obj == btn6) {
			btn6.setIcon(new ImageIcon(TEST.class.getResource("/Image/btn3.png")));
		}else if(obj == a11) {
			a11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
		}else if(obj == b11) {
			b11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
		}else if(obj == c11) {
			c11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
		}else if(obj == d11) {
			d11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
		}else if(obj == e11) {
			e11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
		}else if(obj == f11) {
			f11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
		}else if(obj == g11) {
			g11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
		}else if(obj == h11) {
			h11.setIcon(new ImageIcon(TEST.class.getResource("/Image/a1_1.png")));
		}
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		setLocation(e.getXOnScreen() -tx, e.getYOnScreen() -ty);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == InfoButton) {
			Info frame = new Info();
		}else if(obj == MailButton) {
			try {
				Desktop.getDesktop().browse(new URL("https://mail.google.com/").toURI());
			}catch(Exception evt) {
				return;
			}
		}else if(obj == BrowseButton) {
			try {
				Desktop.getDesktop().browse(new URL("http://www.google.com").toURI());
			}catch(Exception evt) {
				return;
			}
		}else if(obj == CalenderButton) {
			Calender cal = new Calender();
		}
	}
}