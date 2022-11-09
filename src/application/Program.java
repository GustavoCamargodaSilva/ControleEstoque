package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Product> products = new ArrayList<>();
		
		String escolha;
		
		do{
			System.out.println("************************************************");
			System.out.println("*      DIGITE O NUMERO DA OPERAÇÃO DESEJADA    *");
			System.out.println("************************************************");
			System.out.println("*          (1) PARA REGISTRAR PRODUTO          *");
			System.out.println("*          (2) PARA CONSULTAR PRODUTO          *");
			System.out.println("*          (3) PARA DELETAR PRODUTO            *");
			System.out.println("************************************************");
			System.out.print("Digite a operação: ");
			escolha = sc.next();
			
			switch (escolha) {
				case "1":
					System.out.print("Digite o nome do produto: ");
					String name = sc.next();
					System.out.print("Digite a descrição do produto: ");
					String descricao = sc.
					System.out.print("Digite o preço do produto: ");
					Double preco = sc.nextDouble();
					
					products.add(new Product(name,descricao,preco));
					
					break;
				
				case "2":
					for(Product prod : products) {
						System.out.printf("Name: " + prod.getName() + "\n Descrição: " + prod.getDescricao() + "\n Preço: " + ": $ %.2f\n", prod.getPreco());
					}
			}
			
			
			
		}while(escolha != "0");
		
		sc.close();
	}
}
