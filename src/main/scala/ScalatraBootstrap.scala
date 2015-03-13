import org.scalatra.LifeCycle
import javax.servlet.ServletContext

import com.example.app.HelloServlet


class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    // Mount servlets.
    context.mount(new HelloServlet, "/hello/*")
  }
}
