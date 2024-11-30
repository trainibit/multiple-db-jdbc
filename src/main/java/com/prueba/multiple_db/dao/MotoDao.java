package com.prueba.multiple_db.dao;

import com.prueba.multiple_db.dto.response.MotoResponse;

public interface MotoDao {
    MotoResponse getMotoById(Long id) ;
}
