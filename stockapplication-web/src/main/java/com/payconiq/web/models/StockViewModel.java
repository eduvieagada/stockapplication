package com.payconiq.web.models;

import com.payconiq.entities.Stock;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

public class StockViewModel implements Stock {

    private Long id;
    @NotEmpty
    private String name;
    @NotNull
    private BigDecimal currentPrice;
    private Date lastUpdate;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public BigDecimal getCurrentPrice() {
        return this.currentPrice;
    }

    @Override
    public void setCurrentPrice(BigDecimal price) {
        this.currentPrice = price;
    }

    @Override
    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    @Override
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
