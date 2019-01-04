package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MineSweeperGUI extends JFrame {

    private JLabel[][] field = new JLabel[9][9];

    public MineSweeperGUI() throws HeadlessException {
        super("MineSweeper ist ein Spass zu programmieren :)");
        this.setVisible(true);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents() {
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(9, 9, 3, 3));

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                JLabel label = new JLabel();
                label.setOpaque(true);
                label.setBackground(Color.black);
                label.setForeground(Color.white);
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setName(i + "" + j);
                field[i][j] = label;
                container.add(label);

                label.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent event) {
                        onButtonClick(event);
                    }

                });
            }
        }
    }

    private void onButtonClick(java.awt.event.MouseEvent event) {
        
    }

    public static void main(String[] args) {
        MineSweeperGUI gui = new MineSweeperGUI();
    }
}
