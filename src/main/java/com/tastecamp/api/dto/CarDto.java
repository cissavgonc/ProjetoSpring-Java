package com.tastecamp.api.dto;

import java.math.BigDecimal;

public record CarDto (String modelo, String fabricante, String dataFabricacao, BigDecimal valor, int anoModelo){
    
}
