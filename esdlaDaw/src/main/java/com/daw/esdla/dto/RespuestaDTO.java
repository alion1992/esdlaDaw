package com.daw.esdla.dto;

public class RespuestaDTO {

    public RespuestaDTO(){}

    private Long id;

    private int respuestaCorrecta;

    public RespuestaDTO(Long id, int respuestaCorrecta) {
        this.id = id;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(int respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }
}
