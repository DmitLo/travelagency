package by.step.travelagency.controller;

import by.step.travelagency.service.dto.ToursDto;
import by.step.travelagency.service.service.AbstrToursService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/tours")
@Tag(name = "traveler app", description = "controller for work with travelers")
public class ToursController {

    private final AbstrToursService abstrToursService;

    public ToursController(AbstrToursService abstrToursService) {
        this.abstrToursService = abstrToursService;
    }

    @Operation(summary = "method post", description = "save driver with method post")
    @PostMapping
    public ToursDto saveTours(@RequestBody ToursDto tours){
        return abstrToursService.save(tours);
    }

    @GetMapping
    public List<ToursDto> getAllTours(){
        return abstrToursService.getAllTours();
    }

    @GetMapping("/{id}")
    public ToursDto getByID(@RequestParam Long id) {
        return abstrToursService.getById(id);
    }

    //
    @DeleteMapping("/{id}")
    public void deleteToursById(@RequestParam Long id) {
        abstrToursService.delete(id);
    }

}
