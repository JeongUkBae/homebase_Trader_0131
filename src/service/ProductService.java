package service;

import java.util.List;

import domain.ProductDTO;

public interface ProductService {
	public void registCustomer(ProductDTO ordd);
	
	public List<ProductDTO> bringAllOrdersList();
	public List<ProductDTO> retrieveOrders(String searchWord);
	public ProductDTO retrieveOrder(String searchWord);
	public int countOrder();
	public boolean existsOrder(String searchWord);
	
	public void modifyOrder(ProductDTO ordd);
	public void removeOrder(ProductDTO ordd);
}
