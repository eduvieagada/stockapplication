package com.payconiq.services;

import com.payconiq.entities.Stock;

import java.util.List;

public interface StockService {
    List<Stock> getStocks();
    Stock getStock(Long id);
    Stock updateStock(Long id, Stock stock);
    Stock createStock(Stock stock);
}
