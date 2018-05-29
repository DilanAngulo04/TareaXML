package Interface;

import Data.XMLPersonManager;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdom.JDOMException;
import xmlProjectDomain.Person;

public class MainForm extends javax.swing.JFrame {

    XMLPersonManager xmlPersonManager;

    public MainForm() throws JDOMException, IOException {
        xmlPersonManager = new XMLPersonManager("./data/familyTree.xml");
        initComponents();
        lbl_newBirthdate.setVisible(false);
        lbl_newCountry.setVisible(false);
        lbl_newLastName.setVisible(false);
        lbl_newLastName2.setVisible(false);
        lbl_newName.setVisible(false);
        tfd_newCountry.setVisible(false);
        tfd_newLastName.setVisible(false);
        tfd_newLastName2.setVisible(false);
        tfd_newName.setVisible(false);
        tfd_newBirthdate.setVisible(false);
        btn_modifyInformation.setVisible(false);
        btn_Delete.setVisible(false);
        btn_modify.setVisible(false);
    }

    public int age(String birthdate) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(birthdate, fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);

        return periodo.getYears();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idParent = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        idPerson = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        birthdate = new javax.swing.JTextField();
        lastName2 = new javax.swing.JTextField();
        btn_insert = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        country = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfd_search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        lbl_newName = new javax.swing.JLabel();
        lbl_newLastName = new javax.swing.JLabel();
        lbl_newLastName2 = new javax.swing.JLabel();
        lbl_newBirthdate = new javax.swing.JLabel();
        lbl_newCountry = new javax.swing.JLabel();
        tfd_newName = new javax.swing.JTextField();
        tfd_newLastName = new javax.swing.JTextField();
        tfd_newLastName2 = new javax.swing.JTextField();
        tfd_newBirthdate = new javax.swing.JTextField();
        tfd_newCountry = new javax.swing.JTextField();
        btn_modify = new javax.swing.JButton();
        btn_modifyInformation = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Member Parent");

        jLabel2.setText("ID Person");

        jLabel3.setText("Name");

        jLabel4.setText("Last name");

        idParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idParentActionPerformed(evt);
            }
        });

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        idPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPersonActionPerformed(evt);
            }
        });

        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });

        jLabel5.setText("Last Name2");

        jLabel6.setText("Fecha nacimiento");

        birthdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdateActionPerformed(evt);
            }
        });

        lastName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastName2ActionPerformed(evt);
            }
        });

        btn_insert.setText("Insert");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "null", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel7.setText("Pais");

        country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryActionPerformed(evt);
            }
        });

        jLabel9.setText("Search");

        tfd_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_searchActionPerformed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        lbl_newName.setText("Name");

        lbl_newLastName.setText("Last Name");

        lbl_newLastName2.setText("Last Name2");

        lbl_newBirthdate.setText("Birthdate");

        lbl_newCountry.setText("Country");

        tfd_newName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_newNameActionPerformed(evt);
            }
        });

        btn_modify.setText("Modify");
        btn_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifyActionPerformed(evt);
            }
        });

        btn_modifyInformation.setText("Modify Information");
        btn_modifyInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifyInformationActionPerformed(evt);
            }
        });

        jLabel8.setText("dd/mm/yyyy");

        jLabel10.setText("Numbers");

        jLabel11.setText("Numbers");

        jLabel12.setText("dd/mm/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel7))
                                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(idParent, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(idPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel11))
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))))
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(country, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(lastName2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(birthdate, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(btn_insert, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabel8))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(jLabel9))
                                .addComponent(lbl_newName, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lbl_newLastName2)
                            .addComponent(lbl_newBirthdate)
                            .addComponent(lbl_newCountry)
                            .addComponent(lbl_newLastName))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfd_search, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfd_newLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfd_newName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfd_newLastName2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_modify)
                                    .addComponent(jButton1)
                                    .addComponent(btn_modifyInformation)))
                            .addComponent(tfd_newBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12)
                                .addComponent(tfd_newCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(538, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idParent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lastName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tfd_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(idPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_modify))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfd_newName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_newName)
                            .addComponent(jLabel8))
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_modifyInformation)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10)
                        .addComponent(btn_insert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfd_newLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_newLastName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfd_newLastName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_newLastName2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfd_newBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_newBirthdate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfd_newCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_newCountry, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idParentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idParentActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void idPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPersonActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void birthdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthdateActionPerformed

    private void lastName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastName2ActionPerformed

    //Accion insertar
    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed

        String birthdat = birthdate.getText();
        String countr = country.getText();
        String idParen = idParent.getText();
        String idP = idPerson.getText();
        String lastN1 = lastName.getText();
        String lastN2 = lastName2.getText();
        String nameP = name.getText();

        if (birthdat.length() != 0 || countr.length() != 0 || idParen.length() != 0
                || idP.length() != 0 || lastN1.length() != 0 || lastN2.length() != 0
                || nameP.length() != 0) {

            try {
                int prueba1 = Integer.parseInt(idP);
                int prueba2 = Integer.parseInt(idParen);

                if (prueba1 != prueba2) {

                    if (birthdat.length() == 10 && birthdat.charAt(2) == '/' && birthdat.charAt(5) == '/'
                             ) {

                            Person person = new Person(idP, nameP, lastN1, lastN2, birthdat, countr, idParen);

                            try {
                                xmlPersonManager.insertPerson(person);
                                JOptionPane.showMessageDialog(null, "Successful registration");
                                birthdate.setText("");
                                country.setText("");
                                idParent.setText("");
                                idPerson.setText("");
                                lastName.setText("");
                                lastName2.setText("");
                                name.setText("");

                                ArrayList<Person> decendents = new ArrayList<>();
                                xmlPersonManager.getDecendents(xmlPersonManager.root, decendents, idParen);

                                Object[][] matriz = new Object[decendents.size()][7];
                                for (int i = 0; i < decendents.size(); i++) {
                                    matriz[i][0] = decendents.get(i).getIdDad();
                                    matriz[i][1] = decendents.get(i).getId();
                                    matriz[i][2] = decendents.get(i).getName();
                                    matriz[i][3] = decendents.get(i).getLastName1();
                                    matriz[i][4] = decendents.get(i).getLastName2();
                                    matriz[i][5] = age(decendents.get(i).getBirthdate());
                                    matriz[i][6] = decendents.get(i).getCountry();
                                }
                                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                                        matriz,
                                        new String[]{
                                            "ID Dad", "ID Person", " Name", "Last Name", "Last Name2", "Age", "Country"
                                        }
                                ));

                            } catch (IOException ex) {
                                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                            }

                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid date");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "The two identifications must be different");
                }

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "There are letters in numeric fields");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Missing spaces to fill");
        }


    }//GEN-LAST:event_btn_insertActionPerformed

    private void countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryActionPerformed

    private void tfd_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfd_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String search = tfd_search.getText();

        if (search.length() != 0) {

            try {

                ArrayList<Person> person = new ArrayList<>();
                xmlPersonManager.getAllPersons(xmlPersonManager.root, person);
                Object matriz[][] = new Object[person.size()][7];

                for (int i = 0; i < person.size(); i++) {

                    if (person.get(i).getId().equalsIgnoreCase(search.trim())) {
                        matriz[i][0] = person.get(i).getIdDad();
                        matriz[i][1] = person.get(i).getId();
                        matriz[i][2] = person.get(i).getName();
                        matriz[i][3] = person.get(i).getLastName1();
                        matriz[i][4] = person.get(i).getLastName2();
                        matriz[i][5] = age(person.get(i).getBirthdate());
                        matriz[i][6] = person.get(i).getCountry();
                        btn_Delete.setVisible(true);
                        btn_modify.setVisible(true);

                    } else {
                        matriz = null;
                        JOptionPane.showMessageDialog(null, "The person sought is not registered");
                    }
                }
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        matriz,
                        new String[]{
                            "ID Dad", "ID Person", " Name", "Last Name", "Last Name2", "Age", "Country"
                        }
                ));
            } catch (NumberFormatException nfe) {

            } catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "The person has not been admitted");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        String delete = tfd_search.getText();
        if (delete.length() != 0) {

            try {
                xmlPersonManager.removePerson(xmlPersonManager.root, delete);
                JOptionPane.showMessageDialog(null, "Successful elimination");
            } catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    null,
                    new String[]{
                        "ID Dad", "ID Person", "Name", "Last Name", "Last Name2", "Age", "Country"
                    }
            ));

        } else {
            JOptionPane.showMessageDialog(null, "The person has not been admitted");
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifyActionPerformed
        lbl_newBirthdate.setVisible(true);
        lbl_newCountry.setVisible(true);
        lbl_newLastName.setVisible(true);
        lbl_newLastName2.setVisible(true);
        lbl_newName.setVisible(true);
        tfd_newCountry.setVisible(true);
        tfd_newLastName.setVisible(true);
        tfd_newLastName2.setVisible(true);
        tfd_newName.setVisible(true);
        tfd_newBirthdate.setVisible(true);
        btn_modifyInformation.setVisible(true);
        String modify = tfd_search.getText();

        ArrayList<Person> lista = new ArrayList<>();
        try {
            xmlPersonManager.getAllPersons(xmlPersonManager.root, lista);
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        Object matriz[][] = new Object[lista.size()][7];
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId().equalsIgnoreCase(modify)) {

                tfd_newBirthdate.setText("" + age(lista.get(i).getBirthdate()));
                tfd_newCountry.setText(lista.get(i).getCountry());
                tfd_newLastName.setText(lista.get(i).getLastName1());
                tfd_newLastName2.setText(lista.get(i).getLastName2());
                tfd_newName.setText(lista.get(i).getName());

            }
        }


    }//GEN-LAST:event_btn_modifyActionPerformed

    private void btn_modifyInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifyInformationActionPerformed

        String newBirthdate = tfd_newBirthdate.getText();
        String newName = tfd_newName.getText();
        String newLastName = tfd_newLastName.getText();
        String newLastName2 = tfd_newLastName2.getText();
        String newCountry = tfd_newCountry.getText();
        String modify = tfd_search.getText();

        if (newBirthdate.length() != 0 || newName.length() != 0 || newCountry.length() != 0
                || newLastName2.length() != 0 || newLastName.length() != 0) {

            try {

                ArrayList<Person> lista = new ArrayList<>();
                xmlPersonManager.getAllPersons(xmlPersonManager.root, lista);
                Object matriz[][] = new Object[lista.size()][7];
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getId().equalsIgnoreCase(modify)) {

                        xmlPersonManager.removePerson(xmlPersonManager.root, modify);

                        matriz[i][0] = lista.get(i).getIdDad();
                        matriz[i][1] = lista.get(i).getId();
                        matriz[i][2] = newName;
                        matriz[i][3] = newLastName;
                        matriz[i][4] = newLastName2;
                        matriz[i][5] = age(newBirthdate);
                        matriz[i][6] = newCountry;

                        Person person = new Person(lista.get(i).getId(), newName, newLastName, newLastName2,
                                newBirthdate, newCountry, lista.get(i).getIdDad());

                        xmlPersonManager.insertPerson(person);

                        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                                matriz,
                                new String[]{
                                    "ID Dad", "ID Person", "Name", "Last Name", "Last Name2", "Age", "Country"
                                }
                        ));

                        lbl_newBirthdate.setVisible(false);
                        lbl_newCountry.setVisible(false);
                        lbl_newLastName.setVisible(false);
                        lbl_newLastName2.setVisible(false);
                        lbl_newName.setVisible(false);
                        tfd_newCountry.setVisible(false);
                        tfd_newLastName.setVisible(false);
                        tfd_newLastName2.setVisible(false);
                        tfd_newName.setVisible(false);
                        tfd_newBirthdate.setVisible(false);
                        btn_modifyInformation.setVisible(false);

                        return;
                    }

                }

            } catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btn_modifyInformationActionPerformed

    private void tfd_newNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_newNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfd_newNameActionPerformed

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
                try {
                    new MainForm().setVisible(true);
                } catch (JDOMException | IOException ex) {
                    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField birthdate;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_modify;
    private javax.swing.JButton btn_modifyInformation;
    private javax.swing.JTextField country;
    private javax.swing.JTextField idParent;
    private javax.swing.JTextField idPerson;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField lastName2;
    private javax.swing.JLabel lbl_newBirthdate;
    private javax.swing.JLabel lbl_newCountry;
    private javax.swing.JLabel lbl_newLastName;
    private javax.swing.JLabel lbl_newLastName2;
    private javax.swing.JLabel lbl_newName;
    private javax.swing.JTextField name;
    private javax.swing.JTextField tfd_newBirthdate;
    private javax.swing.JTextField tfd_newCountry;
    private javax.swing.JTextField tfd_newLastName;
    private javax.swing.JTextField tfd_newLastName2;
    private javax.swing.JTextField tfd_newName;
    private javax.swing.JTextField tfd_search;
    // End of variables declaration//GEN-END:variables
}
