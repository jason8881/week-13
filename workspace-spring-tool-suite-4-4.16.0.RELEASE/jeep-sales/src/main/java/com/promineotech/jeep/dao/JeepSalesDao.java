package com.promineotech.jeep.dao;

import java.util.List;

import com.promineotech.jeep.enitiy.Jeep;
import com.promineotech.jeep.enitiy.JeepModel;

public interface JeepSalesDao {
    
    

    List<Jeep> fetchJeeps(JeepModel model, String trim);

}
