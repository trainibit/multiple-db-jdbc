package com.prueba.multiple_db.dto.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class FacturaResponse {
    private Long id;
    private BigDecimal total;
    private BigDecimal subTotal;
    private BigDecimal iva;
    private Long motoId;
}
