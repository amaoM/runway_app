package com.example.runway.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class IncidentService {

    @Autowired
    IncidentRepository incidentRepository;

    public List<Incident> getPage(int pageNumber) {
        PageRequest request = new PageRequest(pageNumber - 1, 3, Sort.Direction.ASC, "id");
        return incidentRepository.findAll(request).getContent();
    }
}
