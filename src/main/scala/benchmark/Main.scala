package benchmark

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer


object Main extends App {

  implicit val system = ActorSystem()
  implicit val materializer = ActorMaterializer.create(system)

  println("Staring Up!")
  val httpService = Http().bindAndHandle(new HTTPHello().route,  "0.0.0.0", 8008)

}