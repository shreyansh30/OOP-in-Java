import javax.swing.*;
import java.awt.*;

public class swing {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Add a label
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        frame.add(nameLabel);

        // Add a text field
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 200, 30);
        frame.add(nameField);

        // Add a text area
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 100, 100, 30);
        frame.add(addressLabel);

        JTextArea addressArea = new JTextArea();
        addressArea.setBounds(150, 100, 200, 60);
        frame.add(addressArea);

        // Add checkboxes
        JLabel hobbiesLabel = new JLabel("Hobbies:");
        hobbiesLabel.setBounds(50, 180, 100, 30);
        frame.add(hobbiesLabel);

        JCheckBox readingCheckBox = new JCheckBox("Reading");
        readingCheckBox.setBounds(150, 180, 100, 30);
        frame.add(readingCheckBox);

        JCheckBox travelingCheckBox = new JCheckBox("Traveling");
        travelingCheckBox.setBounds(250, 180, 100, 30);
        frame.add(travelingCheckBox);

        // Add radio buttons
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 230, 100, 30);
        frame.add(genderLabel);

        JRadioButton maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setBounds(150, 230, 100, 30);
        frame.add(maleRadioButton);

        JRadioButton femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setBounds(250, 230, 100, 30);
        frame.add(femaleRadioButton);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        // Add a button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 300, 100, 30);
        frame.add(submitButton);

        // Add an image
        JLabel imageLabel = new JLabel(new ImageIcon("path/to/your/image.jpg"));
        imageLabel.setBounds(50, 350, 300, 100);
        frame.add(imageLabel);

        // Set frame visibility
        frame.setVisible(true);
    }
}