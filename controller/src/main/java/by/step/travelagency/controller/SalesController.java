package by.step.travelagency.controller;

import by.step.travelagency.service.dto.SalesDto;
import by.step.travelagency.service.service.AbstrSalesService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/sales")
@Tag(name = "traveler app", description = "controller for work with travelers")
public class SalesController {

    private final AbstrSalesService abstrSalesService;

    public SalesController(AbstrSalesService abstrSalesService) {
        this.abstrSalesService = abstrSalesService;
    }

    @Operation(summary = "method post", description = "save driver with method post")
    @PostMapping
    public SalesDto saveSales(@RequestBody SalesDto sales){
        return abstrSalesService.save(sales);
    }

    @GetMapping
    public List<SalesDto> getAllSales(){
        return abstrSalesService.getAllSales();
    }

}
