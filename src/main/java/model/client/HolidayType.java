package model.client;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HolidayType {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "type_seq")
	private Long id;
	private String types;

	public HolidayType() {
		super();
	}

	public HolidayType(Long id, String types) {
		super();
		this.id = id;
		this.types = types;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	@Override
	public String toString() {
		return "HolidayTypes [id=" + id + ", types=" + types + "]";
	}

}
