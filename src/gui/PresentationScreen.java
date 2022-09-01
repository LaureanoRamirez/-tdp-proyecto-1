package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import entities.Student;
import tiempo.Tiempo;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PresentationScreen extends JFrame {

//Declaro atributos gráficos
	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel lblImagen;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblApellido;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textGit;
	private JTextField textLU;
	private JTextField textApellido;
	private JTextField textNombre;
	private JTextField textEmail;
	private JLabel lblFecha;

	public PresentationScreen(Student studentData) {
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 250));
		setResizable(false);
		setContentPane(contentPane);
		//inicializo la información del estudiante, muestro la imagen y la fecha 
		init();
		//cambio el ícono al frame
		setIconImage(new ImageIcon(getClass().getResource("/images/tdp.png")).getImage());
		
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 0, 436, 177);
		tabInformation = new JPanel();
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la informaciÃ³n declarada por el alumno");
		tabInformation.setLayout(null);
		//MUESTRO LA INFORMACIÓN DEL ALUMNO
		panel = new JPanel();
		panel.setBounds(10, 11, 405, 122);
		tabInformation.add(panel);
		
		lblNewLabel = new JLabel("LU");
		textLU = new JTextField();
		textLU.setText(studentData.getId()+" ");
		textLU.setColumns(10);
		
		lblApellido = new JLabel("Apellido");
		textApellido = new JTextField();
		textApellido.setText(studentData.getLastName());
		textApellido.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Nombre");
		textNombre = new JTextField();
		textNombre.setText(studentData.getFirstName());
		textNombre.setColumns(10);
		
		lblNewLabel_2 = new JLabel("E-mail");
		textEmail = new JTextField();
		textEmail.setText(studentData.getMail());
		textEmail.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Github URL");
		textGit = new JTextField();
		textGit.setText(studentData.getGithubURL()+" ");
		textGit.setColumns(10);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 405, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_3))
					.addGap(20)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textGit, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
						.addComponent(textLU, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
						.addComponent(textApellido, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
						.addComponent(textNombre, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
						.addComponent(textEmail, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 122, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textLU, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApellido)
						.addComponent(textApellido, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(textGit, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.add(tabbedPane);
		
		// MUESTRO LA FOTO
		lblImagen = new JLabel("New label");
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen.setIcon(new ImageIcon(PresentationScreen.class.getResource("/images/laureano.jpg")));
		lblImagen.setBounds(445, 23, 144, 154);
		contentPane.add(lblImagen);
		
		// MUESTRO LA FECHA
		Tiempo fecha= new Tiempo();
		 
		lblFecha= new JLabel();
		lblFecha.setBounds(15, 188, 413, 14);
		contentPane.add(lblFecha);
		lblFecha.setText("Esta ventana fue generada el "+fecha.getFecha()+" a las "+ fecha.getMomento());
		

		
		
	}
}

