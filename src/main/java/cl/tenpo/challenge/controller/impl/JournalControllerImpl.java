package cl.tenpo.challenge.controller.impl;

import cl.tenpo.challenge.controller.JournalController;
import cl.tenpo.challenge.entity.Journal;
import cl.tenpo.challenge.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JournalControllerImpl implements JournalController {

    @Autowired
    private JournalService journalService;


    @Override
    public ResponseEntity<Page<Journal>> getAll(int page, int size) {
        return ResponseEntity.ok(journalService.getAll(page, size));
    }
}
