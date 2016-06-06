import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.web.WebView
import java.io.File

/**
 * Main app.
 *
 * @author Toast kid
 */
object Main extends JFXApp {
  /** web view. */
  private[this] val browser: WebView = new WebView
  browser.engine.load(new File("slide.html").toURI.toURL.toString)

  stage = new JFXApp.PrimaryStage {
    title  = "Effective Scala"
    width  = 1200.0
    height =  800.0
    scene = new Scene {
      root = browser
    }
  }
  stage.setFullScreen(true)
}
