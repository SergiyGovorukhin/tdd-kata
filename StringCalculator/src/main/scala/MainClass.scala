class MainClass {

  def validate(value: String): Unit = {
    val isValueValid = value.toCharArray.forall(v => v.isDigit || v.equals(','))

    if (!isValueValid) {
      throw new IllegalArgumentException(s"Invalid argument '$value'")
    }
    val numbers = value.split(",")
    numbers.foreach(_.toLong)
  }

  def add(value: String): Int = {
    if (value.isEmpty) {
      0
    } else {
      validate(value)
      0
    }
  }
}
