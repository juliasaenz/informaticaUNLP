package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class VoorheesExporter {

	@SuppressWarnings("unchecked")
	private JSONObject exportar(Socio socio) {
		
		JSONObject usuario = new JSONObject();
		
		usuario.put("nombre", socio.getNombre());
		usuario.put("legajo", socio.getLegajo());
		usuario.put("email", socio.getEmail());
		
		/*String separator = System.lineSeparator();
		return "\t{" + separator
			+ "\t\t\"nombre\": \"" + socio.getNombre() + "\"," + separator
			+ "\t\t\"email\": \"" + socio.getEmail() + "\"," + separator
			+ "\t\t\"legajo\": \"" + socio.getLegajo() + "\"" + separator
			+ "\t}";*/
		return usuario;
	}

	@SuppressWarnings("unchecked")
	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
		
		JSONArray usuarios = new JSONArray();
		socios.forEach(socio -> usuarios.add(this.exportar(socio) ) );
		
		return usuarios.toString();
		/*String separator = System.lineSeparator();
		StringBuilder buffer = new StringBuilder("[" + separator);
		socios.forEach(socio -> {
			buffer.append(this.exportar(socio))
				.append(",")
				.append(separator);
		});
		// remueve la última coma y fin de línea
		buffer.setLength(buffer.length() - (separator.length() + 1));
		buffer.append(separator).append("]");
		return buffer.toString();*/
	}
}
