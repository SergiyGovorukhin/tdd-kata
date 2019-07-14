import org.scalatest.{BeforeAndAfter, FlatSpec, Matchers}

class MainSpec extends FlatSpec with Matchers with BeforeAndAfter {

  private val stringCalculator = new MainClass

  "method add with string param" should "exist" in {
    val value = "1,2"
    stringCalculator.add(value)
  }

  "method add" should "return int" in {
    val value = "1,2"
    val result = stringCalculator.add(value)

    result shouldBe a [Int]
  }

  "method add with empty param" should "should return 0" in {
    val value = ""
    val result = stringCalculator.add(value)

    result shouldBe 0
  }

  "add argument consists of not only numbers or coma" should "throw exception" in {
    val value = "."
    an [IllegalArgumentException] should be thrownBy stringCalculator.add(value)
  }

  "add with argument that consists of any amount of numbers" should "not throw exception" in {
    val value = "1,2,3,4,5,6,7,8"
    stringCalculator.add(value)
  }

  "if add argument cannot be parsed to numbers of type long" should "throw exception" in {
    val value = "9999999999999999999999999999999999999999999999999999999999"
    an [NumberFormatException] should be thrownBy stringCalculator.add(value)
  }

  "method add" should "return " in {
    val value = "1,2"
    val result = stringCalculator.add(value)

    result shouldBe a [Int]
  }
}
