package com.prueba.multiple_db.mapper;


import com.prueba.multiple_db.dto.response.MotoResponse;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MotoMapper implements RowMapper<MotoResponse> {

    @Override
    public MotoResponse mapRow(ResultSet rs, int rowNum) throws SQLException {
        MotoResponse motoResponse = new MotoResponse();
        motoResponse.setId(rs.getLong("ID"));
        motoResponse.setName(rs.getString("NAME"));
        motoResponse.setYear(rs.getString("YEAR"));
        return motoResponse;
    }
}
