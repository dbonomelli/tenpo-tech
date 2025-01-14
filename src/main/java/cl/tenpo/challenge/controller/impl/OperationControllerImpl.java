package cl.tenpo.challenge.controller.impl;

import cl.tenpo.challenge.controller.OperationController;
import cl.tenpo.challenge.controller.request.AddRequest;
import cl.tenpo.challenge.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationControllerImpl implements OperationController {

    @Autowired
    private OperationService operationService;

    @Override
    public ResponseEntity<Double> addNumbers(AddRequest request) {
        return ResponseEntity.ok(operationService.addNumbers(request));
    }
}
