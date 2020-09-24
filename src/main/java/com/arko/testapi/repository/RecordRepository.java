package com.arko.testapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arko.testapi.entity.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
