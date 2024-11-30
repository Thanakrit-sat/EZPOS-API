package ezpos.program.EZPOS.repository;

import ezpos.program.EZPOS.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
