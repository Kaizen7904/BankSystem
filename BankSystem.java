package renting;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.io.*;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class BankingSystem extends JFrame {
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5; // New Transfer Button
    private JButton jButton6;
    private JButton jButton7;
    private JButton saveButton; // Save Button
    private JButton loadButton; // Load Button
    private JLabel jLabel1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JPanel infoPanel;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem3;
    private JMenuItem jMenuItem4;
    private JMenuItem jMenuItem5;
    private JMenuItem jMenuItem6;
    private JMenuItem jMenuItem7;
    private JSeparator jSeparator1;

    private Account acc;
    private Client client;
    private ArrayList<Transaction> transactions;

    public BankingSystem() {
        initComponents();
        transactions = new ArrayList<>();
    }

    private void initComponents() {
        jLabel1 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton(); // New Transfer Button
        jButton6 = new JButton();
        jButton7 = new JButton();
        saveButton = new JButton(); // Save Button
        loadButton = new JButton(); // Load Button
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jSeparator1 = new JSeparator();
        jMenuItem3 = new JMenuItem();
        jMenuItem4 = new JMenuItem();
        jMenu2 = new JMenu();
        jMenuItem5 = new JMenuItem();
        jMenuItem6 = new JMenuItem();
        jMenuItem7 = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new Font("Tahoma", 1, 18));
        jLabel1.setText("Banking System");

        jButton1.setText("Create Account");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Deposit");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Withdraw");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Check Balance");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Transfer"); // New Transfer Button
        jButton5.setEnabled(false);
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Exit");
        jButton6.setEnabled(false);
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Log Out");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

       saveButton = new JButton(); // Correct declaration
saveButton.setText("Save");
saveButton.setEnabled(true);
saveButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        saveButtonActionPerformed(evt);
    }
});

        loadButton= new JButton(); // Correct declaration
loadButton.setText("Load");
loadButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent evt) {
        loadButtonActionPerformed(evt);
    }
});
  

        jMenu1.setText("File");

    jMenuItem1.setText("Save");
    jMenuItem1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            jMenuItem1ActionPerformed(evt);
        }
    });
    jMenu1.add(jMenuItem1);
    jMenu1.add(jSeparator1);

    jMenuItem3.setText("Load");
    jMenuItem3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            jMenuItem3ActionPerformed(evt);
        }
    });
    jMenu1.add(jMenuItem3);

    jMenuItem4.setText("Exit");
    jMenuItem4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            jMenuItem4ActionPerformed(evt);
        }
    });
    jMenu1.add(jMenuItem4);

    jMenuBar1.add(jMenu1);

    jMenu2.setText("Account");

    jMenuItem5.setText("Deposit");
    jMenuItem5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            jMenuItem5ActionPerformed(evt);
        }
    });
    jMenu2.add(jMenuItem5);

    jMenuItem6.setText("Withdraw");
    jMenuItem6.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            jMenuItem6ActionPerformed(evt);
        }
    });
    jMenu2.add(jMenuItem6);

    jMenuItem7.setText("Transfer");
    jMenuItem7.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            jMenuItem7ActionPerformed(evt);
        }
    });
    
    jMenu2.add(jMenuItem7);

    jMenuBar1.add(jMenu2);

    setJMenuBar(jMenuBar1);
    infoPanel = new JPanel();
    infoPanel.setLayout(new BorderLayout());
    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addComponent(jLabel1))
                .addGroup(layout.createSequentialGroup()
                    .addGap(181, 181, 181)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loadButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(infoPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addContainerGap(125, Short.MAX_VALUE))
);

