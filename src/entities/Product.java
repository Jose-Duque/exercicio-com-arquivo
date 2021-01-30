package entities;

public class Product {
	private String name;
	private Double price;
	private Integer qtd;
	
	public Product() {
	}

	public Product(String name, Double price, Integer qtd) {
		super();
		this.name = name;
		this.price = price;
		this.qtd = qtd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	
	public Double total() {
		return qtd * price;
	}
}
