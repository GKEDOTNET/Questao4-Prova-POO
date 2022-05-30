/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Gustavo Kovaleski Estlin
 */
public class Musico {
    	private String nome;
	private double comissao;
        private String genero;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
	
    	@Override
	public String toString() {
		return "\nMusico: " + this.nome 
				+ " Comissao R$ "+ this.comissao 
				+ " Genêro: "+ this.genero;
	}

}
