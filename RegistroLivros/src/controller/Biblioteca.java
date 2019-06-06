package controller;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Biblioteca {

    public ArrayList<Livro> listaLivros = new ArrayList();
    
    public void adicionar(Livro livro){
        try{
            listaLivros.add(livro);
            System.out.println(livro.getTitulo() +livro.getArea()+livro.getEditora() + livro.getEdicao());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void remover(int index){
        listaLivros.remove(index);
    }
    
    public void editar(int index, Livro livro){
        listaLivros.get(index).setTitulo(livro.getTitulo());
        listaLivros.get(index).setEditora(livro.getEditora());
        listaLivros.get(index).setEdicao(livro.getEdicao());
        listaLivros.get(index).setArea(livro.getArea());        
    }
    
    public DefaultTableModel listarTodos(){
        Object Colunas[] = {"Título", "Editora", "Edição", "Área"};
        DefaultTableModel modelo = new DefaultTableModel(Colunas,0);
        for (int i = 0; i < listaLivros.size(); i++) {
            Object livro[] = new Object[] {listaLivros.get(i).getTitulo(),
                                           listaLivros.get(i).getEditora(),
                                           listaLivros.get(i).getEdicao(),
                                           listaLivros.get(i).getArea()};
               modelo.addRow(livro);
        }
        return modelo;
    }
    
    public void listarEditora(){
        
    }
    
}
