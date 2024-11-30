package ezpos.program.EZPOS.repository;

import ezpos.program.EZPOS.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
