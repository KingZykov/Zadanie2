package lb2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class MainClass {
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setLocation(500, 500);
		frame.setTitle("My Frame");
		frame.setVisible(true);
		frame.setLayout(new GridLayout(0, 2));

		frame.add(new JLabel("тип"));
		final JComboBox<String> operationCombo = new JComboBox<String>(
				new String[] { "капучино", "американо", "эспрессо" });
		frame.add(operationCombo);

		final JCheckBox sugar = new JCheckBox("Сахар");
		frame.add(sugar);

		final JCheckBox slivki = new JCheckBox("Сливки");
		frame.add(slivki);

		frame.add(new JLabel("Количество"));
		final JTextField firstField = new JTextField("          ");
		frame.add(firstField);
		final JButton calculateButton = new JButton("сумма к выплате = ");
		frame.add(calculateButton);
		final JTextField resultField = new JTextField("          ");
		frame.add(resultField);

		calculateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				float a = 0;
				float b = 0;
				float c = 0;
				if (sugar.isSelected()) {
					b = 5;
				}
				if (slivki.isSelected()) {
					c = 25;
				}
				if (operationCombo.getSelectedItem().equals("капучино")) {
					a = 60;
				} else if (operationCombo.getSelectedItem().equals("американо")) {
					a = 50;
				} else if (operationCombo.getSelectedItem().equals("эспрессо")) {
					a = 40;
				}
				float x = Float.parseFloat(firstField.getText());
				float result = (a + b + c) * x;
				resultField.setText(String.valueOf(result));
			}
		});
	}
}
