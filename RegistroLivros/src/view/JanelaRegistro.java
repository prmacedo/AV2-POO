package view;

import controller.Biblioteca;
import controller.Livro;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class JanelaRegistro extends javax.swing.JFrame {
    
    public JanelaRegistro() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/books.png")));
    }

    Biblioteca biblioteca = new Biblioteca();
    private String modo = "Inicial";
    private int indiceEditar = 0;
    
    public void carregarTabela(){
        tabelaLivros.setModel(biblioteca.listarTodos());
        if (tabelaLivros.getColumnModel().getColumnCount() > 0) {
            tabelaLivros.getColumnModel().getColumn(0).setResizable(false);
            tabelaLivros.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelaLivros.getColumnModel().getColumn(1).setResizable(false);
            tabelaLivros.getColumnModel().getColumn(1).setPreferredWidth(300);
            tabelaLivros.getColumnModel().getColumn(2).setResizable(false);
            tabelaLivros.getColumnModel().getColumn(2).setPreferredWidth(150);
            tabelaLivros.getColumnModel().getColumn(3).setResizable(false);
            tabelaLivros.getColumnModel().getColumn(3).setPreferredWidth(80);
            tabelaLivros.getColumnModel().getColumn(4).setResizable(false);
            tabelaLivros.getColumnModel().getColumn(4).setPreferredWidth(150);
        }
    }
    
    public void carregarBusca(String busca){
        tabelaLivros.setModel(biblioteca.listarEditora(busca));
        if (tabelaLivros.getColumnModel().getColumnCount() > 0) {
            tabelaLivros.getColumnModel().getColumn(0).setResizable(false);
            tabelaLivros.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelaLivros.getColumnModel().getColumn(1).setResizable(false);
            tabelaLivros.getColumnModel().getColumn(1).setPreferredWidth(300);
            tabelaLivros.getColumnModel().getColumn(2).setResizable(false);
            tabelaLivros.getColumnModel().getColumn(2).setPreferredWidth(150);
            tabelaLivros.getColumnModel().getColumn(3).setResizable(false);
            tabelaLivros.getColumnModel().getColumn(3).setPreferredWidth(80);
            tabelaLivros.getColumnModel().getColumn(4).setResizable(false);
            tabelaLivros.getColumnModel().getColumn(4).setPreferredWidth(150);
        }
    }
    
    public void limparCampos(){
        cdtTitulo.setText("");
        cdtEditora.setText("");
        cdtEdicao.setText("");
        cdtArea.setText("");
        txtBuscar.setText("");
    }
    
    public void habilitarModo(){
        switch (modo){
            case "Inicial":
                btnNovo.setEnabled(true);
                btnSalvar.setEnabled(false);
                btnCancelar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnEditar.setEnabled(false);
                cdtTitulo.setEnabled(false);
                cdtEditora.setEnabled(false);
                cdtEdicao.setEnabled(false);
                cdtArea.setEnabled(false);
            break;
                
            case "Novo":
                btnNovo.setEnabled(false);
                btnSalvar.setEnabled(true);
                btnCancelar.setEnabled(true);
                btnExcluir.setEnabled(false);
                btnEditar.setEnabled(false);
                cdtTitulo.setEnabled(true);
                cdtEditora.setEnabled(true);
                cdtEdicao.setEnabled(true);
                cdtArea.setEnabled(true);
            break;
            
            case "Editar":
                btnNovo.setEnabled(false);
                btnSalvar.setEnabled(true);
                btnCancelar.setEnabled(true);
                btnExcluir.setEnabled(false);
                btnEditar.setEnabled(false);
                cdtTitulo.setEnabled(true);
                cdtEditora.setEnabled(true);
                cdtEdicao.setEnabled(true);
                cdtArea.setEnabled(true);
            break;
            
            case "Clicado":
                btnNovo.setEnabled(true);
                btnSalvar.setEnabled(false);
                btnCancelar.setEnabled(true);
                btnExcluir.setEnabled(true);
                btnEditar.setEnabled(true);
                cdtTitulo.setEnabled(false);
                cdtEditora.setEnabled(false);
                cdtEdicao.setEnabled(false);
                cdtArea.setEnabled(false);
            break;
            
            case "Buscar":
                btnNovo.setEnabled(true);
                btnSalvar.setEnabled(false);
                btnCancelar.setEnabled(true);
                btnExcluir.setEnabled(false);
                btnEditar.setEnabled(false);
                cdtTitulo.setEnabled(false);
                cdtEditora.setEnabled(false);
                cdtEdicao.setEnabled(false);
                cdtArea.setEnabled(false);
            break;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCdt = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelEditora = new javax.swing.JLabel();
        labelEdicao = new javax.swing.JLabel();
        labelArea = new javax.swing.JLabel();
        cdtTitulo = new javax.swing.JTextField();
        cdtEditora = new javax.swing.JTextField();
        cdtEdicao = new javax.swing.JTextField();
        cdtArea = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        painelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLivros = new javax.swing.JTable();
        labelBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        tituloPrograma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Livros");
        setResizable(false);

        painelCdt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        labelTitulo.setText("Título:");

        labelEditora.setText("Editora:");

        labelEdicao.setText("Edição:");

        labelArea.setText("Área:");

        cdtTitulo.setEnabled(false);

        cdtEditora.setEnabled(false);

        cdtEdicao.setEnabled(false);

        cdtArea.setEnabled(false);

        javax.swing.GroupLayout painelCdtLayout = new javax.swing.GroupLayout(painelCdt);
        painelCdt.setLayout(painelCdtLayout);
        painelCdtLayout.setHorizontalGroup(
            painelCdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCdtLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEditora)
                    .addComponent(labelTitulo)
                    .addComponent(labelEdicao)
                    .addComponent(labelArea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cdtArea, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addGroup(painelCdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cdtEdicao)
                        .addComponent(cdtTitulo)
                        .addComponent(cdtEditora, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelCdtLayout.setVerticalGroup(
            painelCdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCdtLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(cdtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEditora)
                    .addComponent(cdtEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEdicao)
                    .addComponent(cdtEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCdtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelArea)
                    .addComponent(cdtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/notebook.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btn-salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btn-excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        painelLista.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Listagem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tabelaLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Título", "Editora", "Edição", "Área"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        tabelaLivros.getTableHeader().setResizingAllowed(false);
        tabelaLivros.getTableHeader().setReorderingAllowed(false);
        tabelaLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaLivrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaLivros);
        if (tabelaLivros.getColumnModel().getColumnCount() > 0) {
            tabelaLivros.getColumnModel().getColumn(0).setResizable(false);
            tabelaLivros.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabelaLivros.getColumnModel().getColumn(1).setResizable(false);
            tabelaLivros.getColumnModel().getColumn(1).setPreferredWidth(300);
            tabelaLivros.getColumnModel().getColumn(2).setResizable(false);
            tabelaLivros.getColumnModel().getColumn(2).setPreferredWidth(150);
            tabelaLivros.getColumnModel().getColumn(3).setResizable(false);
            tabelaLivros.getColumnModel().getColumn(3).setPreferredWidth(80);
            tabelaLivros.getColumnModel().getColumn(4).setResizable(false);
            tabelaLivros.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        labelBuscar.setText("Buscar editora:");

        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarMouseClicked(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/book.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelListaLayout = new javax.swing.GroupLayout(painelLista);
        painelLista.setLayout(painelListaLayout);
        painelListaLayout.setHorizontalGroup(
            painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListaLayout.createSequentialGroup()
                .addGroup(painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelListaLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(labelBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar))
                    .addGroup(painelListaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelListaLayout.setVerticalGroup(
            painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        tituloPrograma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tituloPrograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/books.png"))); // NOI18N
        tituloPrograma.setText("Sistema de Controle de Livros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(painelCdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(tituloPrograma)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(painelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPrograma)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(painelCdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        modo = "Novo";  
        limparCampos();
        habilitarModo();
        carregarTabela();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
        if(modo.equals("Clicado") || modo.equals("Buscar")){
            carregarTabela();
        }
        modo = "Inicial";
        habilitarModo();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        boolean foiSalvo = false;
        try {
            if (cdtTitulo.getText().trim().isEmpty() || cdtEditora.getText().trim().isEmpty() || cdtEdicao.getText().trim().isEmpty() || cdtArea.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos", "ERRO", JOptionPane.ERROR_MESSAGE);
            } else {
                Livro livro = new Livro(cdtTitulo.getText(), cdtEditora.getText(), Integer.parseInt(cdtEdicao.getText()), cdtArea.getText());
                if(modo.equals("Novo")){
                    biblioteca.adicionar(livro);
                    foiSalvo = true;
                    JOptionPane.showMessageDialog(null, "Salvo com sucesso!!!", "SUCESSO", JOptionPane.DEFAULT_OPTION);
                } else if(modo.equals("Editar")){
                    biblioteca.editar(indiceEditar, livro);
                    modo = "Inicial";
                    foiSalvo = true;
                    JOptionPane.showMessageDialog(null, "Alterado com sucesso!!!", "SUCESSO", JOptionPane.DEFAULT_OPTION);
                }
            }
        } catch (NumberFormatException e) {
            if(!cdtEdicao.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "A edição deve ter valor numérico", "ERRO", JOptionPane.INFORMATION_MESSAGE);
                cdtEdicao.setText("");
            }
        } finally {
            if(foiSalvo){
                limparCampos();
            }
        }
        habilitarModo();
        carregarTabela();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tabelaLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaLivrosMouseClicked
        modo = "Clicado";
        int codigo = Integer.parseInt(tabelaLivros.getModel().getValueAt(tabelaLivros.getSelectedRow(), 0).toString());
        int index = codigo - 1;
//        System.out.println(tabelaLivros.getRowCount());
//        int ultimoIndice = Integer.parseInt(tabelaLivros.getModel().getValueAt(tabelaLivros.getRowCount()-1, 0).toString());
        indiceEditar = index;
//        System.out.println(ultimoIndice);
//        System.out.println(index);
//        if(index >= 0 && index < ultimoIndice){
            Livro livro = biblioteca.listaLivros.get(index);
            cdtTitulo.setText(livro.getTitulo());
            cdtEditora.setText(livro.getEditora());
            cdtEdicao.setText(String.valueOf(livro.getEdicao()));
            cdtArea.setText(livro.getArea());
//        }
        habilitarModo();
        String busca = txtBuscar.getText();
        if(!busca.isEmpty() || !busca.equals("")){
            carregarBusca(busca);
        }
        modo = "Buscar";
    }//GEN-LAST:event_tabelaLivrosMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        biblioteca.remover(indiceEditar);
        JOptionPane.showMessageDialog(null, "Excluído com sucesso!!!", "SUCESSO", JOptionPane.DEFAULT_OPTION);
        modo = "Inicial";
        carregarTabela();
        limparCampos();
        habilitarModo();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        modo = "Editar";        
        habilitarModo();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String busca = txtBuscar.getText();
        if(busca.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo de busca", "Busca", JOptionPane.CANCEL_OPTION);
            carregarTabela();
        }
        carregarBusca(busca);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseClicked
        modo = "Buscar";
        habilitarModo();
    }//GEN-LAST:event_txtBuscarMouseClicked

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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField cdtArea;
    private javax.swing.JTextField cdtEdicao;
    private javax.swing.JTextField cdtEditora;
    private javax.swing.JTextField cdtTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelArea;
    private javax.swing.JLabel labelBuscar;
    private javax.swing.JLabel labelEdicao;
    private javax.swing.JLabel labelEditora;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelCdt;
    private javax.swing.JPanel painelLista;
    private javax.swing.JTable tabelaLivros;
    private javax.swing.JLabel tituloPrograma;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
