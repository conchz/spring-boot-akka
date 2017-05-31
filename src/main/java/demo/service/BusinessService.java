package demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BusinessService {

    public void perform(Object o) {
        log.info("Perform: {}", o);
    }
}
