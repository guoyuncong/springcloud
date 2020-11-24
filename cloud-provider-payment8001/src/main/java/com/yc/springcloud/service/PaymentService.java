package com.yc.springcloud.service;

import com.yc.springcloud.model.entity.Payment;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
