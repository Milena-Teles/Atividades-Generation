package POLIMORFIA_;

public abstract class Animal {
	
	private String animal; 
	
	abstract public void nome(String nome);
	abstract public void idade(int idade);
	abstract public void som(String some);
	
	public Animal(String animal) 
	{
		this.animal = animal;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	

}
