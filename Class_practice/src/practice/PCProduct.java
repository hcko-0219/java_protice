package practice;

public class PCProduct extends Product {
	private int core = 0;
	private String power = "0 W";
	
	public int get_product_core() {
		return this.core;
	}
	
	public String get_product_power() {
		return this.power;
	}
	
	public void set_product_core(int core_number) {
		this.core = core_number;
	}
	
	public void set_product_power(String power_number) {
		this.power = power_number;
	}
	
	public PCProduct() {}
	
	public PCProduct(String id, String brand, int core, String power) {
		this.set_product_id(id);
		this.set_product_brand(brand);
		this.set_product_core(core);
		this.set_product_power(power);
	}
	
	public void product_information() {
		System.out.printf("ID : %s\n",this.get_product_id());
		System.out.printf("Brand : %s\n",this.get_product_brand());
		System.out.printf("Core : %d\n",this.get_product_core());
		System.out.printf("Brand : %s\n",this.get_product_power());
	}
}
