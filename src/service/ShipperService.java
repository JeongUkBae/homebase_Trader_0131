package service;

import java.util.List;

import domain.ShipperDTO;

public interface ShipperService {
	public void registCustomer(ShipperDTO ordd);
	
	public List<ShipperDTO> bringAllOrdersList();
	public List<ShipperDTO> retrieveOrders(String searchWord);
	public ShipperDTO retrieveOrder(String searchWord);
	public int countOrder();
	public boolean existsOrder(String searchWord);
	
	public void modifyOrder(ShipperDTO ordd);
	public void removeOrder(ShipperDTO ordd);
}
