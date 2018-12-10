
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rizz
 */
public class Pathupdate extends javax.swing.JFrame {

    /**
     * Creates new form PatientInfo
     */
    private Connection connection = null;
    private PreparedStatement pst = null;
    private ResultSet resultSet = null;

    public Pathupdate() {
        initComponents();
        init();
        connection = ConnectionDB.dbcon();
        UpdatePatientInfo();
    }

    public void init() {
        setLocationRelativeTo(null);
        setResizable(false);
        groupbutton();
        groupbutton2();
        j_not.setSelected(true);
        
    }
    private void UpdatePatientInfo()
    {
        try{
            String sql= "select * from patient";
            pst = connection.prepareStatement(sql);
            resultSet = pst.executeQuery();
            //tab_info.setModel(DbUtils.resultSetToTableModel(resultSet));
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, ex);
            
        }
        
    }
    private void groupbutton()
    {
        ButtonGroup gb = new ButtonGroup();
        gb.add(j_male);
        gb.add(j_female);
        
    }
    private void groupbutton2()
    {
        ButtonGroup gb2= new ButtonGroup();
        gb2.add(j_ready);
        gb2.add(j_not);
        
    }
    private void clear(){
        jt_entry.setText(null);
        jt_name.setText(null);
        j_male.setSelected(false);
        j_female.setSelected(false);
        jt_age.setText(null);
        jt_test.setSelectedItem("Blood Grouping");
        jt_mob.setText(null);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jt_entry = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jt_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jt_age = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        j_male = new javax.swing.JRadioButton();
        j_female = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jt_test = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jt_ref = new javax.swing.JComboBox<>();
        jt_mob = new javax.swing.JTextField();
        btn_clear = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jt_search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        j_ready = new javax.swing.JRadioButton();
        j_not = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        menu_exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, java.awt.Color.green), "Patient Info", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(102, 102, 255))); // NOI18N

        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setText("Entry No :");

        jt_entry.setBackground(new java.awt.Color(204, 204, 204));
        jt_entry.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.black, java.awt.Color.gray));

        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("(To be updated)");

        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("   Name :");

        jt_name.setBackground(new java.awt.Color(204, 204, 204));
        jt_name.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.black));
        jt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_nameActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Age :");

        jt_age.setBackground(new java.awt.Color(204, 204, 204));
        jt_age.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.black));

        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Sex :");

        j_male.setBackground(new java.awt.Color(204, 204, 204));
        j_male.setForeground(new java.awt.Color(102, 102, 255));
        j_male.setText("Male");
        j_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_maleActionPerformed(evt);
            }
        });

        j_female.setBackground(new java.awt.Color(204, 204, 204));
        j_female.setForeground(new java.awt.Color(102, 102, 255));
        j_female.setText("Female");
        j_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_femaleActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(102, 102, 255));
        jLabel10.setText("Test :");

        jt_test.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood grouping", "USG", "Urine test", "MT(T.T)", "ECG", "ETT", "S.Billurubine", "S.Electrolytes", "S. Createnine", "Hb%", "X-Ray", "Blood Gloucose", "HBS", "RBS", " " }));

        jLabel11.setForeground(new java.awt.Color(102, 102, 255));
        jLabel11.setText("Mobile number :");

        jLabel12.setForeground(new java.awt.Color(102, 102, 255));
        jLabel12.setText("Reffered by :");

        jt_ref.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr. Roksana Parvin", "Dr.Priyotosh Roy", "Dr. Haripada Roy", "Dr. Parvin Begum", "Dr. Mohammad Mohsin", "Dr. AKM Shoab", "Dr. MA Subhan", "Dr. Najibush Shaheed", "Dr. Motiur Rahman", "Dr. Md Mujibur Rahman", "Dr. MAH Chowdhury Liton", "Dr. Nibash Chandra Paul", "Dr. Pradip Lal Banik", "Dr. Habibur Rahman", "Dr. Khukon Singh", "Dr. Saleh Ahmed", "Self" }));

        jt_mob.setBackground(new java.awt.Color(204, 204, 204));
        jt_mob.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, java.awt.Color.black));

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)
                                .addComponent(jLabel10)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)))))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jt_test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(j_male)
                        .addGap(18, 18, 18)
                        .addComponent(j_female))
                    .addComponent(jt_ref, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jt_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addComponent(jt_age, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_clear)
                        .addComponent(jt_mob, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_entry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j_male)
                            .addComponent(j_female))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jt_ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jt_mob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_clear)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, java.awt.Color.green), "Search Panel", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(102, 102, 255))); // NOI18N

        jt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_searchActionPerformed(evt);
            }
        });
        jt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_searchKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Search :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, java.awt.Color.green), "Test Status", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(102, 102, 255))); // NOI18N

        j_ready.setBackground(new java.awt.Color(204, 204, 204));
        j_ready.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        j_ready.setForeground(new java.awt.Color(255, 51, 102));
        j_ready.setText("Ready");
        j_ready.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        j_not.setBackground(new java.awt.Color(204, 204, 204));
        j_not.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        j_not.setForeground(new java.awt.Color(102, 102, 255));
        j_not.setText("Not Ready");
        j_not.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 0, 0), new java.awt.Color(204, 0, 204), new java.awt.Color(102, 255, 102), new java.awt.Color(204, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(j_ready)
                        .addGap(18, 18, 18)
                        .addComponent(j_not)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j_ready, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j_not, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("                                                              Patient                                                          ", jPanel1);

        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));

        jMenu7.setText("File   ");
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });

        menu_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menu_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EXIT.png"))); // NOI18N
        menu_exit.setText("Exit");
        menu_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_exitActionPerformed(evt);
            }
        });
        jMenu7.add(menu_exit);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed

    }//GEN-LAST:event_jMenu7ActionPerformed

    private void menu_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_exitActionPerformed
            System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_menu_exitActionPerformed

    private void jt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_searchActionPerformed

    private void jt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_searchKeyReleased
       
        String sql= "select * from patient where Entry_no like '%"+jt_search.getText()+"%' OR"
                        + " Name like '%"+jt_search.getText()+"%' OR"
                        + " Mobile_no like '%"+jt_search.getText()+"%'";
        try {
           
            
            pst = connection.prepareStatement(sql);
            //pst.setString(1,jt_search.getText());
            resultSet = pst.executeQuery();
            //tab_info.setModel(DbUtils.resultSetToTableModel(resultSet));
            if(resultSet.next())
            {
                jt_entry.setText(resultSet.getString("Entry_no"));
                jt_name.setText(resultSet.getString("Name"));
                jt_age.setText(resultSet.getString("Age"));
                String s = resultSet.getString("Sex");
                    if("Male".equals(s)){
                    j_male.setSelected(true);
                    }
                    else if("Female".equals(s)){
                    j_female.setSelected(true);
                    }
                    String q = resultSet.getString("Status");
                    if("Ready".equals(q)){
                    j_ready.setSelected(true);
                    }
                    else if("Not Ready".equals(q)){
                    j_not.setSelected(true);
                    }
                jt_test.setSelectedItem(resultSet.getString("Test"));
                jt_mob.setText(resultSet.getString("Mobile_no"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Deleteframe.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        //clear();
        
       
    }//GEN-LAST:event_jt_searchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          try {
            setVisible(false);
            Activitypanel lol = new Activitypanel();
            lol.setVisible(true);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, e);
        } finally {
            try {
                resultSet.close();
                pst.close();
                connection.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void j_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_maleActionPerformed
        gender = "Male";        // TODO add your handling code here:
    }//GEN-LAST:event_j_maleActionPerformed

    private void j_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_femaleActionPerformed
        gender = "Female";        // TODO add your handling code here:
    }//GEN-LAST:event_j_femaleActionPerformed

    private void jt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_nameActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btn_clearActionPerformed

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
            //java.util.logging.Logger.getLogger(PatientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //java.util.logging.Logger.getLogger(PatientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //java.util.logging.Logger.getLogger(PatientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            //java.util.logging.Logger.getLogger(PatientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton j_female;
    private javax.swing.JRadioButton j_male;
    private javax.swing.JRadioButton j_not;
    private javax.swing.JRadioButton j_ready;
    private javax.swing.JTextField jt_age;
    private javax.swing.JTextField jt_entry;
    private javax.swing.JTextField jt_mob;
    private javax.swing.JTextField jt_name;
    private javax.swing.JComboBox<String> jt_ref;
    private javax.swing.JTextField jt_search;
    private javax.swing.JComboBox<String> jt_test;
    private javax.swing.JMenuItem menu_exit;
    // End of variables declaration//GEN-END:variables
    private String gender = null;

}