package service;

import java.util.List;

import domain.ProductDTO;

public class ProductServiceImpl implements ProductService{
	private static ProductServiceImpl instance = new ProductServiceImpl();
	private ProductServiceImpl() {}
	public static ProductServiceImpl getInstance() {return instance;}

	@Override
	public void registCustomer(ProductDTO ordd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductDTO> bringAllOrdersList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDTO> retrieveOrders(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO retrieveOrder(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsOrder(String searchWord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modifyOrder(ProductDTO ordd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeOrder(ProductDTO ordd) {
		// TODO Auto-generated method stub
		
	}

}
