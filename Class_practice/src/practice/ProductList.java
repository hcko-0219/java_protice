package practice;

public class ProductList {
	public Product[] product_list = new Product[300];
	public int idx = 0;
	
	public void add_productlist(Product new_product) {
		if (idx > 299) {
			System.out.printf("LIST is full \n");
		} else {
			this.product_list[idx] = new_product;
			idx ++;
		}
	}
	
	public void del_list (int number) {
		if (number > 299) {
			System.out.printf("LIST is OVER \n");
		} else {
			for (int j=number; j<299; ++j) {
				this.product_list[j] = this.product_list[j+1];
			}
			--idx;
		}
	}
	
	public Product search_product (String id_name) {
		for (int i=0; i<idx; ++i) {
			if (product_list[i].get_product_id().equals(id_name)) {
				return product_list[i];
			}
		}
		return null;
	}
	
	public void all_product_information() {
		for (int i=0; i<idx; ++i) {
			System.out.printf("id : %s\nbrand : %s\n",product_list[i].get_product_id(),product_list[i].get_product_brand());
		}
	}
}
