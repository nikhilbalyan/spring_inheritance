package inheritance_mapping.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Apparal extends Product{
	@Column(name="type")
	private String type;
	@Column(name="brand")
	private String brand;
	@Column(name="design")
	private String design;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	
	
}
