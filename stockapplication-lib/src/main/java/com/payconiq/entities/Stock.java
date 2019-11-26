package com.payconiq.entities;

import java.math.BigDecimal;
import java.util.Date;

public interface Stock {
    Long getId();
    void setId(Long id);
    String getName();
    void setName(String name);
    BigDecimal getCurrentPrice();
    void setCurrentPrice(BigDecimal price);
    Date getLastUpdate();
    void setLastUpdate(Date lastUpdate);
}
