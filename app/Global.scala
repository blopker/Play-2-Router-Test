import play.api._
import play.api.mvc._

object Global extends GlobalSettings {

  override def onStart(app: Application) {
    Logger.info("RouterTest 1 has started")
  }

  override def onRouteRequest(req: RequestHeader): Option[Handler] = {
    (req.method, req.path) match {
      case ("GET", "/") => Some(controllers.Application.index)
      case _ => None
    }
  }
}