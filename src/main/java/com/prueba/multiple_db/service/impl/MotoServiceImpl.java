package com.prueba.multiple_db.service.impl;

import com.prueba.multiple_db.dao.FacturaDao;
import com.prueba.multiple_db.dao.MotoDao;
import com.prueba.multiple_db.dto.response.MotoDetailResponse;
import com.prueba.multiple_db.service.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotoServiceImpl implements MotoService {

    @Autowired
    MotoDao motoDao;

    @Autowired
    FacturaDao facturaDao;

    @Override
    public MotoDetailResponse getMotoDetailById(Long id){
        MotoDetailResponse motoDetailResponse = new MotoDetailResponse();
        motoDetailResponse.setMotoResponse(motoDao.getMotoById(id));
        motoDetailResponse.setFacturaResponse(facturaDao.getFacturaByMotoId(id));
        return motoDetailResponse;
    }
}
