package com.superdevs.HealthOMeter.service;

import com.superdevs.HealthOMeter.entity.Gender;
import com.superdevs.HealthOMeter.service.managers.CalculatorManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculatorService {

    @Autowired
    CalculatorManager calculatorManager;

    public BigDecimal getCalculateBMI(BigDecimal height, BigDecimal weight) {
        return calculatorManager.calculateBMI(height, weight);
    }

    public BigDecimal getCalculateWHR(BigDecimal waistRatio, BigDecimal hipRatio) {
        return calculatorManager.calculateWhr(waistRatio, hipRatio);
    }

    public BigDecimal getCalculateRFM(Gender gender, BigDecimal height, BigDecimal waistRatio) {
        return calculatorManager.calculateRFM(gender, height, waistRatio);
    }
}
