import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form extends JFrame {

    public Form() {

//      judul frame
        setTitle("C O B A  Y U K");
        setSize(380, 320);
        setDefaultCloseOperation(3);
        setSize(800, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null); // set layout
        JLabel judul = new JLabel("T U G A S ");
        add(judul);
        judul.setBounds(360, 20, 150, 20);

//      radio button
        ButtonGroup group = new ButtonGroup();
        JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");
        ljeniskelamin.setBounds(10, 50, 120, 20);
        add(ljeniskelamin);
        JRadioButton rbPria = new JRadioButton(" Laki-Laki "); // input menggunakan radio button
        rbPria.setBounds(130, 50, 100, 20);
        add(rbPria);
        group.add(rbPria);
        JRadioButton rbWanita = new JRadioButton("Perempuan ");// input juga menggunakan radio button
        rbWanita.setBounds(230, 50, 100, 20);
        add(rbWanita);
        group.add(rbWanita);
        JTextField hjk = new JTextField();
        hjk.setBounds(400, 50, 100, 20);
        add(hjk);

        rbPria.addItemListener((ItemEvent event) -> {
            if (event.getSource() == rbPria) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    hjk.setText("Laki-Laki");
                }
            }
        });
        rbWanita.addItemListener((ItemEvent event) -> {
            if (event.getSource() == rbWanita) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    hjk.setText("Perempuan");
                }
            }
        });

//      combo box
        JLabel lagama = new JLabel(" Agama ");
        String[] namaAgama
                = {"Islam", "Kristen", "Katolik", "Hindu", "Budha", "Konghucu"};

        lagama.setBounds(10, 80, 150, 20);
        add(lagama);
        JComboBox cmbAgama = new JComboBox(namaAgama); // input menggunakan combo box (yang bisa dipilih salah satu)
        cmbAgama.setBounds(130, 80, 150, 20);
        add(cmbAgama);
        JTextField ha = new JTextField();
        ha.setBounds(400, 80, 150, 20);
        add(ha);

        cmbAgama.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (cmbAgama.getSelectedIndex() == 0) {
                    ha.setText("Islam");
                } else if (cmbAgama.getSelectedIndex() == 1) {
                    ha.setText("Kristen");
                } else if (cmbAgama.getSelectedIndex() == 2) {
                    ha.setText("Katholik");
                } else if (cmbAgama.getSelectedIndex() == 3) {
                    ha.setText("Hindu");
                } else if (cmbAgama.getSelectedIndex() == 4) {
                    ha.setText("Budha");
                }
            }
        });

//      check box
        JLabel lhobby = new JLabel(" Hobby ");
        lhobby.setBounds(10, 110, 120, 20);
        add(lhobby);
        JCheckBox cbDance = new JCheckBox(" Dance ");
        cbDance.setBounds(130, 110, 100, 20);
        add(cbDance);
        JCheckBox cbBasket = new JCheckBox(" Basket ");
        cbBasket.setBounds(230, 110, 150, 20);
        add(cbBasket);
        JTextField hh = new JTextField();
        hh.setBounds(400, 110, 150, 20);
        add(hh);
        cbBasket.addItemListener((ItemEvent event) -> {
            if (event.getSource() == cbBasket) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    hh.setText("Basket");
                }
            }
        });
        cbDance.addItemListener((ItemEvent event) -> {
            if (event.getSource() == cbDance) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    hh.setText("Dance");
                }
            }
        });

//      pilihan untuk terkhir
        JLabel labelHobi = new JLabel("AYO!!!");
        add(labelHobi);
        labelHobi.setBounds(360, 210, 150, 20);

        JTextField chill = new JTextField("Chill");
        JTextField santuy = new JTextField("Santuy");
        JTextField sibuck = new JTextField("Sibuck");
        JTextField kuy = new JTextField("kuy");
        JTextField hasilJll = new JTextField();
        JTextField hasilnyaJll = new JTextField();
        Font font = new Font("SanSerif", Font.BOLD, 20);
        Font font1 = new Font("SanSerif", Font.BOLD, 10);
        add(chill);
        chill.setBounds(25, 230, 150, 20);
        chill.setEditable(false);
        chill.setHorizontalAlignment(JTextField.CENTER);
        chill.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                hasilJll.setText(chill.getText());
            }
        });
        add(santuy);
        santuy.setBounds(225, 230, 150, 20);
        santuy.setEditable(false);
        santuy.setHorizontalAlignment(JTextField.CENTER);
        santuy.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                hasilJll.setText(santuy.getText());
            }
        });
        add(sibuck);
        sibuck.setBounds(425, 230, 150, 20);
        sibuck.setEditable(false);
        sibuck.setHorizontalAlignment(JTextField.CENTER);
        sibuck.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                hasilJll.setText(sibuck.getText());
            }
        });
        add(kuy);
        kuy.setBounds(625, 230, 150, 20);
        kuy.setEditable(false);
        kuy.setHorizontalAlignment(JTextField.CENTER);
        kuy.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                hasilJll.setText(kuy.getText());
            }
        });
        add(hasilJll);
        hasilJll.setBounds(25, 260, 750, 50);
        hasilJll.setEditable(false);
        hasilJll.setFont(font);
        hasilJll.setHorizontalAlignment(JTextField.CENTER);



        setVisible(true);


    }
}