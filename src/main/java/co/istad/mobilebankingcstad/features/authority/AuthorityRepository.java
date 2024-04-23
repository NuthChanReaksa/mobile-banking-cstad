package co.istad.mobilebankingcstad.features.authority;

import co.istad.mobilebankingcstad.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorityRepository extends JpaRepository<Authority,String> {
    Optional<Authority> findByName(String name);
}
