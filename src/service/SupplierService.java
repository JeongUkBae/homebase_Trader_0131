package service;

import java.util.List;

import domain.SupplierDTO;

public interface SupplierService {
	public void registCustomer(SupplierDTO ordd);
	
	public List<SupplierDTO> bringAllOrdersList();
	public List<SupplierDTO> retrieveOrders(String searchWord);
	public SupplierDTO retrieveOrder(String searchWord);
	public int countOrder();
	public boolean existsOrder(String searchWord);
	
	public void modifyOrder(SupplierDTO ordd);
	public void removeOrder(SupplierDTO ordd);
}
