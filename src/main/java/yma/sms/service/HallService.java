package yma.sms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yma.sms.dto.HallDto;
import yma.sms.entity.Hall;
import yma.sms.repository.HallRepository;

import java.util.List;

// Annotate this class as a service component so Spring can detect and manage it
@Service
public class HallService {

    // Automatically inject an instance of HallRepository to perform DB operations
    @Autowired
    private HallRepository hallRepository;

    // Method createHall works with data received in HallDto
    public void createHall(HallDto createDto) {
        Hall hall = new Hall();                       // Create a new instance of the Hall entity
        hall.setName(createDto.getName());                // Set the hall name using the value given in the DTO
        hall.setCode(createDto.getCode());
        hall.setCapacity(createDto.getCapacity());
        hall.setAc(createDto.getAc());
        hall.setProjector(createDto.getProjector());

        hallRepository.save(hall);                      // Save the hall entity to the database using the repository
    }

    public List<Hall> getAllHall() {

        return hallRepository.findAll();
    }

    public void updateHall(Integer hallId, HallDto updateDto) {
        Hall hall = hallRepository.findById(hallId)
                .orElseThrow(() -> new RuntimeException("Hall Not Found"));
        hall.setName(updateDto.getName());
        hall.setCode(updateDto.getCode());
        hall.setCapacity(updateDto.getCapacity());
        hall.setAc(updateDto.getAc());
        hall.setProjector(updateDto.getProjector());
        hallRepository.save(hall);
    }

    public void deleteHall(Integer hallId) {
        hallRepository.deleteById(hallId);
    }

    public Hall getHallById(Integer id) {
        return hallRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Hall not found"));
}
}




