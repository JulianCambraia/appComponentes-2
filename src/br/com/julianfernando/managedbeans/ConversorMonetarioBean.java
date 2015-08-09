package br.com.julianfernando.managedbeans;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

import br.com.julianfernando.entities.ConversorMonetario;

@ManagedBean
public class ConversorMonetarioBean {

	private ConversorMonetario conversorMonetario = new ConversorMonetario();
	
	private Map<String, Double> taxas = new LinkedHashMap<String, Double>();

	public ConversorMonetarioBean() {
		super();
		this.taxas.put("Real", 1.0);
		this.taxas.put("Euro", 3.33);
		this.taxas.put("Peso Argentino", 0.42);
		this.taxas.put("Dólar Americano", 2.84);
	}

	public ConversorMonetario getConversorMonetario() {
		return conversorMonetario;
	}

	public void setConversorMonetario(ConversorMonetario conversorMonetario) {
		this.conversorMonetario = conversorMonetario;
	}

	public Map<String, Double> getTaxas() {
		return taxas;
	}
	
	public String conversorDeMoeda() {
		conversorMonetario.setResultado(this.conversorMonetario.getValor() * this.taxas.get(this.conversorMonetario.getDe()) / this.taxas.get(this.conversorMonetario.getPara()) );
		
		return "moeda";
	}
	
	public void reset() {
		this.conversorMonetario.setDe("");
		this.conversorMonetario.setPara("");
		this.conversorMonetario.setValor(null);
	}
}
