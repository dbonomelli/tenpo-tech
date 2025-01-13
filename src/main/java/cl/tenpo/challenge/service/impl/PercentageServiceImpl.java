package cl.tenpo.challenge.service.impl;

import cl.tenpo.challenge.service.PercentageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PercentageServiceImpl implements PercentageService {

    @Override
    @Cacheable("Percentage")
    public double obtainPercentage() {
        try{
            //og.info("Obtaining percentage from mock service");

        } catch (Exception e){
            //og.error(e.getMessage());
        }
        return 0.10;
    }
}
