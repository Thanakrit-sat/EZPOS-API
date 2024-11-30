package ezpos.program.EZPOS.repository;

import ezpos.program.EZPOS.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
