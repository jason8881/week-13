package com.promineotech.jeep.service;

import com.promineotech.jeep.enitiy.Order;
import com.promineotech.jeep.enitiy.OrderRequest;

public interface JeepOrderService {

	Order createOrder(OrderRequest orderRequest);

}
