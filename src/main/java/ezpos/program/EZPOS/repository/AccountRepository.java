package ezpos.program.EZPOS.repository;

import ezpos.program.EZPOS.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
