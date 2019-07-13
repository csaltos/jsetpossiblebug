import scala.collection.JavaConverters._
import java.util

object JSetPossibleBug extends App {

	println("The following code should print hello just once (the set contains just one element, not two):")

	val jSet = new util.HashSet[String]()
	jSet.add("hello")
	jSet.asScala.map(println)

}
