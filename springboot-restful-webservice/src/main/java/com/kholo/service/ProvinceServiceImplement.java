package com.kholo.service;

import com.kholo.model.Province;
import com.kholo.repository.ProvinceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProvinceServiceImplement implements ProvinceService{

    private ProvinceRepository provinceRepository;

    @Override
    public Province createProvince(Province province) {
        return provinceRepository.save(province);
    }

    @Override
    public List<Province> getAllProvinces() {
        return provinceRepository.findAll();
    }
}
