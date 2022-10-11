/**
 * 
 */
package com.promineotech.jeep.service;

import java.util.List;

import com.promineotech.jeep.enitiy.Jeep;
import com.promineotech.jeep.enitiy.JeepModel;

public interface JeepSaleService {

 
    List<Jeep> fetchJeeps(JeepModel model, String trim);

    

}
