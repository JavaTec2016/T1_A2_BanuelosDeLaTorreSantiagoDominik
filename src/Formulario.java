
import java.awt.*;
import java.util.stream.IntStream;

import javax.swing.*;
class Ventana extends JFrame{
	public Ventana() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		setTitle("Layout NULO");
		setVisible(true);
		
		int bajacion = 40, x = 0;
		int empujacion = 40, y = 0;
		int linea = 1, columna = 1;
		JLabel txtListado1 = new JLabel("The");//newLabel("The ", x+empujacion*columna, y+bajacion*linea, 30, 30, 0, 10);
		FormatearComponente(txtListado1, x+empujacion, y+bajacion, 17, 30, 0, 10);
		add(txtListado1);
		
		JLabel txtListado2 = new JLabel("Classic Form");
		FormatearComponente(txtListado2, txtListado1, 20, 0, 100, 30, 1, 10);//newLabel("Classic Form", x+empujacion*columna+20, y+bajacion*linea, 100, 30, 1, 10); 
		add(txtListado2);
		
		JLabel txtListado3 = new JLabel("includes all visible fields for");
		FormatearComponente(txtListado3, txtListado2, 67, 0, 150, 30, 0, 10);
		add(txtListado3);
		
		JLabel txtListado4 = new JLabel("this list.");
		FormatearComponente(txtListado4, txtListado1, 0, 10, 50, 30, 0, 10);
		add(txtListado4);
		
		bajacion = 40;
		linea = 1;
		
		///
		linea = 2;
		JLabel txtOptions = new JLabel("Form options");
		txtOptions.setBounds(x+empujacion*columna, y+bajacion*linea, 200, 30);
		txtOptions.setFont(new Font("Arial", 0, 15));
		add(txtOptions);
		
		bajacion += 10;
		JLabel txtInclude = new JLabel("Include the following: ");
		txtInclude.setBounds(x+empujacion*columna, y+bajacion*linea, 200, 30);
		txtInclude.setFont(new Font("Arial", 0, 10));
		add(txtInclude);
		
		bajacion += 5;
		JCheckBox checkTitle = new JCheckBox("A title for your form");
		checkTitle.setBounds(x+empujacion*columna, y+bajacion*linea, 200, 30);
		checkTitle.setFont(new Font("Arial", 0, 10));
		add(checkTitle);
		
		JTextField cajaSubscribe = newTextFieldDesde(10, checkTitle.getX(), 0, checkTitle.getY(), 30, 200, 25, 0, 10);
		add(cajaSubscribe);
		ButtonGroup bg = new ButtonGroup();
		JRadioButton radioRequiredFields = newRadioDesde("only required fields", cajaSubscribe.getX(), 0, cajaSubscribe.getY(), 60, 150, 20, 0, 10);
		bg.add(radioRequiredFields);
		add(radioRequiredFields);
		JRadioButton radioAllFields = newRadioDesde("all fields", radioRequiredFields.getX(), 0, radioRequiredFields.getY(), 20, 150, 20, 0, 10);
		bg.add(radioAllFields);
		add(radioAllFields);
		
		JLabel txtParentesisEdit = new JLabel("(edit required fields in");
		FormatearComponente(
			txtParentesisEdit, radioAllFields, 15, 20,
			200, 15, 0, 8
		);
	
		add(txtParentesisEdit);
		JLabel txtParentesisEditBlue = new JLabel("the form builder");
		FormatearComponente(
				txtParentesisEditBlue, txtParentesisEdit, 85, 0,
				150, 15, 1, 8
			);
		txtParentesisEditBlue.setForeground(new Color(0, 200, 255));
		add(txtParentesisEditBlue);
		
		JLabel txtParentesisEditLast = new JLabel(")"); 
		FormatearComponente(
				txtParentesisEditLast, txtParentesisEditBlue, 63, 0,
				30, 15, 0, 8
			);
		add(txtParentesisEditLast);
		
		JCheckBox checkGroupFields = new JCheckBox("interest group fields");
		FormatearComponente(
				checkGroupFields, radioAllFields, 0, 60,
				200, 15, 0, 10
			);
		add(checkGroupFields);
		
