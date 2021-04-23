package practice;

public class Product {
	private String id = "";
	private String brand = "";
	
	public Product() {}
	
	public Product(String id) {
		this.id = id;
		this.brand = "Anonymous";
	}
	
	public Product(String id, String brand) {
		this.id = id;
		this.brand = brand;
	}
	
	public String get_product_id() {
		return this.id;
	}
	
	public String get_product_brand() {
		return this.brand;
	}
	
	public void set_product_id(String id_name) {
		this.id = id_name;
	}
	
	public void set_product_brand(String brand_name) {
		this.brand = brand_name;
	}
	
	public static String is_fake(Product p) {
		if (p.get_product_id().equals("") && p.get_product_brand().equals("")) {
			return "The product is not there";
		} else {
			return "The product is there";
		}
	}
}
