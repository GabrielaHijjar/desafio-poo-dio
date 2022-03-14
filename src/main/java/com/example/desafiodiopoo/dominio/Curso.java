package com.example.desafiodiopoo.dominio;

public class Curso extends Conteudo {
   private String titulo;
   private String descricao;
   private int cargahoraria;


    @Override
    public double calcularXP() {
        return XP_PADRAO * cargahoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }


    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao()+ '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }
}
