package projeto.evidencia.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.evidencia.loja.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
