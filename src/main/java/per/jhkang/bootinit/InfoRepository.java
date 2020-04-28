package per.jhkang.bootinit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface InfoRepository extends JpaRepository<Info, Long> {
}
