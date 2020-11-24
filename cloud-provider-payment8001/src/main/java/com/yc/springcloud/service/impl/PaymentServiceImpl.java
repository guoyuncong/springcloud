package com.yc.springcloud.service.impl;

import com.yc.springcloud.mapper.PaymentMapper;
import com.yc.springcloud.model.entity.Payment;
import com.yc.springcloud.service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentMapper paymentMapper;


    public int create(Payment payment)  {
        return paymentMapper.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
