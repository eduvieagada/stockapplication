package com.payconiq.data.repositories;

import com.payconiq.data.models.StockImpl;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<StockImpl, Long> {
}
