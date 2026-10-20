package org.example;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
@RequestMapping("/cabs")
public class CabController {

    @Autowired
    private CabRepository cabRepository;

    
    //FOR Adding cab
    @PostMapping
    public Cab addCab(@RequestBody Cab cab) {
        return cabRepository.save(cab);
    }
//For GETTING cab
    @GetMapping
    public List<Cab> getAllCabs() {
        return cabRepository.findAll();
    }
    
    
    //CJECK cab details
    @PutMapping("/{id}")
    public Cab updateCab(@PathVariable int id, @RequestBody Cab cab) {
        cab.setCabid(id);
        return cabRepository.save(cab);
    }
    
    //delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCab(@PathVariable int id) {

        if (!cabRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        cabRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }    
}