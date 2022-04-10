package com.geological.classes.core.service;

import com.geological.classes.data.transfer.request.CreateGeologicalClassRequest;
import com.geological.classes.data.transfer.response.GeologicalClassResponse;
import com.geological.classes.data.transfer.request.GeologicalClassRequest;

import java.util.List;

public interface GeologicalClassService {

    GeologicalClassResponse findByCode(String code);

    GeologicalClassResponse findById(Long id);

    GeologicalClassResponse update(GeologicalClassRequest geologicalClassRequest);

    GeologicalClassResponse add(CreateGeologicalClassRequest createGeologicalClassRequest);

    List<GeologicalClassResponse> findAll();

    void deleteById(Long id);
}
