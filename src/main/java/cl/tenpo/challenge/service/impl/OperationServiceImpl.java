package cl.tenpo.challenge.service.impl;

import cl.tenpo.challenge.controller.impl.request.AddRequest;
import cl.tenpo.challenge.service.OperationService;
import cl.tenpo.challenge.service.PercentageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OperationServiceImpl implements OperationService {

    private PercentageService percentageService;

    @Override
    public int addNumbers(AddRequest request) {
        int res = 0;
        try {
            //call external service
            double percentage = percentageService.obtainPercentage();
        } catch (Exception e) {
            //log.error(e.getMessage());
        }

        return res;
    }
}
