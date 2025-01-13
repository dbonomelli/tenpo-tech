package cl.tenpo.challenge.service;

import cl.tenpo.challenge.controller.impl.request.AddRequest;

public interface OperationService {
    int addNumbers(AddRequest request);
}
