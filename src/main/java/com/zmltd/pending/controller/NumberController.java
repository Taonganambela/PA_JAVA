package com.zmltd.pending.controller;

import com.zmltd.pending.service.dbService;
import org.springframework.web.bind.annotation.RestController;
import com.zmltd.pending.entity.PhoneNumber;
import com.zmltd.pending.pojos.ReponsePojo;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/pending_Active")

public class NumberController {

    @PostMapping("/save_pending_active")
    public ReponsePojo number(@RequestBody PhoneNumber number) throws SQLException {

        dbService db = new dbService();
        ReponsePojo resp = db.database(number.getMsisdn());

        if (resp.getStatusCode() == 202) {
            // return new ResponseEntity<>(new ReponsePojo(resp.getStatusCode(),
            // resp.getMessage()), HttpStatus.OK);
            return resp;
        } else {

            return resp;
            // return new ResponseEntity<>(new ReponsePojo(resp.getStatusCode(),
            // resp.getMessage()), HttpStatus.NOT_FOUND);
        }
        // db.database(number)
        // return number;

    }

}
