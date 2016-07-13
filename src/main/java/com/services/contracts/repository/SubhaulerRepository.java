package com.services.contracts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.services.contracts.dto.Subhauler;


@Repository
public interface SubhaulerRepository extends CrudRepository<Subhauler, Long>
{   
}
