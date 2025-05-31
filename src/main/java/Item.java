public class Item {
	private String nome;
	private int codigo;
	private double preco;
	private double desconto;

	
	public Item(String nome, double preco, int codigo, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.codigo = codigo;
		this.desconto = desconto;
	
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
	public void getDesconto( double desconto){

	}public void setDesconto( double desconto){

	}

	
public void Apresentar(){
   System.out.println("nome do item "+nome+" codigo do item "+codigo+" preço do item "+preco);
	
}
}

