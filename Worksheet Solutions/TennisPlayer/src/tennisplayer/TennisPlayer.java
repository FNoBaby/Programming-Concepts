/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tennisplayer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;

/**
 *
 * @author jakea
 */
public class TennisPlayer extends javax.swing.JFrame {
    Border defaulltBorder;
    /**
     * Creates new form TennisPlayer
     */
    public TennisPlayer() {
        initComponents();
        defaulltBorder = itfNumField.getBorder();
        loadedPlayersSelect.setVisible(false);
        if (!playerFileExists()) {
            loadPlayersButton.setVisible(false);
        }
    }

    public boolean playerFileExists() {
        File file = new File("tennisPlayers.csv");
        return file.exists();
    }

    private java.util.List<String[]> data = new java.util.ArrayList<>();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        itfNumberLabel = new javax.swing.JLabel();
        itfNumField = new javax.swing.JTextField();
        itfNumExampleLabel = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JLabel();
        surnameField = new javax.swing.JTextField();
        yobLabel = new javax.swing.JLabel();
        numOfCompPlayedLabel = new javax.swing.JLabel();
        numOfCompPlayed = new javax.swing.JSpinner();
        playerRankingLabel = new javax.swing.JLabel();
        numOfCompWon = new javax.swing.JSpinner();
        playerRanking = new javax.swing.JComboBox<>();
        numOfCompWonLabel1 = new javax.swing.JLabel();
        yobField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        loadPlayersButton = new javax.swing.JButton();
        loadedPlayersSelect = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tennis Player");

        titleLabel.setText("Tennis Player");

        itfNumberLabel.setText("ITF Number");

        itfNumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itfNumFieldActionPerformed(evt);
            }
        });

        itfNumExampleLabel.setText("e.g. MT 123456");

        surnameLabel.setText("Surname");

        yobLabel.setText("Year of Birth");

        numOfCompPlayedLabel.setText("Number of Competitions Played");

        playerRankingLabel.setText("Ranking");

        playerRanking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BEG", "OK", "PRO" }));
        playerRanking.setEnabled(false);

        numOfCompWonLabel1.setText("Number of Competitions Won");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        loadPlayersButton.setText("Load");
        loadPlayersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadPlayersButtonActionPerformed(evt);
            }
        });

        loadedPlayersSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        loadedPlayersSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadedPlayersSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(surnameLabel)
                                .addComponent(yobLabel))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(yobField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(numOfCompWonLabel1)
                                .addComponent(numOfCompPlayedLabel)
                                .addComponent(playerRankingLabel))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(numOfCompPlayed)
                                .addComponent(numOfCompWon)
                                .addComponent(playerRanking, 0, 82, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(125, 125, 125)
                            .addComponent(submitButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loadPlayersButton)
                                .addGap(18, 18, 18)
                                .addComponent(itfNumberLabel))
                            .addComponent(loadedPlayersSelect, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(titleLabel)
                                .addGap(53, 53, 53))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(itfNumField, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itfNumExampleLabel)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addComponent(loadedPlayersSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itfNumberLabel)
                            .addComponent(itfNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itfNumExampleLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(loadPlayersButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameLabel)
                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yobLabel)
                    .addComponent(yobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numOfCompPlayedLabel)
                    .addComponent(numOfCompPlayed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numOfCompWon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numOfCompWonLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerRankingLabel))
                .addGap(27, 27, 27)
                .addComponent(submitButton)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadPlayersButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loadPlayersButtonActionPerformed
        // Reset the combo box data
        loadedPlayersSelect.removeAllItems();
        loadedPlayersSelect.addItem("Select");
        data.clear();

        File file = new File("tennisPlayers.csv");
        if (file.exists()) {
            try {
                FileReader reader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(reader);

                // Skip the first line (header)
                bufferedReader.readLine();

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] playerData = line.split(",");
                    loadedPlayersSelect.addItem(playerData[0] + " " + playerData[1]);
                    data.add(playerData);
                }

                bufferedReader.close();

                loadedPlayersSelect.setVisible(true);
            } catch (IOException e) {
                e.printStackTrace();
            }

            loadedPlayersSelect.setVisible(true);
        }
    }// GEN-LAST:event_loadPlayersButtonActionPerformed

    private void loadedPlayersSelectActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loadedPlayersSelectActionPerformed
        int selectedIndex = loadedPlayersSelect.getSelectedIndex();
        if (selectedIndex == 0) {
            resetComponents();
            return;
        } else if (selectedIndex > 0) {
            String[] selectedPlayerData = data.get(selectedIndex - 1);
            itfNumField.setText(selectedPlayerData[0]);
            surnameField.setText(selectedPlayerData[1]);
            yobField.setText(selectedPlayerData[2]);
            numOfCompPlayed.setValue(Integer.parseInt(selectedPlayerData[3]));
            numOfCompWon.setValue(Integer.parseInt(selectedPlayerData[4]));
            playerRanking.setSelectedItem(selectedPlayerData[5]);
        }
    }// GEN-LAST:event_loadedPlayersSelectActionPerformed

    private void itfNumFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_itfNumFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_itfNumFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:

        int validChecks = 0;

        // Check ITF Number
        String itfNum = itfNumField.getText();
        String countryCode = "";
        String number = "";
        for (int i = 0; i < itfNum.length(); i++) {
            if (itfNum.charAt(i) == ' ') {
                countryCode = itfNum.substring(0, i);
                number = itfNum.substring(i + 1);
                break;
            }
        }

        if (countryCode.length() != 2 || number.length() != 6) {
            // Invalid ITF Number
            // Set border to red
            itfNumField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        } else {
            validChecks++;
            itfNumField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        }

        // Check Surname
        String surname = surnameField.getText();
        if (surname.length() == 0) {
            // Invalid Surname
            // Set border to red
            surnameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        } else {
            validChecks++;
            surnameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));

        }

        // Check Year of Birth
        String yob = yobField.getText();
        if (yob.length() != 4) {
            // Invalid Year of Birth
            // Set border to red
            yobField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        } else {
            if (!yob.isBlank()) {
                if (Integer.parseInt(yob) < 1990 || Integer.parseInt(yob) > 2025) {
                    // Invalid Year of Birth
                    // Set border to red
                    yobField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
                } else {
                    validChecks++;
                    yobField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
                }
            } else {
                yobField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            }
        }

        // Check Number of Competitions Played
        int numCompPlayed = (int) numOfCompPlayed.getValue();
        if (numCompPlayed < 0) {
            // Invalid Number of Competitions Played
            // Set border to red
            numOfCompPlayed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        } else {
            validChecks++;
            numOfCompPlayed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));

        }

        // Check Number of Competitions Won
        int numCompWon = (int) numOfCompWon.getValue();
        if (numCompWon < 0) {
            // Invalid Number of Competitions Won
            // Set border to red
            numOfCompWon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        } else {
            validChecks++;
            numOfCompWon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));

        }

        // Check Ranking
        // Ranking should be calclulated with (age + gamesPlayed) * gamesWon

        // Ranking should be calculated with (age + gamesPlayed) * gamesWon
        // get the year by getting the current date
        // get the age by subtracting the year of birth from the current year
        // get the games played and games won from the form
        // calculate the ranking
        // display the ranking in the ranking field

        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        if (!yob.isEmpty() && numCompPlayed > 0 && numCompWon > 0) {
            int age = currentYear - Integer.parseInt(yob);
            int ranking = (age + numCompPlayed) * numCompWon;

            if (ranking >= 0 && ranking <= 75) {
                playerRanking.setSelectedIndex(0);
            } else if (ranking > 75 && ranking <= 250) {
                playerRanking.setSelectedIndex(1);
            } else if (ranking > 250) {
                playerRanking.setSelectedIndex(2);
            }

            validChecks++;
        }

        if (validChecks == 6) {
            // All fields are valid
            // Check if ITF Number already exists in the file

            boolean itfNumExists = false;
            File file = new File("tennisPlayers.csv");
            if (file.exists()) {
                try {
                    FileReader reader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(reader);

                    // Skip the first line (header)
                    bufferedReader.readLine();

                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        String[] playerData = line.split(",");
                        if (playerData[0].equals(itfNum)) {
                            itfNumExists = true;
                            break;
                        }
                    }

                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (itfNumExists) {
                JOptionPane.showMessageDialog(null, "ITF Number already exists. Please enter a unique ITF Number.");
                itfNumField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            } else {
                // Create a new CSV file
                // If the file already exists, append to it

                try {
                    boolean newFile = false;
                    // Create a new file
                    // Check if the file already exists
                    // If it does, append to it
                    if (!file.exists()) {
                        newFile = true;
                        file.createNewFile();
                    }
                    // Create a FileWriter object
                    FileWriter writer = new FileWriter(file, true);

                    // Write the data to the file
                    if (newFile) {
                        writer.write(
                                "ITF Number,Surname,Year of Birth,Number of Competitions Played,Number of Competitions Won,Ranking\n");
                    }
                    writer.write(itfNum + "," + surname + "," + yob + "," + numCompPlayed + "," + numCompWon + ","
                            + playerRanking.getSelectedItem()
                            + "\n");

                    // Close the writer
                    writer.close();

                    JOptionPane.showMessageDialog(null, "Data has been saved to tennisPlayers.csv");

                    loadPlayersButton.setVisible(true);

                    resetComponents();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }// GEN-LAST:event_submitButtonActionPerformed

    public void resetComponents() {
        itfNumField.setText("");
        surnameField.setText("");
        yobField.setText("");
        numOfCompPlayed.setValue(0);
        numOfCompWon.setValue(0);
        playerRanking.setSelectedIndex(0);

        
        
        itfNumField.setBorder(defaulltBorder);
        surnameField.setBorder(defaulltBorder);
        yobField.setBorder(defaulltBorder);
        numOfCompPlayed.setBorder(defaulltBorder);
        numOfCompWon.setBorder(defaulltBorder);
        playerRanking.setBorder(defaulltBorder);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TennisPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TennisPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TennisPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TennisPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TennisPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel itfNumExampleLabel;
    private javax.swing.JTextField itfNumField;
    private javax.swing.JLabel itfNumberLabel;
    private javax.swing.JButton loadPlayersButton;
    private javax.swing.JComboBox<String> loadedPlayersSelect;
    private javax.swing.JSpinner numOfCompPlayed;
    private javax.swing.JLabel numOfCompPlayedLabel;
    private javax.swing.JSpinner numOfCompWon;
    private javax.swing.JLabel numOfCompWonLabel1;
    private javax.swing.JComboBox<String> playerRanking;
    private javax.swing.JLabel playerRankingLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField surnameField;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField yobField;
    private javax.swing.JLabel yobLabel;
    // End of variables declaration//GEN-END:variables
}
