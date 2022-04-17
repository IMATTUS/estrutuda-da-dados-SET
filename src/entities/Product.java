package entities;

import java.util.Objects;

public class Product implements Comparable<Product> {
	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	

/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}



	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}



	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}



	// (... get / set / hashCode / equals)
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product other) {
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}
}