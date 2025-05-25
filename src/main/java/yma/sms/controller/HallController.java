package yma.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yma.sms.dto.HallDto;
import yma.sms.entity.Hall;
import yma.sms.service.HallService;

import java.util.List;

@RestController
@RequestMapping("/api/halls")
public class HallController {
    @Autowired
    private HallService hallservice;

    @PostMapping
    public void createHall(@RequestBody HallDto hallDto){
        hallservice.createHall(hallDto);

    }

    @GetMapping
    public List<Hall> getAllHall(){
        return hallservice.getAllHall();
    }

    @PutMapping("/{hallId}")
    public void updateHall(@PathVariable Integer hallId, @RequestBody HallDto updateDto){
        hallservice.updateHall(hallId,updateDto);
    }

    @DeleteMapping("/{hallId}")
    public void deleteHall(@PathVariable Integer hallId){
        hallservice.deleteHall(hallId);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hall> getHallById(@PathVariable Integer id) {
        Hall hall = hallservice.getHallById(id);
        return ResponseEntity.ok(hall);
    }


}
