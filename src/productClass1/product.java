package productClass1;

public class product {
	
	private int prod_id;
	private String prod_mame;
	private int prod_cost;
	public product() {
		prod_id=100;
		prod_mame="Scissor";
		prod_cost=10000;
	 
	}
	public product(int prod_id, String prod_mame, int prod_cost) {
		super();
		this.prod_id = prod_id;
		this.prod_mame = prod_mame;
		this.prod_cost = prod_cost;
	}
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_mame() {
		return prod_mame;
	}
	public void setProd_mame(String prod_mame) {
		this.prod_mame = prod_mame;
	}
	public int getProd_cost() {
		return prod_cost;
	}
	public void setProd_cost(int prod_cost) {
		this.prod_cost = prod_cost;
	}
	@Override
	public String toString() {
		return "product [prod_id=" + prod_id + ", prod_mame=" + prod_mame + ", prod_cost=" + prod_cost + "]";
	}
	
	
	 
	
	
	
	

}
