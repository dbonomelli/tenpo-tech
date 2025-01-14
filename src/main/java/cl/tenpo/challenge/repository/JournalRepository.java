package cl.tenpo.challenge.repository;

import cl.tenpo.challenge.entity.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository extends JpaRepository<Journal, Long> {

}
