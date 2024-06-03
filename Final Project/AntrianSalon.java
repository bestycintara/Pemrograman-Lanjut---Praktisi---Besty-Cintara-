import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

public class NailArtQueueSystem extends JFrame {
    private Queue<String> queue;
    private DefaultListModel<String> queueModel;
    private JList<String> queueList;
    private JTextField nameField;

    public NailArtQueueSystem() {
        queue = new LinkedList<>();
        queueModel = new DefaultListModel<>();
        queueList = new JList<>(queueModel);

        setTitle("Sistem Antrian Salon Nail Art");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel utama
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Panel antrian
        JPanel queuePanel = new JPanel();
        queuePanel.setBorder(BorderFactory.createTitledBorder("Antrian"));
        queuePanel.setLayout(new BorderLayout());

        queueList.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(queueList);
        queuePanel.add(scrollPane, BorderLayout.CENTER);

        // Panel kontrol
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        nameField = new JTextField(20);
        JButton addButton = new JButton("Tambah ke Antrian");
        JButton removeButton = new JButton("Hapus dari Antrian");

        controlPanel.add(nameField);
        controlPanel.add(addButton);
        controlPanel.add(removeButton);

        // Menambahkan panel ke panel utama
        mainPanel.add(queuePanel, BorderLayout.CENTER);
        mainPanel.add(controlPanel, BorderLayout.SOUTH);

        // Menambahkan panel utama ke frame
        add(mainPanel);

        // Event listener untuk tombol tambah
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                if (!name.isEmpty()) {
                    queue.add(name);
                    updateQueueList();
                    nameField.setText("");
                } else {
                    JOptionPane.showMessageDialog(NailArtQueueSystem.this,
                            "Nama tidak boleh kosong!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // Event listener untuk tombol hapus
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = queueList.getSelectedIndex();
                if (selectedIndex != -1) {
                    queue.remove(queueModel.getElementAt(selectedIndex));
                    updateQueueList();
                } else {
                    JOptionPane.showMessageDialog(NailArtQueueSystem.this,
                            "Pilih item dari antrian untuk dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    private void updateQueueList() {
        queueModel.clear();
        int index = 1;
        for (String name : queue) {
            queueModel.addElement(index++ + ". " + name);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NailArtQueueSystem().setVisible(true);
            }
        });
    }
}
