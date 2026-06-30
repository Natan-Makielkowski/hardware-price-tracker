package org.example.hardwarepricetracker.repository;

import org.example.hardwarepricetracker.model.PriceSnapshot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceSnapshotRepository extends JpaRepository<PriceSnapshot, Integer> {
}
