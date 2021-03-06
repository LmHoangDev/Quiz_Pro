/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Account;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author mrloc
 */
public class AdminForm extends javax.swing.JFrame {

    /**
     * Creates new form AdminForm
     */
    
    int positionX, positionY;
    Account userLogin;
    
    public AdminForm() {
        initComponents();
//        jPanelMain.add(new MainAdminPanel());
    }
    
    public AdminForm(Account account) {
        initComponents();
//        jPanelMain.add(new MainAdminPanel());
        userLogin = account;
        jLabelName.setText(account.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jPanelTop = new javax.swing.JPanel();
        jLabelMinimize = new javax.swing.JLabel();
        jLabelExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelChangePass = new javax.swing.JLabel();
        jPanelMain = new javax.swing.JPanel();
        jPanelAdminHome = new javax.swing.JPanel();
        jPanelTitle = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelComponent = new javax.swing.JPanel();
        jPanelSubject = new javax.swing.JPanel();
        jLabelSubject = new javax.swing.JLabel();
        jPanelTest = new javax.swing.JPanel();
        jLabelTest = new javax.swing.JLabel();
        jPanelColclusion = new javax.swing.JPanel();
        jLabelConclution = new javax.swing.JLabel();
        jPanelAccount = new javax.swing.JPanel();
        jLabelAccount = new javax.swing.JLabel();
        jPanelQuestion = new javax.swing.JPanel();
        jLabelQuestion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTop.setBackground(new java.awt.Color(4, 135, 217));
        jPanelTop.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelTopMouseDragged(evt);
            }
        });
        jPanelTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelTopMousePressed(evt);
            }
        });

        jLabelMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mini.png"))); // NOI18N
        jLabelMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseExited(evt);
            }
        });

        jLabelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close.png"))); // NOI18N
        jLabelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelExitMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Xin ch??o :");

        jLabelName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(255, 255, 255));

        jLabelChangePass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelChangePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/setting.png"))); // NOI18N
        jLabelChangePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelChangePass.setPreferredSize(new java.awt.Dimension(20, 30));
        jLabelChangePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelChangePassMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelChangePass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 891, Short.MAX_VALUE)
                .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelName))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTopLayout.createSequentialGroup()
                        .addComponent(jLabelChangePass, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                        .addComponent(jLabelExit, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))))
        );

        jPanelBackground.add(jPanelTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 40));

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setLayout(new java.awt.BorderLayout());

        jPanelAdminHome.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAdminHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTitle.setBackground(new java.awt.Color(4, 178, 217));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("H??? TH???NG QU???N L?? THI TR???C NGHI???M HAUI");

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addGroup(jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTitleLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4))
                    .addGroup(jPanelTitleLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jPanelAdminHome.add(jPanelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 230));

        jPanelComponent.setBackground(new java.awt.Color(4, 135, 217));
        jPanelComponent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelSubject.setBackground(new java.awt.Color(255, 255, 255));

        jLabelSubject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/subjectadmin.png"))); // NOI18N
        jLabelSubject.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSubjectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSubjectMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelSubjectMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSubjectLayout = new javax.swing.GroupLayout(jPanelSubject);
        jPanelSubject.setLayout(jPanelSubjectLayout);
        jPanelSubjectLayout.setHorizontalGroup(
            jPanelSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSubject, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );
        jPanelSubjectLayout.setVerticalGroup(
            jPanelSubjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSubject, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        jPanelComponent.add(jPanelSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, 290));

        jPanelTest.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/testadmin.png"))); // NOI18N
        jLabelTest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelTestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelTestMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelTestMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTestLayout = new javax.swing.GroupLayout(jPanelTest);
        jPanelTest.setLayout(jPanelTestLayout);
        jPanelTestLayout.setHorizontalGroup(
            jPanelTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTest, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );
        jPanelTestLayout.setVerticalGroup(
            jPanelTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTest, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        jPanelComponent.add(jPanelTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, 290));

        jPanelColclusion.setBackground(new java.awt.Color(255, 255, 255));

        jLabelConclution.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConclution.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/sumupadmin.png"))); // NOI18N
        jLabelConclution.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelConclution.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelConclutionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelConclutionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelConclutionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelColclusionLayout = new javax.swing.GroupLayout(jPanelColclusion);
        jPanelColclusion.setLayout(jPanelColclusionLayout);
        jPanelColclusionLayout.setHorizontalGroup(
            jPanelColclusionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelConclution, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );
        jPanelColclusionLayout.setVerticalGroup(
            jPanelColclusionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelConclution, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        jPanelComponent.add(jPanelColclusion, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, -1, 290));

        jPanelAccount.setBackground(new java.awt.Color(255, 255, 255));

        jLabelAccount.setBackground(new java.awt.Color(255, 255, 255));
        jLabelAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/accountadmin.png"))); // NOI18N
        jLabelAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelAccount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAccountMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelAccountMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAccountLayout = new javax.swing.GroupLayout(jPanelAccount);
        jPanelAccount.setLayout(jPanelAccountLayout);
        jPanelAccountLayout.setHorizontalGroup(
            jPanelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );
        jPanelAccountLayout.setVerticalGroup(
            jPanelAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        jPanelComponent.add(jPanelAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 290));

        jPanelQuestion.setBackground(new java.awt.Color(255, 255, 255));

        jLabelQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelQuestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/questionadmin.png"))); // NOI18N
        jLabelQuestion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelQuestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelQuestionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelQuestionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelQuestionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelQuestionLayout = new javax.swing.GroupLayout(jPanelQuestion);
        jPanelQuestion.setLayout(jPanelQuestionLayout);
        jPanelQuestionLayout.setHorizontalGroup(
            jPanelQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );
        jPanelQuestionLayout.setVerticalGroup(
            jPanelQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        jPanelComponent.add(jPanelQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, -1, 290));

        jPanelAdminHome.add(jPanelComponent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1130, 390));

        jPanelMain.add(jPanelAdminHome, java.awt.BorderLayout.CENTER);

        jPanelBackground.add(jPanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1130, 620));

        getContentPane().add(jPanelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jLabelMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseEntered
        // TODO add your handling code here:
        jLabelMinimize.setIcon((new javax.swing.ImageIcon(getClass().getResource("/Image/mini_hover.png"))));
    }//GEN-LAST:event_jLabelMinimizeMouseEntered

    private void jLabelMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseExited
        // TODO add your handling code here:
        jLabelMinimize.setIcon((new javax.swing.ImageIcon(getClass().getResource("/Image/mini.png"))));
    }//GEN-LAST:event_jLabelMinimizeMouseExited

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        // TODO add your handling code here:
        int input = JOptionPane.showConfirmDialog(rootPane, "B???n c?? ch???c ch???n mu???n tho??t ch????ng tr??nh?", "X??c nh???n tho??t", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (input == 0) {
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            LoginForm f = new LoginForm();
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            f.setVisible(true);
            this.dispose();
        } else {
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jLabelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseEntered
        // TODO add your handling code here:
        jLabelExit.setIcon((new javax.swing.ImageIcon(getClass().getResource("/Image/close_hover.png"))));
    }//GEN-LAST:event_jLabelExitMouseEntered

    private void jLabelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseExited
        // TODO add your handling code here:
        jLabelExit.setIcon((new javax.swing.ImageIcon(getClass().getResource("/Image/close.png"))));
    }//GEN-LAST:event_jLabelExitMouseExited

    private void jPanelTopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTopMousePressed
        // TODO add your handling code here:
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_jPanelTopMousePressed

    private void jPanelTopMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTopMouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getX() + evt.getX() - positionX, this.getY() + evt.getY() - positionY);
    }//GEN-LAST:event_jPanelTopMouseDragged

    private void jLabelQuestionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelQuestionMouseExited
        jPanelQuestion.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelQuestionMouseExited

    private void jLabelQuestionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelQuestionMouseEntered
        jPanelQuestion.setBackground(new Color(243, 209, 220));
    }//GEN-LAST:event_jLabelQuestionMouseEntered

    private void jLabelAccountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAccountMousePressed
        // TODO add your handling code here:
        jPanelMain.removeAll();
        jPanelMain.add(new AccountPanel());
        jPanelMain.revalidate();
    }//GEN-LAST:event_jLabelAccountMousePressed

    private void jLabelAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAccountMouseExited
        jPanelAccount.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelAccountMouseExited

    private void jLabelAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAccountMouseEntered
        jPanelAccount.setBackground(new Color(243, 209, 220));
    }//GEN-LAST:event_jLabelAccountMouseEntered

    private void jLabelConclutionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConclutionMouseExited
        jPanelColclusion.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelConclutionMouseExited

    private void jLabelConclutionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConclutionMouseEntered
        jPanelColclusion.setBackground(new Color(243, 209, 220));
    }//GEN-LAST:event_jLabelConclutionMouseEntered

    private void jLabelTestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTestMouseExited
        jPanelTest.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelTestMouseExited

    private void jLabelTestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTestMouseEntered
        jPanelTest.setBackground(new Color(243, 209, 220));
    }//GEN-LAST:event_jLabelTestMouseEntered

    private void jLabelSubjectMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSubjectMousePressed
        // TODO add your handling code here:
        jPanelMain.removeAll();
        jPanelMain.add(new SubjectPanel());
        jPanelMain.revalidate();
    }//GEN-LAST:event_jLabelSubjectMousePressed

    private void jLabelSubjectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSubjectMouseExited
        jPanelSubject.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jLabelSubjectMouseExited

    private void jLabelSubjectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSubjectMouseEntered
        jPanelSubject.setBackground(new Color(243, 209, 220));
    }//GEN-LAST:event_jLabelSubjectMouseEntered

    private void jLabelTestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTestMousePressed
        // TODO add your handling code here:
        jPanelMain.removeAll();
        jPanelMain.add(new TestPanel());
        jPanelMain.revalidate();
    }//GEN-LAST:event_jLabelTestMousePressed

    private void jLabelQuestionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelQuestionMousePressed
        // TODO add your handling code here:
        jPanelMain.removeAll();
        jPanelMain.add(new QuestionPanel());
        jPanelMain.revalidate();
    }//GEN-LAST:event_jLabelQuestionMousePressed

    private void jLabelConclutionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConclutionMousePressed
        // TODO add your handling code here:
        jPanelMain.removeAll();
        jPanelMain.add(new StatisticPanel());
        jPanelMain.revalidate();
    }//GEN-LAST:event_jLabelConclutionMousePressed

    private void jLabelChangePassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelChangePassMousePressed
        // TODO add your handling code here:
        ChangPassForm f = new ChangPassForm(this, true, userLogin);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }//GEN-LAST:event_jLabelChangePassMousePressed

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
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
        public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAccount;
    private javax.swing.JLabel jLabelChangePass;
    private javax.swing.JLabel jLabelConclution;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelQuestion;
    private javax.swing.JLabel jLabelSubject;
    private javax.swing.JLabel jLabelTest;
    private javax.swing.JPanel jPanelAccount;
    private javax.swing.JPanel jPanelAdminHome;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelColclusion;
    private javax.swing.JPanel jPanelComponent;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelQuestion;
    private javax.swing.JPanel jPanelSubject;
    private javax.swing.JPanel jPanelTest;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JPanel jPanelTop;
    // End of variables declaration//GEN-END:variables
}
