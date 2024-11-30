package com.prueba.multiple_db.service;

import com.prueba.multiple_db.dto.response.MotoDetailResponse;

public interface MotoService {
    MotoDetailResponse getMotoDetailById(Long id);
}
