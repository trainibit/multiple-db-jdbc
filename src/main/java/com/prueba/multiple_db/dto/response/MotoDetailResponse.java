package com.prueba.multiple_db.dto.response;

import lombok.Data;

@Data
public class MotoDetailResponse {
    private MotoResponse motoResponse;
    private UsuarioResponse usuarioResponse;
    private FacturaResponse facturaResponse;
}
