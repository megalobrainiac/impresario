package impresario.api.repository;

import impresario.api.repository.entity.PayeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayeeRepository extends JpaRepository<PayeeEntity, Integer> {
}
