package br.com.caelum.estoque.modelo.usuario;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public abstract class DateAdapter extends XmlAdapter {

	private String pattern = "dd/MM/yyyy";
	
	public Date unmarshal(String dateString) throws Exception {
		return new SimpleDateFormat(pattern).parse(dateString);
	}
	
	public String marshal(Date date) throws Exception {
		return new SimpleDateFormat(pattern).format(date);
	}
}