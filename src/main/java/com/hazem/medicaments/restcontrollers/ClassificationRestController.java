package com.hazem.medicaments.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hazem.medicaments.entities.Classification;
import com.hazem.medicaments.entities.Medicament;
import com.hazem.medicaments.repos.ClassificationRepository;

@RestController
@RequestMapping("/api/class")
@CrossOrigin("*")
public class ClassificationRestController {

    @Autowired
    ClassificationRepository classificationRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Classification AjouterClassifications(@RequestBody Classification classification) {
        return classificationRepository.save(classification);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Classification UpadteClassifications(@RequestBody Classification classification) {
        return classificationRepository.save(classification);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Classification> getAllClassifications() {
        return classificationRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Classification getClassificationById(@PathVariable("id") Long id) {
        return classificationRepository.findById(id).orElse(null);
    }
}
