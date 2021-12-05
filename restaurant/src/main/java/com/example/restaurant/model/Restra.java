package com.example.restaurant.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restra {
private String Item;
private int Price;
private int Qty;
private int Total;
@Id
  public String getItem() {
		return Item;
	}
	public void setItem(String item) {
		Item = item;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	public int getTotal() {
		return Total;
	}
	public void setTotal(int total) {
		Total = total;
	}
	@Override
	public String toString() {
		return "Restra [Item=" + Item + ", Price=" + Price + ", Qty=" + Qty + ", Total=" + Total + "]";
	}
	

	

}