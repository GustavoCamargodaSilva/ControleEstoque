package entities;

import java.util.ArrayList;
import java.util.List;

public class Product {
		private String name;
		private String descricao;
		private Double preco;
		
		List<Product> products = new ArrayList<>();
		
		public Product(){
			
		}

		public Product(String name, String descricao, Double preco) {
			super();
			this.name = name;
			this.descricao = descricao;
			this.preco = preco;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public Double getPreco() {
			return preco;
		}

		public void setPreco(Double preco) {
			this.preco = preco;
		}
		
		public String toString() {
			return "Name: " + name +
				   "Descrição: " + descricao +
				   "Preco: " + preco;
					
		}
		
		

		
		



		
		
		
		
}
