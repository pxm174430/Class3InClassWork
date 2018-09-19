class Animal(animalName: String) {
  private var name = animalName
  def makeSound(): Unit = {
    println(s"\n\nAnimal, $name, makes a sound\n\n")// s for string interpolation; you can now refer to variables in a very easy way
  }

  def move(units: Int = 5 ): Unit= {
    println(s"$name moved")
  }

}
