package dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

@SuppressWarnings("deprecation")
public class Prescription {

	
	private int id;
	private String name;
	private List<String> medicineList;

	public int getId() {
		return id;
	}

	
	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMedicineList() {
		return medicineList;
	}

	@Required
	public void setMedicineList(List<String> medicineList) {
		this.medicineList = medicineList;
	}

	@Override
	public String toString() {
		return "Prescription [id=" + id + ", name=" + name + ", medicineList=" + medicineList + "]";
	}

	

}
