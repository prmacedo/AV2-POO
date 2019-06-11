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
        tabela_livros.setModel(biblioteca.listarTodos());
        if (tabela_livros.getColumnModel().getColumnCount() > 0) {
            tabela_livros.getColumnModel().getColumn(0).setResizable(false);
            tabela_livros.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabela_livros.getColumnModel().getColumn(1).setResizable(false);
            tabela_livros.getColumnModel().getColumn(1).setPreferredWidth(300);
            tabela_livros.getColumnModel().getColumn(2).setResizable(false);
            tabela_livros.getColumnModel().getColumn(2).setPreferredWidth(150);
            tabela_livros.getColumnModel().getColumn(3).setResizable(false);
            tabela_livros.getColumnModel().getColumn(3).setPreferredWidth(80);
            tabela_livros.getColumnModel().getColumn(4).setResizable(false);
            tabela_livros.getColumnModel().getColumn(4).setPreferredWidth(150);
        }
    }
    
    public void carregarBusca(String busca){
        tabela_livros.setModel(biblioteca.listarEditora(busca));
        if (tabela_livros.getColumnModel().getColumnCount() > 0) {
            tabela_livros.getColumnModel().getColumn(0).setResizable(false);
            tabela_livros.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabela_livros.getColumnModel().getColumn(1).setResizable(false);
            tabela_livros.getColumnModel().getColumn(1).setPreferredWidth(300);
            tabela_livros.getColumnModel().getColumn(2).setResizable(false);
            tabela_livros.getColumnModel().getColumn(2).setPreferredWidth(150);
            tabela_livros.getColumnModel().getColumn(3).setResizable(false);
            tabela_livros.getColumnModel().getColumn(3).setPreferredWidth(80);
            tabela_livros.getColumnModel().getColumn(4).setResizable(false);
            tabela_livros.getColumnModel().getColumn(4).setPreferredWidth(150);
        }
    }
    
    public void limparCampos(){
        cdt_titulo.setText("");
        cdt_editora.setText("");
        cdt_edicao.setText("");
        cdt_area.setText("");
        txt_buscar.setText("");
    }
    
    public void habilitarModo(){
        switch (modo){
            case "Inicial":
                btn_novo.setEnabled(true);
                btn_salvar.setEnabled(false);
                btn_cancelar.setEnabled(false);
                btn_excluir.setEnabled(false);
                btn_editar.setEnabled(false);
                cdt_titulo.setEnabled(false);
                cdt_editora.setEnabled(false);
                cdt_edicao.setEnabled(false);
                cdt_area.setEnabled(false);
            break;
                
            case "Novo":
                btn_novo.setEnabled(false);
                btn_salvar.setEnabled(true);
                btn_cancelar.setEnabled(true);
                btn_excluir.setEnabled(false);
                btn_editar.setEnabled(false);
                cdt_titulo.setEnabled(true);
                cdt_editora.setEnabled(true);
                cdt_edicao.setEnabled(true);
                cdt_area.setEnabled(true);
            break;
            
            case "Editar":
                btn_novo.setEnabled(false);
                btn_salvar.setEnabled(true);
                btn_cancelar.setEnabled(true);
                btn_excluir.setEnabled(false);
                btn_editar.setEnabled(false);
                cdt_titulo.setEnabled(true);
                cdt_editora.setEnabled(true);
                cdt_edicao.setEnabled(true);
                cdt_area.setEnabled(true);
            break;
            
            case "Clicado":
                btn_novo.setEnabled(true);
                btn_salvar.setEnabled(false);
                btn_cancelar.setEnabled(true);
                btn_excluir.setEnabled(true);
                btn_editar.setEnabled(true);
                cdt_titulo.setEnabled(false);
                cdt_editora.setEnabled(false);
                cdt_edicao.setEnabled(false);
                cdt_area.setEnabled(false);
            break;
            
            case "Buscar":
                btn_novo.setEnabled(true);
                btn_salvar.setEnabled(false);
                btn_cancelar.setEnabled(true);
                btn_excluir.setEnabled(false);
                btn_editar.setEnabled(false);
                cdt_titulo.setEnabled(false);
                cdt_editora.setEnabled(false);
                cdt_edicao.setEnabled(false);
                cdt_area.setEnabled(false);
            break;
        }
    }
    
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Livros");
        setResizable(false);

        painel_cdt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

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
                        .addComponent(cdt_titulo))
                    .addGroup(painel_cdtLayout.createSequentialGroup()
                        .addComponent(label_editora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cdt_editora, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                    .addGroup(painel_cdtLayout.createSequentialGroup()
                        .addComponent(label_edicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cdt_edicao))
                    .addGroup(painel_cdtLayout.createSequentialGroup()
                        .addComponent(label_area)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cdt_area)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/notebook.png"))); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btn-salvar.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.setEnabled(false);
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.setEnabled(false);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/btn-excluir.png"))); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.setEnabled(false);
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        painel_lista.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Listagem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        tabela_livros.setModel(new javax.swing.table.DefaultTableModel(
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
        tabela_livros.getTableHeader().setResizingAllowed(false);
        tabela_livros.getTableHeader().setReorderingAllowed(false);
        tabela_livros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela_livrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela_livros);
        if (tabela_livros.getColumnModel().getColumnCount() > 0) {
            tabela_livros.getColumnModel().getColumn(0).setResizable(false);
            tabela_livros.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabela_livros.getColumnModel().getColumn(1).setResizable(false);
            tabela_livros.getColumnModel().getColumn(1).setPreferredWidth(300);
            tabela_livros.getColumnModel().getColumn(2).setResizable(false);
            tabela_livros.getColumnModel().getColumn(2).setPreferredWidth(150);
            tabela_livros.getColumnModel().getColumn(3).setResizable(false);
            tabela_livros.getColumnModel().getColumn(3).setPreferredWidth(80);
            tabela_livros.getColumnModel().getColumn(4).setResizable(false);
            tabela_livros.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        label_buscar.setText("Buscar editora:");

        txt_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_buscarMouseClicked(evt);
            }
        });

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/book.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_listaLayout = new javax.swing.GroupLayout(painel_lista);
        painel_lista.setLayout(painel_listaLayout);
        painel_listaLayout.setHorizontalGroup(
            painel_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_listaLayout.createSequentialGroup()
                .addGroup(painel_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_listaLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(label_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_buscar))
                    .addGroup(painel_listaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.setEnabled(false);
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/books.png"))); // NOI18N
        jLabel1.setText("Sistema de Controle de Livros");

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
                                .addComponent(painel_cdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(painel_lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(painel_cdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painel_lista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        modo = "Novo";  
        limparCampos();
        habilitarModo();
        carregarTabela();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        limparCampos();
        if(modo.equals("Clicado") || modo.equals("Buscar")){
            carregarTabela();
        }
        modo = "Inicial";
        habilitarModo();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        boolean foiSalvo = false;
        try {
            if (cdt_titulo.getText().isEmpty() || cdt_editora.getText().isEmpty() || 
                cdt_edicao.getText().isEmpty() || cdt_area.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos", "ERRO", JOptionPane.ERROR_MESSAGE);
            } else {
                Livro livro = new Livro(cdt_titulo.getText(), cdt_editora.getText(), Integer.parseInt(cdt_edicao.getText()), cdt_area.getText());
                if(modo.equals("Novo")){
                    biblioteca.adicionar(livro);
                    foiSalvo = true;
                } else if(modo.equals("Editar")){
//                    int index = tabela_livros.getSelectedRow();
//                    System.out.println(indiceEditar);
                    biblioteca.editar(indiceEditar, livro);
                    modo = "Inicial";
                    foiSalvo = true;
                }
            }
        } catch (NumberFormatException e) {
            if(!cdt_edicao.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "A edição deve ter valor numérico", "ERRO", JOptionPane.INFORMATION_MESSAGE);
                cdt_edicao.setText("");
            }
        } finally {
            if(foiSalvo){
                limparCampos();
            }
        }
        habilitarModo();
        carregarTabela();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void tabela_livrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela_livrosMouseClicked
        modo = "Clicado";
        int codigo = Integer.parseInt(tabela_livros.getModel().getValueAt(tabela_livros.getSelectedRow(), 0).toString());
        int index = codigo - 1;
        System.out.println(tabela_livros.getRowCount());
        int ultimoIndice = Integer.parseInt(tabela_livros.getModel().getValueAt(tabela_livros.getRowCount()-1, 0).toString());
        indiceEditar = index;
        System.out.println(ultimoIndice);
        System.out.println(index);
        if(index >= 0 && index < ultimoIndice){
            Livro livro = biblioteca.listaLivros.get(index);
            cdt_titulo.setText(livro.getTitulo());
            cdt_editora.setText(livro.getEditora());
            cdt_edicao.setText(String.valueOf(livro.getEdicao()));
            cdt_area.setText(livro.getArea());
        }
        habilitarModo();
        String busca = txt_buscar.getText();
        if(!busca.isEmpty() || !busca.equals("")){
            carregarBusca(busca);
        }
        modo = "Buscar";
    }//GEN-LAST:event_tabela_livrosMouseClicked

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
//        int index = tabela_livros.getSelectedRow();
        biblioteca.remover(indiceEditar);
        modo = "Inicial";
        carregarTabela();
        limparCampos();
        habilitarModo();
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        modo = "Editar";        
        habilitarModo();
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String busca = txt_buscar.getText();
        if(busca.isEmpty() || busca.equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo de busca", "Busca", JOptionPane.CANCEL_OPTION);
            carregarTabela();
        }
        carregarBusca(busca);
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txt_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_buscarMouseClicked
        modo = "Buscar";
        habilitarModo();
    }//GEN-LAST:event_txt_buscarMouseClicked

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
    private javax.swing.JLabel jLabel1;
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
