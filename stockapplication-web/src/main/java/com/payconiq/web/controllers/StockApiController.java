package com.payconiq.web.controllers;

import com.payconiq.entities.Stock;
import com.payconiq.exceptions.NotFoundException;
import com.payconiq.services.StockService;
import com.payconiq.web.models.StockViewModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/stocks")
public class StockApiController {

    private StockService stockService;
    public StockApiController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping
    public ResponseEntity<List<Stock>> GetStockList() {
        List<Stock> stockList = stockService.getStocks();

        return ResponseEntity.ok(stockList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Stock> GetSingleStock(@PathVariable("id") Long id) {
        try {
            Stock stock = stockService.getStock(id);

            return ResponseEntity.ok(stock);
        } catch (NotFoundException ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Stock> CreateStock(@Valid @RequestBody StockViewModel model) {
        Stock stock = stockService.createStock(model);

        return ResponseEntity.ok(stock);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Stock> Update(@PathVariable("id") Long id, @Valid @RequestBody StockViewModel model) {

    }
}
