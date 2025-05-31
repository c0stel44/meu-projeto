public class Item {
	private String nome;
	private int codigo;
	private double preco;
	
	public Item(String nome, double preco, int codigo) {
		this.nome = nome;
		this.preco = preco;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreço(double preco) {
		this.preco = preco;
	}
	
public void Apresentar(){
   System.out.println("nome do item "+nome+" codigo do item "+codigo+" preço do item "+preco);
	
}
}

