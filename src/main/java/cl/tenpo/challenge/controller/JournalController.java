package cl.tenpo.challenge.controller;

import cl.tenpo.challenge.entity.Journal;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Validated
public interface JournalController {
    @GetMapping("logs")
    ResponseEntity<Page<Journal>> getAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    );
}
