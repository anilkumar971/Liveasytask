package com.example.taskLiveasy.controller;


import com.example.taskLiveasy.Entity.Load;
import com.example.taskLiveasy.service.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/load")
public class LoadController {

    @Autowired
    private LoadService loadService;

    @PostMapping
    public ResponseEntity<String> createLoad(@RequestBody Load load) {
        loadService.createLoad(load);
        return ResponseEntity.ok("Load details added successfully");
    }

    @GetMapping
    public ResponseEntity<List<Load>> getLoads(@RequestParam String shipperId) {
        List<Load> loads = loadService.getLoadsByShipperId(shipperId);
        return ResponseEntity.ok(loads);
    }

    @GetMapping("/{loadId}")
    public ResponseEntity<Load> getLoad(@PathVariable Long loadId) {
        Load load = loadService.getLoadById(loadId);
        return load != null ? ResponseEntity.ok(load) : ResponseEntity.notFound().build();
    }



    @PutMapping("/{loadId}")
    public ResponseEntity<Load> updateLoad(@PathVariable Long loadId, @RequestBody Load load) {
        Load updatedLoad = loadService.updateLoad(loadId, load);
        return ResponseEntity.ok(updatedLoad);
    }



    @DeleteMapping("/{loadId}")
    public ResponseEntity<Void> deleteLoad(@PathVariable Long loadId) {
        loadService.deleteLoad(loadId);
        return ResponseEntity.noContent().build();
    }


}
