package projeto.evidencia.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.evidencia.loja.dto.OrderDTO;
import projeto.evidencia.loja.servicies.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService service;

	@GetMapping
	public ResponseEntity<List<OrderDTO>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@GetMapping("/order/{id}")
	public ResponseEntity<OrderDTO> findById(@PathVariable Long id) {
		return ResponseEntity.ok(service.findById(id));
	}

}
