package benchmark

import akka.http.scaladsl.server.Directives
import akka.http.scaladsl.server.directives.HeaderDirectives
import akka.stream.ActorMaterializer

/**
 * Created by kinshuk.bairagi on 04/02/16.
 */
class HTTPHello(implicit am: ActorMaterializer) extends Directives with HeaderDirectives {

  val route =
    path("hello") {
      get {
        ctx =>
          Thread.sleep(2)
          ctx.complete("h!")
      }
    }


}
