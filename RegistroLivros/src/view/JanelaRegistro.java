/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Biblioteca;
import controller.Livro;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class JanelaRegistro extends javax.swing.JFrame {

    /**
     * Creates new form JanelaRegistro
     */
    
    public void carregarTabela(){
        Object Colunas[] = {"Título", "Editora", "Edição", "Área"};
        DefaultTableModel modelo = new DefaultTableModel();
    }
    
    public JanelaRegistro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    Biblioteca biblioteca = new Biblioteca();
    private String modo;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_cdt = new javax.swing.JPanel();
        label_titulo = new javax.swing.JLabel();
        label_editora = new javax.swing.JLabel();
        label_edicao = new javax.swing.JLabel();
        label_area = new javax.swing.JLabel();
        cdt_titulo = new javax.swing.JTextField();
        cdt_editora = new javax.swing.JTextField();
        cdt_edicao = new javax.swing.JTextField();
        cdt_area = new javax.swing.JTextField();
        btn_novo = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        painel_lista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_livros = new javax.swing.JTable();
        label_buscar = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Livros");
        setResizable(false);

        painel_cdt.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        label_titulo.setText("Título:");

        label_editora.setText("Editora:");

        label_edicao.setText("Edição:");

        label_area.setText("Área:");

        cdt_titulo.setEnabled(false);

        cdt_editora.setEnabled(false);

        cdt_edicao.setEnabled(false);

        cdt_area.setEnabled(false);

        javax.swing.GroupLayout painel_cdtLayout = new javax.swing.GroupLayout(painel_cdt);
        painel_cdt.setLayout(painel_cdtLayout);
        painel_cdtLayout.setHorizontalGroup(
            painel_cdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_cdtLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_cdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painel_cdtLayout.createSequentialGroup()
                        .addComponent(label_titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cdt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_cdtLayout.createSequentialGroup()
                        .addComponent(label_editora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cdt_editora))
                    .addGroup(painel_cdtLayout.createSequentialGroup()
                        .addComponent(label_edicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cdt_edicao))
                    .addGroup(painel_cdtLayout.createSequentialGroup()
                        .addComponent(label_area)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cdt_area)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        painel_cdtLayout.setVerticalGroup(
            painel_cdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_cdtLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_cdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_titulo)
                    .addComponent(cdt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_cdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_editora)
                    .addComponent(cdt_editora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_cdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_edicao)
                    .addComponent(cdt_edicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel_cdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_area)
                    .addComponent(cdt_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_excluir.setText("Excluir");

        painel_lista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listagem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tabela_livros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Editora", "Edição", "Área"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_livros.getTableHeader().setReorderingAllowed(false);
        tabela_livros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_livrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_livros);
        if (tabela_livros.getColumnModel().getColumnCount() > 0) {
            tabela_livros.getColumnModel().getColumn(0).setResizable(false);
            tabela_livros.getColumnModel().getColumn(0).setPreferredWidth(300);
            tabela_livros.getColumnModel().getColumn(1).setResizable(false);
            tabela_livros.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabela_livros.getColumnModel().getColumn(2).setResizable(false);
            tabela_livros.getColumnModel().getColumn(2).setPreferredWidth(75);
            tabela_livros.getColumnModel().getColumn(3).setResizable(false);
            tabela_livros.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        label_buscar.setText("Buscar editora:");

        btn_buscar.setText("Buscar");

        javax.swing.GroupLayout painel_listaLayout = new javax.swing.GroupLayout(painel_lista);
        painel_lista.setLayout(painel_listaLayout);
        painel_listaLayout.setHorizontalGroup(
            painel_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(painel_listaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(label_buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_buscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_listaLayout.setVerticalGroup(
            painel_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_listaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_buscar)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_editar.setText("Editar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painel_lista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painel_cdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 107, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painel_cdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(painel_lista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        modo = "Novo";
        
        cdt_titulo.setText("");
        cdt_editora.setText("");
        cdt_edicao.setText("");
        cdt_area.setText("");
        
        cdt_titulo.setEnabled(true);
        cdt_editora.setEnabled(true);
        cdt_edicao.setEnabled(true);
        cdt_area.setEnabled(true);
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        cdt_titulo.setText("");
        cdt_editora.setText("");
        cdt_edicao.setText("");
        cdt_area.setText("");
        
        cdt_titulo.setEnabled(false);
        cdt_editora.setEnabled(false);
        cdt_edicao.setEnabled(false);
        cdt_area.setEnabled(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        if(modo.equals("Novo")){
            Livro livro = new Livro(cdt_titulo.getText(), cdt_editora.getText(), Integer.parseInt(cdt_edicao.getText()), cdt_area.getText());
            biblioteca.adicionar(livro);
            biblioteca.listarTodos();
        } else if(modo.equals("Editar")){
            
        }

        cdt_titulo.setText("");
        cdt_editora.setText("");
        cdt_edicao.setText("");
        cdt_area.setText("");
        
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void tabela_livrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_livrosMouseClicked
        int index = tabela_livros.getSelectedRow();
        if(index >= 0 && index < tabela_livros.getRowCount()){
            Livro livro = biblioteca.listaLivros.get(index);
            cdt_titulo.setText(livro.getTitulo());
            cdt_editora.setText(livro.getEditora());
            cdt_edicao.setText(String.valueOf(livro.getEdicao()));
            cdt_area.setText(livro.getArea());
        }
    }//GEN-LAST:event_tabela_livrosMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JTextField cdt_area;
    private javax.swing.JTextField cdt_edicao;
    private javax.swing.JTextField cdt_editora;
    private javax.swing.JTextField cdt_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_area;
    private javax.swing.JLabel label_buscar;
    private javax.swing.JLabel label_edicao;
    private javax.swing.JLabel label_editora;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JPanel painel_cdt;
    private javax.swing.JPanel painel_lista;
    private javax.swing.JTable tabela_livros;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
