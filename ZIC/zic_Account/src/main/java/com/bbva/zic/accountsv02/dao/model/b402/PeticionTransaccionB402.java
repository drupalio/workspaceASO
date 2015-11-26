package com.bbva.zic.accountsv02.dao.model.b402;

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
 * <p>Transacci&oacute;n <code>B402</code></p>
 * <p>Informaci&oacute;n de la transacci&oacute;n:
 * <ul>
 *    <li><b>Tipo:</b> 1</li>
 *    <li><b>Subtipo:</b> 1</li>
 *    <li><b>Versi&oacute;n:</b> 1</li>
 *    <li><b>Clase de petici&oacute;n:</b> PeticionTransaccionB402</li>
 *    <li><b>Clase de respuesta:</b> RespuestaTransaccionB402</li>
 * </ul>
 * </p>
 * <p>Configuraci&oacute;n de la transacci&oacute;n:
 * <ul>
 *    <li><b>Nombre configuraci&oacute;n:</b> default_ps9_mx</li>
 * </ul>
 * </p>
 * <p>Copy de la transacci&oacute;n:</p>
 * <code><pre> * FICHERO: MBVD.BG.FIX.QGDTCCT.CCTB402.txt
 * B402CONSULTA DE SALDO                  BG        BG2C4020BVTBGPO BGM402              B402  NS2000N         SSTN    C   NNNSNNNN  NN S              1992-12-02OPIMPS  2013-11-0817.09.43QG4CUCCT2004-05-24-12.11.37.188861IDADAB  1992-12-032001-01-12
 * FICHERO: MBVD.BG.FIX.QGDTFDF.B402.txt
 * BGM402  �CONSULTA DE SALDOS            �E�04�00058�01�00016�CCC    �NUMERO DE CUENTA    �A�020�0�R�BR6CNEW0�
 * BGM402  �CONSULTA DE SALDOS            �E�04�00058�02�00039�OPCION �CONSULTA AMPLIADA   �A�001�0�O�        �
 * BGM402  �CONSULTA DE SALDOS            �E�04�00058�03�00043�PAPEL  �PAPEL ?             �A�001�0�O�        �
 * BGM402  �CONSULTA DE SALDOS            �E�04�00058�04�00047�LIBRE  �LIBRE               �A�012�0�O�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�01�00016�FECSIST�FECHA DEL SISTEMA   �A�010�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�02�00029�CCC    �CCC                 �A�024�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�03�00056�CLAVEB �CLAVE BANCARIA      �A�018�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�04�00077�CTACEN �CTACEN              �A�024�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�05�00104�CONCC  �CONDICIONAL CENTRALI�A�001�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�06�00108�SUBPRO �SUBPRODUCTO         �A�038�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�07�00149�CCCASO �CCC ASOCIADA.       �A�024�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�08�00176�DIVISA �CODIGO-DESCR DIVISA �A�025�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�09�00204�SALDIS �SALDO DISPUESTO     �A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�10�00228�DISPON �DISPONIBLE          �A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�11�00252�LIMITE �LIMITE ACTUAL CTA.  �A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�12�00276�EXCMAX �EXCEDIDO MAXIMO     �A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�13�00300�EXCVEN �SALDO/EXC.VENTANILLA�A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�14�00324�EXCDOM �SALDO/EXC.DOMICILIA.�A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�15�00348�EXCCAJ �SALDO/EXC.CAJERO    �A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�16�00372�EXCCOM �SALDO/EXC.COMPRA    �A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�17�00396�SALRET �SALDO RETENCIONES   �A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�18�00420�SALIMP �SALDO IMPAGO        �A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�19�00444�CON1   �CONDICIONAL 1       �A�001�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�20�00448�CON2   �CONDICIONAL 2       �A�001�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�21�00452�CON3   �CONDICIONAL 3       �A�001�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�22�00456�CON4   �CONDICIONAL 4       �A�001�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�23�00460�CON5   �CONDICIONAL 5       �A�001�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�24�00464�CON6   �CONDICIONAL 6       �A�001�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�25�00468�CON7   �CONDICIONAL 7       �A�001�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�26�00472�CON8   �CONDICIONAL 8       �A�001�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�27�00476�CON9   �CONDICIONAL 9       �A�001�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�28�00480�ULTLIQ �ULTIMA LIQUIDACION  �A�010�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�29�00493�SALVAL �SALDO VALORADO      �A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�30�00517�PROMANU�SALDO PROMEDIO A#O  �A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�31�00541�PROMMES�SALDO PROMEDIO MES  �A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�32�00565�PROMPER�SALDO PROMEDIO P.LIQ�A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�33�00589�CON44  �CONDICIONAL 44      �A�001�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�34�00593�SALADEU�SALDO ADEUDOS PEND. �A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�35�00617�SALMISM�SBC DOC. MISMA PLAZA�A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�36�00641�SALDIST�SBC DOC.DISTINTA PZA�A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�37�00665�SALEXTR�SBC DOC. DEL EXTRANJ�A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�38�00689�SALVOUC�SBC DE VOUCHERS     �A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�39�00713�CONSAL �COND SALDOS OTROS   �A�001�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�40�00717�LIMCI  �LIM.COBRO INMEDIATO �A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�41�00741�DISCI  �DISP.COB.INMEDIATO  �A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�42�00765�LIMREM �LIMITE REMESA       �A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�43�00789�DISREM �DISPUESTO REMESA    �A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�44�00813�CON109 �CONDICIONAL 109     �A�001�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�45�00817�CON110 �CONDICIONAL 110     �A�001�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�46�00821�CON111 �CONDICIONAL 111     �A�001�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�47�00825�CON112 �CONDICIONAL 112     �A�001�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�48�00829�CON10  �CONDICIONAL 10      �A�001�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�49�00833�LIMEXT �LIMITE EXTRANJERO   �A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�50�00857�DISEXT �DISPUESTO EXTRANJERO�A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�51�00881�CON113 �CONDICIONAL 113     �A�001�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�52�00885�CON114 �CONDICIONAL 114     �A�001�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�53�00889�SALPLA �SALDO PLAZO         �A�021�0�S�        �
 * BGM402A �CONSULTA DE SALDOS(SALIDA 1). �S�54�00913�54�00913�CONLP  �CONDICIONAL LP      �A�001�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�01�00016�ESTADO �ESTADO              �A�013�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�02�00032�COND1  �COND. CTA INMOVILIZ.�A�001�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�03�00036�CANCEL �CANCELAC. AUTOM. S/N�A�002�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�04�00041�NUMIMP �NUMERO IMPOSICION   �N�005�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�05�00049�CON107 �CONDICIONAL 10-7    �A�001�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�06�00053�OFIGES �OFICINA GESTORA     �A�009�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�07�00065�UNIGEST�UNIDAD GESTORA      �A�006�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�08�00074�FECHAS �FECHAS              �A�037�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�09�00114�CON105 �CONDICIONAL 10-5    �A�001�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�10�00118�PUNTOSP�PUNTOS A SUMAR POSIT�A�006�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�11�00127�PUNTOSN�PUNTOS A RESTAR NEG �A�006�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�12�00136�PUNTOSE�PUNTOS A RESTAR EXCE�A�006�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�13�00145�PUNTOSM�PUNTOS A RESTAR MORA�A�006�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�14�00154�CON106 �CONDICIONAL 10-6    �A�001�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�15�00158�TITULA �TITULAR             �A�050�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�16�00211�NIF    �NIF                 �A�010�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�17�00224�CON108 �CONDICIONAL 10-8    �A�001�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�18�00228�CORASU �TITULARIDAD         �A�060�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�19�00291�CON12  �CONDICIONAL 12      �A�001�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�20�00295�LITDIS �LIT. DISPONIBILIDAD �A�020�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�21�00318�CON16  �CONDICIONAL 16      �A�001�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�22�00322�CON20  �CONDICIONAL 20      �A�001�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�23�00326�REGF   �REGULACION FISCAL   �A�004�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�24�00333�CON29  �CONDICIONAL 29      �A�001�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�25�00337�SITUOB �SITUACION OBJETIVA  �A�030�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�26�00370�CON36  �CONDICIONAL 36      �A�001�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�27�00374�SITUSU �SITUACION SUBJETIVA �A�030�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�28�00407�CON37  �CONDICIONAL 37      �A�001�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�29�00411�SITUIN �SITUACION INDUCIDA  �A�030�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�30�00444�CON38  �CONDICIONAL 38      �A�001�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�31�00448�TARIFA �TARIFA              �A�004�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�32�00455�LIDIOM �LITERAL IDIOMA      �A�007�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�33�00465�CON34  �CONDICIONAL 34      �A�001�0�S�        �
 * BGM402B �CONSULTA DE SALDOS(SALIDA 2). �S�34�00489�34�00469�SALLIB �SALDO LIBRETA       �A�021�0�S�        �
 * BGM4022 �CONSULTA DE SALDOS(SAL.ADICI.)�S�04�00060�01�00016�FECDES �FECHA DESCUBIERTO   �A�010�0�S�        �
 * BGM4022 �CONSULTA DE SALDOS(SAL.ADICI.)�S�04�00060�02�00029�CON01  �CONDICIONAL 1       �A�001�0�S�        �
 * BGM4022 �CONSULTA DE SALDOS(SAL.ADICI.)�S�04�00060�03�00033�CCCSERV�CCC TRASP SERV      �A�024�0�S�        �
 * BGM4022 �CONSULTA DE SALDOS(SAL.ADICI.)�S�04�00060�04�00060�CON03  �CONDICIONAL 3       �A�001�0�S�        �
 * BGM4025 �CONSULTA SALDOS (FORM.REDUC.) �S�12�00284�01�00016�FECHACA�FECHA DE CABECERA   �A�042�0�S�        �
 * BGM4025 �CONSULTA SALDOS (FORM.REDUC.) �S�12�00284�02�00061�LITCTA �LITERAL DE LA CUENTA�A�057�0�S�        �
 * BGM4025 �CONSULTA SALDOS (FORM.REDUC.) �S�12�00284�03�00121�SALDODI�SALDO DISPONIBLE    �A�021�0�S�        �
 * BGM4025 �CONSULTA SALDOS (FORM.REDUC.) �S�12�00284�04�00145�SALDOTO�SALDO TOTAL         �A�021�0�S�        �
 * BGM4025 �CONSULTA SALDOS (FORM.REDUC.) �S�12�00284�05�00169�DESDIVI�DESCRIPCION DIVISA  �A�020�0�S�        �
 * BGM4025 �CONSULTA SALDOS (FORM.REDUC.) �S�12�00284�06�00192�FECHAFI�FECHA FINAL         �A�008�0�S�        �
 * BGM4025 �CONSULTA SALDOS (FORM.REDUC.) �S�12�00284�07�00203�HORA   �HORA DE OPERACION   �A�005�0�S�        �
 * BGM4025 �CONSULTA SALDOS (FORM.REDUC.) �S�12�00284�08�00211�CODTRAN�CODIGO TRANSACCION  �A�004�0�S�        �
 * BGM4025 �CONSULTA SALDOS (FORM.REDUC.) �S�12�00284�09�00218�TERMINA�TERMINAL            �A�004�0�S�        �
 * BGM4025 �CONSULTA SALDOS (FORM.REDUC.) �S�12�00284�10�00225�SECUENC�NUMERO DE OPERACION �N�009�0�S�        �
 * BGM4025 �CONSULTA SALDOS (FORM.REDUC.) �S�12�00284�11�00237�HORAFI �HORA DE LA CLAVE    �A�005�0�S�        �
 * BGM4025 �CONSULTA SALDOS (FORM.REDUC.) �S�12�00284�12�00245�SUCURSA�SUCURSAL            �A�040�0�S�        �
 * BGM4026 �SALDO AMPLIADO                �S�09�00102�01�00016�CON05  �CONDICIONAL 5       �A�001�0�S�        �
 * BGM4026 �SALDO AMPLIADO                �S�09�00102�02�00020�DEPTO  �DEP. QUE BLOQUEA CTA�A�004�0�S�        �
 * BGM4026 �SALDO AMPLIADO                �S�09�00102�03�00027�CON06  �CONDICIONAL 6       �A�001�0�S�        �
 * BGM4026 �SALDO AMPLIADO                �S�09�00102�04�00031�COND23 �CONDICIONAL 23      �A�001�0�S�        �
 * BGM4026 �SALDO AMPLIADO                �S�09�00102�05�00035�COND24 �CONDICIONAL 24      �A�001�0�S�        �
 * BGM4026 �SALDO AMPLIADO                �S�09�00102�06�00039�COND31 �CONDICIONAL 31      �A�001�0�S�        �
 * BGM4026 �SALDO AMPLIADO                �S�09�00102�07�00043�CUOTIMP�CUOTA IMPAGADA      �F�017�2�S�        �
 * BGM4026 �SALDO AMPLIADO                �S�09�00102�08�00063�LITAHOI�LIT. AHORRO-CONCENT.�A�020�0�S�        �
 * BGM4026 �SALDO AMPLIADO                �S�09�00102�09�00086�SALAHOI�SAL. AHORRO-CONCENT.�F�017�2�S�        �
 * BGM4027 �CAMPOS ADICIONALES PARA T.F.  �S�18�00409�01�00016�FECVTO �FCHA VTO LIN.OPERAT.�A�010�0�S�        �
 * BGM4027 �CAMPOS ADICIONALES PARA T.F.  �S�18�00409�02�00029�LIMVOU �LIM.DEP.FIRME VOUCH.�A�021�0�S�        �
 * BGM4027 �CAMPOS ADICIONALES PARA T.F.  �S�18�00409�03�00053�DISVOU �DISP.FIRME VOUCHERS �A�021�0�S�        �
 * BGM4027 �CAMPOS ADICIONALES PARA T.F.  �S�18�00409�04�00077�LIMREM �LIM.DEP.FIRME REMESA�A�021�0�S�        �
 * BGM4027 �CAMPOS ADICIONALES PARA T.F.  �S�18�00409�05�00101�DISREM �DISP.FIRME REMESAS  �A�021�0�S�        �
 * BGM4027 �CAMPOS ADICIONALES PARA T.F.  �S�18�00409�06�00125�LIMCI  �LIM.DEP.FIR. COB.INM�A�021�0�S�        �
 * BGM4027 �CAMPOS ADICIONALES PARA T.F.  �S�18�00409�07�00149�DISCI  �DISP.FIRME COB.INM. �A�021�0�S�        �
 * BGM4027 �CAMPOS ADICIONALES PARA T.F.  �S�18�00409�08�00173�LIMEXT �LIM.DEP.FIRME EXTR. �A�021�0�S�        �
 * BGM4027 �CAMPOS ADICIONALES PARA T.F.  �S�18�00409�09�00197�DISEXT �DISP.FIRME EXTRANJ. �A�021�0�S�        �
 * BGM4027 �CAMPOS ADICIONALES PARA T.F.  �S�18�00409�10�00221�DESVOU �DESCR. DISP. VOUCH. �A�015�0�S�        �
 * BGM4027 �CAMPOS ADICIONALES PARA T.F.  �S�18�00409�11�00239�DESREM �DESC. DISP. REMESAS �A�015�0�S�        �
 * BGM4027 �CAMPOS ADICIONALES PARA T.F.  �S�18�00409�12�00257�DESCI  �DESC. DISP. COB. INM�A�015�0�S�        �
 * BGM4027 �CAMPOS ADICIONALES PARA T.F.  �S�18�00409�13�00275�DESEXT �DESC. DISP. EXTRANJ.�A�015�0�S�        �
 * BGM4027 �CAMPOS ADICIONALES PARA T.F.  �S�18�00409�14�00293�EXCMAX �EXC. MAXIMOO        �A�021�0�S�        �
 * BGM4027 �CAMPOS ADICIONALES PARA T.F.  �S�18�00409�15�00317�EXCVEN �EXC. VENTANILLA     �A�021�0�S�        �
 * BGM4027 �CAMPOS ADICIONALES PARA T.F.  �S�18�00409�16�00341�EXCDOM �EXC. DOMICILIACION  �A�021�0�S�        �
 * BGM4027 �CAMPOS ADICIONALES PARA T.F.  �S�18�00409�17�00365�EXCCAJ �EXC. CAJERO         �A�021�0�S�        �
 * BGM4027 �CAMPOS ADICIONALES PARA T.F.  �S�18�00409�18�00389�EXCCOM �EXC. COMPRAS        �A�021�0�S�        �
 * FICHERO: MBVD.BG.FIX.QGDTFDX.FDXB402.txt
 * B402BGM402A BGWC402ABG2C40201S                             IDAJLT  2005-03-23-11.52.30.112845IDAJLT  2005-03-23-11.52.30.112870
 * B402BGM402B BGWC402BBG2C40201S                             XM01346 2012-05-30-16.31.15.001771XM01346 2012-05-30-16.31.15.002262
 * B402BGM4022 BGWC4022BG2C40201S                             IDAJLT  2005-03-23-11.53.22.108811IDAJLT  2005-03-23-11.53.22.108841
 * B402BGM4025 BGWC4025BG2C40201S                             IDAJLT  2005-03-23-11.53.32.248842IDAJLT  2005-03-23-11.53.32.248872
 * B402BGM4026 BGWC4026BG2C40201S                             IDAJLT  2005-03-23-11.54.08.273693IDAJLT  2005-03-23-11.54.08.273721
 * B402BGM4027 BGWC4027BG2C40201S                             IDAJLT  2005-03-23-11.54.16.802412IDAJLT  2005-03-23-11.54.16.802441
</pre></code>
 * 
 * @see RespuestaTransaccionB402
 *
 * @author Arquitectura Spring BBVA
 */
@Transaccion(
	nombre = "B402",
	tipo = 1, 
	subtipo = 1,	
	version = 1,
	configuracion = "default_ps9_mx",
	respuesta = RespuestaTransaccionB402.class,
	atributos = {@Atributo(nombre = "altamiraExtendido", valor = "true"), @Atributo(nombre = "tipoCopy", valor = "BMS")}
)
@Multiformato(formatos = {FormatoBGM402.class})
@RooJavaBean
@RooToString
@RooSerializable
public class PeticionTransaccionB402 implements MensajeMultiparte {
	
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