package projeto.evidencia.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.evidencia.loja.dto.UserDTO;
import projeto.evidencia.loja.servicies.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserServices services;

	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {
		return ResponseEntity.ok(services.findAll());

	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable Long id){
		return ResponseEntity.ok(services.findById(id));
		
	}

}
