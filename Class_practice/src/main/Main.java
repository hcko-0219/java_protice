package main;

import practice.Product;
import practice.ProductList;

public class Main {

	public static void main(String[] args) {
		Product asus = new Product("123-456", "asus");
		Product msi = new Product("456-789", "msi");
		Product amd = new Product("741-852", "amd");
		Product intel = new Product("852-963", "intel");

		System.out.printf("id = %s\nbrand = %s\n\n",msi.get_product_id(),msi.get_product_brand());
		System.out.printf("This a product is fake ? \n%s\n\n",Product.is_fake(msi));
		
		ProductList list_one = new ProductList();
		
		list_one.add_productlist(asus);
		list_one.add_productlist(msi);
		list_one.add_productlist(amd);
		list_one.add_productlist(intel);
		
		list_one.all_product_information();
	
		Product searched = list_one.search_product("741-852");
		
		if (searched == null) {
			System.out.println("The product is null");
		} else {
			System.out.printf("id = %s\nbrand = %s",searched.get_product_id(),searched.get_product_brand());
		}
		return;
	}

}
