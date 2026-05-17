import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChanger extends JFrame {
    private JPanel panel;
    private JList<String> colorList;
    private JButton changeColorButton;

    public ColorChanger() {
        // Set up the frame
        setTitle("Color Changer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the panel
        panel = new JPanel();
        add(panel, BorderLayout.CENTER);

        // Create the list box with color names
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        colorList = new JList<>(colors);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(colorList), BorderLayout.WEST);

        // Create the button
        changeColorButton = new JButton("Change Color");
        add(changeColorButton, BorderLayout.SOUTH);

        // Add action listener to the button
        changeColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColor = colorList.getSelectedValue();
                if (selectedColor != null) {
                    switch (selectedColor) {
                        case "Red":
                            panel.setBackground(Color.RED);
                            break;
                        case "Green":
                            panel.setBackground(Color.GREEN);
                            break;
                        case "Blue":
                            panel.setBackground(Color.BLUE);
                            break;
                        case "Yellow":
                            panel.setBackground(Color.YELLOW);
                            break;
                        default:
                            panel.setBackground(Color.WHITE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a color from the list.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorChanger frame = new ColorChanger();
            frame.setVisible(true);
        });
    }
}