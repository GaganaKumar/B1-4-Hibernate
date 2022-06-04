package Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Item")
public class Item implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	private long id;
	private String name;
	private int price;
	private String manufacturingDate;
	private String expiryDate;
	private String category;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(String string) {
		this.manufacturingDate = string;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String string) {
		this.expiryDate = string;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}