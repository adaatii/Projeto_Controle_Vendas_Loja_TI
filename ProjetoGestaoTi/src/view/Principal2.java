/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author diego
 */

import dao.ProdutosDao;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Produtos;
import model.Utilitarios;

public class Principal2 extends javax.swing.JFrame {

    private JPanel jPanel1;
    private JLabel jLabel1;
    private JTabbedPane painelCadastroProduto;
    private JPanel painelDadosCadastroProduto;
    private JLabel jLabel4;
    private JTextField txtCodigoProduto;
    private JLabel jLabel5;
    private JTextField txtDescriProduto;
    private JLabel jLabel6;
    private JFormattedTextField txtPrecoProduto;
    private JLabel jLabel7;
    private JTextField txtFornProduto;
    private JPanel painelDadosConsultaProduto;
    private JLabel jLabel18;
    private JTextField txtPesquisaProduto;
    private JButton btnPesquisaProd;
    private JScrollPane jScrollPane1;
    private JTable tabelaProduto;
    private JButton btnSalvarProd;
    private JButton btnEditarProd;
    private JButton btnLimparProd;
    private JButton btnExcluirProd;

    /**
     * Creates new form Principal2
     */
    public Principal2() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelCadastroProduto = new javax.swing.JTabbedPane();
        painelDadosCadastroProduto = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDescriProduto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecoProduto = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFornProduto = new javax.swing.JTextField();
        painelDadosConsultaProduto = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtPesquisaProduto = new javax.swing.JTextField();
        btnPesquisaProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        btnSalvarProd = new javax.swing.JButton();
        btnEditarProd = new javax.swing.JButton();
        btnLimparProd = new javax.swing.JButton();
        btnExcluirProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(14, 89, 235));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Produto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        painelCadastroProduto.setBackground(new java.awt.Color(255, 255, 255));

        painelDadosCadastroProduto.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("Código:");

        txtCodigoProduto.setEditable(false);
        txtCodigoProduto.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigoProduto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtCodigoProduto.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Descrição:");

        txtDescriProduto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Preço:");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtPrecoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤¤#,##0.00"))));
        txtPrecoProduto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Fornecedor:");

        txtFornProduto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        javax.swing.GroupLayout painelDadosCadastroProdutoLayout = new javax.swing.GroupLayout(painelDadosCadastroProduto);
        painelDadosCadastroProduto.setLayout(painelDadosCadastroProdutoLayout);
        painelDadosCadastroProdutoLayout.setHorizontalGroup(
            painelDadosCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosCadastroProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosCadastroProdutoLayout.createSequentialGroup()
                        .addGroup(painelDadosCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelDadosCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescriProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(684, Short.MAX_VALUE))
                    .addGroup(painelDadosCadastroProdutoLayout.createSequentialGroup()
                        .addGroup(painelDadosCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosCadastroProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDadosCadastroProdutoLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFornProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        painelDadosCadastroProdutoLayout.setVerticalGroup(
            painelDadosCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosCadastroProdutoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(painelDadosCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelDadosCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDescriProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDadosCadastroProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFornProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(234, Short.MAX_VALUE))
        );

        painelCadastroProduto.addTab("Cadastro", painelDadosCadastroProduto);

        painelDadosConsultaProduto.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel18.setText("Nome:");

        txtPesquisaProduto.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtPesquisaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaProdutoKeyPressed(evt);
            }
        });

        btnPesquisaProd.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnPesquisaProd.setText("Pesquisar");
        btnPesquisaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaProdActionPerformed(evt);
            }
        });

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Preço", "Fornecedor"
            }
        ));
        tabelaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProduto);
        if (tabelaProduto.getColumnModel().getColumnCount() > 0) {
            tabelaProduto.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout painelDadosConsultaProdutoLayout = new javax.swing.GroupLayout(painelDadosConsultaProduto);
        painelDadosConsultaProduto.setLayout(painelDadosConsultaProdutoLayout);
        painelDadosConsultaProdutoLayout.setHorizontalGroup(
            painelDadosConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosConsultaProdutoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(painelDadosConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelDadosConsultaProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisaProd)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDadosConsultaProdutoLayout.setVerticalGroup(
            painelDadosConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosConsultaProdutoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(painelDadosConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaProd))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        painelCadastroProduto.addTab("Consulta ", painelDadosConsultaProduto);

        btnSalvarProd.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnSalvarProd.setText("CADASTRAR");
        btnSalvarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdActionPerformed(evt);
            }
        });

        btnEditarProd.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnEditarProd.setText("EDITAR");
        btnEditarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdActionPerformed(evt);
            }
        });

        btnLimparProd.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnLimparProd.setText("LIMPAR");
        btnLimparProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparProdActionPerformed(evt);
            }
        });

        btnExcluirProd.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnExcluirProd.setText("EXCLUIR");
        btnExcluirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(btnSalvarProd)
                .addGap(43, 43, 43)
                .addComponent(btnEditarProd)
                .addGap(43, 43, 43)
                .addComponent(btnLimparProd)
                .addGap(44, 44, 44)
                .addComponent(btnExcluirProd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 1209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvarProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimparProd)
                        .addComponent(btnExcluirProd)
                        .addComponent(btnEditarProd)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaProdutoKeyPressed
    }//GEN-LAST:event_txtPesquisaProdutoKeyPressed

    private void btnPesquisaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaProdActionPerformed
        // Botão pesquisar

        String nome = "%" + txtPesquisaProduto.getText() + "%";

        ProdutosDao dao = new ProdutosDao();
        List<Produtos> lista = dao.buscaProdutoNome(nome);
        DefaultTableModel dado = (DefaultTableModel) tabelaProduto.getModel();
        dado.setNumRows(0);

        for (Produtos cont : lista) {
            dado.addRow(new Object[]{
                cont.getVarcodigo();
            

            });

        }
    }//GEN-LAST:event_btnPesquisaProdActionPerformed

    private void tabelaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutoMouseClicked
        // Pega os dados e envia para aba Cadastro
        painelCadastro.setSelectedIndex(0);
        txtiCodigoProdutos.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0).toString());
        txtDescriProdutos.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 1).toString());
        txtPrecoProdutos.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 2).toString());
        txtFornProdutos.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tabelaProdutoMouseClicked

    private void btnSalvarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdActionPerformed
        // Botão Salvar :

        Produtos obj = new Produtos();
        obj.setNome(txtDescriProdutos.getText());
        obj.setRg(txtPrecoProdutos.getText());
        obj.setCpf(txtCpf.getText());
        obj.setEmail(txtEmail.getText());
        obj.setTelefone(txtTelefone.getText());
        obj.setCelular(txtCelular.getText());
        obj.setCep(txtCep.getText());
        obj.setEndereco(txtEndereco.getText());
        obj.setNumero(Integer.parseInt(txtNumero.getText()));
        obj.setComplemento(txtComplemento.getText());
        obj.setBairro(txtBairro.getText());
        obj.setCidade(txtCidade.getText());
        obj.setUf(cbUf.getSelectedItem().toString());

        ProdutosDao dao = new ProdutosDao();
        dao.cadastrarProduto(obj);

        new Utilitarios().LimparTela(painelDadosCadastro);

        //            txtNome.setText("");
        //            txtRg.setText("");
        //            txtCpf.setText("");
        //            txtEmail.setText("");
        //            txtTelefone.setText("");
        //            txtCelular.setText("");
        //            txtCep.setText("");
        //            txtEndereco.setText("");
        //            txtNumero.setText("");
        //            txtComplemento.setText("");
        //            txtBairro.setText("");
        //            txtCidade.setText("");
        //            txtCodigo.setText("");
    }//GEN-LAST:event_btnSalvarProdActionPerformed

    private void btnEditarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdActionPerformed
        // Botão editar

        Produtos obj = new Produtos();
        obj.setNome(txtDescriProdutos.getText());
        obj.setRg(txtPrecoProdutos.getText());
        obj.setCpf(txtCpf.getText());
        obj.setEmail(txtEmail.getText());
        obj.setTelefone(txtTelefone.getText());
        obj.setCelular(txtCelular.getText());
        obj.setCep(txtCep.getText());
        obj.setEndereco(txtEndereco.getText());
        obj.setNumero(Integer.parseInt(txtNumero.getText()));
        obj.setComplemento(txtComplemento.getText());
        obj.setBairro(txtBairro.getText());
        obj.setCidade(txtCidade.getText());
        obj.setUf(cbUf.getSelectedItem().toString());

        obj.setId(Integer.parseInt(txtiCodigoProdutos.getText()));

        ProdutosDao dao = new ProdutosDao();
        dao.alterarProduto(obj);

        new Utilitarios().LimparTela(painelDadosCadastro);

    }//GEN-LAST:event_btnEditarProdActionPerformed

    private void btnLimparProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparProdActionPerformed
        // Limpa todos os campos:

        new Utilitarios().LimparTela(painelDadosCadastro);
        new Utilitarios().LimparTela(painelDadosConsulta);
    }//GEN-LAST:event_btnLimparProdActionPerformed

    private void btnExcluirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdActionPerformed
        // Botão Excluir

        Produtos obj = new Produtos();

        obj.setId(Integer.parseInt(txtiCodigoProdutos.getText()));

        ProdutosDao dao = new ProdutosDao();
        dao.exluirProduto(obj);

        new Utilitarios().LimparTela(painelDadosCadastro);

    }//GEN-LAST:event_btnExcluirProdActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarProd;
    private javax.swing.JButton btnExcluirProd;
    private javax.swing.JButton btnLimparProd;
    private javax.swing.JButton btnPesquisaProd;
    private javax.swing.JButton btnSalvarProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane painelCadastroProduto;
    private javax.swing.JPanel painelDadosCadastroProduto;
    private javax.swing.JPanel painelDadosConsultaProduto;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextField txtDescriProduto;
    private javax.swing.JTextField txtFornProduto;
    private javax.swing.JTextField txtPesquisaProduto;
    private javax.swing.JFormattedTextField txtPrecoProduto;
    // End of variables declaration//GEN-END:variables
}
