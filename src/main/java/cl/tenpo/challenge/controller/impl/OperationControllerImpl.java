package cl.tenpo.challenge.controller.impl;

import cl.tenpo.challenge.controller.OperationController;
import cl.tenpo.challenge.controller.impl.request.AddRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationControllerImpl implements OperationController {

    @Override
    public ResponseEntity<AddRequest> addNumbers(AddRequest request) {
        return null;
    }
}
