package objetos;

import classes.Fornecedor;
import classes.Produto;

public class UsarProduto {

	public static void main(String[] args) {
		Fornecedor dell = new Fornecedor();
		dell.setRazaoSocial("Dell Computer");
		dell.setNomeFantasia("Dell");
		dell.setCnpj("42152364587");
		System.out.println(dell.cadastro());
		
		Produto mouse = new Produto();
		mouse.setNome("Mouse sem Fio");
		mouse.setDescricao("Mouse sem fio recarregável");
		mouse.setPreco(49.99);
		mouse.setFornecedor(dell);
		System.out.println(mouse.cadastrar());
		System.out.println("O preço do produto é R$ "+mouse.getpPreco());

	}

}
