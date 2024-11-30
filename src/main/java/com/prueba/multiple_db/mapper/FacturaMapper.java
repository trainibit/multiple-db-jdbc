package com.prueba.multiple_db.mapper;


import com.prueba.multiple_db.dto.response.FacturaResponse;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FacturaMapper implements RowMapper<FacturaResponse> {

    @Override
    public FacturaResponse mapRow(ResultSet rs, int rowNum) throws SQLException {
        FacturaResponse facturaResponse = new FacturaResponse();
        facturaResponse.setId(rs.getLong("ID"));
        facturaResponse.setSubTotal(rs.getBigDecimal("SUB_TOTAL"));
        facturaResponse.setIva(rs.getBigDecimal("IVA"));
        facturaResponse.setTotal(rs.getBigDecimal("TOTAL"));
        return facturaResponse;
    }
}
