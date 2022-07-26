package projeto.evidencia.loja.servicies;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.evidencia.loja.dto.OrderDTO;
import projeto.evidencia.loja.entities.Order;
import projeto.evidencia.loja.repositories.OrderRepository;

@Service
public class OrderService {

	private static Logger logger = LoggerFactory.getLogger(OrderService.class);

	@Autowired
	private OrderRepository repository;

	public List<OrderDTO> findAll() {
		logger.info("find all entities");
		List<Order> user = repository.findAll();
		return user.stream().map(this::converterEntityForDTO).collect(Collectors.toList());

	}

	public OrderDTO findById(Long id) {
		Order oreder = repository.findById(id).get();
		return converterEntityForDTO(oreder);
	}

	// conversores

	public OrderDTO converterEntityForDTO(Order order) {

		OrderDTO dto = new OrderDTO();
		dto.setId(order.getId());
		dto.setMoment(order.getMoment());
		dto.setOrderStatus(order.getOrderStatus());
		dto.setClient(order.getClient());
		return dto;
	}

}
