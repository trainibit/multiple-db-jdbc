package com.prueba.multiple_db.dao;

import com.prueba.multiple_db.dto.response.FacturaResponse;

public interface FacturaDao {
    FacturaResponse getFacturaByMotoId(Long id);
}
