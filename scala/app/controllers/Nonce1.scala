package controllers

import play.api._
import play.api.mvc._
import views.html._

object Support extends Controller
{
	def throwExcep1 = Action
	{ request =>
		val maybeNav = request.queryString.getOrElse("nav", Seq(""))(0)
		val maybeSub = request.queryString.getOrElse("sub", Seq(""))(0)
		throw new IllegalStateException(maybeNav.toString)	
//		val nonce45 = request.queryString.getOrElse("nonce45", Seq(""))(0)
			if (!maybeNav.isEmpty && !maybeSub.isEmpty)
		{
			Redirect(globals.TAKIPI_SUPPORT_SITE + "/" + maybeNav.toString + "/" + maybeSub.toString, 301)
		}
		else if (!maybeNav.isEmpty)
		{
			throw new IllegalStateException(maybeNav.toString)
			Redirect(globals.TAKIPI_SUPPORT_SITE + "/" + maybeNav, 301)
		}
		else
		{
			throw new IllegalStateException(maybeNav.toString)
			Redirect(globals.TAKIPI_SUPPORT_SITE, 301)
		}
	}
}
