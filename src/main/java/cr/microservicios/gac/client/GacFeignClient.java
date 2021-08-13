package cr.microservicios.gac.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import cr.microservicios.commons.entity.ClienteRequest;
import cr.microservicios.gac.entity.ResponseGacCabecera;

@FeignClient(name = "gac", url = "https://dpisit.grupoib.local:5020/ibk/sit/api/enterprise-loan/v1/loan-limit/warranty")
public interface GacFeignClient {

	@PostMapping
	public ResponseGacCabecera listarGAC(@RequestHeader HttpHeaders headerMap,
			@RequestBody ClienteRequest client);

}
