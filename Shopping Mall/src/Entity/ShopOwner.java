package Entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ShopOwner")
public class ShopOwner implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	@Column(name="ownerId")
	private String id;
	@Column(name="ownerName")
	private String name;
	@Column(name="DOB")
	private LocalDate dob;
	@Column(name="Address")
	private String address;
	@Column(name="shopId")
	private int shop_id;
	public String getId() {
		return id;
	}
	public void setId(String string) {
		this.id = string;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getShop_id() {
		return shop_id;
	}
	public void setShop_id(int i) {
		this.shop_id = i;
	}
	@Override
	public String toString() {
		return "ShopOwner [id=" + id + ", name=" + name + ", dob=" + dob + ", address=" + address + ", shop_id="
				+ shop_id + "]";
	}
	
}