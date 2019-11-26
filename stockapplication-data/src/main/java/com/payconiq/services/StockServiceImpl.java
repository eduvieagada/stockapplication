package com.payconiq.services;

import com.payconiq.entities.Stock;
import com.payconiq.exceptions.NotFoundException;
import com.payconiq.models.StockImpl;
import com.payconiq.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class StockServiceImpl implements StockService {

    private StockRepository stockRepository;

    @Autowired
    public StockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }
    @Override
    public List<Stock> getStocks() {

        List<Stock> result = new ArrayList<>();

        stockRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Stock getStock(Long id) throws NotFoundException {
        return stockRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    @Override
    public Stock updateStock(Long id, Stock stock) {
        StockImpl stockToUpdate = stockRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid id"));

        stockToUpdate.setCurrentPrice(stock.getCurrentPrice());
        stockToUpdate.setLastUpdate(new Date());
        stockToUpdate.setName(stock.getName());

        return stockRepository.save(stockToUpdate);
    }

    @Override
    public Stock createStock(Stock stock) {
        var stockImpl = new StockImpl();

        stockImpl.setName(stock.getName());
        stockImpl.setCurrentPrice(stock.getCurrentPrice());
        stockImpl.setLastUpdate(new Date());

        return stockRepository.save(stockImpl);
    }
}
