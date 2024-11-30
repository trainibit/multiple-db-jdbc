package com.prueba.multiple_db.dao.impl;

import com.prueba.multiple_db.dao.MotoDao;
import com.prueba.multiple_db.dto.response.MotoResponse;
import com.prueba.multiple_db.mapper.MotoMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MotoDaoImpl implements MotoDao {

    private final JdbcTemplate jdbcTemplate;

    public MotoDaoImpl(@Qualifier("db1JdbcTemplate") JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public MotoResponse getMotoById(Long id) {

        String query = "SELECT * FROM MOTOS WHERE ID = ?";
        MotoResponse motoResponse = jdbcTemplate.queryForObject(query, new MotoMapper(), id);
        return motoResponse;
    }
}
