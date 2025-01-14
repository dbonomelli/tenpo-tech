package cl.tenpo.challenge.service.impl;

import cl.tenpo.challenge.controller.request.AddRequest;
import cl.tenpo.challenge.service.JournalService;
import cl.tenpo.challenge.service.OperationService;
import cl.tenpo.challenge.service.PercentageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OperationServiceImpl implements OperationService {

    @Autowired
    private PercentageService percentageService;

    private JournalService journalService;

    @Override
    public double addNumbers(AddRequest request) {
        double res = 0;
        try {
            res = (request.getNumber1() + request.getNumber2());
            journalService.logCall("/add", request.toString(), Double.toString(res));
        } catch (Exception e) {
            //log.error(e.getMessage());
        }
        return res;
    }
}
