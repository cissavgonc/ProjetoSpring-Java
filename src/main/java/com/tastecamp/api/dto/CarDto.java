package com.tastecamp.api.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

public record CarDto (String modelo, String fabricante, String dataFabricacao, BigDecimal valor, int anoModelo){
    
}
