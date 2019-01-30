package service;

import java.util.List;

import domain.SupplierDTO;

public class SupplierServiceImpl implements SupplierService{
	private static SupplierServiceImpl instance = new SupplierServiceImpl();
	private SupplierServiceImpl() {}
	public static SupplierServiceImpl getInstance() {return instance;}

	@Override
	public void registCustomer(SupplierDTO ordd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SupplierDTO> bringAllOrdersList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SupplierDTO> retrieveOrders(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SupplierDTO retrieveOrder(String searchWord) {
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
	public void modifyOrder(SupplierDTO ordd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeOrder(SupplierDTO ordd) {
		// TODO Auto-generated method stub
		
	}

}
