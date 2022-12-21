package com.consulco.catalogapi;

public class Decking {

	private Integer id;
		
	private Integer deckingId;
	private Integer deckingCatId;
	private String sKU;
	private String size;
	private String deckDesc;
	private double price;
	private String unit;
	private Boolean viewOnWeb;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public long getDeckingId() {
		return deckingId;
	}

	public void setDeckingId(Integer deckingId) {
		this.deckingId = deckingId;
	}
	
	public Integer getDeckingCatId() {
		return deckingCatId;
	}

	public void setDeckingCatId(Integer deckingCatId) {
		this.deckingCatId = deckingCatId;
	}

	public String getsKU() {
		return sKU;
	}

	public void setsKU(String sKU) {
		this.sKU = sKU;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDeckDesc() {
		return deckDesc;
	}

	public void setDeckDesc(String deckDesc) {
		this.deckDesc = deckDesc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public boolean isViewOnWeb() {
		return viewOnWeb;
	}

	public void setViewOnWeb(boolean viewOnWeb) {
		this.viewOnWeb = viewOnWeb;
	}
}
