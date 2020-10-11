import java.awt.BorderLayout;
import java.awt.EventQueue;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

import java.util.*;
import java.io.*;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TacoBuilderTest1 extends JFrame {

	private JPanel contentPane;
	private JTextField BEANNS;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField TacoArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TacoBuilderTest1 frame = new TacoBuilderTest1();
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
	public TacoBuilderTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 909, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setTitle("Taco Simulator: The Ultimate Taco Simulation");
		
		int TacoScore = 0;
		JCheckBox Chorizo = new JCheckBox("Chorizo");
		Chorizo.setOpaque(false);
		Chorizo.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		Chorizo.setBounds(225, 110, 97, 30);
		if(Chorizo.isSelected() == true) {
			TacoScore = 1;
		}
		contentPane.add(Chorizo);
		
		JCheckBox CarneAsada = new JCheckBox("Carne Asada");
		CarneAsada.setOpaque(false);
		CarneAsada.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		CarneAsada.setBounds(225, 139, 136, 30);
		contentPane.add(CarneAsada);
		
		JCheckBox Carnitas = new JCheckBox("Carnitas");
		Carnitas.setOpaque(false);
		Carnitas.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		Carnitas.setBounds(225, 161, 97, 42);
		contentPane.add(Carnitas);
		
		JCheckBox TexmexMeat = new JCheckBox("TexMex Meat");
		TexmexMeat.setOpaque(false);
		TexmexMeat.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		TexmexMeat.setBounds(225, 197, 136, 30);
		contentPane.add(TexmexMeat);
		
		JCheckBox GrilledMeat = new JCheckBox("Grilled Meat");
		GrilledMeat.setOpaque(false);
		GrilledMeat.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		GrilledMeat.setBounds(225, 224, 136, 30);
		contentPane.add(GrilledMeat);
		
		JCheckBox IcebergLettuce = new JCheckBox("Iceberg Lettuce");
		IcebergLettuce.setOpaque(false);
		IcebergLettuce.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		IcebergLettuce.setBounds(437, 115, 149, 21);
		contentPane.add(IcebergLettuce);
		
		JCheckBox DicedTomato = new JCheckBox("Diced Tomato");
		DicedTomato.setOpaque(false);
		DicedTomato.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		DicedTomato.setBounds(437, 139, 137, 21);
		contentPane.add(DicedTomato);
		
		JCheckBox SalsaVerde = new JCheckBox("Salsa Verde");
		SalsaVerde.setOpaque(false);
		SalsaVerde.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		SalsaVerde.setBounds(437, 161, 118, 21);
		contentPane.add(SalsaVerde);
		
		JCheckBox PDGallo = new JCheckBox("Pico de Gallo");
		PDGallo.setOpaque(false);
		PDGallo.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		PDGallo.setBounds(437, 182, 137, 21);
		contentPane.add(PDGallo);
		
		JCheckBox Onions = new JCheckBox("Onions");
		Onions.setOpaque(false);
		Onions.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		Onions.setBounds(437, 202, 118, 21);
		contentPane.add(Onions);
		
		JCheckBox Beans = new JCheckBox("Beans");
		Beans.setOpaque(false);
		Beans.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		Beans.setBounds(437, 224, 118, 21);
		contentPane.add(Beans);
		
		JCheckBox Cilantro = new JCheckBox("Cilantro");
		Cilantro.setOpaque(false);
		Cilantro.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		Cilantro.setBounds(437, 246, 118, 21);
		contentPane.add(Cilantro);
		
		JCheckBox Avocados = new JCheckBox("Avocados");
		Avocados.setOpaque(false);
		Avocados.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		Avocados.setBounds(604, 115, 118, 21);
		contentPane.add(Avocados);
		
		JCheckBox SourCream = new JCheckBox("Sour Cream");
		SourCream.setOpaque(false);
		SourCream.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		SourCream.setBounds(604, 138, 118, 21);
		contentPane.add(SourCream);
		
		JCheckBox Queso = new JCheckBox("Queso");
		Queso.setOpaque(false);
		Queso.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		Queso.setBounds(604, 161, 118, 21);
		contentPane.add(Queso);
		
		JCheckBox HotSauce = new JCheckBox("Hot Sauce");
		HotSauce.setOpaque(false);
		HotSauce.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		HotSauce.setBounds(604, 184, 118, 21);
		contentPane.add(HotSauce);
		
		JCheckBox SalsaRoja = new JCheckBox("Salsa Roja");
		SalsaRoja.setOpaque(false);
		SalsaRoja.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		SalsaRoja.setBounds(604, 207, 118, 21);
		contentPane.add(SalsaRoja);
		
		JCheckBox QuesoBlanco = new JCheckBox("Queso Blanco");
		QuesoBlanco.setOpaque(false);
		QuesoBlanco.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		QuesoBlanco.setBounds(745, 110, 137, 21);
		contentPane.add(QuesoBlanco);
		
		JCheckBox Cheddar = new JCheckBox("Cheddar");
		Cheddar.setOpaque(false);
		Cheddar.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		Cheddar.setBounds(745, 133, 118, 21);
		contentPane.add(Cheddar);
		
		JCheckBox MJack = new JCheckBox("Monterey Jack");
		MJack.setOpaque(false);
		MJack.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		MJack.setBounds(745, 156, 149, 21);
		contentPane.add(MJack);
		
		JCheckBox Cotija = new JCheckBox("Cotija");
		Cotija.setOpaque(false);
		Cotija.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		Cotija.setBounds(745, 179, 118, 21);
		contentPane.add(Cotija);
		
		JCheckBox Oaxaca = new JCheckBox("Oaxaca");
		Oaxaca.setOpaque(false);
		Oaxaca.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		Oaxaca.setBounds(745, 202, 118, 21);
		contentPane.add(Oaxaca);
		
		JCheckBox Asadero = new JCheckBox("Asadero");
		Asadero.setOpaque(false);
		Asadero.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		Asadero.setBounds(745, 225, 118, 21);
		contentPane.add(Asadero);
		
		BEANNS = new JTextField();
		BEANNS.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		BEANNS.setBounds(745, 287, 118, 30);
		contentPane.add(BEANNS);
		BEANNS.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Other Ingredients:");
		lblNewLabel.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
		lblNewLabel.setBounds(745, 255, 159, 30);
		contentPane.add(lblNewLabel);
		
		JLabel CornPic = new JLabel("");
		CornPic.setIcon(new ImageIcon("C:\\Users\\chris\\eclipse-workspace\\TacoSim.zip_expanded\\TacoBuilderTest1\\img\\cornt.jpg"));
		CornPic.setBounds(13, 185, 200, 200);
		contentPane.add(CornPic);
		CornPic.setVisible(false);
		
		JLabel FlourPic = new JLabel("");
		FlourPic.setIcon(new ImageIcon("C:\\Users\\alann\\eclipse-workspace\\TacoSim.zip_expanded\\TacoBuilderTest1\\img\\flourt.jpg"));
		FlourPic.setBounds(13, 185, 200, 200);
		contentPane.add(FlourPic);
		FlourPic.setVisible(false);
		
		JRadioButton CornTortilla = new JRadioButton("Corn Tortilla");
		CornTortilla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FlourPic.setVisible(false);
				CornPic.setVisible(false);
				CornPic.setVisible(true);
			}
		});
		CornTortilla.setOpaque(false);
		CornTortilla.setFont(new Font("Malgun Gothic", Font.PLAIN, 18));
		buttonGroup.add(CornTortilla);
		CornTortilla.setBounds(3, 110, 149, 30);
		contentPane.add(CornTortilla);
		
		JRadioButton FlourTortilla = new JRadioButton("Flour Tortilla");
		FlourTortilla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FlourPic.setVisible(false);
				CornPic.setVisible(false);
				FlourPic.setVisible(true);
			}
		});
		FlourTortilla.setOpaque(false);
		FlourTortilla.setFont(new Font("Malgun Gothic", Font.PLAIN, 18));
		buttonGroup.add(FlourTortilla);
		FlourTortilla.setBounds(3, 139, 149, 35);
		contentPane.add(FlourTortilla);
		
		//Flour Tortilla > Corn Tortilla
		
		JButton Taco = new JButton("Rate My Taco!");
		Taco.setForeground(Color.RED);
		Taco.setFont(new Font("Malgun Gothic", Font.BOLD, 16));
		Taco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int TotalScore = 0;
				int calories = 0;
				boolean special = false;
				
				if(FlourTortilla.isSelected() && CarneAsada.isSelected() && PDGallo.isSelected() && Onions.isSelected() && Cilantro.isSelected() && SourCream.isSelected() && Avocados.isSelected() && Asadero.isSelected() && Cotija.isSelected() && (Chorizo.isSelected() == false && Carnitas.isSelected() == false && GrilledMeat.isSelected() == false && TexmexMeat.isSelected() == false && Beans.isSelected() == false && SalsaVerde.isSelected() == false && DicedTomato.isSelected() == false && IcebergLettuce.isSelected() == false && Queso.isSelected() == false && HotSauce.isSelected() == false && SalsaRoja.isSelected() == false && QuesoBlanco.isSelected() == false && Cheddar.isSelected() == false && MJack.isSelected() == false && Oaxaca.isSelected() == false))
				{
					JOptionPane.showMessageDialog(null, "Holy smokes! A perfect 100/100 taco! Amazing!!!", "The Taco Lord is very pleased " + "", JOptionPane.WARNING_MESSAGE);
					TacoArea.setText("PERFECT TACO!!!! 100/100");
					special = true;
				}
				
				if(Beans.isSelected() == true && FlourTortilla.isSelected() == true && (CarneAsada.isSelected() == false && PDGallo.isSelected() == false && Onions.isSelected() == false && Cilantro.isSelected() ==false && SourCream.isSelected() == false && Avocados.isSelected() == false && Asadero.isSelected() == false && Cotija.isSelected() == false && Chorizo.isSelected() == false && Carnitas.isSelected() == false && GrilledMeat.isSelected() == false && TexmexMeat.isSelected() == false && SalsaVerde.isSelected() == false && DicedTomato.isSelected() == false && IcebergLettuce.isSelected() == false && Queso.isSelected() == false && HotSauce.isSelected() == false && SalsaRoja.isSelected() == false && QuesoBlanco.isSelected() == false && Cheddar.isSelected() == false && MJack.isSelected() == false && Oaxaca.isSelected() == false))
				{
					if(BEANNS.getText().equals("beans"))
					{
						special = true;
						JOptionPane.showMessageDialog(null, "Unbelievable! A burrito beyond perfect?!? 200/100", "The Taco Lord is speechless " + "", JOptionPane.WARNING_MESSAGE);
					}
						else {
						JOptionPane.showMessageDialog(null, "No way! A perfect bean burrito!! 115/100", "The Taco Lord is ecstatic " + "", JOptionPane.WARNING_MESSAGE);
						TacoArea.setText("perfect bean taco: 115/100");
						special = true;
						}
				}
				
				if(CornTortilla.isSelected() || FlourTortilla.isSelected()) 
				{
					if(FlourTortilla.isSelected() == true) 
					{
						TotalScore = TotalScore + 10;
						calories = calories + 150;
					}
					if(CornTortilla.isSelected() == true)
					{
						TotalScore = TotalScore + 5;
						calories = calories + 70;
					}
					if(Chorizo.isSelected() == true)
					{
						TotalScore = TotalScore + 1;
						calories = calories + 150;
					}
					if(Carnitas.isSelected() == true)
					{
						TotalScore = TotalScore + 1;
						calories = calories + 170;
					}
					if(TexmexMeat.isSelected() == true)
					{
						TotalScore = TotalScore + 1;
						calories = calories + 200;
					}
					if(GrilledMeat.isSelected() == true)
					{
						TotalScore = TotalScore + 1;
						calories = calories + 150;
					}
					if(IcebergLettuce.isSelected() == true)
					{
						TotalScore = TotalScore + 1;
						calories = calories + 15;
					}
					if(DicedTomato.isSelected() == true)
					{
						TotalScore = TotalScore + 1;
						calories = calories + 20;
					}
					if(SalsaVerde.isSelected() == true)
					{
						TotalScore = TotalScore + 1;
						calories = calories + 10;
					}
					if(Beans.isSelected() == true)
					{
						TotalScore = TotalScore + 1;
						calories = calories + 100;
					}
					if(Queso.isSelected() == true)
					{
						TotalScore = TotalScore + 1;
						calories = calories + 100;
					}
					if(HotSauce.isSelected() == true)
					{
						TotalScore = TotalScore + 1;
						calories = calories + 0;
					}
					if(SalsaRoja.isSelected() == true)
					{
						TotalScore = TotalScore + 1;
						calories = calories + 75;
					}
					if(QuesoBlanco.isSelected() == true)
					{
						TotalScore = TotalScore + 1;
						calories = calories + 250;
					}
					if(Cheddar.isSelected() == true)
					{
						TotalScore = TotalScore - 10;
						calories = calories + 50;
					}
					if(MJack.isSelected() == true)
					{
						TotalScore = TotalScore - 5;
						calories = calories + 300;
					}
					if(Oaxaca.isSelected() == true)
					{
						TotalScore = TotalScore + 1;
						calories = calories + 100;
					}
					if(CarneAsada.isSelected() == true)
					{
						TotalScore = TotalScore + 5;
						calories = calories + 400;
					}
					if(PDGallo.isSelected() == true)
					{
						TotalScore = TotalScore + 5;
						calories = calories + 15;
					}
					if(Onions.isSelected() == true)
					{
						TotalScore = TotalScore + 5;
						calories = calories + 45;
					}
					if(Cilantro.isSelected() == true)
					{
						TotalScore = TotalScore + 5;
						calories = calories + 5;
					}
					if(Avocados.isSelected() == true)
					{
						TotalScore = TotalScore + 5;
						calories = calories + 75;
					}
					if(SourCream.isSelected() == true)
					{
						TotalScore = TotalScore + 5;
						calories = calories + 25;
					}
					if(Cotija.isSelected() == true)
					{
						TotalScore = TotalScore + 5;
						calories = calories + 20;
					}
					if(Asadero.isSelected() == true)
					{
						TotalScore = TotalScore + 5;
						calories = calories + 100;
					}
				}
				if(special==false) {
				JOptionPane.showMessageDialog(null, "Your taco scored: " + TotalScore + "/100!", "The Taco Lord " + "", JOptionPane.INFORMATION_MESSAGE);
				TacoArea.setText("" + calories + " calories");
				}

		}});
		Taco.setBounds(621, 496, 159, 30);
		contentPane.add(Taco);
		
		TacoArea = new JTextField();
		TacoArea.setFont(new Font("Malgun Gothic", Font.BOLD, 18));
		TacoArea.setBounds(735, 540, 118, 30);
		contentPane.add(TacoArea);
		TacoArea.setColumns(10);
		
		JButton CloseButton = new JButton("EXIT");
		CloseButton.setFont(new Font("Malgun Gothic", Font.BOLD, 16));
		CloseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		CloseButton.setBounds(13, 553, 118, 30);
		contentPane.add(CloseButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("\u2508\u2508\u2508\u2508\u256D\u256F\u256D\u256F\u256D\u256F\u2508\u2508\u2508\u2508\u2508\r\n\u2508\u2508\u2508\u2571\u2594\u2594\u2594\u2594\u2594\u2572\u2594\u2572\u2508\u2508\u2508\r\n\u2508\u2508\u2571\u2508\u256D\u256E\u2508\u256D\u256E\u2508\u2572\u256E\u2572\u2508\u2508\r\n\u2508\u2508\u258F\u2508\u2582\u2582\u2582\u2582\u2582\u2508\u2595\u256E\u2595\u2508\u2508\r\n\u2508\u2508\u258F\u2508\u2572\u2582\u2582\u2582\u2571\u2508\u2595\u256E\u2595\u2508\u2508\r\n\u2508\u2508\u2572\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2582\u2572\u2571\u2508\u2508");
		textArea.setBounds(359, 306, 167, 122);
		contentPane.add(textArea);
		
		JButton Clear = new JButton("Clear");
		Clear.setFont(new Font("Malgun Gothic", Font.BOLD, 16));
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CornPic.setVisible(false);
				FlourPic.setVisible(false);
				buttonGroup.clearSelection();
				CornTortilla.setSelected(false);
				FlourTortilla.setSelected(false);
				TacoArea.setText("");
				BEANNS.setText("");
				Chorizo.setSelected(false); CarneAsada.setSelected(false); Carnitas.setSelected(false); TexmexMeat.setSelected(false); GrilledMeat.setSelected(false);
				IcebergLettuce.setSelected(false); DicedTomato.setSelected(false); SalsaVerde.setSelected(false); PDGallo.setSelected(false); Onions.setSelected(false); Beans.setSelected(false); Cilantro.setSelected(false);
				Avocados.setSelected(false); SourCream.setSelected(false); Queso.setSelected(false); HotSauce.setSelected(false); SalsaRoja.setSelected(false);
				QuesoBlanco.setSelected(false); Cheddar.setSelected(false); MJack.setSelected(false); Oaxaca.setSelected(false); Cotija.setSelected(false); Asadero.setSelected(false);
			}
		});
		Clear.setBounds(13, 398, 118, 30);
		contentPane.add(Clear);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image taco = new ImageIcon(this.getClass().getResource("/e5aFQ7B.gif")).getImage();
		Image newimg = taco.getScaledInstance( 61, 57,  java.awt.Image.SCALE_SMOOTH ) ;  
		lblNewLabel_1.setIcon(new ImageIcon(newimg));
		lblNewLabel_1.setBounds(211, 13, 61, 57);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Create your own taco!");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.GREEN);
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 31));
		lblNewLabel_2.setBounds(0, 0, 891, 57);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblChooseYourTortilla = new JLabel("Choose your tortilla:");
		lblChooseYourTortilla.setForeground(Color.RED);
		lblChooseYourTortilla.setFont(new Font("Malgun Gothic", Font.PLAIN, 19));
		lblChooseYourTortilla.setBounds(6, 71, 675, 30);
		contentPane.add(lblChooseYourTortilla);
		
		JLabel lblChooseYourMeats = new JLabel("Choose your meat(s):");
		lblChooseYourMeats.setForeground(Color.RED);
		lblChooseYourMeats.setFont(new Font("Malgun Gothic", Font.PLAIN, 19));
		lblChooseYourMeats.setBounds(225, 70, 456, 30);
		contentPane.add(lblChooseYourMeats);
		
		JLabel lblChooseYourToppings = new JLabel("Choose your topping(s):");
		lblChooseYourToppings.setForeground(Color.RED);
		lblChooseYourToppings.setFont(new Font("Malgun Gothic", Font.PLAIN, 19));
		lblChooseYourToppings.setBounds(437, 71, 244, 30);
		contentPane.add(lblChooseYourToppings);
		
		JLabel lblHaveYourTaco = new JLabel("Have your taco judged by the taco lord:");
		lblHaveYourTaco.setForeground(Color.BLUE);
		lblHaveYourTaco.setFont(new Font("Malgun Gothic", Font.PLAIN, 18));
		lblHaveYourTaco.setBounds(544, 468, 338, 30);
		contentPane.add(lblHaveYourTaco);
		
		JLabel lblCaloriesPerTaco = new JLabel("Calories Per Taco:");
		lblCaloriesPerTaco.setForeground(Color.BLUE);
		lblCaloriesPerTaco.setFont(new Font("Malgun Gothic", Font.PLAIN, 18));
		lblCaloriesPerTaco.setBounds(578, 539, 160, 30);
		contentPane.add(lblCaloriesPerTaco);
		
	}
}