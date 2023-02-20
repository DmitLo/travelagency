package by.step.travelagency.controller;
import by.step.travelagency.service.dto.ReturnsDto;
import by.step.travelagency.service.service.AbstrReturnsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/returns")
@Tag(name = "traveler app", description = "controller for work with travelers")
public class ReturnsController {

    private final AbstrReturnsService abstrReturnsService;

    public ReturnsController(AbstrReturnsService abstrReturnsService) {
        this.abstrReturnsService = abstrReturnsService;
    }

    @Operation(summary = "method post", description = "save driver with method post")
    @PostMapping
    public ReturnsDto saveReturns(@RequestBody ReturnsDto returns){
        return abstrReturnsService.save(returns);
    }

    @GetMapping
    public List<ReturnsDto> getAllReturns(){
        return abstrReturnsService.getAllReturns();
    }

}
