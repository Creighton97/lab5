
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!doctype html>
</html>
   <head>
     <title>About Us page</title>
     <style>
         h1  """),format.raw/*6.14*/("""{"""),format.raw/*6.15*/("""
             """),format.raw/*7.14*/("""color:red;

         """),format.raw/*9.10*/("""}"""),format.raw/*9.11*/("""
         """),format.raw/*10.10*/("""</style>
        </head>
        <body>
            <h1>About Us</h1>
            </body>
            </html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 16 10:23:43 GMT 2017
                  SOURCE: /home/wdd/webapps/play/play-java-seed/app/views/about.scala.html
                  HASH: 52d3c055041d72b6dd51e7fb2444fac6fa9f9208
                  MATRIX: 1030->0|1151->94|1179->95|1220->109|1268->130|1296->131|1334->141
                  LINES: 33->1|38->6|38->6|39->7|41->9|41->9|42->10
                  -- GENERATED --
              */
          