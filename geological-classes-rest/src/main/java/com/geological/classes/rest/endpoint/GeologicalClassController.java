package com.geological.classes.rest.endpoint;

import com.geological.classes.core.service.GeologicalClassService;
import com.geological.classes.data.transfer.response.GeologicalClassResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/geological_class ")
public class GeologicalClassController {

    private final GeologicalClassService geologicalClassService;

    @GetMapping("/by-code{code}")
    public ResponseEntity<GeologicalClassResponse> getByCode(@PathVariable("code") String code) {
        return ResponseEntity.ok(geologicalClassService.findByCode(code));
    }

}
