package service;

import java.util.List;

import domain.ShipperDTO;

public class ShipperServiceImpl implements ShipperService{
	private static ShipperServiceImpl instance = new ShipperServiceImpl();
	private ShipperServiceImpl() {}
	public static ShipperServiceImpl getInstance() {return instance;}

	@Override
	public void registCustomer(ShipperDTO ordd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ShipperDTO> bringAllOrdersList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShipperDTO> retrieveOrders(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShipperDTO retrieveOrder(String searchWord) {
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
	public void modifyOrder(ShipperDTO ordd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeOrder(ShipperDTO ordd) {
		// TODO Auto-generated method stub
		
	}

}
