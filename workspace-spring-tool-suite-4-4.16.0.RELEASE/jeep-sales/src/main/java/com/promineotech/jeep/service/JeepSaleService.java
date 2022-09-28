/**
 * 
 */
package com.promineotech.jeep.service;

import java.util.List;

import com.promineotech.jeep.enitiy.Jeep;

public interface JeepSaleService {

 
    List<Jeep> fetchJeeps(String model, String trim);

}
