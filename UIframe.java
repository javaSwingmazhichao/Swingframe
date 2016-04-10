import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import javax.swing.JProgressBar;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class UIframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JPasswordField passwordField1;
	private JTextArea textarea;
	private JProgressBar progressBar;
	private static boolean a=true; 
	private static boolean b=true;
	private static boolean c=true;
	private static boolean d=true;
	private static boolean e = true;
	private static boolean f = true;
	private static boolean g = true;
	private static boolean h = true;
	private JRadioButton rdbtnNewRadioButton3;
	private JRadioButton rdbtnNewRadioButton2;
	private JCheckBox chckbxNewCheckBox1;
	private JCheckBox chckbxNewCheckBox2;
	private JCheckBox checkBox3;
	private JCheckBox checkBox4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIframe frame = new UIframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UIframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel Label1 = new JLabel("\u59D3\u540D\r\n");
		Label1.setForeground(Color.BLACK);
		Label1.setBackground(Color.LIGHT_GRAY);
		Label1.setFont(new Font("宋体", Font.BOLD, 21));
		Label1.setBounds(30, 24, 89, 31);
		panel.add(Label1);
		
		JButton NewButton3 = new JButton("\u91CD\u9009");
		NewButton3.setFont(new Font("宋体", Font.BOLD, 22));
		NewButton3.setBounds(502, 382, 104, 41);
		panel.add(NewButton3);
		
		JLabel label2 = new JLabel("\u8EAB\u4EFD\u8BC1\u53F7");
		label2.setBackground(Color.YELLOW);
		label2.setFont(new Font("宋体", Font.BOLD, 21));
		label2.setBounds(30, 76, 89, 31);
		panel.add(label2);
		
		JLabel label3 = new JLabel("\u5BC6\u7801");
		label3.setBackground(Color.LIGHT_GRAY);
		label3.setFont(new Font("宋体", Font.BOLD, 21));
		label3.setBounds(30, 130, 89, 31);
		panel.add(label3);
		
		textField1 = new JTextField();
		textField1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				textField1.requestFocus();
			}
		});
		textField1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				progressBar.setValue(progressBar.getValue()+50);
			}
		});
		textField1.setToolTipText("\u59D3\u540D\u4E0D\u80FD\u4E3A\u7A7A");
		textField1.setHorizontalAlignment(SwingConstants.CENTER);
		textField1.setBackground(Color.WHITE);
		textField1.setColumns(10);
		textField1.setBounds(129, 27, 217, 31);
		textField1.getDocument().addDocumentListener(new Swing_OnValueChanged());
		panel.add(textField1);
		
		textField2 = new JTextField();
		textField2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int keyChar = e.getKeyChar();                 
                if(keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9){  
                      
                }else{  
                    e.consume(); //关键，屏蔽掉非法输入  
                }  
			}
		});
		textField2.setToolTipText("\u8EAB\u4EFD\u8BC1\u53F7\u53EA\u80FD\u4E3A\u6570\u5B57");
		textField2.setHorizontalAlignment(SwingConstants.CENTER);
		textField2.setBackground(Color.WHITE);
		textField2.setColumns(10);
		textField2.setBounds(129, 79, 217, 31);
		textField2.getDocument().addDocumentListener(new Swing_OnValueChanged1());
		panel.add(textField2);
		
		JButton NewButton2 = new JButton("\u53D6\u6D88");
		NewButton2.setIcon(new ImageIcon("D:\\BaiduYunDownload\\2.0btn\\2-0btn_01.ico"));
		NewButton2.setFont(new Font("宋体", Font.BOLD, 22));
		NewButton2.setBounds(626, 382, 104, 41);
		panel.add(NewButton2);
		
		JButton NewButton1 = new JButton("\u786E\u5B9A");
		NewButton1.setForeground(Color.WHITE);
		NewButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
