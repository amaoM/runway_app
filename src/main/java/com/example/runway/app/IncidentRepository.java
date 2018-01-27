package com.example.runway.app;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface IncidentRepository extends PagingAndSortingRepository<Incident, Long> {

}