		JCheckBox checkFieldIndicators = new JCheckBox("required field indicators");
		FormatearComponente(
				checkFieldIndicators, checkGroupFields, 0, 20,
				200, 15, 0, 10
			);
		add(checkFieldIndicators);
		
		JLabel txtFormWidth = new JLabel("Set form width");
		FormatearComponente(
				txtFormWidth, checkFieldIndicators, 0, 40,
				150, 15, 0, 10
				);
		add(txtFormWidth);
		JTextField cajaWidth = new JTextField(10);
		FormatearComponente(cajaWidth, txtFormWidth, 0, 20, 200, 25, 0, 10);
		add(cajaWidth);
		
	
		JLabel txtEnhance = escribir(cajaWidth, "Enhance your form", 0, 35, 10);
		
		JCheckBox checkEvil = marcable(txtEnhance, "enable", 0, 20, 10, 55, 0);
		JLabel txtEvilBold = escribir(checkEvil, "evil", 56, 3, 10, 1, 0);
		JLabel txtEvilLast = escribir(txtEvilBold, " popup mode", 18, 0, 10);
		
		JCheckBox checkJavascript = marcable(checkEvil, "disable all", 0, 20, 10, 74, 0);
		JLabel txtJavascriptBold = escribir(checkJavascript, "JavaScript", 73, 3, 10, 1, 0);
		
		JCheckBox checkArchiveLink = marcable(checkJavascript, "include archive link", 0, 20, 10, 155, 0);
		JCheckBox checkMonkeyRewards = marcable(checkArchiveLink, "include", 0, 20, 10, 58, 0);
		JLabel txtMonkeyRewardsBlue = escribir(checkMonkeyRewards, "MonkeyRewards link", 58, 3, 10, 0, 0);
		txtMonkeyRewardsBlue.setForeground(new Color(0, 200, 255));
		
		JLabel txtPreview = escribir(txtListado1, "Preview", 250, 1, 17, 75);
		
		
		
