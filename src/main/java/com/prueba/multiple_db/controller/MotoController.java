package com.prueba.multiple_db.controller;

import com.prueba.multiple_db.dto.response.MotoDetailResponse;
import com.prueba.multiple_db.service.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/motos")
public class MotoController {

    @Autowired
    MotoService motoService;

    @GetMapping("{id}")
    ResponseEntity<MotoDetailResponse> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(motoService.getMotoDetailById(id));
    }


}
