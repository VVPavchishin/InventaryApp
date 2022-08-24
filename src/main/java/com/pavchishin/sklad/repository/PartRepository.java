package com.pavchishin.sklad.repository;

import com.pavchishin.sklad.model.SparePart;
import org.springframework.data.repository.CrudRepository;

public interface PartRepository extends CrudRepository<SparePart, Long> {
}
