/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package worksheet15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JOptionPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author jakea
 */
public class NotepadWannabe extends javax.swing.JFrame {

    /**
     * Creates new form NotepadWannabe
     */
    public NotepadWannabe() {
        initComponents();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (isDirty) {
                    Object[] options = {"Save", "Discard", "Cancel"};
                    int option = JOptionPane.showOptionDialog(
                            NotepadWannabe.this,
                            "You have unsaved changes. Do you want to save them?",
                            "Unsaved Changes",
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.WARNING_MESSAGE,
                            null,
                            options,
                            options[0]
                    );
                    if (option == JOptionPane.YES_OPTION) {
                        String filePath = showSaveDialogAndGetPath();
                        setTitle(filePath);
                        if (filePath != null) {
                            writeToTextFile(filePath, MainTextArea.getText());
                            currentFilePath = filePath;
                            originalContent = MainTextArea.getText();
                            setTitle(getTitle().replace(" *", ""));
                            isDirty = true;
                            SaveMenuItem.setEnabled(true);
                        }
                        if (!isDirty) {
                            System.exit(0);
                        }
                    } else if (option == JOptionPane.NO_OPTION) {
                        System.exit(0);
                    }
                    // Do nothing if Cancel is selected
                } else {
                    System.exit(0);
                }
            }
        });
    }

    public static String readTextFile(String filePath) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }

    public static ArrayList<String> getFileList(String directory) {
        ArrayList<String> files = new ArrayList<>();
        try {
            Files.list(Paths.get(directory)).forEach(filePath -> {
                if (Files.isRegularFile(filePath)) {
                    files.add(filePath.toString());
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return files;
    }

    public static ArrayList<String> filterTxt(ArrayList<String> allFiles) {
        ArrayList<String> txtFiles = new ArrayList<>();
        for (String file : allFiles) {
            if (file.endsWith(".txt")) {
                txtFiles.add(file);
            }
        }

        return txtFiles;
    }

    public static void writeToTextFile(String filePath, String toWrite) {
        try {
            Files.write(Paths.get(filePath), toWrite.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String showOpenDialogAndGetPath() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
        fileChooser.setFileFilter(filter);
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile().getPath();
        } else {
            System.out.println("No file selected");
            return null;
        }
    }

    public static String showSaveDialogAndGetPath() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
        fileChooser.setFileFilter(filter);
        int returnValue = fileChooser.showSaveDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getPath();
            if (!filePath.endsWith(".txt")) {
                filePath += ".txt";
            }
            return filePath;
        } else {
            System.out.println("No file selected");
            return null;
        }
    }

    private String currentFilePath = null;
    private boolean isDirty = false;
    private String originalContent = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        MainTextArea = new javax.swing.JTextArea();
        wordCountLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        OpenMenuItem = new javax.swing.JMenuItem();
        SaveAsMenuItem = new javax.swing.JMenuItem();
        SaveMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ExitMenuItem = new javax.swing.JMenuItem();
        helpButton = new javax.swing.JMenu();
        aboutButton = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainTextArea.setColumns(20);
        MainTextArea.setRows(5);
        MainTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MainTextAreaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(MainTextArea);

        wordCountLabel.setText("0 words");

        jMenu1.setText("File");

        OpenMenuItem.setText("Open");
        OpenMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(OpenMenuItem);

        SaveAsMenuItem.setText("Save As");
        SaveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveAsMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(SaveAsMenuItem);

        SaveMenuItem.setText("Save");
        SaveMenuItem.setEnabled(false);
        SaveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(SaveMenuItem);
        jMenu1.add(jSeparator1);

        ExitMenuItem.setText("Exit");
        ExitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(ExitMenuItem);

        jMenuBar1.add(jMenu1);

        helpButton.setText("Help");

        aboutButton.setText("About");
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });
        helpButton.add(aboutButton);

        jMenuBar1.add(helpButton);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(wordCountLabel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(wordCountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenMenuItemActionPerformed
        currentFilePath = showOpenDialogAndGetPath();
        if (currentFilePath != null) {
            setTitle(currentFilePath);
            originalContent = readTextFile(currentFilePath);
            MainTextArea.setText(originalContent);
            SaveMenuItem.setEnabled(true);
            updateWordCount();
            isDirty = false;
            setTitle(getTitle().replace(" *", ""));
        } else {
            return;
        }
    }//GEN-LAST:event_OpenMenuItemActionPerformed

    private void SaveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveAsMenuItemActionPerformed
        String filePath = showSaveDialogAndGetPath();
        if (filePath != null) {
            setTitle(filePath);
            writeToTextFile(filePath, MainTextArea.getText());
            currentFilePath = filePath;
            originalContent = MainTextArea.getText();
            setTitle(getTitle().replace(" *", ""));
            isDirty = false;
            SaveMenuItem.setEnabled(true);
        } else {
            return;
        }
    }//GEN-LAST:event_SaveAsMenuItemActionPerformed

    private void SaveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveMenuItemActionPerformed
        if (currentFilePath != null) {
            writeToTextFile(currentFilePath, MainTextArea.getText());
            originalContent = MainTextArea.getText();
            setTitle(getTitle().replace(" *", ""));
            isDirty = false;
        } else {
            String filePath = showSaveDialogAndGetPath();
            if (filePath != null) {
                writeToTextFile(filePath, MainTextArea.getText());
                currentFilePath = filePath;
                originalContent = MainTextArea.getText();
                setTitle(getTitle().replace(" *", ""));
                isDirty = false;
                SaveMenuItem.setEnabled(true);
            }
        }
}//GEN-LAST:event_SaveMenuItemActionPerformed

    private void ExitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMenuItemActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitMenuItemActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Notepad V1 \n Notepad Java Project");
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void MainTextAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MainTextAreaKeyTyped
        if (!MainTextArea.getText().equals(originalContent)) {
            if (!isDirty) {
                setTitle(getTitle() + " *");
                isDirty = true;
            }
        } else {
            if (isDirty) {
                setTitle(getTitle().replace(" *", ""));
                isDirty = false;
            }
        }
        updateWordCount();
    }//GEN-LAST:event_MainTextAreaKeyTyped

    private void updateWordCount() {
        String text = MainTextArea.getText().trim();
        int wordCount = text.isEmpty() ? 0 : text.split("\\s+").length;
        wordCountLabel.setText(wordCount + " words");
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
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NotepadWannabe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotepadWannabe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotepadWannabe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotepadWannabe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotepadWannabe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ExitMenuItem;
    private javax.swing.JTextArea MainTextArea;
    private javax.swing.JMenuItem OpenMenuItem;
    private javax.swing.JMenuItem SaveAsMenuItem;
    private javax.swing.JMenuItem SaveMenuItem;
    private javax.swing.JMenuItem aboutButton;
    private javax.swing.JMenu helpButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel wordCountLabel;
    // End of variables declaration//GEN-END:variables
}
