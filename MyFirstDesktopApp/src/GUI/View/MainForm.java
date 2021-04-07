/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;

import java.awt.Color;

/**
 *
 * @author hp
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NavigateMenu = new javax.swing.JDesktopPane();
        AdminPanel = new javax.swing.JLabel();
        Hotelet = new javax.swing.JButton();
        Motelet = new javax.swing.JButton();
        Pallatet = new javax.swing.JButton();
        Villat = new javax.swing.JButton();
        DesktopPane = new javax.swing.JDesktopPane();
        MenuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        NewFile = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        SaveAs = new javax.swing.JMenuItem();
        History = new javax.swing.JMenuItem();
        Print = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        Cut = new javax.swing.JMenuItem();
        Copy = new javax.swing.JMenuItem();
        Past = new javax.swing.JMenuItem();
        Delete = new javax.swing.JMenuItem();
        View = new javax.swing.JMenu();
        Toolbars = new javax.swing.JMenuItem();
        FullScreen = new javax.swing.JMenuItem();
        Search = new javax.swing.JMenu();
        Find = new javax.swing.JMenuItem();
        Replace = new javax.swing.JMenuItem();
        Filter = new javax.swing.JMenu();
        SortAZ = new javax.swing.JMenuItem();
        SortZA = new javax.swing.JMenuItem();
        Team = new javax.swing.JMenu();
        Admin = new javax.swing.JMenuItem();
        UserGroup = new javax.swing.JMenuItem();
        AllUsers = new javax.swing.JMenuItem();
        Report = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        Forum = new javax.swing.JMenuItem();
        Question = new javax.swing.JMenuItem();
        Email = new javax.swing.JMenuItem();
        Shortcut = new javax.swing.JMenu();
        LinkHoteli = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NavigateMenu.setBackground(new java.awt.Color(255, 255, 255));

        AdminPanel.setBackground(new java.awt.Color(51, 51, 255));
        AdminPanel.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        AdminPanel.setForeground(new java.awt.Color(204, 255, 204));
        AdminPanel.setText("    Admin Panel");

        Hotelet.setBackground(new java.awt.Color(0, 0, 0));
        Hotelet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Hotelet.setForeground(new java.awt.Color(255, 255, 255));
        Hotelet.setText("Hotelet");
        Hotelet.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.green, java.awt.Color.green, java.awt.Color.green, java.awt.Color.green));
        Hotelet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoteletActionPerformed(evt);
            }
        });

        Motelet.setBackground(new java.awt.Color(0, 0, 0));
        Motelet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Motelet.setForeground(new java.awt.Color(255, 255, 255));
        Motelet.setText("Motelet");
        Motelet.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));

        Pallatet.setBackground(new java.awt.Color(0, 0, 0));
        Pallatet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Pallatet.setForeground(new java.awt.Color(255, 255, 255));
        Pallatet.setText("Pallatet");
        Pallatet.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));

        Villat.setBackground(new java.awt.Color(0, 0, 0));
        Villat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Villat.setForeground(new java.awt.Color(255, 255, 255));
        Villat.setText("Villat");
        Villat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));

        javax.swing.GroupLayout NavigateMenuLayout = new javax.swing.GroupLayout(NavigateMenu);
        NavigateMenu.setLayout(NavigateMenuLayout);
        NavigateMenuLayout.setHorizontalGroup(
            NavigateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NavigateMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(NavigateMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Hotelet, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(Motelet, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(Pallatet, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(Villat, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        NavigateMenuLayout.setVerticalGroup(
            NavigateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigateMenuLayout.createSequentialGroup()
                .addComponent(AdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(NavigateMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Villat, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(Hotelet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Motelet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pallatet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        NavigateMenu.setLayer(AdminPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        NavigateMenu.setLayer(Hotelet, javax.swing.JLayeredPane.DEFAULT_LAYER);
        NavigateMenu.setLayer(Motelet, javax.swing.JLayeredPane.DEFAULT_LAYER);
        NavigateMenu.setLayer(Pallatet, javax.swing.JLayeredPane.DEFAULT_LAYER);
        NavigateMenu.setLayer(Villat, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        File.setText("File");

        NewFile.setText("New File");
        File.add(NewFile);

        Save.setText("Save");
        File.add(Save);

        SaveAs.setText("Save As");
        File.add(SaveAs);

        History.setText("History");
        File.add(History);

        Print.setText("Print");
        File.add(Print);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        File.add(Exit);

        MenuBar.add(File);

        Edit.setText("Edit");

        Cut.setText("Cut");
        Cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutActionPerformed(evt);
            }
        });
        Edit.add(Cut);

        Copy.setText("Copy");
        Edit.add(Copy);

        Past.setText("Past");
        Past.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PastActionPerformed(evt);
            }
        });
        Edit.add(Past);

        Delete.setText("Delete");
        Edit.add(Delete);

        MenuBar.add(Edit);

        View.setText("View");

        Toolbars.setText("Toolbars");
        View.add(Toolbars);

        FullScreen.setText("Full Screen");
        FullScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullScreenActionPerformed(evt);
            }
        });
        View.add(FullScreen);

        MenuBar.add(View);

        Search.setText("Search");

        Find.setText("Find");
        Search.add(Find);

        Replace.setText("Replace");
        Replace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReplaceActionPerformed(evt);
            }
        });
        Search.add(Replace);

        Filter.setText("Filter");

        SortAZ.setText("Sort A-Z");
        SortAZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortAZActionPerformed(evt);
            }
        });
        Filter.add(SortAZ);

        SortZA.setText("Sort Z-A");
        Filter.add(SortZA);

        Search.add(Filter);

        MenuBar.add(Search);

        Team.setText("Team");

        Admin.setText("Admin");
        Team.add(Admin);

        UserGroup.setText("UserGroup");
        Team.add(UserGroup);

        AllUsers.setText("All Users");
        Team.add(AllUsers);

        Report.setText("Report");
        Team.add(Report);

        MenuBar.add(Team);

        Help.setText("Help");

        Forum.setText("Forum");
        Help.add(Forum);

        Question.setText("Question");
        Question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionActionPerformed(evt);
            }
        });
        Help.add(Question);

        Email.setText("E-mail");
        Help.add(Email);

        MenuBar.add(Help);

        Shortcut.setText("Shortcut");

        LinkHoteli.setText("LinkHoteli");
        LinkHoteli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinkHoteliActionPerformed(evt);
            }
        });
        Shortcut.add(LinkHoteli);

        MenuBar.add(Shortcut);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NavigateMenu)
            .addComponent(DesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(NavigateMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuestionActionPerformed

    private void ReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReplaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReplaceActionPerformed

    private void SortAZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortAZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SortAZActionPerformed

    private void FullScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullScreenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullScreenActionPerformed

    private void CutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CutActionPerformed

    private void PastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PastActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void HoteletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoteletActionPerformed
        // TODO add your handling code here:
        HotelForm hf = new HotelForm();
        DesktopPane.add(hf);
        hf.show();
    }//GEN-LAST:event_HoteletActionPerformed

    private void LinkHoteliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinkHoteliActionPerformed
        // TODO add your handling code here:
        HotelForm hf = new HotelForm();
        DesktopPane.add(hf);
        hf.show();
    }//GEN-LAST:event_LinkHoteliActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Admin;
    private javax.swing.JLabel AdminPanel;
    private javax.swing.JMenuItem AllUsers;
    private javax.swing.JMenuItem Copy;
    private javax.swing.JMenuItem Cut;
    private javax.swing.JMenuItem Delete;
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenuItem Email;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu File;
    private javax.swing.JMenu Filter;
    private javax.swing.JMenuItem Find;
    private javax.swing.JMenuItem Forum;
    private javax.swing.JMenuItem FullScreen;
    private javax.swing.JMenu Help;
    private javax.swing.JMenuItem History;
    private javax.swing.JButton Hotelet;
    private javax.swing.JMenuItem LinkHoteli;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton Motelet;
    private javax.swing.JDesktopPane NavigateMenu;
    private javax.swing.JMenuItem NewFile;
    private javax.swing.JButton Pallatet;
    private javax.swing.JMenuItem Past;
    private javax.swing.JMenuItem Print;
    private javax.swing.JMenuItem Question;
    private javax.swing.JMenuItem Replace;
    private javax.swing.JMenuItem Report;
    private javax.swing.JMenuItem Save;
    private javax.swing.JMenuItem SaveAs;
    private javax.swing.JMenu Search;
    private javax.swing.JMenu Shortcut;
    private javax.swing.JMenuItem SortAZ;
    private javax.swing.JMenuItem SortZA;
    private javax.swing.JMenu Team;
    private javax.swing.JMenuItem Toolbars;
    private javax.swing.JMenuItem UserGroup;
    private javax.swing.JMenu View;
    private javax.swing.JButton Villat;
    // End of variables declaration//GEN-END:variables
}
