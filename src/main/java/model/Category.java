package model;

import jakarta.persistence.*;

@Entity

public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "predmet_seq")
	private int categoryId;
	@Column(nullable = false)
	private String name;
	
	public Category() {
		super();

		this.name = name;
	}
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", name=" + name + "]";
	}
	
}
