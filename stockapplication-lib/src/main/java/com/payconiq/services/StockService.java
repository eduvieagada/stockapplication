package com.payconiq.services;

import com.payconiq.entities.Stock;
import com.payconiq.exceptions.NotFoundException;

import java.util.List;

public interface StockService {
    List<Stock> getStocks();
    Stock getStock(Long id) throws NotFoundException;
    Stock updateStock(Long id, Stock stock);
    Stock createStock(Stock stock);
}
