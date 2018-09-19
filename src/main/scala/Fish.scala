class Fish(name: String) extends Animal(name){

  override def move(units: Int): Unit = {
    println(s"$name swims ${units*2} strokes forward")
    println(f"$name swims ${units*2} strokes forward")// handy with currency; lets you put the format
  }



}
