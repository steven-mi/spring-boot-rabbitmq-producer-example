package com.example.demoproducer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Currency {

    private String baseCurrency;
    private String targetCurrency;
    private float exchangeRate;
}
