package com.promineotech.jeep.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.promineotech.jeep.enitiy.Color;
import com.promineotech.jeep.enitiy.Customer;
import com.promineotech.jeep.enitiy.Engine;
import com.promineotech.jeep.enitiy.Jeep;
import com.promineotech.jeep.enitiy.JeepModel;
import com.promineotech.jeep.enitiy.Option;
import com.promineotech.jeep.enitiy.Order;
import com.promineotech.jeep.enitiy.Tire;


public interface JeepOrderDao {
	
  List<Option> fetchOptions(List<String> optionIds);
  Optional<Customer> fetchCustomer(String customerId);
  Optional<Jeep> fetchModel(JeepModel model, String trim, int doors);
  Optional<Color> fetchColor(String colorId);
  Optional<Engine> fetchEngine(String engineId);
  Optional<Tire> fetchTire(String tireId);
Order saveOrder(Customer customer, Jeep jeep, Color color, Engine engine, Tire tire, BigDecimal price, List<Option> options);



	
}
