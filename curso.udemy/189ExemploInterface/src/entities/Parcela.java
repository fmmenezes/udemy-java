package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataParcela;
	private Double valorParcela;
	
	public Parcela(Date dataParcela, Double valorParcela) {
		
		this.dataParcela = dataParcela;
		this.valorParcela = valorParcela;
	}

	public Date getDataParcela() {
		return dataParcela;
	}

	public void setDataParcela(Date dataParcela) {
		this.dataParcela = dataParcela;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}
	
	@Override
	public String toString() {
		return sdf.format(dataParcela) + " - " + String.format("%.2f", valorParcela);
	}
	

}
