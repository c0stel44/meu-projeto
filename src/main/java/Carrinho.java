import java.util.ArrayList;
import java.util.List;

public class Carrinho {
 private ArrayList<Item> itens;
 
 	public void Carrinho() {
 		itens = new ArrayList<>();
 	}
	
	public void AdionarItem(Item item) {
		itens.add(item);
		
	}
	
	public void removeritem(int codigo) {
		for(int i=0;i<itens.size();i++){
			if(itens.get(i).getCodigo()==codigo) {
			System.out.println(itens.get(i).getNome()+"foi removido com sucesso");
			itens.remove(i);
			}
			
					
				}
		
			}
				
	public void Calcularpreco(double preco) {
		double valor = 0;
		for(int i=0;i<itens.size();i++) {
			valor += itens.get(i).getPreco();
		
		}
			
	}
}
	
	

