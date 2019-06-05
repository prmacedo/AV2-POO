package controller;

public class Livro {

    private String titulo;
    private String editora;
    private int edicao;
    private String area;

    public Livro(String titulo, String editora, int edicao, String area) {
        this.titulo = titulo;
        this.editora = editora;
        this.edicao = edicao;
        this.area = area;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
}
