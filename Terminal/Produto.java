package Desktop;

public class Produto {
	
	private float preco;
	private int ID;
	
	
	public Produto(float preco, int ID) {
            this.preco = preco;
            this.ID = ID;
	}
	
	public float getPreco() {
            return preco;
	}
        
        public void setPreco(float p){
            preco = p;
        }
	
	public int getID() {
            return ID;
	}
        
        public void setID(int id){
            ID = id;
        }
        
        public String getinfo(){
            return null;
        }
	
}
