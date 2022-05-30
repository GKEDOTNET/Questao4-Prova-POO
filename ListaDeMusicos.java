/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.ArrayList;

/**
 *
 * @author Gustavo Kovaleski Estlin
 */
public class ListaDeMusicos {
    
    	private ArrayList<Musico> lista;

	public ListaDeMusicos() {
		this.lista = new ArrayList<Musico>();
	}

	public ArrayList<Musico> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Musico> lista) {
		this.lista = lista;
	}

	public void adicionarMusico(Musico p1) {
		this.lista.add(p1);
	}

	public void apagarTudo() {
		this.lista.clear();
	}

	public int obterQuantidadeDeMusicos() {
		return this.lista.size();
	}

	@Override
	public String toString() {
		return "ListaDeMusicos {" + "lista= " + lista + '}';
	}
    
}
