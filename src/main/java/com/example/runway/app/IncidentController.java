package com.example.runway.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IncidentController {

    @Autowired
    IncidentService incidentService;

    @RequestMapping(value = "/incidents", method = RequestMethod.GET)
    public @ResponseBody Iterable<Incident> getIncidents(@RequestParam(name = "p", defaultValue = "1") int pageNumber) {
        return incidentService.getPage(pageNumber);
    }
}
