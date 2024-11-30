package com.prueba.multiple_db.dao.impl;

import com.prueba.multiple_db.dao.FacturaDao;
import com.prueba.multiple_db.dto.response.FacturaResponse;
import com.prueba.multiple_db.mapper.FacturaMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FacturaDaoImpl implements FacturaDao {

    private final JdbcTemplate jdbcTemplate;

    public FacturaDaoImpl(@Qualifier("db2JdbcTemplate") JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public FacturaResponse getFacturaByMotoId(Long id) {
        String query = "SELECT * FROM FACTURAS WHERE MOTO_ID = ?";
        return jdbcTemplate.queryForObject(query, new FacturaMapper(), id);
    }

}
