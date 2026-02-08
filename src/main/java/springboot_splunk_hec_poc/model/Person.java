package springboot_splunk_hec_poc.model;

import java.util.Objects;

public class Person {
	private String name;
	private int phoneNumber;
	
	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name) && phoneNumber == other.phoneNumber;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

}
