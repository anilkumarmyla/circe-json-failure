package example

import io.circe.literal._
import net.javacrumbs.jsonunit.JsonAssert.assertJsonEquals
import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "Json equals" should "fail" in {
    val a1 =
      json"""
        {
          "b_c": "c",
          "b1": "c1"
        }
        """
    val a2 =
      json"""
        {
          "b": "c",
          "b1": "c1"
        }
        """
    assertJsonEquals(a1, a2) // does not fail with jackson, but fails with json.org / gson
    //assertJsonEquals(a1.noSpaces, a2.noSpaces) // fails with jackson as well, this is the workaround!
  }
}
