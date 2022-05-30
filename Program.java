/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package app;

import java.util.Scanner;

/**
 *
 * @author Gustavo Kovaleski Estlin
 */
public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		
		ListaDeMusicos l1 = new ListaDeMusicos();
		int op;
		
		do {
			System.out.println("DIGITE");
			System.out.println("1 - Cadastrar Musico");
			System.out.println("2 - Visualizar Musico");
			System.out.println("3 - Ver quantidade de Musicos cadastrados");
			System.out.println("4 - Apagar todos os Musicos da lista");
			System.out.println("0 - Sair");
			op = sc.nextInt();
			
			switch(op) {
			case 1:
				Musico p1 = new Musico();
				System.out.println("Digite o nome do Musico: ");
				sc.nextLine();
				p1.setNome(sc.nextLine());
				System.out.println("Digite a comissao: ");
                                p1.setComissao(sc.nextDouble());
				if(p1.getComissao() <= 0 ) {
				System.out.println("Erro! Valor Inválido!");
				}
				System.out.println("Digite o Genero musical: ");
                                p1.setGenero(sc.next());
				l1.adicionarMusico(p1);
				System.out.println("Cadastrado com sucesso!");
				break;
			case 2:
				if(l1.getLista().isEmpty()) {
					System.out.println("Não há Musicos cadastrados!");
				}else {
					System.out.println(l1);
				}
				break;
			case 3:
				System.out.println("Total de cadastros:"
						+ l1.obterQuantidadeDeMusicos());
				break;
			case 4:
				if(l1.getLista().isEmpty()){
					System.out.println("Não há Musicos para excluir");
				}else {
					int confirma;
					System.out.println("Tem certeza que deseja EXCLUIR TUDO\n1-SIM\n2-NÃO");
					confirma = sc.nextInt();
					if(confirma == 1) {
						l1.apagarTudo();
						System.out.println("Musicos excluidos com suceso!");
					}else {
						System.out.println("Opção cancelada");
					}
				}
				break;

			case 0:
				System.out.println("Sistema encerrado.");
				break;
			default:
				System.out.println("Opção cancelada.");
			}
			
		}while(op!=0);
		
	}
        
    }