		JTextArea marcoFalso = new JTextArea(5, 10);
		//FormatearComponente(marcoFalso, txtPreview, 0, 20, 200, 100, 0, 50);
		marcoFalso.setLineWrap(true);
		marcoFalso.setWrapStyleWord(true);
		marcoFalso.setText("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		marcoFalso.setEditable(false);
		marcoFalso.setEnabled(false);
		marcoFalso.setVisible(false);
		JScrollPane scroll = new JScrollPane(marcoFalso);
		FormatearComponente(scroll, txtPreview, 0, 20, 450, 260, 0, 50);
		
		JLabel txtRequiredSymbol = new JLabel("*");
		FormatearComponente(txtRequiredSymbol, scroll, 305, 3, 20, 20, 1, 15);
		txtRequiredSymbol.setForeground(new Color(255,0,0));
		add(txtRequiredSymbol);
		
		JLabel txtRequired = new JLabel("indicates required");
		FormatearComponente(txtRequired, txtRequiredSymbol, 5, 5, 100, 15, 0, 10);
		add(txtRequired);
		
		JLabel txtEmail = escribir(scroll, "Email Address", 20, 20, 13, 100);
		
		JFormattedTextField cajaEmail = new JFormattedTextField();
		FormatearComponente(cajaEmail, txtEmail, 0, 20, 300, 25, 0, 12);
		add(cajaEmail);
		
		JLabel txtAsterisco = new JLabel("*");
		FormatearComponente(txtAsterisco, cajaEmail, 305, 0, 20, 20, 1, 15);
		txtAsterisco.setForeground(new Color(255,0,0));
		add(txtAsterisco);
		
		JLabel txtFirstName = escribir(cajaEmail, "First Name", 0, 40, 13, 100);
		JTextField cajaFirstName = caja(txtFirstName, 10, 0, 20, 300);
		
		JLabel txtLastName = escribir(cajaFirstName, "Last Name", 0, 40, 13, 100);
		JTextField cajaLastName = caja(txtLastName, 10, 0, 20, 300);
		
		JButton btnSUBSCRIBE = new JButton();
		FormatearComponente(btnSUBSCRIBE, cajaLastName.getX(), cajaLastName.getY()+50, 230, 26, 0, 10);
		btnSUBSCRIBE.setIcon(new ImageIcon("././icono/image.png"));
		add(btnSUBSCRIBE);
		
		
		
		add(scroll);
		
		JLabel txtCode = escribir(scroll, "Copy/paste onto your site", 0, 290, 15, 200);
		
		JTextArea marcoVerdadero = new JTextArea(10,10);
		JScrollPane scrollVerdadero = new JScrollPane(marcoVerdadero);
		FormatearComponente(scrollVerdadero, txtCode, 0, 20, 450, 150, 0, 13);
		add(scrollVerdadero);
	}
	JLabel escribir(Component ref, String texto, int x, int y, int tamanio) {
		JLabel c = new JLabel(texto);
		FormatearComponente(c, ref, x, y, (int)(texto.length()/2*19), 15, 0, tamanio);
		add(c);
		return c;
	}
	JLabel escribir(Component ref, String texto, int x, int y, int tamanio, int largo) {
		JLabel c = new JLabel(texto);
		FormatearComponente(c, ref, x, y, largo, 15, 0, tamanio);
		add(c);
		return c;
	}
	JLabel escribir(Component ref, String texto, int x, int y, int tamanio, int estilo, int rgb) {
		JLabel c = new JLabel(texto);
		FormatearComponente(c, ref, x, y, (int)(texto.length()/2*19), 15, estilo, tamanio);
		c.setForeground(new Color(rgb));
		add(c);
		return c;
	}
	JTextField caja(Component ref, int taman, int x, int y, int largo) {
		JTextField caja = new JTextField(taman);
		FormatearComponente(caja, ref, x, y, largo, 25, 0, 10);
		add(caja);
		return caja;
	}
	JCheckBox marcable(Component ref, String texto, int x, int y, int tamanio, int largo, int rgb) {
		JCheckBox c = new JCheckBox(texto);
		FormatearComponente(c, ref, x, y, largo, 20, 0, tamanio);
		c.setForeground(new Color(rgb));
		add(c);
		return c;
	}
	void FormatearComponente(Component c, int x, int y, int w, int h, int formato, int tamano) {
		c.setBounds(x, y, w, h);
		c.setFont(new Font("Arial", formato, tamano));
	}
	void FormatearComponente(Component c, Component ref, int x, int y, int w, int h, int formato, int tamano) {
		c.setBounds(ref.getX()+x, ref.getY()+y, w, h);
		c.setFont(new Font("Arial", formato, tamano));
	}
	JCheckBox newCheckBox(String txt, float x, float y, int w, int h, int formato, int tamano){
		JCheckBox ch = new JCheckBox(txt);
		ch.setBounds((int)x, (int)y, w, h);
		ch.setFont(new Font("Arial", formato, tamano));
		return ch;
	}
	JLabel newLabel(String txt, float x, float y, int w, int h, int formato, int tamano){
		JLabel e = new JLabel(txt);
		e.setBounds((int)x, (int)y, w, h);
		e.setFont(new Font("Arial", formato, tamano));
		return e;
	}
	JLabel newLabelDesde(String txt, float x, float dx, float dy, float y, int w, int h, int formato, int tamano) {
		JLabel e = new JLabel(txt);
		e.setBounds((int)(x+dx), (int)(y+dy), w, h);
		e.setFont(new Font("Arial", formato, tamano));
		return e;
	}
	JTextField newTextField(int taman, float x, float y,int w, int h, int formato, int tamano) {
		JTextField e = new JTextField(taman);
		e.setBounds((int)x, (int)y, 140, 20);
		e.setFont(new Font("Arial", formato, tamano));
		return e;
		
	}
	JTextField newTextFieldDesde(int taman, float x, float dx, float dy, float y, int w, int h, int formato, int tamano) {
		JTextField e = new JTextField(taman);
		e.setBounds((int)(x+dx), (int)(y+dy), w, h);
		e.setFont(new Font("Arial", formato, tamano));
		return e;
		
	}
	JRadioButton newRadioDesde(String texto, float x, float dx, float dy, float y, int w, int h, int formato, int tamano) {
		JRadioButton e = new JRadioButton(texto);
		e.setBounds((int)(x+dx), (int)(y+dy), w, h);
		e.setFont(new Font("Arial", formato, tamano));
		return e;
		
	}
}
public class Formulario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Ventana();
			}
		});
	}

}
