package cl.tenpo.challenge.controller;


import cl.tenpo.challenge.controller.impl.request.AddRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Validated
public interface OperationController {


    @PostMapping("/add")
    ResponseEntity<AddRequest> addNumbers(
            @RequestBody @Validated AddRequest request
    );
}
