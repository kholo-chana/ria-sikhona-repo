package com.kholo.controller;

import com.kholo.model.Province;
import com.kholo.service.ProvinceService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("api/province")
public class ProvinceController {

    private ProvinceService provinceService;

    // Build Get All Provinces REST API
    // http://localhost:8083/api/province
    @GetMapping
    public ResponseEntity<List<Province>> getAllProvinces(){
        List<Province> provinces = provinceService.getAllProvinces();
        return new ResponseEntity<>(provinces, HttpStatus.OK);
    }
}
