package cr.microservicios.gac.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import cr.microservicios.commons.entity.ClienteRequest;
import cr.microservicios.gac.client.GacFeignClient;
import cr.microservicios.gac.entity.ResponseGacCabecera;

@Service
public class ClienteGacServiceImpl implements ClienteGacService {

	@Autowired
	private GacFeignClient clientegac;

	@Override
	public ResponseGacCabecera listarGAC(HttpHeaders headerMap, ClienteRequest client) {
		return clientegac.listarGAC(headerMap, client);
	}

}
