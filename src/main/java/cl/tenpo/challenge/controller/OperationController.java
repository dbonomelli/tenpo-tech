package cl.tenpo.challenge.controller;


import cl.tenpo.challenge.controller.request.AddRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Validated
public interface OperationController {
    @PostMapping("add")
    ResponseEntity<Double> addNumbers(
            @RequestBody @Validated AddRequest request
    );
}
