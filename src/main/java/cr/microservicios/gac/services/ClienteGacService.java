package cr.microservicios.gac.services;

import org.springframework.http.HttpHeaders;

import cr.microservicios.commons.entity.ClienteRequest;
import cr.microservicios.gac.entity.ResponseGacCabecera;

public interface ClienteGacService {

	public ResponseGacCabecera listarGAC(HttpHeaders headerMap, ClienteRequest client);

}
