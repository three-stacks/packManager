package io.threestacks.packerapi.budget;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Budget {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	public String event;
	public int price;
	public int packId;
	
	public Budget(){
		
	}
	
	public Budget(long id, String event, int price, int packId) {
		super();
		this.id = id;
		this.event = event;
		this.price = price;
		this.packId = packId;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPackId() {
		return packId;
	}
	public void setPackId(int packId) {
		this.packId = packId;
	}
	
}
