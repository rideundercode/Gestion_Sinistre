package com.axa.sinistresmanagement.controllers;

import com.axa.sinistresmanagement.models.SinistrePTIA;
import com.axa.sinistresmanagement.services.SinistrePTIAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sinistre-ptia")
public class SinistrePTIAController {
    private final SinistrePTIAService sinistrePTIAService;

    @Autowired
    public SinistrePTIAController(SinistrePTIAService sinistrePTIAService) {
        this.sinistrePTIAService = sinistrePTIAService;
    }

    // GET /api/sinistre-ptia
    @GetMapping
    public ResponseEntity<List<SinistrePTIA>> getAll() {
        List<SinistrePTIA> sinistres = sinistrePTIAService.findAll();
        return new ResponseEntity<>(sinistres, HttpStatus.OK); 
    }

    // GET /api/sinistre-ptia/{id}
    @GetMapping("/{id}")
    public ResponseEntity<SinistrePTIA> getById(@PathVariable Long id) {
        SinistrePTIA sinistrePTIA = sinistrePTIAService.findById(id);
        return new ResponseEntity<>(sinistrePTIA, HttpStatus.OK);
    }

    // POST /api/sinistre-ptia
    @PostMapping
    public ResponseEntity<SinistrePTIA> createSinistrePTIA(@RequestBody SinistrePTIA sinistrePTIA) {
        SinistrePTIA createdSinistrePTIA = sinistrePTIAService.save(sinistrePTIA);
        return new ResponseEntity<>(createdSinistrePTIA, HttpStatus.CREATED);
    }

    // PUT /api/sinistre-ptia/{id}
    @PutMapping("/{id}")
    public ResponseEntity<SinistrePTIA> updateSinistrePTIA(@PathVariable Long id, @RequestBody SinistrePTIA sinistrePTIA) {
        SinistrePTIA updatedSinistrePTIA = sinistrePTIAService.update(id, sinistrePTIA);
        return new ResponseEntity<>(updatedSinistrePTIA, HttpStatus.OK);
    }

    // DELETE /api/sinistre-ptia/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSinistrePTIA(@PathVariable Long id) {
        sinistrePTIAService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
