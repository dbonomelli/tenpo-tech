package cl.tenpo.challenge.service.impl;

import cl.tenpo.challenge.service.PercentageService;
import lombok.extern.java.Log;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

@Service
@Log
public class PercentageServiceImpl implements PercentageService {

    @Override
    @Cacheable(value = "percentageCache", key = "#percentage")
    @Retryable(backoff = @Backoff(delay = 2000L))
    public double obtainPercentage() {
        double res = 0;
        try {
            res = 0.10;
        }catch (Exception e){
            System.out.println("error");
        }
        return res;
    }
}
