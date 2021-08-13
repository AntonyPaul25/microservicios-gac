package cr.microservicios.gac.controller;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cr.microservicios.commons.entity.ClienteRequest;
import cr.microservicios.commons.entity.LogMDL;
import cr.microservicios.gac.entity.ResponseGacCabecera;
import cr.microservicios.gac.services.ClienteGacService;
import cr.microservicios.gac.services.LogMDLService;
import feign.FeignException;

@RestController
public class GacController {

	@Autowired
	private ClienteGacService servicecliente;

	@Autowired
	private LogMDLService logservice;

	@PostMapping
	public ResponseEntity<?> ObtenerGAC(@Valid @RequestBody ClienteRequest clientrequest, BindingResult result) {

		if (result.hasErrors()) {
			return this.validar(result);
		}

		Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Format formatterMessage = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS");

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBasicAuth("uBseGenSit", "Ibkubssit16+");
		headers.add("X-INT-Device-Id", "0");
		headers.add("APIm-Debug", "true");
		headers.add("X-INT-Timestamp", formatter.format(new Date()));
		headers.add("X-INT-Service-Id", "ATM");
		headers.add("X-INT-Net-Id", "IS");
		headers.add("X-IBM-Client-Id", "489f5b95-2507-48e8-839a-b4424ef7e447");
		headers.add("X-INT-Supervisor-Id", "SXFL0000");
		headers.add("X-INT-Consumer-Id", "ATM");
		headers.add("X-INT-Branch-Id", "100");
		headers.add("X-INT-Message-Id", formatterMessage.format(new Date()));
		headers.add("X-INT-User-Id", "BSE0000");

		ResponseGacCabecera objGac = new ResponseGacCabecera();

		try {
			objGac = servicecliente.listarGAC(headers, clientrequest);
		} catch (FeignException feigne) {
			String errorFeign = feigne.contentUTF8().toString();
			logservice.save(
					new LogMDL("num solicitud: " + clientrequest.getNumsolicitud().toString() + " -- " + errorFeign));
			return new ResponseEntity<>(feigne.contentUTF8(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return ResponseEntity.ok(objGac);

	}

	protected ResponseEntity<?> validar(BindingResult result) {
		Map<String, Object> errores = new HashMap<>();
		result.getFieldErrors().forEach(err -> {
			errores.put(err.getField(), "El campo " + err.getField() + " " + err.getDefaultMessage());
		});
		return ResponseEntity.badRequest().body(errores);
	}

}
