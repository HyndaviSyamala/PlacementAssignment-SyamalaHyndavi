package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.models.Orders;
import in.ineuron.repository.OrderRepository;


@Service
public class OrderServiceImpl implements IOrderService {
	
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public Orders addOrder(Orders order) {
		
		
		return orderRepository.save(order);
	}

}
