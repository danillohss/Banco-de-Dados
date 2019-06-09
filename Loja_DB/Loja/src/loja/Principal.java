package loja;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Cliente;
import model.dao.ProdutoDAO;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        DefaultTableModel modelo = (DefaultTableModel) tbl_Cli.getModel();


        btn_Cli_salvar.setEnabled(false);
        btn_Cli_cancelar.setEnabled(false);
    }

    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) tbl_Cli.getModel();
        modelo.setNumRows(0);
        ProdutoDAO pdao = new ProdutoDAO();

        pdao.read().forEach((c) -> {
            modelo.addRow(new Object[]{
                c.getCPF_Cliente(),
                c.getNome(),
                c.getRua(),
                c.getBairro(),
                c.getCidade()
            });
        });
    }
    public void readJTableForNome(String name) {
        DefaultTableModel modelo = (DefaultTableModel) tbl_Cli.getModel();
        modelo.setNumRows(0);
        ProdutoDAO pdao = new ProdutoDAO();

        pdao.readForName(name).forEach((c) -> {
            modelo.addRow(new Object[]{
                c.getCPF_Cliente(),
                c.getNome(),
                c.getRua(),
                c.getBairro(),
                c.getCidade()
            });
        });
    }
    public void readJTableForCPF(String CPF_Cliente) {
        DefaultTableModel modelo = (DefaultTableModel) tbl_Cli.getModel();
        modelo.setNumRows(0);
        ProdutoDAO pdao = new ProdutoDAO();

        pdao.readForCPF(CPF_Cliente).forEach((c) -> {
            modelo.addRow(new Object[]{
                c.getCPF_Cliente(),
                c.getNome(),
                c.getRua(),
                c.getBairro(),
                c.getCidade()
            });
        });
    }
    public void readJTableForCidade(String Cidade) {
        DefaultTableModel modelo = (DefaultTableModel) tbl_Cli.getModel();
        modelo.setNumRows(0);
        ProdutoDAO pdao = new ProdutoDAO();

        pdao.readForCidade(Cidade).forEach((c) -> {
            modelo.addRow(new Object[]{
                c.getCPF_Cliente(),
                c.getNome(),
                c.getRua(),
                c.getBairro(),
                c.getCidade()
            });
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Test = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Cli = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        label_Cli_Cpf = new javax.swing.JLabel();
        c_Cli_Cpf = new javax.swing.JTextField();
        label_Cli_Nome = new javax.swing.JLabel();
        c_Cli_Nome = new javax.swing.JTextField();
        label_Cli_Rua = new javax.swing.JLabel();
        c_Cli_Rua = new javax.swing.JTextField();
        label_Cli_Bairro = new javax.swing.JLabel();
        label_Cli_Cidade = new javax.swing.JLabel();
        c_Cli_Bairro = new javax.swing.JTextField();
        c_Cli_Cidade = new javax.swing.JTextField();
        btn_Cli_salvar = new javax.swing.JButton();
        btn_Cli_cancelar = new javax.swing.JButton();
        btn_Cli_novo = new javax.swing.JButton();
        btn_Cli_Atualizar = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JButton();
        txtBuscaName = new javax.swing.JTextField();
        btn_Cli_Buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscaCPF = new javax.swing.JTextField();
        btn_Cli_Buscar_CPF = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        readCity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_Cli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Rua", "Bairro", "Cidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Cli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_CliMouseClicked(evt);
            }
        });
        tbl_Cli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_CliKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Cli);
        if (tbl_Cli.getColumnModel().getColumnCount() > 0) {
            tbl_Cli.getColumnModel().getColumn(0).setPreferredWidth(200);
            tbl_Cli.getColumnModel().getColumn(1).setResizable(false);
            tbl_Cli.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbl_Cli.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbl_Cli.getColumnModel().getColumn(3).setPreferredWidth(200);
            tbl_Cli.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        label_Cli_Cpf.setText("CPF :");

        c_Cli_Cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_Cli_CpfActionPerformed(evt);
            }
        });

        label_Cli_Nome.setText("Nome :");

        c_Cli_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_Cli_NomeActionPerformed(evt);
            }
        });

        label_Cli_Rua.setText("Rua :");

        c_Cli_Rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_Cli_RuaActionPerformed(evt);
            }
        });

        label_Cli_Bairro.setText("Bairro :");

        label_Cli_Cidade.setText("Cidade :");

        btn_Cli_salvar.setText("Salvar");
        btn_Cli_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cli_salvarActionPerformed(evt);
            }
        });

        btn_Cli_cancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Cli_Cpf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_Cli_Nome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_Cli_Rua, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_Cli_Bairro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_Cli_Cidade, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_Cli_salvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_Cli_cancelar))
                    .addComponent(c_Cli_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_Cli_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_Cli_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_Cli_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_Cli_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Cli_Cpf)
                    .addComponent(c_Cli_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Cli_Nome)
                    .addComponent(c_Cli_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_Cli_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Cli_Rua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Cli_Bairro)
                    .addComponent(c_Cli_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Cli_Cidade)
                    .addComponent(c_Cli_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Cli_salvar)
                    .addComponent(btn_Cli_cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_Cli_novo.setText("Novo");
        btn_Cli_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cli_novoActionPerformed(evt);
            }
        });

        btn_Cli_Atualizar.setText("Atualizar");
        btn_Cli_Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cli_AtualizarActionPerformed(evt);
            }
        });

        btn_Excluir.setText("Excluir");
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });

        txtBuscaName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaNameActionPerformed(evt);
            }
        });

        btn_Cli_Buscar.setText("Buscar");
        btn_Cli_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cli_BuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Busca por nome:");

        txtBuscaCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaCPFActionPerformed(evt);
            }
        });

        btn_Cli_Buscar_CPF.setText("Buscar");
        btn_Cli_Buscar_CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cli_Buscar_CPFActionPerformed(evt);
            }
        });

        jLabel2.setText("Busca por CPF:");

        jLabel3.setText("Busca por Cidade:");

        readCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readCityActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_Cli_novo)
                        .addGap(146, 146, 146)
                        .addComponent(btn_Cli_Atualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Excluir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 123, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(readCity)
                            .addComponent(txtBuscaCPF)
                            .addComponent(txtBuscaName, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Cli_Buscar)
                            .addComponent(btn_Cli_Buscar_CPF)
                            .addComponent(jButton1))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Cli_novo)
                    .addComponent(btn_Cli_Atualizar)
                    .addComponent(btn_Excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Cli_Buscar)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Cli_Buscar_CPF)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(readCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addGap(13, 13, 13)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Test.addTab("Cliente", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Test)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Test))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Cli_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cli_novoActionPerformed

        c_Cli_Cpf.setText("");
        c_Cli_Nome.setText("");
        c_Cli_Rua.setText("");
        c_Cli_Bairro.setText("");
        c_Cli_Cidade.setText("");

        btn_Cli_salvar.setEnabled(true);
        btn_Cli_cancelar.setEnabled(true);
    }//GEN-LAST:event_btn_Cli_novoActionPerformed

    private void btn_Cli_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cli_salvarActionPerformed

        Cliente c = new Cliente();
        ProdutoDAO dao = new ProdutoDAO();
        c.setCPF_Cliente(Integer.parseInt(c_Cli_Cpf.getText()));
        c.setNome(c_Cli_Nome.getText());
        c.setRua(c_Cli_Rua.getText());
        c.setBairro(c_Cli_Bairro.getText());
        c.setCidade(c_Cli_Cidade.getText());
        dao.create(c);

        c_Cli_Cpf.setText("");
        c_Cli_Nome.setText("");
        c_Cli_Rua.setText("");
        c_Cli_Bairro.setText("");
        c_Cli_Cidade.setText("");

        readJTable();


    }//GEN-LAST:event_btn_Cli_salvarActionPerformed

    private void c_Cli_CpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_Cli_CpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_Cli_CpfActionPerformed

    private void tbl_CliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_CliMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_CliMouseClicked

    private void btn_Cli_AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cli_AtualizarActionPerformed
        if (tbl_Cli.getSelectedRow() != -1) {
            Cliente c = new Cliente();
            ProdutoDAO dao = new ProdutoDAO();
            c.setNome(c_Cli_Nome.getText());
            c.setRua(c_Cli_Rua.getText());
            c.setBairro(c_Cli_Bairro.getText());
            c.setCidade(c_Cli_Cidade.getText());
            c.setCPF_Cliente((int)tbl_Cli.getValueAt(tbl_Cli.getSelectedRow(), 0));
            dao.update(c);

            c_Cli_Cpf.setText("");
            c_Cli_Nome.setText("");
            c_Cli_Rua.setText("");
            c_Cli_Bairro.setText("");
            c_Cli_Cidade.setText("");

            readJTable();

        }else{
            JOptionPane.showMessageDialog(null, "Selecione um para atualizar.");
        }


    }//GEN-LAST:event_btn_Cli_AtualizarActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
         if (tbl_Cli.getSelectedRow() != -1) {
            Cliente c = new Cliente();
            ProdutoDAO dao = new ProdutoDAO();

            c.setCPF_Cliente((int)tbl_Cli.getValueAt(tbl_Cli.getSelectedRow(), 0));
            dao.delete(c);

            c_Cli_Cpf.setText("");
            c_Cli_Nome.setText("");
            c_Cli_Rua.setText("");
            c_Cli_Bairro.setText("");
            c_Cli_Cidade.setText("");

            readJTable();

        }else{
             JOptionPane.showMessageDialog(null, "Selecione um para excluir.");
         }

    }//GEN-LAST:event_btn_ExcluirActionPerformed

    private void tbl_CliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_CliKeyReleased
        if (tbl_Cli.getSelectedRow() != -1) {
            c_Cli_Cpf.setText(tbl_Cli.getValueAt(tbl_Cli.getSelectedRow(), 0).toString());
            c_Cli_Nome.setText(tbl_Cli.getValueAt(tbl_Cli.getSelectedRow(), 1).toString());
            c_Cli_Rua.setText(tbl_Cli.getValueAt(tbl_Cli.getSelectedRow(), 2).toString());
            c_Cli_Bairro.setText(tbl_Cli.getValueAt(tbl_Cli.getSelectedRow(), 3).toString());
            c_Cli_Cidade.setText(tbl_Cli.getValueAt(tbl_Cli.getSelectedRow(), 4).toString());

        }    }//GEN-LAST:event_tbl_CliKeyReleased

    private void txtBuscaNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaNameActionPerformed

    }//GEN-LAST:event_txtBuscaNameActionPerformed

    private void btn_Cli_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cli_BuscarActionPerformed
                readJTableForNome(txtBuscaName.getText());
        
    }//GEN-LAST:event_btn_Cli_BuscarActionPerformed

    private void c_Cli_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_Cli_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_Cli_NomeActionPerformed

    private void c_Cli_RuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_Cli_RuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_Cli_RuaActionPerformed

    private void btn_Cli_Buscar_CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cli_Buscar_CPFActionPerformed
                 readJTableForCPF(txtBuscaCPF.getText());
    }//GEN-LAST:event_btn_Cli_Buscar_CPFActionPerformed

    private void txtBuscaCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaCPFActionPerformed

    private void readCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_readCityActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        readJTableForCidade(readCity.getText());
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Test;
    private javax.swing.JButton btn_Cli_Atualizar;
    private javax.swing.JButton btn_Cli_Buscar;
    private javax.swing.JButton btn_Cli_Buscar_CPF;
    private javax.swing.JButton btn_Cli_cancelar;
    private javax.swing.JButton btn_Cli_novo;
    private javax.swing.JButton btn_Cli_salvar;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JTextField c_Cli_Bairro;
    private javax.swing.JTextField c_Cli_Cidade;
    private javax.swing.JTextField c_Cli_Cpf;
    private javax.swing.JTextField c_Cli_Nome;
    private javax.swing.JTextField c_Cli_Rua;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_Cli_Bairro;
    private javax.swing.JLabel label_Cli_Cidade;
    private javax.swing.JLabel label_Cli_Cpf;
    private javax.swing.JLabel label_Cli_Nome;
    private javax.swing.JLabel label_Cli_Rua;
    private javax.swing.JTextField readCity;
    private javax.swing.JTable tbl_Cli;
    private javax.swing.JTextField txtBuscaCPF;
    private javax.swing.JTextField txtBuscaName;
    // End of variables declaration//GEN-END:variables

}
