import org.scalatra.LifeCycle
import javax.servlet.ServletContext

import com.example.app.HelloServlet
import com.example.app.FlowersController


class ScalatraBootstrap extends LifeCycle {
    override def init(context: ServletContext) {
        // Mount servlets.
        context.mount(new HelloServlet, "/hello/*")
        context.mount(new FlowersController, "/flowers/*")
    }
}
