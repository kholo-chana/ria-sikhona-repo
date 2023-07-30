package com.kholo.service;

import com.kholo.model.Province;
import java.util.List;

public interface ProvinceService {

    Province createProvince(Province province);
    List<Province> getAllProvinces();
}
