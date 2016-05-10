package memento;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class Main extends JFrame {
	private JPanel topPanel;
	private JPanel middlePanel;
	private JPanel bottomPanel;

	private JPanel textPanel;
	private JPanel textPanel1;
	private JPanel textPanel2;
	private JPanel textPanel3;
	private JPanel textPanel4;

	private JTextField txtName;
	private JLabel lblName;

	private JTextField txtStreet;
	private JLabel lblStreet;

	private JTextField txtCity;
	private JLabel lblCity;

	private JTextField txtState;
	private JLabel lblState;

	private JTextField txtZip;
	private JLabel lblZip;

	JButton loadButton;
	JButton saveButton;
	JButton unDoButton;

	// ---------------------------------------------

	// Create a caretaker that contains the ArrayList
	// with all the articles in it. It can add and
	// retrieve articles from the ArrayList

	Caretaker caretaker = new Caretaker();

	// The originator sets the value for the article,
	// creates a new memento with a new article, and
	// gets the article stored in the current memento

	Originator originator = new Originator();

	int saveProfiles = 0, currentProfile = 0;

	// ---------------------------------------------

	public Main() {
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
		defineTextPanel();
		defineTextPanel1();
		defineTextPanel2();
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		topPanel.add(textPanel);
		topPanel.add(textPanel1);
		topPanel.add(textPanel2);
	}

	private void defineMiddlePanel() {
		middlePanel = new JPanel();
		middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		defineTextPanel3();
		defineTextPanel4();
		middlePanel.add(textPanel3);
		middlePanel.add(textPanel4);
	}

	private void defineBottomPanel() {
		bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		// button = new JButton("Submit");
		loadButton = new JButton("Load");
		saveButton = new JButton("Save");
		unDoButton = new JButton("Undo");
		saveButton.addActionListener(new SaveButtonListener());
		unDoButton.addActionListener(new UnButtonListener());
		loadButton.addActionListener(new loadButtonListener());
		bottomPanel.add(loadButton);
		bottomPanel.add(saveButton);
		bottomPanel.add(unDoButton);
	}

	private void defineTextPanel() {

		JPanel bottomText = new JPanel();
		JPanel topText = new JPanel();

		bottomText.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
		topText.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));

		lblName = new JLabel("Name");
		txtName = new JTextField(10);

		lblName.setFont(makeSmallFont(lblName.getFont()));

		bottomText.add(lblName);
		topText.add(txtName);
		textPanel = new JPanel();
		textPanel.setLayout(new BorderLayout());
		textPanel.add(bottomText, BorderLayout.NORTH);
		textPanel.add(topText, BorderLayout.CENTER);
	}

	private void defineTextPanel1() {

		JPanel bottomText1 = new JPanel();
		JPanel topText1 = new JPanel();

		bottomText1.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 0));
		topText1.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 0));

		lblStreet = new JLabel("Street");
		txtStreet = new JTextField(10);

		lblStreet.setFont(makeSmallFont(lblStreet.getFont()));

		bottomText1.add(lblStreet);
		topText1.add(txtStreet);
		textPanel1 = new JPanel();
		textPanel1.setLayout(new BorderLayout());
		textPanel1.add(bottomText1, BorderLayout.NORTH);
		textPanel1.add(topText1, BorderLayout.CENTER);
	}

	private void defineTextPanel2() {

		JPanel bottomText2 = new JPanel();
		JPanel topText2 = new JPanel();

		bottomText2.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 0));
		topText2.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 0));

		lblCity = new JLabel("City");
		txtCity = new JTextField(10);

		lblCity.setFont(makeSmallFont(lblCity.getFont()));

		bottomText2.add(lblCity);
		topText2.add(txtCity);
		textPanel2 = new JPanel();
		textPanel2.setLayout(new BorderLayout());
		textPanel2.add(bottomText2, BorderLayout.NORTH);
		textPanel2.add(topText2, BorderLayout.CENTER);
	}

	private void defineTextPanel3() {

		JPanel bottomText3 = new JPanel();
		JPanel topText3 = new JPanel();

		bottomText3.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
		topText3.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));

		lblState = new JLabel("State");
		txtState = new JTextField(10);

		lblState.setFont(makeSmallFont(lblState.getFont()));

		bottomText3.add(lblState);
		topText3.add(txtState);
		textPanel3 = new JPanel();
		textPanel3.setLayout(new BorderLayout());
		textPanel3.add(bottomText3, BorderLayout.NORTH);
		textPanel3.add(topText3, BorderLayout.CENTER);
	}

	private void defineTextPanel4() {

		JPanel bottomText4 = new JPanel();
		JPanel topText4 = new JPanel();

		bottomText4.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
		topText4.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));

		lblZip = new JLabel("Zip");
		txtZip = new JTextField(10);

		lblZip.setFont(makeSmallFont(lblZip.getFont()));

		bottomText4.add(lblZip);
		topText4.add(txtZip);
		textPanel4 = new JPanel();
		textPanel4.setLayout(new BorderLayout());
		textPanel4.add(bottomText4, BorderLayout.NORTH);
		textPanel4.add(topText4, BorderLayout.CENTER);
	}

	private void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Memento Design Pattern");
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
				Main m = new Main();
				m.setVisible(true);
			}
		});
	}

	class SaveButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String textName = txtName.getText();
			String textStreet = txtStreet.getText();
			String textCity = txtCity.getText();
			String textState = txtState.getText();
			String textZip = txtZip.getText();

			if (textName.equals("") || textStreet.equals("")
					|| textCity.equals("") || textState.equals("")
					|| textZip.equals("")) {

				showMessage("Please fill the form");
			} else {
				txtName.setText("");
				txtStreet.setText("");
				txtCity.setText("");
				txtState.setText("");
				txtZip.setText("");
				UserProfile userProfile = new UserProfile(textName, textStreet,
						textCity, textState, textZip);

				// Set the value for the current memento

				originator.set(userProfile);

				// Add new article to the ArrayList

				caretaker.addMemento(originator.storeInMemento());

				// saveProfiles monitors how many articles are saved
				// currentArticle monitors the current article displayed

				saveProfiles++;

				System.out.println("Save profile " + saveProfiles);
			}
		}
	}

	class UnButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {

			// Decrement to the current article displayed

			// Get the older article saved and display it in JTextArea

			UserProfile userProfile = originator.restoreFromMemento(caretaker
					.getMemento(currentProfile));
			System.out.println("user profile>>>>>>> " + userProfile);
			txtName.setText(userProfile.getName());
			txtCity.setText(userProfile.getCity());
			txtState.setText(userProfile.getState());
			txtStreet.setText(userProfile.getStreet());
			txtZip.setText(userProfile.getZip());
			++currentProfile;
		}
	}

	class loadButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {

			// Decrement to the current article displayed

			// Get the older article saved and display it in JTextArea

			UserProfile userProfile = originator.restoreFromMemento(caretaker
					.getMemento(currentProfile));
			System.out.println("user profile>>>>>>> " + userProfile);
			if (userProfile == null) {
				showMessage("No User Profile please enter User Profile");
				
			} else {
				txtName.setText(userProfile.getName());
				txtCity.setText(userProfile.getCity());
				txtState.setText(userProfile.getState());
				txtStreet.setText(userProfile.getStreet());
				txtZip.setText(userProfile.getZip());
			}

		}
	}

	private void showMessage(String message) {
		JOptionPane.showMessageDialog(this, message, "Error",
				JOptionPane.ERROR_MESSAGE); // could also be INFORMATION_MESSAGE
	}

	private static final long serialVersionUID = 3618976789175941431L;

}
