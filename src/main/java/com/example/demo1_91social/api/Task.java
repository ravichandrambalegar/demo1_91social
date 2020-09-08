package com.example.demo1_91social.api;
import com.example.demo1_91social.model.*;
import com.example.demo1_91social.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
@RestController
@CrossOrigin
public class Task {
    @Autowired
    ReverseSStringService reverseSStringService;
    @Autowired
    BubbleSortService bubbleSortService;
    @Autowired
    NonRepeatativeNumber nonRepeatativeNumber;
    @Autowired
    AlternativePosAndNegNumber alternativePosAndNegNumber;
    @Autowired
    MachinePriceComp machinePriceComp;
    @Autowired
    DatabaseService databaseService;
    @Autowired
    SocketService socketService;

    @RequestMapping (value = "/api/reverse/string", method = RequestMethod.POST)
    public ResponseEntity<?> makeReport(@RequestBody ReverseStringApiRequest reverseStringApiRequest, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<String>("Binding Issues for /api/reverse/string", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        AppResponse response = new AppResponse();
        String stringReverse = reverseSStringService.makeStringReverse(reverseStringApiRequest.getUserString());
        try {
            response.setData(stringReverse);
            response.setMsg("Success");
        } catch (Exception e) {
            response.setMsg(e.getMessage());
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @RequestMapping (value = "/api/bubble/sort", method = RequestMethod.POST)
    public ResponseEntity<?> bubblesort(@RequestBody BubleSortApiRequest bubleSortApiRequest, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<String>("Binding Issues for /api/bubble/sort", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        AppResponse response = new AppResponse();
        List<Integer> sortedArray = bubbleSortService.bubbleSort(bubleSortApiRequest.getIntArray());
        try {
            response.setData(sortedArray);
            response.setMsg("Success");
        } catch (Exception e) {
            response.setMsg(e.getMessage());
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @RequestMapping (value = "/api/alternative/elements", method = RequestMethod.POST)
    public ResponseEntity<?> alternatineposAndNegNumbers(@RequestBody NonRepeatativeNumberRequest nonRepeatativeNumberRequest, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<String>("Binding Issues for /api/alternative/elements", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        AppResponse response = new AppResponse();
       List<Integer> reArrangePosAndNegNumber = alternativePosAndNegNumber.reArrangePosAndNegNumber(nonRepeatativeNumberRequest.getIntArray());

        try {
            response.setData(reArrangePosAndNegNumber);
            response.setMsg("Success");
        } catch (Exception e) {
            response.setMsg(e.getMessage());
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }


    @RequestMapping (value = "/api/non-repeated/element", method = RequestMethod.POST)
    public ResponseEntity<?> nonRepeatativeNumber(@RequestBody NonRepeatativeNumberRequest nonRepeatativeNumberRequest, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<String>("Binding Issues for /api/non-repeated/element", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        AppResponse response = new AppResponse();
        List<Integer> sortedArray = nonRepeatativeNumber.findNonRepeatativeNumbers(nonRepeatativeNumberRequest.getIntArray());

        try {
            response.setData(sortedArray);
            response.setMsg("Success");
        } catch (Exception e) {
            response.setMsg(e.getMessage());
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @RequestMapping (value = "/api/machine/highest/price", method = RequestMethod.POST)
    public ResponseEntity<?> machineHighestPrice(@RequestBody MachinePriceRequest machinePriceRequest, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<String>("Binding Issues for /api/machine/highest/price", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        AppResponse response = new AppResponse();
        MachinePriceResponse machinePriceResponse = machinePriceComp.machinePriceComp(machinePriceRequest.getMachines());

        try {
            response.setData(machinePriceResponse);
            response.setMsg("Success");
        } catch (Exception e) {
            response.setMsg(e.getMessage());
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }


    @RequestMapping (value = "/api/database/insert/randomdata", method = RequestMethod.POST)
    public ResponseEntity<?> databaseInsertData(@RequestBody InsertDBRequest insertDBRequest, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<String>("Binding Issues for /api/database/insert/randomdata", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        AppResponse response = new AppResponse();
        String msg = databaseService.insertRecords(insertDBRequest.getNumber());

        try {
            response.setData(msg);
            response.setMsg("Success");
        } catch (Exception e) {
            response.setMsg(e.getMessage());
        }
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @GetMapping("api/database/get/data")
    String databaseGetData() {
        long timeInMilliSec = databaseService.doDBOperation();
        return timeInMilliSec+ " Milli Seconds";
    }

    @GetMapping("/api/start/server")
      String sartServer() {
        return socketService.startServer();
    }
    @GetMapping("/api/start/client")
    String sartClient() {
        return socketService.startClient();
    }

}