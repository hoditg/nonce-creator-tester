
package views.html.pages

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object sneakybug extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div id="sneakyBugMain">
	<div class="landing-area">
		<div class="bug-area container">
			<div class="holder">
				<h2>The story of the sneaky bug that got an entire production down</h2>
				<p>New year's eve. Well, all great downtimes must happen on holidays, birthdays or even better - spouses' birthdays. A few days earlier, when the dev team was trying to beat a tight deadline, the database had to be moved to a new location. All we had to do was update the new IP on each server's config file, 1, 2, 3 ... 20 servers - Done!</p>
				<span>We missed one. It was the only server type with no redundancy at that time, and obviously this one also had critical functionality that the other servers relied on. Another testament to the saying that anything that can go wrong, will go wrong. And then it started:</span>
				<ul>
					<li>...Tens of thousands of timeout errors.</li>
					<li>...Countless hours pouring over server logs.</li>
					<li>...Validating database entries to clean up the mess.</li>
					<li>...Most of the developers spent New year's eve bringing the production up.</li>
				</ul>
				<p>Cases like that were the trigger for starting Takipi - Creating a new type of tool to help developers avoid the next crisis in production, and solve server errors in minutes, getting to the 'a-Ha!' moment in just a few seconds.</p>
				<p><strong class="subtitle">Now you can get actionable insights to solve your production errors, and cut down debugging time.</strong></p>
				<h3>How a software bug led to a $460M loss in one day</h3>
				<p>A very similar case took down not just an entire production environment, but an entire company. This bug is known as "The knight Capital Glitch". Knight Capital was a leading Algo-trading company worth more than $1.5 billion, when a software bug led to a $460M loss in one day.<br/><br/>Here's how it happened:<br/>On August 1st 2012, new code was deployed to production and replaced old, unused code in the trading system. This new code repurposed and enabled a flag which was also used in the older code. During deployment, one copy of the older code was forgotten. It gets worse: The newly enabled flag, combined with the old forgotten code, ran on one of the servers and sent out unintended orders to the stock exchange, literally throwing money down the drain.</p>
				<p><strong class="subtitle">It only takes 10 min to evaluate Takipi and you get one server for free. Zero configuration. No Risk.</strong></p>
			</div><!-- / holder -->
			<div class="landing-form takipiMiniSignupForm" createdin="sidebar">
				<img src="assets/images/landing/img-landing-01.png" alt="image">
				<form>
					<div class="row">
						<input class="text emailInput" type="email" placeholder="Email address">
						<input class="btn-submit createStubAccountBtn" type="submit" value="Start using Takipi">
					</div>
					<p>Solve your first bug by <em id="errorAnalysisTime" class="time">5:38pm</em>,<br>Java / Scala developers</p>
					<p>Deploy and get a Free T-shirt</p>
				</form>
			</div><!-- / landing-form -->
		</div><!-- / bug-area -->
		<div class="features-holder">
			<div class="container">
				<ul class="list">
					<li>
						<div class="img">
							<img src="assets/images/landing/img-landing-02.png" alt="image">
						</div>
						<p>Cut down the 'detect-fix-deploy' cycle to minutes</p>
					</li>
					<li>
						<div class="img">
							<img src="assets/images/landing/img-landing-03.png" alt="image">
						</div>
						<p>Have zero critical server errors</p>
					</li>
					<li>
						<div class="img">
							<img src="assets/images/landing/img-landing-04.png" alt="image">
						</div>
						<p>Slash debugging time</p>
					</li>
				</ul><!-- / list -->
				<a class="more" href=""""),_display_(/*54.28*/routes/*54.34*/.BlueSite.product),format.raw/*54.51*/("""" target="_blank">View full feature list</a>
			</div><!-- / container -->
		</div><!-- / features-holder -->
		<div class="stack-area infix">
			<div class="video-player container">
				<video id="demo-video" poster="https://www.takipi.com/assets/images/index/img03.jpg"> 
					<source src="https://www.takipi.com/assets/videos/index/demo.mp4" type="video/mp4" />
				</video><!-- / video-bg -->
				<div class="landing-form takipiMiniSignupForm" createdin="movie>
					<form>
						<div class="row">
							<input class="text emailInput" type="email" placeholder="Email address">
							<input class="btn-submit createStubAccountBtn" type="submit" value="Start using Takipi">
						</div>
					</form>
				</div><!-- / landing-form -->
			</div><!-- / video-player -->
		</div>
	</div><!-- / landing-area -->
</div>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:38 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/pages/sneakybug.scala.html
                  HASH: bb036a082c93a9576ec4eb1680403b400474b601
                  MATRIX: 590->0|4377->3760|4392->3766|4430->3783
                  LINES: 22->1|75->54|75->54|75->54
                  -- GENERATED --
              */
          