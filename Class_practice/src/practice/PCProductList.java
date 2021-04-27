package practice;

public class PCProductList {
	public PCProduct[] product_list = new PCProduct[300];
	public int idx = 0;
	
	public void add_productlist(PCProduct new_product) {
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
	
	public PCProduct search_product (String id_name) {
		for (int i=0; i<idx; ++i) {
			if (product_list[i].get_product_id().equals(id_name)) {
				return product_list[i];
			}
		}
		return null;
	}
	
	public void all_product_information() {
		for (int i=0; i<idx; ++i) {
			product_list[i].product_information();
			System.out.printf("\n");
		}
	}
}
