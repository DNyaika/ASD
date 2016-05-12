package state.labSoln;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class Client extends JFrame {
	private JPanel topPanel;
	private JPanel middlePanel;
	private JPanel bottomPanel;

	private JPanel buttonPanel;
	private JPanel buttonPanel1;
	private JPanel buttonPanel2;
	private JPanel buttonPanel3;
	private JPanel stateChoices;

	private JButton left;
	private JButton right;

	private JButton accel;
	private JButton brake;

	JComboBox<State> states;

	private JTextField result;

	private State selectedState;
	private CarController carController = new CarController();

	public Client() {
		initializeWindow();
		JPanel mainPanel = new JPanel();
		defineTopPanel();
		defineMiddlePanel();
		defineBottomPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(middlePanel, BorderLayout.CENTER);
		mainPanel.add(bottomPanel, BorderLayout.PAGE_END);
		getContentPane().add(mainPanel);
	}

	private void defineTopPanel() {
		topPanel = new JPanel();
		defineButtonPanel();
		defineButtonPanel1();
		defineButtonPanel2();
		defineButtonPanel3();
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		topPanel.add(buttonPanel);
		topPanel.add(buttonPanel1);
		topPanel.add(buttonPanel2);
		topPanel.add(buttonPanel3);
	}

	private void defineMiddlePanel() {
		middlePanel = new JPanel();
		middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		defineTextPanel4();

		middlePanel.add(stateChoices);
	}

	private void defineBottomPanel() {
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		result = new JTextField(15);
		// button.addActionListener(new MyButtonListener());
		bottomPanel.add(result);
	}

	private void defineButtonPanel() {
		JPanel leftPanel = new JPanel();
		left = new JButton("Left");
		left.setEnabled(false);
		left.addActionListener(new LeftListener());
		leftPanel.add(left);
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new BorderLayout());
		buttonPanel.add(leftPanel, BorderLayout.NORTH);
	}

	private void defineButtonPanel1() {
		JPanel rightPanel = new JPanel();
		right = new JButton("Right");
		right.setEnabled(false);
		right.addActionListener(new RightListener());
		rightPanel.add(right);

		buttonPanel1 = new JPanel();
		buttonPanel1.setLayout(new BorderLayout());
		buttonPanel1.add(rightPanel, BorderLayout.NORTH);
	}

	private void defineButtonPanel2() {

		JPanel brakePanel = new JPanel();
		brake = new JButton("Brake");
		brake.setEnabled(false);
		brake.addActionListener(new BrakeListener());
		brakePanel.add(brake);
		buttonPanel2 = new JPanel();
		buttonPanel2.setLayout(new BorderLayout());
		buttonPanel2.add(brakePanel, BorderLayout.NORTH);
	}

	private void defineButtonPanel3() {
		JPanel accelPanel = new JPanel();
		accel = new JButton("Accel");
		accel.setEnabled(false);
		accel.addActionListener(new AccelListener());
		accelPanel.add(accel);

		buttonPanel3 = new JPanel();
		buttonPanel3.setLayout(new BorderLayout());
		buttonPanel3.add(accelPanel, BorderLayout.NORTH);

	}

	private void defineTextPanel4() {
		State[] controlstates = { carController.getRegularState(),carController.getGravelState(), carController.getWetState(),
				carController.getIceState() };
		JPanel statesMenu = new JPanel();
		states = new JComboBox<>(controlstates);
		statesMenu.add(states);
		states.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				@SuppressWarnings("unchecked")
				JComboBox<State> combo = (JComboBox<State>) event.getSource();
				selectedState = (State) combo.getSelectedItem();
				brake.setEnabled(true);
				accel.setEnabled(true);
				right.setEnabled(true);
				left.setEnabled(true);
			}
		});

		stateChoices = new JPanel();
		stateChoices.setLayout(new BorderLayout());
		stateChoices.add(statesMenu, BorderLayout.NORTH);
	}

	private void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("State Pattern");
		centerFrameOnDesktop(this);
		setSize(500, 200);
		setResizable(false);
	}

	public static Font makeSmallFont(Font f) {
		return new Font(f.getName(), f.getStyle(), (f.getSize() - 2));
	}

	public static void centerFrameOnDesktop(Component f) {
		final int SHIFT_AMOUNT = 0;
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		f.setLocation(((width - frameWidth) / 2) - SHIFT_AMOUNT,
				(height - frameHeight) / 3);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				Client cl = new Client();
				cl.setVisible(true);
			}
		});
	}

	class LeftListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			carController.setState(selectedState);
			result.setText("Left, "+selectedState+" = " + carController.left());
			disabeButtons();
		}
	}

	class RightListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			carController.setState(selectedState);
			result.setText("Right, "+selectedState+" = " + carController.right());
			disabeButtons();
		}
	}

	class BrakeListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			carController.setState(selectedState);
			result.setText("Brake, "+selectedState+" = " + carController.brake());
			disabeButtons();
		}
	}

	class AccelListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			carController.setState(selectedState);
			result.setText("Accel, "+selectedState+" = " + carController.accel());
			disabeButtons();
		}
	}

	private void showMessage(String message) {
		JOptionPane.showMessageDialog(this, message, "Error",
				JOptionPane.ERROR_MESSAGE); // could also be INFORMATION_MESSAGE
	}
	
	public void disabeButtons(){
		right.setEnabled(false);
		left.setEnabled(false);
		brake.setEnabled(false);
		accel.setEnabled(false);
	}

	private static final long serialVersionUID = 3618976789175941431L;

}