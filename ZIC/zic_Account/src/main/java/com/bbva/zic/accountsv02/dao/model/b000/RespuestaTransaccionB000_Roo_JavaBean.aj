// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.bbva.zic.accountsv02.dao.model.b000;

import com.bbva.jee.arq.spring.core.host.CuerpoMultiparte;
import java.lang.String;

privileged aspect RespuestaTransaccionB000_Roo_JavaBean {
    
    public String RespuestaTransaccionB000.getCodigoRetorno() {
        return this.codigoRetorno;
    }
    
    public void RespuestaTransaccionB000.setCodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }
    
    public String RespuestaTransaccionB000.getCodigoControl() {
        return this.codigoControl;
    }
    
    public void RespuestaTransaccionB000.setCodigoControl(String codigoControl) {
        this.codigoControl = codigoControl;
    }
    
    public void RespuestaTransaccionB000.setCuerpo(CuerpoMultiparte cuerpo) {
        this.cuerpo = cuerpo;
    }
    
}
