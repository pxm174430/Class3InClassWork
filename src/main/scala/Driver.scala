object Driver {
  def main(args: Array[String]): Unit = {
    val myBird = new Animal("polly")
    myBird.makeSound()

    val germanShepherd = new Dog("rover")

    germanShepherd.wagTail()
    germanShepherd.makeSound()
    germanShepherd.move()

    val goldFish = new Fish("goldie")
    goldFish.move(24)
  }


}