layout.setVerticalGroup(
    layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(29, 29, 29)
            .addComponent(jLabel1)
            .addGap(41, 41, 41)
            .addComponent(jButton1)
            .addGap(18, 18, 18)
            .addComponent(jButton2)
            .addGap(18, 18, 18)
            .addComponent(jButton3)
            .addGap(18, 18, 18)
            .addComponent(jButton4)
            .addGap(18, 18, 18)
            .addComponent(jButton5)
            .addGap(18, 18, 18)
            .addComponent(jButton6)
            .addGap(18, 18, 18)
            .addComponent(jButton7)
            .addGap(18, 18, 18)
            .addComponent(saveButton)
            .addGap(18, 18, 18)
            .addComponent(loadButton)
            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(infoPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap(54, Short.MAX_VALUE))
);

    pack();
} 

    private void jButton1ActionPerformed(ActionEvent evt) {
    String accountHolderName = JOptionPane.showInputDialog(this, "Enter Account Holder Name:");
    if (accountHolderName != null && !accountHolderName.trim().isEmpty()) { // Check if the input is not null or empty
        String accountNumberString = JOptionPane.showInputDialog(this, "Enter Account Number:");
        if (accountNumberString != null && !accountNumberString.trim().isEmpty()) { // Check if the input is not null or empty
            long accountNumber = Long.parseLong(accountNumberString);
            acc = new Account(accountHolderName, accountNumber);
            JOptionPane.showMessageDialog(this, "Account created successfully!");
            enableAccountActions();

            String name = JOptionPane.showInputDialog(this, "Enter Client Name:");
            if (name != null && !name.trim().isEmpty()) { // Check if the input is not null or empty
                String address = JOptionPane.showInputDialog(this, "Enter Client Address:");
                if (address != null && !address.trim().isEmpty()) { // Check if the input is not null or empty
                    String phoneNumber = JOptionPane.showInputDialog(this, "Enter Client Phone Number:");
                    if (phoneNumber != null && !phoneNumber.trim().isEmpty()) { // Check if the input is not null or empty
                        client = new Client(name, address, phoneNumber);
                    } else {
                        // Handle empty or cancel input for phone number
                        JOptionPane.showMessageDialog(this, "Invalid phone number. Client creation canceled.");
                        client = null;
                    }
                } else {
                    // Handle empty or cancel input for address
                    JOptionPane.showMessageDialog(this, "Invalid address. Client creation canceled.");
                    client = null;
                }
            } else {
                // Handle empty or cancel input for name
                JOptionPane.showMessageDialog(this, "Invalid name. Client creation canceled.");
                client = null;
            }
        } else {
            // Handle empty or cancel input for account number
            JOptionPane.showMessageDialog(this, "Invalid account number. Account creation canceled.");
            acc = null;
            disableAccountActions();
        }
    } else {
        // Handle empty or cancel input for account holder name
        JOptionPane.showMessageDialog(this, "Invalid account holder name. Account creation canceled.");
        acc = null;
        disableAccountActions();
    }
}


    private void jButton2ActionPerformed(ActionEvent evt) {
    if (acc != null) {
        String description = JOptionPane.showInputDialog(this, "Enter the desired amount:");
        if (description != null && !description.trim().isEmpty()) { // Check if the input is not null or empty
            double amount = Double.parseDouble(description);
            Transaction transaction = new Transaction(LocalDateTime.now(), description, amount);
            transactions.add(transaction);
            acc.deposit(amount);
            JOptionPane.showMessageDialog(this, "Amount deposited successfully!");
        }
    } else {
        JOptionPane.showMessageDialog(this, "No account exists. Create an account first.");
    }
}


   private void jButton3ActionPerformed(ActionEvent evt) {
    if (acc != null) {
        String amountString = JOptionPane.showInputDialog(this, "Enter Amount to Withdraw:");
        if (amountString != null && !amountString.trim().isEmpty()) { // Check if the input is not null or empty
            double amount = Double.parseDouble(amountString);
            if (acc.withdraw(amount)) {
                JOptionPane.showMessageDialog(this, "Amount withdrawn successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Insufficient balance!");
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "No account exists. Create an account first.");
    }
}


    private void jButton4ActionPerformed(ActionEvent evt) {
    if (acc != null) {
        StringBuilder sb = new StringBuilder();
        sb.append("Client Name: ").append(client.getName()).append("\n");
        sb.append("Client Address: ").append(client.getAddress()).append("\n");
        sb.append("Client Phone Number: ").append(client.getPhoneNumber()).append("\n");
        sb.append("Account Holder Name: ").append(acc.getAccountHolderName()).append("\n");
        sb.append("Account Number: ").append(acc.getAccountNumber()).append("\n");
        sb.append("Account Balance: ").append(acc.getBalance()).append("\n");
        sb.append("Transactions:\n");
        for (Transaction transaction : transactions) {
            sb.append(transaction.getTimestamp()).append(" - ");
            sb.append(transaction.getDescription()).append(": ");
            sb.append(transaction.getAmount()).append("\n");
        }
        JOptionPane.showMessageDialog(this, sb.toString());
    } else {
        JOptionPane.showMessageDialog(this, "No account exists. Create an account first.");
    }
}


   private void jButton5ActionPerformed(ActionEvent evt) {
    if (acc != null) {
        String description = JOptionPane.showInputDialog(this, "Enter Transaction Description:");
        if (description == null) {
            return; // Cancel button pressed, exit the method
        }
        
        String amountString = JOptionPane.showInputDialog(this, "Enter Transaction Amount:");
        if (amountString == null) {
            return; // Cancel button pressed, exit the method
        }
        
        String receiverAccountNumberString = JOptionPane.showInputDialog(this, "Enter Receiver's Account Number:");
        if (receiverAccountNumberString == null) {
            return; // Cancel button pressed, exit the method
        }
        
        double amount;
        try {
            amount = Double.parseDouble(amountString);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid amount entered.");
            return; // Exit the method if amount is not a valid number
        }
        
        long receiverAccountNumber;
        try {
            receiverAccountNumber = Long.parseLong(receiverAccountNumberString);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid receiver's account number entered.");
            return; // Exit the method if receiver's account number is not a valid number
        }
        
        Account receiverAccount = findAccount(receiverAccountNumber);
        if (receiverAccount != null) {
            Transaction transaction = new Transaction(LocalDateTime.now(), description, amount);
            transactions.add(transaction);
            acc.transfer(receiverAccount, amount);
            JOptionPane.showMessageDialog(this, "Amount transferred successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Receiver's account does not exist.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "No account exists. Create an account first.");
    }
}


    private Account findAccount(long accountNumber) {
        // Logic to search for an account based on the account number
        // and return the account object if found, otherwise return null.
        return null;
    }

    private void jButton6ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Thank you for using our banking system!");
        System.exit(0);
    }

    private void jButton7ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Logging out...");
        acc = null;
        disableAccountActions();
    }
   private void saveButtonActionPerformed(ActionEvent evt) {
    // Get the entered information
    String clientName = jTextField1.getText();
    String phoneNumber = jTextField2.getText();
    String address = jTextField3.getText();
    String accountNumber = jTextField4.getText();
    
    // Create a string representation of the information
    String info = "Client Name: " + clientName + "\n" +
                  "Phone Number: " + phoneNumber + "\n" +
                  "Address: " + address + "\n" +
                  "Account Number: " + accountNumber;
    
    try {
        // Open the file in append mode
        FileWriter fileWriter = new FileWriter("Banking.txt", true);
        
        // Write the information to the file
        fileWriter.write(info + "\n\n");
        
        // Close the file
        fileWriter.close();
        
        // Display a success message
        JOptionPane.showMessageDialog(this, "Information saved successfully!");
    } catch (IOException ex) {
        // Display an error message if the file cannot be saved
        JOptionPane.showMessageDialog(this, "Error saving information: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}


private void loadButtonActionPerformed(ActionEvent evt) {
    try {
        // Read the contents of the file
        FileReader fileReader = new FileReader("Banking.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        StringBuilder infoBuilder = new StringBuilder();
        String line;
        
        while ((line = bufferedReader.readLine()) != null) {
            infoBuilder.append(line);
            infoBuilder.append("\n");
        }
        
        // Close the file
        bufferedReader.close();
        
        // Set the loaded information in the infoPanel
        JTextArea infoTextArea = new JTextArea(infoBuilder.toString());
        infoTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(infoTextArea);
        infoPanel.removeAll();
        infoPanel.add(scrollPane);
        infoPanel.revalidate();
        infoPanel.repaint();
    } catch (IOException ex) {
        // Display an error message if the file cannot be loaded
        JOptionPane.showMessageDialog(this, "Error loading information: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void jMenuItem1ActionPerformed(ActionEvent evt) {
        jButton1ActionPerformed(evt);
    }

    private void jMenuItem3ActionPerformed(ActionEvent evt) {
        jButton2ActionPerformed(evt);
    }

    private void jMenuItem4ActionPerformed(ActionEvent evt) {
        jButton3ActionPerformed(evt);
    }

    private void jMenuItem5ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "This is a simple banking system.");
    }

    private void jMenuItem6ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "For support, please email us at support@bankingsystem.com");
    }

    private void jMenuItem7ActionPerformed(ActionEvent evt) {
        jButton6ActionPerformed(evt);
    }

    private void enableAccountActions() {
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        saveButton.setEnabled(true);
       
        
    }

    private void disableAccountActions() {
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false); 
        
        
        
    }

    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankingSystem().setVisible(true);
            }
        });
    }
}
