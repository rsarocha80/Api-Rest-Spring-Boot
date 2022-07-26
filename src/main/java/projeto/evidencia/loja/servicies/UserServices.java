package projeto.evidencia.loja.servicies;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projeto.evidencia.loja.dto.UserDTO;
import projeto.evidencia.loja.entities.User;
import projeto.evidencia.loja.repositories.UserRepository;

@Service
public class UserServices {

	private static Logger logger = LoggerFactory.getLogger(UserServices.class);

	@Autowired
	private UserRepository repository;

	public List<UserDTO> findAll() {
		logger.info("find all entities");
		List<User> user = repository.findAll();
		return user.stream().map(this::converterEntityForDTO).collect(Collectors.toList());

	}

	// conversores

	public UserDTO converterEntityForDTO(User user) {

		UserDTO dto = new UserDTO();
		dto.setName(user.getName());
		dto.setEmail(user.getEmail());
		dto.setPassword(user.getPassword());
		dto.setPhone(user.getPhone());

		return dto;
	}
}
