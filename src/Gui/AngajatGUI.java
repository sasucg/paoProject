package Gui;

import proiectPAO.Angajat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AngajatGUI {
    public class AngajatFrame extends JFrame {

        private AngajatService produsService = new Angajatervice();

        private JPanel p1 = new JPanel(new BorderLayout());
        private JPanel p2 = new JPanel(/*new FlowLayout(FlowLayout.LEFT)*/);

        private JLabel e1 = new JLabel("NUME:");
        private JLabel e2 = new JLabel("JOB");
        private JTextField t1 = new JTextField(10);
        private JTextField t2 = new JTextField(10);
        private JButton b1 = new JButton("ADD");

        private DefaultListModel<Angajat> model = new DefaultListModel<>();
        private JList<Angajat> list = new JList<>(model);

        public AngajatFrame() {
            super("Angajati");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(900,900);
            setLocationRelativeTo(null);

            add(p1);
            add(p2, BorderLayout.SOUTH);

            p2.add(e1);
            p2.add(t1);
            p2.add(e2);
            p2.add(t2);
            p2.add(b1);
            b1.addActionListener(ev -> adaugaAngajat());

            p1.add(list);

            list.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    if (e.getClickCount() == 2) {
                        Angajat p = list.getSelectedValue();
                        if (p != null) {
                            deleteAngajat(p);
                        }
                    }
                }

            });
            afisareProduse();

            setVisible(true);
        }

        private void adaugaAngajat() {
            String nume = t1.getText();
            double pret = Double.parseDouble(t2.getText());
            AngajatFrame angajatService;
            angajatService.adaugaAngajat(nume, pret);
            t1.setText(null);
            t2.setText(null);
            afisareProduse();
            JOptionPane.showMessageDialog(this, "Ai adaugat un angajat");
        }

        private void afisareProduse() {
            model.clear();
            List<Angajat> produse = angajatService.getAngajat);
            produse.forEach(p -> model.addElement(p));
        }

        private void deleteAngajat(Angajat p) {
            angajatService.delete(p);
            afisareProduse();
        }
    }
}
