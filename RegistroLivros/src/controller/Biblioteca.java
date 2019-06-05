package controller;

import java.util.ArrayList;

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
    
    public void remover(Livro livro){
        listaLivros.remove(livro);
    }
    
    public void editar(){
        
    }
    
    public void listarTodos(){
        
    }
    
    public void listarEditora(){
        
    }
    
}
