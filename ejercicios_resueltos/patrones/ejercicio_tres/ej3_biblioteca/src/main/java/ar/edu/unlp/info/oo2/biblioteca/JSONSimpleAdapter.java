package ar.edu.unlp.info.oo2.biblioteca;
import org.json.simple.JSONObject;

import java.util.List;

import org.json.simple.JSONArray;

public class JSONSimpleAdapter extends VoorheesExporter {
	
	@Override
	public String exportar(List<Socio> socios) {
		JSONArray arregloJSON = new JSONArray();
		socios.stream()
		.forEach(socio -> arregloJSON.add(this.crearSocio(socio)));
		return arregloJSON.toJSONString();
	}
	
	private JSONObject crearSocio(Socio socio) {
		JSONObject objetoJSON = new JSONObject();
		objetoJSON.put("nombre", socio.getNombre());
		objetoJSON.put("email", socio.getEmail());
		objetoJSON.put("legajo", socio.getLegajo());
		return objetoJSON;
	}
	
}
