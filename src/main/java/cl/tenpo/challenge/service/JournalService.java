package cl.tenpo.challenge.service;


import cl.tenpo.challenge.entity.Journal;
import org.springframework.data.domain.Page;

public interface JournalService {
    Page<Journal> getAll(int page, int size);
    void logCall(String endpoint, String request, String response);
}
