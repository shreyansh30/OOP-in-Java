import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class querybutton {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Query Executor");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create components
        JLabel queryLabel = new JLabel("Enter Query:");
        JTextField queryField = new JTextField(30);
        JButton executeButton = new JButton("Execute Query");
        JTextArea outputArea = new JTextArea(5, 40);
        outputArea.setEditable(false);
        outputArea.setVisible(false); // Initially hidden

        // Add action listener to the button
        executeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String query = queryField.getText();
                // Simulate query execution
                if (query.equalsIgnoreCase("select mark from student where rollno= 2205230")) {
                    outputArea.setText("82");
                } else {
                    outputArea.setText("Invalid query or no data found.");
                }
                outputArea.setVisible(true); // Show the output area
            }
        });

        // Add components to the frame
        frame.add(queryLabel);
        frame.add(queryField);
        frame.add(executeButton);
        frame.add(new JScrollPane(outputArea));

        // Make the frame visible
        frame.setVisible(true);
    }
}