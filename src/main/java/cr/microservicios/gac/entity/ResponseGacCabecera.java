package cr.microservicios.gac.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseGacCabecera {

	@JsonProperty("Datos")
	private List<ResponseGacDetalle> datos;

	public List<ResponseGacDetalle> getDatos() {
		return datos;
	}

	public void setDatos(List<ResponseGacDetalle> datos) {
		this.datos = datos;
	}

}
