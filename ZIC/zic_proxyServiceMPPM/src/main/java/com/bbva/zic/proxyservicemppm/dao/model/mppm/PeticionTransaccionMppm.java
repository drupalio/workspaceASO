package com.bbva.zic.proxyservicemppm.dao.model.mppm;

import com.bbva.jee.arq.spring.core.host.Atributo;
import com.bbva.jee.arq.spring.core.host.Cuerpo;
import com.bbva.jee.arq.spring.core.host.CuerpoMultiparte;
import com.bbva.jee.arq.spring.core.host.MensajeMultiparte;
import com.bbva.jee.arq.spring.core.host.Multiformato;
import com.bbva.jee.arq.spring.core.host.Transaccion;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * <p>Transacci&oacute;n <code>MPPM</code></p>
 * <p>Informaci&oacute;n de la transacci&oacute;n:
 * <ul>
 *    <li><b>Tipo:</b> 1</li>
 *    <li><b>Subtipo:</b> 1</li>
 *    <li><b>Versi&oacute;n:</b> 1</li>
 *    <li><b>Clase de petici&oacute;n:</b> PeticionTransaccionMppm</li>
 *    <li><b>Clase de respuesta:</b> RespuestaTransaccionMppm</li>
 * </ul>
 * </p>
 * <p>Configuraci&oacute;n de la transacci&oacute;n:
 * <ul>
 *    <li><b>Nombre configuraci&oacute;n:</b> default_ps9_mx</li>
 * </ul>
 * </p>
 * <p>Copy de la transacci&oacute;n:</p>
 * <code><pre> * FICHERO: QGDTCCT.MPPM.TXT
 * MPPMASIGNACION CUENTA MOVIL.           MP        MP2CPM00BVDMCPO MPPM00E             MPPM  NN3000NNNNNN    SSTN    C   NNNNNNNN  NN                2010-02-03CICSDM112013-11-0810.22.15QG4CUCCT2010-02-03-16.39.31.900676CICSDM110001-01-010001-01-01
 * FICHERO: QGDTFDF.MPPM.TXT
 * MPPM00E �ASIGNACION CUENTA MOVIL       �F�05�00066�01�00001�NUMCLIE�NUMERO DE CLIENTE   �A�008�0�O�        �
 * MPPM00E �ASIGNACION CUENTA MOVIL       �F�05�00066�02�00009�NUMCTA �NUMERO DE CUENTA    �A�018�0�O�        �
 * MPPM00E �ASIGNACION CUENTA MOVIL       �F�05�00066�03�00027�NUMTARA�NUMERO TARJ ASIGNAR �A�019�0�O�        �
 * MPPM00E �ASIGNACION CUENTA MOVIL       �F�05�00066�04�00046�TARANT �NUMERO TARJ ANTERIOR�A�019�0�O�        �
 * MPPM00E �ASIGNACION CUENTA MOVIL       �F�05�00066�05�00065�OPCION �OPCION              �A�002�0�O�        �
 * MPPM00S �ASIGNACION CUENTA MOVIL       �X�03�00045�01�00001�NUMCLIE�NUMERO DE CLIENTE   �A�008�0�S�        �
 * MPPM00S �ASIGNACION CUENTA MOVIL       �X�03�00045�02�00009�NUMCTA �NUMERO DE CUENTA    �A�018�0�S�        �
 * MPPM00S �ASIGNACION CUENTA MOVIL       �X�03�00045�03�00027�NUMTARA�NUMERO TARJ ASIGNAR �A�019�0�S�        �
 * FICHERO: QGDTFDX.MPPM.TXT
 * MPPMMPPM00S MPNCPM0SMP2CPM001S                             CICSDM112011-07-20-11.10.27.829140CICSDM112011-07-20-11.10.27.829211
</pre></code>
 * 
 * @see RespuestaTransaccionMppm
 *
 * @author Arquitectura Spring BBVA
 */
@Transaccion(
	nombre = "MPPM",
	tipo = 1, 
	subtipo = 1,	
	version = 1,
	configuracion = "default_ps9_mx",
	respuesta = RespuestaTransaccionMppm.class,
	atributos = {@Atributo(nombre = "altamiraExtendido", valor = "true"), @Atributo(nombre = "tipoCopy", valor = "FIJA")}
)
@Multiformato(formatos = {FormatoMPPM00E.class})
@RooJavaBean
@RooToString
@RooSerializable
public class PeticionTransaccionMppm implements MensajeMultiparte {
	
	/**
	 * <p>Cuerpo del mensaje de petici&oacute;n multiparte</p>
	 */
	@Cuerpo
	private CuerpoMultiparte cuerpo = new CuerpoMultiparte();
	
	/**
	 * <p>Permite obtener el cuerpo del mensaje de petici&oacute;n multiparte</p>
	 */
	@Override
	public CuerpoMultiparte getCuerpo() {
		return cuerpo;
	}
	
}