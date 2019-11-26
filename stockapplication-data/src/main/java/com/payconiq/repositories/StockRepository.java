package com.payconiq.repositories;

import com.payconiq.models.StockImpl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends CrudRepository<StockImpl, Long> {
}
