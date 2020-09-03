package com.example.demo1_91social.service;


import com.example.demo1_91social.exception.BusinessError;
import com.example.demo1_91social.exception.BusinessException;
import com.example.demo1_91social.model.Machine;
import com.example.demo1_91social.model.MachinePriceResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
@Service
public class MachinePriceComp {
    Map<String, Object> map = new HashMap<>();

    public MachinePriceResponse machinePriceComp(List<Machine> machines){
        MachinePriceResponse machinePriceResponse=new MachinePriceResponse();
        try {

            Machine machine = machines.stream()
                    .max((machine1, machine2)->
                            machine1.getPrice() > machine2.getPrice() ? 1: -1).get();
            machinePriceResponse.setMachine_name(machine.getName());
            machinePriceResponse.setMachine_price(machine.getPrice());

        }
        catch (RuntimeException e){
            map.put("error",e);
            String message = String.format("Unable to Compare Machine Price ");
            log.error(message, e);
            throw new BusinessException("Invalid document type", BusinessError.ANABLE_TO_COMPARE,map);
        }
        return machinePriceResponse;
    }
}
