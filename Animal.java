abstract class Animal {
	abstract void animalSound();

	public static void main(String[] args) {
		Animal animal = new Pig();
		animal.animalSound();
	}
}

class Pig extends Animal {
	public void animalSound() {
		System.out.println("wee wee");
	}
}

class Dog extends Animal {
	public void animalSound() {
		System.out.println("woof woof");
	}
}