//				System.out.println(textField1.getText());
//				System.out.println(textarea.getText());
				if(textField1.getText().trim().equals("")){
					JOptionPane.showMessageDialog(null,"姓名不能为空","警告信息",JOptionPane.ERROR_MESSAGE);
				}
				if(passwordField1.getPassword().length<8){
					JOptionPane.showMessageDialog(null,"密码不能少于8位","警告信息",JOptionPane.ERROR_MESSAGE);
				}
				if(textarea.getText().trim().equals("")){
					JOptionPane.showMessageDialog(null,"个人介绍不能为空","警告信息",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		NewButton1.setIcon(new ImageIcon("D:\\BaiduYunDownload\\2.0btn\\2-0btn_11.png"));
		NewButton1.setFont(new Font("宋体", Font.BOLD, 22));
		NewButton1.setBounds(363, 382, 104, 41);
		panel.add(NewButton1);
		
		passwordField1 = new JPasswordField();
		passwordField1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		passwordField1.setToolTipText("\u5BC6\u7801\u957F\u5EA6\u4E0D\u80FD\u5C11\u4E8E8\u4F4D");
		passwordField1.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField1.setBounds(129, 133, 217, 31);
		passwordField1.getDocument().addDocumentListener(new Swing_OnValueChanged2());
		panel.add(passwordField1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(90, 243, 256, 108);
		panel.add(scrollPane);
		
		textarea = new JTextArea();
		scrollPane.setViewportView(textarea);
		textarea.setToolTipText("\u4E2A\u4EBA\u4ECB\u7ECD\u4E0D\u80FD\u4E3A\u7A7A");
		textarea.getDocument().addDocumentListener(new Swing_OnValueChanged3());
		
		ButtonGroup group = new ButtonGroup();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u6027\u522B", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(79, 181, 267, 51);
		panel.add(panel_1);
		
		rdbtnNewRadioButton3 = new JRadioButton("\u7537");
		rdbtnNewRadioButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnNewRadioButton3.isSelected()&&g==true){
					progressBar.setValue(progressBar.getValue()+10);
					g=false;
				}
			}
		});
		group.add(rdbtnNewRadioButton3);
		
		rdbtnNewRadioButton2 = new JRadioButton("\u5973");
		rdbtnNewRadioButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(rdbtnNewRadioButton2.isSelected()&&g==true){
                	progressBar.setValue(progressBar.getValue()+10);
                	g=false;
				}
			}
		});
		group.add(rdbtnNewRadioButton2);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(65, Short.MAX_VALUE)
					.addComponent(rdbtnNewRadioButton3, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(rdbtnNewRadioButton2, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addGap(42))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton2)
						.addComponent(rdbtnNewRadioButton3))
					.addGap(36))
		);
		panel_1.setLayout(gl_panel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(comboBox.getSelectedIndex()>=0&&f==true){
					progressBar.setValue(progressBar.getValue()+10);
					f=false;
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u515A\u5458", "\u5DE5\u4EBA", "\u56E2\u5458", "\u7FA4\u4F17"}));
		comboBox.setBounds(425, 33, 145, 31);
		panel.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u5174\u8DA3", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(448, 181, 267, 139);
		panel.add(panel_2);
		
		chckbxNewCheckBox1 = new JCheckBox("\u6E38\u6CF3");
		chckbxNewCheckBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox1.isSelected()&&h==true){
					progressBar.setValue(progressBar.getValue()+10);
					h=false;
				}
				if(!chckbxNewCheckBox1.isSelected()&&
						!chckbxNewCheckBox2.isSelected()&&
						!checkBox3.isSelected()&&
						!checkBox4.isSelected()){
					progressBar.setValue(progressBar.getValue()-10);
					h=true;
				}
				
			}
		});
		
		chckbxNewCheckBox2 = new JCheckBox("\u7BEE\u7403");
		chckbxNewCheckBox2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox2.isSelected()&&h==true){
					progressBar.setValue(progressBar.getValue()+10);
					h=false;
				}
				if(!chckbxNewCheckBox1.isSelected()&&
						!chckbxNewCheckBox2.isSelected()&&
						!checkBox3.isSelected()&&
						!checkBox4.isSelected()){
					progressBar.setValue(progressBar.getValue()-10);
					h=true;
				}
			}
		});
		
		checkBox3 = new JCheckBox("\u8DB3\u7403");
		checkBox3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkBox3.isSelected()&&h==true){
					progressBar.setValue(progressBar.getValue()+10);
					h=false;
				}
				if(!chckbxNewCheckBox1.isSelected()&&
						!chckbxNewCheckBox2.isSelected()&&
						!checkBox3.isSelected()&&
						!checkBox4.isSelected()){
					progressBar.setValue(progressBar.getValue()-10);
					h=true;
				}
			}
		});
		
		checkBox4 = new JCheckBox("\u7FBD\u6BDB\u7403");
		checkBox4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkBox4.isSelected()&&h==true){
					progressBar.setValue(progressBar.getValue()+10);
					h=false;
				}
				if(!chckbxNewCheckBox1.isSelected()&&
						!chckbxNewCheckBox2.isSelected()&&
						!checkBox3.isSelected()&&
						!checkBox4.isSelected()){
					progressBar.setValue(progressBar.getValue()-10);
					h=true;
				}
			}
		});
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(16)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxNewCheckBox1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkBox3))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(checkBox4)
						.addComponent(chckbxNewCheckBox2, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox1)
						.addComponent(chckbxNewCheckBox2))
					.addGap(32)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(checkBox3)
						.addComponent(checkBox4))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		gl_panel_2.linkSize(SwingConstants.VERTICAL, new Component[] {chckbxNewCheckBox1, chckbxNewCheckBox2});
		gl_panel_2.linkSize(SwingConstants.HORIZONTAL, new Component[] {chckbxNewCheckBox1, chckbxNewCheckBox2});
		panel_2.setLayout(gl_panel_2);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(21, 382, 291, 41);
		panel.add(progressBar);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(600, 33, 153, 101);
		panel.add(scrollPane_1);
		
		JList<String> list = new JList<String>();
		scrollPane_1.setViewportView(list);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				if(list.getSelectedIndex()>=0&&e==true){
					progressBar.setValue(progressBar.getValue()+10);
					e = false;
				}
			}
		});
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"\u8F6F\u4EF6\u5DE5\u7A0B", "", "\u56FD\u9645\u7ECF\u6D4E\u4E0E\u8D38\u6613", "", "\u8BA1\u7B97\u673A\u79D1\u5B66\u4E0E\u6280\u672F", "", "\u80FD\u6E90\u5316\u5B66\u4E0E\u5DE5\u7A0B", "\u98DE\u884C\u5668\u5236\u9020\u5DE5\u7A0B ", "\u98DF\u54C1\u79D1\u5B66\u4E0E\u5DE5\u7A0B ", "\u710A\u63A5\u6280\u672F\u4E0E\u5DE5\u7A0B ", "\u7535\u78C1\u573A\u4E0E\u65E0\u7EBF\u6280\u672F"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setSelectedIndex(-1);
	}
	public class Swing_OnValueChanged implements DocumentListener{
	    public void changedUpdate(DocumentEvent e){
//	    	System.out.println("Attribute Changed"+textField1.getText());
	    }
	    public void insertUpdate(DocumentEvent e){
	    	if(a==true){
	    		progressBar.setValue(progressBar.getValue()+15);
	    	  a=false;
	    	}
//	    	System.out.println("Text Inserted"+textField1.getText());
	    }
	    public void removeUpdate(DocumentEvent e){
//	    	System.out.println("Text Removed"+e.getDocument().toString());
	    	if(textField1.getText().isEmpty()){
	    		if(progressBar.getValue()>=15)
	    		{
	    			progressBar.setValue(progressBar.getValue()-15);
	    		}
	    		else{
	    			progressBar.setValue(0);
	    		}
	    		a=true;
	    	}
	    }
	    
	}
	public class Swing_OnValueChanged1 implements DocumentListener{
	    public void changedUpdate(DocumentEvent e){
//	    	System.out.println("Attribute Changed"+textField1.getText());
	    }
	    public void insertUpdate(DocumentEvent e){
	    	if(b==true){
	    		progressBar.setValue(progressBar.getValue()+15);
	    	  b=false;
	    	}
//	    	System.out.println("Text Inserted"+textField1.getText());
	    }
	    public void removeUpdate(DocumentEvent e){
//	    	System.out.println("Text Removed"+e.getDocument().toString());
	    	if(textField2.getText().isEmpty()){
	    		if(progressBar.getValue()>=15)
	    		{
	    			progressBar.setValue(progressBar.getValue()-15);
	    		}
	    		else{
	    			progressBar.setValue(0);
	    		}
	    		b=true;
	    	}
	    }
	    
	}
	public class Swing_OnValueChanged2 implements DocumentListener{
	    public void changedUpdate(DocumentEvent e){
//	    	System.out.println("Attribute Changed"+textField1.getText());
	    }
	    public void insertUpdate(DocumentEvent e){
	    	if(c==true){
	    		progressBar.setValue(progressBar.getValue()+15);
	    	  c=false;
	    	}
//	    	System.out.println("Text Inserted"+textField1.getText());
	    }
	    public void removeUpdate(DocumentEvent e){
//	    	System.out.println("Text Removed"+e.getDocument().toString());
	    	if(passwordField1.getPassword().length==0){
	    		if(progressBar.getValue()>=15)
	    		{
	    			progressBar.setValue(progressBar.getValue()-15);
	    		}
	    		else{
	    			progressBar.setValue(0);
	    		}
	    		c=true;
	    	}
	    }
	    
	}
	public class Swing_OnValueChanged3 implements DocumentListener{
	    public void changedUpdate(DocumentEvent e){
//	    	System.out.println("Attribute Changed"+textField1.getText());
	    }
	    public void insertUpdate(DocumentEvent e){
	    	if(d==true){
	    		progressBar.setValue(progressBar.getValue()+15);
	    	  d=false;
	    	}
//	    	System.out.println("Text Inserted"+textField1.getText());
	    }
	    public void removeUpdate(DocumentEvent e){
//	    	System.out.println("Text Removed"+e.getDocument().toString());
	    	if(textarea.getText().isEmpty()){
	    		if(progressBar.getValue()>=15)
	    		{
	    			progressBar.setValue(progressBar.getValue()-15);
	    		}
	    		else{
	    			progressBar.setValue(0);
	    		}
	    		d=true;
	    	}
	    }
	    
	}
}
