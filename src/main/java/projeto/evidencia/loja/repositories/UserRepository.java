package projeto.evidencia.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.evidencia.loja.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
