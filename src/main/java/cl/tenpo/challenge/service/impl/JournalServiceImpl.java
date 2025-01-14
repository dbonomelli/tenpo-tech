package cl.tenpo.challenge.service.impl;

import cl.tenpo.challenge.entity.Journal;
import cl.tenpo.challenge.repository.JournalRepository;
import cl.tenpo.challenge.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;



@Service
public class JournalServiceImpl implements JournalService {

    @Autowired
    private JournalRepository journalRepository;

    @Override
    public Page<Journal> getAll(int page, int size) {
        Page<Journal> journal = null;
        try{
            journal = journalRepository.findAll(PageRequest.of(page, size));
        }catch (Exception e){
            System.out.println("error");
        }
        return journal;
    }

    @Override
    public void logCall(String endpoint, String request, String response) {
        Journal journal = new Journal();
        journal.setEndpoint(endpoint);
        journal.setRequest(request);
        journal.setResponse(response);
        journalRepository.save(journal);
    }
}
