
package views.html.bluesite.pages

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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div id="blueSiteIndexMain">
	<section class="promo-block">
		<div class="slimSiteCentered">
			<div class="descr">
				<h1>Takipi tells you when and why code breaks in production.</h1>
				<p>Get actionable information to fix the errors
<br>that impact your users the most.</p>
				<div class="start-form takipiMiniSignupForm" createdin="header">
					<form action="#">
						<div class="row">
							<input class="text emailInput" type="email" placeholder="Email address">
							<input class="btn-submit createStubAccountBtn" type="submit" value="Start using Takipi &gt;&gt;">
						</div>
						<div class="errorLabel">User already exists <a class="loginLink" href=""""),_display_(/*14.79*/globals/*14.86*/.LOGIN_PAGE),format.raw/*14.97*/("""">Log in</a></div>
						<p class="supported-language">Java, Scala, Groovy, Clojure, JRuby</p>
					</form>
				</div>
			</div>
		</div>
		<img class="alignright" src="assets/images/bluesite/Fred--main-site_.gif" alt="image">
	</section><!-- /promo-block -->
	<section class="production-info">
		<div class="slimSiteCentered">
			<div class="headline">
				<h2 class="marked">see the cause - CODE AND VARIABLES</h2>
				<p>Takipi detects every caught and uncaught exception, log and HTTP error in production and<br>shows the code and variables that caused them - right as if you were there.</p>
			</div>
			<div class="production-area">
				<div class="col-left">
					<div class="history-box">
						<strong class="ttl">NullPointerException</strong>
						<p>CampaignBuilder.selectPublisher</p>
						<ul class="list">
							<li><img src="assets/images/bluesite/ico01.png" alt="image">First seen Dec 17</li>
							<li><img src="assets/images/bluesite/ico02.png" alt="image">26 times</li>
						</ul>
						<div class="error-block">
							<a class="select open-link" href="#">
								<ul class="num">
									<li class="num-01">4</li>
									<li class="num-02">2</li>
								</ul>
								<span class="text">Dec 18, 11:32 am</span>
							</a>
							<ul class="error-list">
								<li><a href="#"><em class="date">Dec 18, 11:33 am</em><span class="txt">na.dallas.dc02.campaign-builder-02</span></a></li>
								<li><a href="#"><em class="date">Dec 18, 11:32 am</em><span class="txt">na.dallas.dc01.campaign-builder-02</span></a></li>
								<li><a href="#"><em class="date">Dec 17, 3:11 pm</em><span class="txt">na.dallas.dc01.campaign-builder-02</span></a></li>
								<li><a href="#"><em class="date">Dec 17, 11:33 am</em><span class="txt">na.boston.dc01.campaign-builder-02</span></a></li>
								<li><a href="#"><em class="date">Dec 17, 11:33 am</em><span class="txt">na.boston.dc01.campaign-builder-02</span></a></li>
							</ul>
							<div class="info-link info-link-01">
								<a href="#">Error history</a>
								<div class="box">
									<p>See multiple instances of the error at different times and from different machines.</p>
								</div>
								<a href="#" class="hotspot"></a>
							</div>
						</div><!-- / error-block -->
					</div><!-- / history-box -->
					<ul class="nav-list">
						<li class="style-05">CampaignBuilder.selectPublisher</li>
						<li class="style-05">CampaignBuilder.buildCampaign</li>
						<li class="style-05">CampaignServlet.doGet</li>
						<li class="style-01 style-05">
							<a class="open-link" href="#">na.dallas.dc01.campaign-builder-02</a>
							<div class="info-link info-link-02">
								<a href="#">Unified stacks</a>
								<div class="box">
									<p>If an error involves calls across multiple machines over HTTP / REST, Takipi shows the unified call stack - complete with code and variables for each machine.</p>
								</div>
								<a href="#" class="hotspot"></a>
							</div>
						</li>
						<li class="style-04 color-02">BidRequestTask.execute</li>
						<li class="style-04 color-02">TaskExecutor.execute</li>
						<li class="style-02 style-04 color-02">
							<a class="open-link" href="#">QueueTasksFetcher.run</a>
							<div class="info-link info-link-03">
								<a href="#">Reproduce errors</a>
								<div class="box">
									<p>Get the values passed into your code to reproduce every production error.</p>
								</div>
								<a href="#" class="hotspot"></a>
							</div>
						</li>
						<li class="style-03 style-04 color-02">na.california.dc02.ad-bidder-11</li>
					</ul><!-- / nav-list -->
				</div><!-- / col-left -->
				<div class="col-right">
					<div class="wrap-01">
						<div class="info-holder">
							<strong class="subtitle">CampaignBuilder.selectPublisher </strong>
							<div class="code-block">
								<span class="line"><span class="color-1">private</span> Publisher selectPublisher(List<span class="color-1">&lt;</span>Publisher<span class="color-1">&gt;</span>
								<span class="info-block">
									<a class="link" href="#">publishers</a>
									<span class="holder">
										<strong class="sub-head">publishers</strong>
										<span class="list-item"><span class="left">0</span><span class="right">AdPublisher</span></span>
										<span class="list-item"><span class="left">1</span><span class="right">BidPublisher</span></span>
									</span>
								</span>
								) """),format.raw/*104.11*/("""{"""),format.raw/*104.12*/("""</span><!-- / line -->
								<span class="line"><span class="spaces spaces-01"></span><span class="color-1">for</span> (Publisher &nbsp;
								<span class="info-block info-block-07">
									<a class="link" href="#">publisher</a>
									<span class="holder">
										<strong class="sub-head">publisher</strong>
										<span class="list-item"><span class="left">minPrice</span><span class="right">0.2</span></span>
										<span class="list-item"><span class="left">maxPrice</span><span class="right">0.7</span></span>
										<span class="list-item">...</span>
									</span>
								</span>
								<span class="color-1">:</span> 
								<span class="info-block">
									<a class="link" href="#">publishers</a>
									<span class="holder">
										<strong class="sub-head">publishers</strong>
										<span class="list-item"><span class="left">0</span><span class="right">AdPublisher</span></span>
										<span class="list-item"><span class="left">1</span><span class="right">BidPublisher</span></span>
									</span>
								</span>
								) """),format.raw/*124.11*/("""{"""),format.raw/*124.12*/("""</span><!-- / line -->
								<span class="line"><span class="spaces spaces-02"></span><span class="color-1">double</span>
								<span class="info-block info-block-02">
									<a class="link" href="#">allowance</a>
									<span class="holder">0.8</span>
								</span>
								<span class="color-1">=</span>
								<span class="info-block">
									<a class="link" href="#">publisher</a>
									<span class="holder">
										<strong class="sub-head">publisher</strong>
										<span class="list-item"><span class="left">minPrice</span><span class="right">0.2</span></span>
										<span class="list-item"><span class="left">maxPrice</span><span class="right">0.7</span></span>
										<span class="list-item">...</span>
									</span>
								</span>
								<span class="color-1">.</span>getAllowance();</span><!-- / line -->
								<span class="line"></span><!-- / line -->
								<span class="line highlight flame"><span class="spaces spaces-02"></span><span class="color-1">if</span>
								((<span class="info-block info-block-02">
									<a class="link" href="#">bidPrice</a>
									<span class="holder">null</span>
								</span>
								<span class="color-1">.</span>minimum() <span class="color-1">&gt;=</span>
								<span class="var">
									<a class="link open-link" href="#">allowance</a>
									<span class="var-holder">
										<span class="right">0.8</span>
									</span>
									<span class="info-link info-link-04">
										<a href="#">Hover over variables</a>
										<span class="box">to see their value when the error occurred. Takipi automatically reconstructs the code leading to the error within the JVM.</span>
										<a href="#" class="hotspot"></a>
									</span>
								</span>
								) <span class="color-1">&amp;&amp;</span></span><!-- / line -->
								<span class="line"><span class="spaces spaces-03"></span>
								(<span class="info-block info-block-02">
									<a class="link" href="#">bidPrice</a>
									<span class="holder">null</span>
								</span>
								<span class="color-1">.</span>maximum() <span class="color-1">&lt;=</span>
								<span class="info-block info-block-02">
									<a class="link" href="#">allowance</a>
									<span class="holder">0.8</span>
								</span>
								)) """),format.raw/*170.12*/("""{"""),format.raw/*170.13*/("""</span><!-- / line -->
								<span class="line"><span class="spaces spaces-03"></span><span class="color-1">return</span>
								<span class="info-block info-block-07">
									<a class="link" href="#">publisher</a>
									<span class="holder">
										<strong class="sub-head">publishers</strong>
										<span class="list-item"><span class="left">minPrice</span><span class="right">0.2</span></span>
										<span class="list-item"><span class="left">maxPrice</span><span class="right">0.7</span></span>
									</span>
								</span>;
								</span><!-- / line -->
								<span class="line"><span class="spaces spaces-02"></span>"""),format.raw/*181.66*/("""}"""),format.raw/*181.67*/("""</span><!-- / line -->
								<span class="line"><span class="spaces spaces-01"></span>"""),format.raw/*182.66*/("""}"""),format.raw/*182.67*/("""</span><!-- / line -->
								<div class="values">
									<a class="sub-head open-link" href="#">Recorded variables</a>
									<ul class="list">
										<li class="caret">
											<a href="#">
												<span class="left">this</span>
												<span class="right">CampaignB...</span>
											</a>
											<ul>
												<li>
													<a href="#">
														<span class="left">bidPrice</span>
														<span class="right">null</span>
													</a>
												</li>
												<li>
													<a href="#">
														<span class="left">transactionId</span>
														<span class="right">"WEsdkjcv2...</span>
													</a>
												</li>
												<li>
													<a href="#">
														<span class="left">hostId</span>
														<span class="right">"127.0.0.1"</span>
													</a>
												</li>
											</ul>
										</li>
										<li>
											<a href="#">
												<span class="left">allowance</span>
												<span class="right">0.8</span>
											</a>
										</li>
										<li class="caret">
											<a href="#">
												<span class="left">publisher</span>
												<span class="right">Publisher</span>
											</a>
											<ul class="drop-open">
												<li>
													<a href="#">
														<span class="left">minPrice</span>
														<span class="right">0.2</span>
													</a>
												</li>
												<li>
													<a href="#">
														<span class="left">maxPrice</span>
														<span class="right">0.7</span>
													</a>
												</li>
												<li>
													<a href="#">
														<span class="left">currency</span>
														<span class="right">$ (USD)</span>
													</a>
												</li>
												<li>
													<a href="#">
														<span class="left">name</span>
														<span class="right">"P&amp;G"</span>
													</a>
												</li>
											</ul>
										</li>
									</ul>
									<div class="info-link info-link-05">
										<a href="#">See object values</a>
										<div class="box">
											<p>across the entire call stack, 5 levels into the heap.</p>
										</div>
										<a href="#" class="hotspot"></a>
									</div>
								</div><!-- / values -->
							</div><!-- / code-block -->
						</div><!-- / info-holder -->
						<div class="info-holder">
							<strong class="subtitle">CampaignBuilder.buildCampaign</strong>
							<div class="code-block">
								<span class="line"><span class="spaces spaces-01"></span><span class="color-1">public</span> JSONObject buildCampaign() """),format.raw/*264.129*/("""{"""),format.raw/*264.130*/("""</span><!-- / line -->
								<span class="line"><span class="spaces spaces-05"></span>List<span class="color-1">&lt;</span>Publisher<span class="color-1">&gt;</span>
								<span class="info-block">
									<a class="link" href="#">publishers</a>
									<span class="holder">
										<strong class="sub-head">publishers</strong>
										<span class="list-item"><span class="left">0</span><span class="right">AdPublisher</span></span>
										<span class="list-item"><span class="left">1</span><span class="right">BidPublisher</span></span>
									</span>
								</span>
								<span class="color-1">=</span> fetchLivePublishers();</span><!-- / line -->
								<span class="line"></span>
								<span class="line"><span class="spaces spaces-05"></span>Collections<span class="color-1">.</span>shuffle(
								<span class="info-block">
									<a class="link" href="#">publishers</a>
									<span class="holder">
										<strong class="sub-head">publishers</strong>
										<span class="list-item"><span class="left">0</span><span class="right">AdPublisher</span></span>
										<span class="list-item"><span class="left">1</span><span class="right">BidPublisher</span></span>
									</span>
								</span>);
								</span><!-- / line -->
								<span class="line highlight"><span class="spaces spaces-05"></span>Publisher candidate <span class="color-1">=</span>
								selectPublisher(<span class="info-block">
									<a class="link" href="#">publishers</a>
									<span class="holder">
										<strong class="sub-head">publishers</strong>
										<span class="list-item"><span class="left">0</span><span class="right">AdPublisher</span></span>
										<span class="list-item"><span class="left">1</span><span class="right">BidPublisher</span></span>
									</span>
								</span>);
								</span><!-- / line -->
								<span class="line"><span class="spaces spaces-05"></span>Campaign campaign <span class="color-1">=</span> internalCreateCamapain(candidate);</span><!-- / line -->
								<span class="line"></span><!-- / line -->
								<span class="line"><span class="spaces spaces-05"></span><span class="color-1">return</span> campaign.toJson();</span><!-- / line -->
								<span class="line"><span class="spaces spaces-01"></span>"""),format.raw/*299.66*/("""}"""),format.raw/*299.67*/("""</span>
							</div><!-- / code-block -->
						</div><!-- / info-holder -->
						<div class="info-holder">
							<strong class="subtitle">CampaignServlet.doGet</strong>
							<div class="code-block">
								<span class="line"><span class="color-1">protected void</span> doGet(HttpServletRequest
								<span class="info-block info-block-03">
									<a class="link" href="#">req</a>
									<span class="holder">
										<strong class="sub-head">req</strong>
										<span class="list-item"><span class="left">inputStream</span><span class="right">InputStream</span></span>
										<span class="list-item">..</span>
									</span>
								</span>
								, HttpServletResponse
								<span class="info-block info-block-04">
									<a class="link" href="#">resp</a>
									<span class="holder">
										<strong class="sub-head">resp</strong>
										<span class="list-item"><span class="left">outputStream</span><span class="right">outputStream</span></span>
										<span class="list-item"><span class="left">status</span><span class="right">0</span></span>
									</span>
								</span>
								) <span class="color-1">throws</span> ServletException, IOException</span><!-- / line -->
								<span class="line">"""),format.raw/*324.28*/("""{"""),format.raw/*324.29*/("""</span><!-- / line -->
								<span class="line"><span class="spaces spaces-01"></span>String
								<span class="info-block info-block-05">
									<a class="link" href="#">transactionId</a>
									<span class="holder">TRAN-2015-X4k12s</span>
								</span>
								<span class="color-1">=</span>
								<span class="info-block info-block-03">
									<a class="link" href="#">req</a>
									<span class="holder">
										<strong class="sub-head">req</strong>
										<span class="list-item"><span class="left">inputStream</span><span class="right">InputStream</span></span>
										<span class="list-item">..</span>
									</span>
								</span>
								<span class="color-1">.</span>getParameter(<span class="color-2">"transactionId"</span>);</span><!-- / line -->
								<span class="line"><span class="spaces spaces-01"></span>String
								<span class="info-block info-block-06">
									<a class="link" href="#">hostIp</a>
									<span class="holder">192.117.10.29</span>
								</span>
								<span class="color-1">=</span>
								<span class="info-block info-block-03">
									<a class="link" href="#">req</a>
									<span class="holder">
										<strong class="sub-head">req</strong>
										<span class="list-item"><span class="left">inputStream</span><span class="right">InputStream</span></span>
										<span class="list-item">..</span>
									</span>
								</span>
								<span class="color-1">.</span>getHeader(<span class="color-2">"X-Forwarded-For"</span>);</span><!-- / line -->
							</div><!-- / code-block -->
						</div><!-- / info-holder -->
					</div><!-- / wrap-01 -->
					<div class="wrap-02">
						<div class="inner">
							<div class="info-holder">
								<strong class="subtitle">BidRequestTask.execute</strong>
								<div class="code-block">
									<span class="line"><span class="color-1">public static void</span> execute() &#123;</span>
									<span class="line"><span class="spaces spaces-01"></span><span class="color-1">try</span> &#123;</span><!-- / line -->
									<span class="line highlight"><span class="spaces spaces-02"></span>InputStream
									<span class="info-block">
										<a class="link" href="#">is</a>
										<span class="holder">
											<strong class="sub-head">is</strong>
											<span class="list-item"><span class="left">length</span><span class="right">2048</span></span>
											<span class="list-item"><span class="left">buffer</span><span class="right">byte[]</span></span>
										</span>
									</span>
									<span class="color-1">=</span>connection
									<span class="color-1">.</span>getInputStream();</span><!-- / line -->
									<span class="line"><span class="spaces spaces-02"></span>parseResponse(
									<span class="info-block">
										<a class="link" href="#">is</a>
										<span class="holder">
											<strong class="sub-head">is</strong>
											<span class="list-item"><span class="left">length</span><span class="right">2048</span></span>
											<span class="list-item"><span class="left">buffer</span><span class="right">byte[]</span></span>
										</span>
									</span>
									);</span><!-- / line -->
									<span class="line"><span class="spaces spaces-01"></span>"""),format.raw/*386.67*/("""}"""),format.raw/*386.68*/(""" """),format.raw/*386.69*/("""<span class="color-1">catch</span> (Exception e) """),format.raw/*386.118*/("""{"""),format.raw/*386.119*/("""</span><!-- / line -->
									<span class="line"><span class="spaces spaces-02"></span>logger<span class="color-1">.</span>error(<span class="color-2">"Problem with bid request "</span> <span class="color-1">+</span> urlStr, e);</span><!-- / line -->
									<span class="line"><span class="spaces spaces-01"></span>"""),format.raw/*388.67*/("""}"""),format.raw/*388.68*/("""</span><!-- / line -->
									<span class="line">"""),format.raw/*389.29*/("""}"""),format.raw/*389.30*/("""</span><!-- / line -->
								</div><!-- / code-block -->
							</div><!-- / info-holder -->
							<div class="info-holder">
								<strong class="subtitle">TaskExecutor.execute</strong>
								<div class="code-block">
									<span class="line"><span class="color-1">public static void</span> execute(Task 
									<span class="info-block">
										<a class="link" href="#">task</a>
										<span class="holder">
											<strong class="sub-head">task</strong>
											<span class="list-item"><span class="left">taskId</span><span class="right">7412</span></span>
											<span class="list-item"><span class="left">queue</span><span class="right">"prod1"</span></span>
											<span class="list-item">...</span>
										</span>
									</span>
									) """),format.raw/*405.12*/("""{"""),format.raw/*405.13*/("""</span><!-- / line -->
									<span class="line"><span class="spaces spaces-01"></span><span class="color-1">if</span> (
									<span class="info-block alignleft">
										<a class="link" href="#">task</a>
										<span class="holder">
											<strong class="sub-head">task</strong>
											<span class="list-item"><span class="left">taskId</span><span class="right">7412</span></span>
											<span class="list-item"><span class="left">queue</span><span class="right">"prod1"</span></span>
											<span class="list-item">...</span>
										</span>
									</span>
									.shouldExecuteNow()) """),format.raw/*416.31*/("""{"""),format.raw/*416.32*/("""</span><!-- / line -->
									<span class="line highlight">
									<span class="spaces spaces-02"></span><span class="info-block alignleft">
										<a class="link" href="#">task</a>
										<span class="holder">
											<strong class="sub-head">task</strong>
											<span class="list-item"><span class="left">taskId</span><span class="right">7412</span></span>
											<span class="list-item"><span class="left">queue</span><span class="right">"prod1"</span></span>
											<span class="list-item">...</span>
										</span>
									</span>
									<span class="color-1">.</span>execute();</span><!-- / line -->
									<span class="line"><span class="spaces spaces-01"></span>"""),format.raw/*428.67*/("""}"""),format.raw/*428.68*/(""" """),format.raw/*428.69*/("""<span class="color-1">else</span> """),format.raw/*428.103*/("""{"""),format.raw/*428.104*/("""</span><!-- / line -->
									<span class="line"><span class="spaces spaces-02"></span>asyncExecutor.execute(task);</span><!-- / line -->
									<span class="line"><span class="spaces spaces-01"></span>"""),format.raw/*430.67*/("""}"""),format.raw/*430.68*/("""</span><!-- / line -->
									<span class="line">"""),format.raw/*431.29*/("""}"""),format.raw/*431.30*/("""</span><!-- / line -->
								</div><!-- / code-block -->
							</div><!-- / info-holder -->
							<div class="info-holder">
								<strong class="subtitle">QueueTasksFetcher.run</strong>
								<div class="code-block">
									<span class="line"><span class="color-1">public void</span> run() <span class="color-1">throws</span> InterruptedException """),format.raw/*437.133*/("""{"""),format.raw/*437.134*/("""</span><!-- / line -->
									<span class="line"><span class="spaces spaces-01"></span><span class="color-1">while</span> (<span class="color-1">!</span>
									<span class="info-block">
										<span class="info-block info-block-02">
											<a class="link" href="#">shouldStop</a>
											<span class="holder">false</span>
										</span>
									</span>
									) """),format.raw/*445.12*/("""{"""),format.raw/*445.13*/("""</span><!-- / line -->
									<span class="line"><span class="spaces spaces-02"></span>Message 
									<span class="info-block">
										<a class="link" href="#">message</a>
										<span class="holder big">
											<strong class="sub-head">message</strong>
											<span class="list-item"><span class="left">msgId</span><span class="right">"54947df8-0e9e"</span></span>
											<span class="list-item"><span class="left">taskId</span><span class="right">7412</span></span>
										</span>
									</span>
									<span class="color-1">=</span>
									<span class="info-block">
										<a class="link" href="#">queue</a>
										<span class="holder big">
											<strong class="sub-head">queue</strong>
											<span class="list-item"><span class="left">length</span><span class="right">140</span></span>
											<span class="list-item"><span class="left">top</span><span class="right">BidRequestTask</span></span>
										</span>
									</span>
									<span class="color-1">.</span>fetchNextMessage();</span><!-- / line -->
									<span class="line"><span class="spaces spaces-02"></span>Task
									<span class="info-block alignleft">
										<a class="link" href="#">task</a>
										<span class="holder">
											<strong class="sub-head">task</strong>
											<span class="list-item"><span class="left">taskId</span><span class="right">7412</span></span>
											<span class="list-item"><span class="left">queue</span><span class="right">"prod1"</span></span>
											<span class="list-item">...</span>
										</span>
									</span>
									<span class="color-1">=</span> TaskFactory<span class="color-1">.</span>messageToTask(
									<span class="info-block">
										<a class="link" href="#">message</a>
										<span class="holder big">
											<strong class="sub-head">message</strong>
											<span class="list-item"><span class="left">msgId</span><span class="right">"54947df8-0e9e"</span></span>
											<span class="list-item"><span class="left">taskId</span><span class="right">7412</span></span>
										</span>
									</span>
									);</span><!-- / line -->
									<span class="line highlight"><span class="spaces spaces-02"></span>TaskExecutor<span class="color-1">.</span>execute(
									<span class="info-block alignleft">
										<a class="link" href="#">task</a>
										<span class="holder">
											<strong class="sub-head">task</strong>
											<span class="list-item"><span class="left">taskId</span><span class="right">7412</span></span>
											<span class="list-item"><span class="left">queue</span><span class="right">"prod1"</span></span>
											<span class="list-item">...</span>
										</span>
									</span>
									);</span><!-- / line -->
									<span class="line"><span class="spaces spaces-01"></span>"""),format.raw/*496.67*/("""}"""),format.raw/*496.68*/("""</span><!-- / line -->
									<span class="line">"""),format.raw/*497.29*/("""}"""),format.raw/*497.30*/("""</span><!-- / line -->
									<div class="values">
										<a class="sub-head open-link" href="#">Recorded variables</a>
										<ul class="list">
											<li class="caret">
												<a href="#">
													<span class="left">this</span>
													<span class="right">QueueTasksFetcher</span>
												</a>
												<ul>
													<li>
														<a href="#">
															<span class="left">shouldStop</span>
															<span class="right">false</span>
														</a>
													</li>
												</ul>
											</li>
											<li>
												<a href="#">
													<span class="left">queue</span>
													<span class="right">MessageQueue</span>
												</a>
											</li>
											<li>
												<a href="#">
													<span class="left">message</span>
													<span class="right">Message</span>
												</a>
												<ul>
													<li>
														<a href="#">
															<span class="left">messageId</span>
															<span class="right">"jqkdi1Adccsj..."</span>
														</a>
													</li>
													<li class="caret">
														<a href="#">
															<span class="left">dataMD5</span>
															<span class="right">"a1d716b46a.."</span>
														</a>
													</li>
													<li>
														<a href="#">
															<span class="left">data</span>
															<span class="right">"XXa1flakc201.."</span>
														</a>
													</li>
												</ul>
											</li>
											<li>
												<a href="#">
													<span class="left">task</span>
													<span class="right">BidRequestTask</span>
												</a>
											</li>
										</ul>
									</div><!-- / values -->
								</div><!-- / code-block -->
							</div><!-- / info-holder -->
						</div>
					</div><!-- / wrap-02 -->
				</div><!-- / col-right -->
			</div><!-- / production-area -->
			<div class="btn-holder">
				<a href=""""),_display_(/*562.15*/globals/*562.22*/.SAMPLE_TALE),format.raw/*562.34*/("""" target="_blank" class="btn">View sample error</a>
				<a href="https://www.youtube.com/watch?v=U7t-FRvxqJ4" target="_blank" fancy-width="854" fancy-height="510" class="btn fancybox">Product video</a>
			</div>
		</div>
		<img src="assets/images/bluesite/green-monster.png" alt="image description" class="monster" width="221" height="261">
	</section><!-- /production-info -->
	<section class="production-info">
		<div class="slimSiteCentered">
			<div class="headline">
				<h2 class="marked">focus on the errors that matter</h2>
				<p>Real-time analytics let you cut through the noise and get to the errors that you need to fix.</p>
			</div>
			<div class="focus-on">
				<ul class="tabs-nav">
					<li><a href="#new-errors-tab">New errors</a></li>
					<li><a href="#volume-rate-tab">Volume &amp; rate</a></li>
					<li><a href="#filters-tab">Filters</a></li>
					<li><a href="#share-tab">Share</a></li>
					<li><a href="#jira-tab">Jira</a></li>
				</ul>
				<div class="tabarea">
					<div class="tab" id="new-errors-tab">
						<div class="badge"><img src="assets/images/bluesite/img-focus-on01.png" alt="image description" width="214" height="214"></div>
						<img src="assets/images/bluesite/img-focus-on001.png" alt="image description" width="970" height="481" class="image">
						<ul class="error-list">
						    <li>"Cache Server invalidation fail...", InvalidateCacheTask</li>
						    <li class="enabled">NullPointerException, CampaignBuilder</li>
						    <li>NumberFormatException, ConvertCurrencyServlet</li>
						    <li>ConnectionException, HttpStreamingTask</li>
						    <li>Forbidden, ConvertCurrencyServlet</li>
						    <li>"no connection to queue: http:..", QueueMessageWorker</li>
						    <li>BufferUnderflowException, StopCampaignServlet</li>
						</ul>
					</div>
					<div class="tab" id="volume-rate-tab">
						<div class="badge"><img src="assets/images/bluesite/img-focus-on02.png" alt="image description" width="214" height="214"></div>
						<img src="assets/images/bluesite/img-focus-on001.png" alt="image description" width="970" height="481" class="image">
						<ul class="error-list">
						    <li>"Cache Server invalidation fail...", InvalidateCacheTask</li>
						    <li>NullPointerException, CampaignBuilder</li>
						    <li class="enabled">NumberFormatException, ConvertCurrencyServlet</li>
						    <li>ConnectionException, HttpStreamingTask</li>
						    <li>Forbidden, ConvertCurrencyServlet</li>
						    <li>"no connection to queue: http:..", QueueMessageWorker</li>
						    <li>BufferUnderflowException, StopCampaignServlet</li>
						</ul>
					</div>
					<div class="tab" id="filters-tab">
						<img src="assets/images/bluesite/img-focus-on004.png" alt="image description" width="970" height="481" class="image">
						<ul class="error-list">
						    <li>"Cache Server invalidation fail...", InvalidateCacheTask</li>
						    <li class="enabled">NullPointerException, CampaignBuilder</li>
						    <li>NumberFormatException, ConvertCurrencyServlet</li>
						    <li>ConnectionException, HttpStreamingTask</li>
						    <li>Forbidden, ConvertCurrencyServlet</li>
						    <li>"no connection to queue: http:..", QueueMessageWorker</li>
						    <li class="enabled">BufferUnderflowException, StopCampaignServlet</li>
						</ul>
						<div class="form-popup">
							<form action="#">
								<div class="top">
									<input class="txt" type="text" placeholder="ad">
								</div>
								<ul class="switch">
									<li><a href="#">All</a></li>
									<li><a href="#">None</a></li>
								</ul>
								<div class="row">
									<input id="chk-01" type="checkbox">
									<label for="chk-01">ad-bidder</label>
								</div>
								<div class="row">
									<input id="chk-02" type="checkbox">
									<label for="chk-02">ad-currency-converter</label>
								</div>
								<div class="row">
									<input id="chk-03" type="checkbox" checked>
									<label for="chk-03">ad-campaign-builder</label>
								</div>
								<span class="notes">Filter errors by server, app, code entry point and location.</span>
							</form>
						</div><!-- / form-popup -->
					</div>
					<div class="tab" id="share-tab">
						<img src="assets/images/bluesite/img-focus-on001.png" alt="image description" width="970" height="481">
						<ul class="error-list">
						    <li>"Cache Server invalidation fail...", InvalidateCacheTask</li>
						    <li>NullPointerException, CampaignBuilder</li>
						    <li>NumberFormatException, ConvertCurrencyServlet</li>
						    <li>ConnectionException, HttpStreamingTask</li>
						    <li>Forbidden, ConvertCurrencyServlet</li>
						    <li>"no connection to queue: http:..", QueueMessageWorker</li>
						    <li>BufferUnderflowException, StopCampaignServlet</li>
						</ul>
						<div class="info-popup info-popup-02">
							<strong class="subtitle"><img src="assets/images/bluesite/ico15.png" alt="image" width="16" height="25" preventResize>Share with teammates</strong>
							<p class="txt">This just started happening in prod1 after today's release.<br><a class="sampleTaleLink" href=""""),_display_(/*658.119*/globals/*658.126*/.SAMPLE_TALE),format.raw/*658.138*/("""" target="_blank">http//app.takipi.com/event=UzYyOTUjMUzlzE</a></p>
							<div class="holder">
								<span class="left">To:</span>
								<ul class="tags">
									<li>Danny R (developer)<a class="close" href="#">close</a></li>
									<li>Connie H (developer)<a class="close" href="#">close</a></li>
									<li>Stan M (Eng manager)<a class="close" href="#">close</a></li>
								</ul>
							</div>
							<span class="notes">Share errors between DevOps, engineers and QA with one click.</span>
						</div><!-- / info-popup -->
					</div>
					<div class="tab" id="jira-tab">
						<img src="assets/images/bluesite/img-focus-on001.png" alt="image description" width="970" height="481">
						<ul class="error-list">
						    <li>"Cache Server invalidation fail...", InvalidateCacheTask</li>
						    <li>NullPointerException, CampaignBuilder</li>
						    <li>NumberFormatException, ConvertCurrencyServlet</li>
						    <li>ConnectionException, HttpStreamingTask</li>
						    <li>Forbidden, ConvertCurrencyServlet</li>
						    <li>"no connection to queue: http:..", QueueMessageWorker</li>
						    <li>BufferUnderflowException, StopCampaignServlet</li>
						</ul>
						<div class="info-popup">
							<strong class="subtitle"><img src="assets/images/bluesite/ico14.png" alt="image" width="21" height="27" preventResize>Create JIRA issue</strong>
							<p>NullPointerException at CampaignBuilder.selectPublisher</p>
							<p class="txt">Click here to see code and variable state -<br><a class="sampleTaleLink" href=""""),_display_(/*684.103*/globals/*684.110*/.SAMPLE_TALE),format.raw/*684.122*/("""" target="_blank">http//app.takipi.com/event=UzYyOTUjMUzlzE</a></p>
							<span class="notes">Open a JIRA issue for an error with the code and variable state that caused it.</span>
						</div><!-- / info-popup -->
					</div>
				</div>
			</div><!-- focus-on -->
		</div>
	</section><!-- /production-info -->
	<section class="counters">
		<div class="container">
			<div class="box">
				<strong class="ttl">Unique errors analyzed</strong>
				<div id="timer-01" class="timer" data-from="780200" data-to="780228"></div>
			</div>
			<div class="box">
				<strong class="ttl">Connected servers</strong>
				<div id="timer-02" class="timer" data-from="5617" data-to="5727"></div>
			</div>
		</div>
	</section><!-- /counters -->
	<section class="trusted-by">
		<div class="slimSiteCentered">
			<div class="trusted-logos">Trusted by: <img src="assets/images/bluesite/trusted-by.png" data-at2x="assets/images/bluesite/trusted-by&#64;2x.png" /></div>
			<blockquote>
			    <p>I can see all my exceptions in a clear, visual way. This helped me find issues with 3rd party code I previously didn't see.<br/>
			        On top of that, installation was smooth and easy!</p>
			    <footer>
			        <cite>hp</cite>
			    </footer>
			</blockquote>
		</div>
	</section><!-- /trusted-by -->
	<section class="integrates-info">
		<div class="slimSiteCentered">
			<div class="headline">
				<h2 class="marked">Integrates into your workflow</h2>
				<p>Takipi integrates into your team's workflow and enables powerful collaboration<br>between DevOps, engineers, and QA.</p>
			</div>
			<ul class="integrates-list">
				<li>
					<a href="assets/images/bluesite/preview-alerting.png" class="item fancybox alerting" fancy-width="746" fancy-height="503" fancy-integration>Alerting</a>
					<div class="more"><strong>Alerting</strong> - Know when new errors are introduced into your application.</div>
					<div class="fancy-title"><strong>Alerting - </strong> Takipi tells you when a new error has been introduced into your application. A customizable alerting engine lets you control what you’re notified on.</div>
				</li>
				<li>
					<a href="assets/images/bluesite/preview-teamwork.png" class="item fancybox teamwork" fancy-width="697" fancy-height="376" fancy-integration>Teamwork</a>
					<div class="more"><strong>Teamwork</strong> - Manage and invite team members to view errors.</div>
					<div class="fancy-title"><strong>Teamwork - </strong> Invite and share information between DevOps, engineering managers, and developers just like you would on a Google doc.</div>
				</li>
				<li>
					<a href="assets/images/bluesite/preview-logging.png" class="item fancybox logging" fancy-width="893" fancy-height="445" fancy-integration>Logging</a>
					<div class="more"><strong>Logging</strong> - See the code and variables behind each error in your logs.</div>
					<div class="fancy-title"><strong>Logging - </strong> Takipi links log errors to the code and variable state that led to them. So instead of just a single line in the log, you can see the code and variables that caused the error.</div>
				</li>
				<li>
					<a href="assets/images/bluesite/preview-labels.png" class="item fancybox labels" fancy-width="790" fancy-height="450" fancy-integration>Labels</a>
					<div class="more"><strong>Labels</strong> - Share and tag errors with custom labels and notes.</div>
					<div class="fancy-title"><strong>Labels - </strong> Share and tag errors with custom labels and notes (<em>e.g. Important, New, V2.1..</em>). <br />Filter errors by labels and get notified when you are tagged.</div>
				</li>
				<li>
					<a href="assets/images/bluesite/preview-jira.png" class="item fancybox jira" fancy-width="813" fancy-height="430" fancy-integration>Jira</a>
					<div class="more"><strong>JIRA</strong> - Open JIRA issues for new errors with one click.</div>
					<div class="fancy-title"><strong>JIRA - </strong> Open a JIRA issue for an error in staging or production with a direct link to the code and variable state that caused it.</div>
				</li>
				<li>
					<a href="assets/images/bluesite/preview-newrelic.png" class="item fancybox newrelic" fancy-width="850" fancy-height="464" fancy-integration>NewRelic</a>
					<div class="more"><strong>NewRelic</strong> - See errors in your JVM directly from NewRelic.</div>
					<div class="fancy-title"><strong>NewRelic - </strong>See new and trending errors in your code directly from your NewRelic dashboard with the <span class="marked">Takipi plug-in</span>.</div>
				</li>
				<li>
					<a href="assets/images/bluesite/preview-logstash.png" class="item fancybox logstash" fancy-width="829" fancy-height="449" fancy-integration>logstash</a>
					<div class="more"><strong>Logstash</strong> - See the code and variables behind each log error in Logstash.</div>
					<div class="fancy-title"><strong>Logging - </strong> Takipi links log errors to the code and variable state that led to them. So instead of just a single line in Logstash, you can see the code and variables that caused the error.</div>
				</li>
				<li>
					<a href="assets/images/bluesite/preview-splunk.png" class="item fancybox splunk" fancy-width="822" fancy-height="462" fancy-integration>Splunk</a>
					<div class="more"><strong>Splunk</strong> - See the code and variables behind each log error in Splunk.</div>
					<div class="fancy-title"><strong>Splunk - </strong> Takipi links log errors to the code and variable state that led to them. So instead of just a single log line in Splunk, you can see what caused the error.</div>
				</li>
			</ul>
		</div>
	</section><!-- /integrates-info -->
	<section class="installation">
		<div class="container">
			<header class="headline">
				<h2>Installs in minutes</h2>
				<p>Install a simple java agent. No code changes, annotations, or build configurations needed.</p>
			</header><!-- headline -->
			<div class="tabs-install">
				<ul class="nav-tabs">
					<li><a href="#tab01">Linux</a></li>
					<li><a href="#tab02">OS X</a></li>
					<li><a href="#tab03">Windows</a></li>
					<li><a href="#tab04">Chef / Puppet</a></li>
				</ul><!-- nav-tabs -->
				<div class="content-tabs">
					<div id="tab01">
						<div id="tabs-1" class="sub-tabs">
							<ul class="nav">
								<li><a href="#tab-1">Wget</a></li>
								<li><a href="#tab-2">cURL</a></li>
								<li><a href="#tab-3">DEB</a></li>
								<li><a href="#tab-4">RPM</a></li>
							</ul>
							<div id="tab-1">
								<code>wget -O - -o /dev/null http://get.takipi.com | sudo bash /dev/stdin -i --sk=&#60;installation key&#62;</code>
							</div>
							<div id="tab-2">
								<code>curl -s /dev/null http://get.takipi.com | sudo bash /dev/stdin -i --sk=&#60;installation key&#62;</code>
							</div>
							<div id="tab-3">
							 	<code>sudo dpkg -i &#60;path-to-deb&#62;</code>
								<code>sudo /opt/takipi/etc/takipi-setup-package &#60;installation key&#62;</code>
							</div>
							<div id="tab-4">
								<code>sudo rpm -i &#60;path-to-rpm&#62;</code>
								<code>sudo /opt/takipi/etc/takipi-setup-package &#60;installation key&#62;</code>
							</div>
						</div>
						<div class="btn-area btn-start">
							<a href="#start-area" class="btn">Start</a>
						</div>
					</div><!-- tab01 -->
					<div id="tab02">
						<div class="download btn-start">
							<a href="#start-area" class="btn">Download</a>
							<p>the takipi.dmg installer for OS X.</p>
						</div>
					</div><!-- tab02 -->
					<div id="tab03">
						<div class="download btn-start">
							<a href="#start-area" class="btn">Download</a>
							<p>the takipi.msi installer for Windows.</p>
						</div>
					</div><!-- tab03 -->
					<div id="tab04">
						<div id="tabs-2" class="sub-tabs">
							<ul class="nav">
								<li><a href="#tab-5">Chef</a></li>
								<li><a href="#tab-6">Puppet</a></li>
								<li><a href="#tab-7">Ansible</a></li>
							</ul>
							<div id="tab-5">
								<p>Our Chef cookbook:</p>
								<code>git clone <a href="https://github.com/takipi-cookbooks/takipi" target="_blank">https://github.com/takipi-cookbooks/takipi</a></code>
							</div>
							<div id="tab-6">
								<p>Our Puppet module:</p>
								<code>git clone <a href="https://github.com/takipi/takipi-puppet" target="_blank">https://github.com/takipi/takipi-puppet</a></code>
							</div>
							<div id="tab-7">
								<p>Our Ansible playbook:</p>
								<code>git clone <a href="https://github.com/takipi/takipi-playbooks" target="_blank">https://github.com/takipi/takipi-playbooks</a></code>
							</div>
						</div>
						<div class="btn-area">
							<a href="#start-area" class="btn btn-start">Start</a>
						</div>
					</div><!-- tab04 -->
				</div><!-- content-tabs -->
			</div><!-- tabs-install -->
		</div><!-- container -->
	</section><!-- installation -->
	<section class="start-area bottom-form" id="start-area">
		<div class="start-form takipiMiniSignupForm" createdin="footer">
			<form action="#">
				<div class="row">
					<input class="text emailInput" type="email" placeholder="Email address">
					<input class="btn-submit createStubAccountBtn" type="submit" value="Start using Takipi &#62;&#62;" >
				</div>
				<div class="errorLabel">User already exists <a class="loginLink" href=""""),_display_(/*854.77*/globals/*854.84*/.LOGIN_PAGE),format.raw/*854.95*/("""">Log in</a></div>
				<p>Java / Scala</p>
				<figure>
					<img src="assets/images/bluesite/img-002.png" width="104" height="140" alt="image">
				</figure>
			</form>
		</div><!-- end start-form -->
	</section><!-- end start-area -->
	<section class="featured-on">
		<div class="slimSiteCentered">
			<div class="featured-logos">Featured on: <img src="assets/images/bluesite/featured-on.png" data-at2x="assets/images/bluesite/featured-on&#64;2x.png" /></div>
		</div>
	</section><!-- /featured-on -->
</div>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:36 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/bluesite/pages/index.scala.html
                  HASH: 50218a1dd9d1588b3ffc843a46610a5643eaae00
                  MATRIX: 595->0|1293->671|1309->678|1341->689|5805->5124|5835->5125|6941->6202|6971->6203|9296->8499|9326->8500|10003->9148|10033->9149|10150->9237|10180->9238|12853->11881|12884->11882|15202->14171|15232->14172|16505->15416|16535->15417|19826->18679|19856->18680|19886->18681|19965->18730|19996->18731|20344->19050|20374->19051|20454->19102|20484->19103|21294->19884|21324->19885|21972->20504|22002->20505|22735->21209|22765->21210|22795->21211|22859->21245|22890->21246|23125->21452|23155->21453|23235->21504|23265->21505|23652->21862|23683->21863|24095->22246|24125->22247|27009->25102|27039->25103|27119->25154|27149->25155|29149->27127|29166->27134|29200->27146|34356->32273|34374->32280|34409->32292|35980->33834|35998->33841|36033->33853|45333->43125|45350->43132|45383->43143
                  LINES: 22->1|35->14|35->14|35->14|125->104|125->104|145->124|145->124|191->170|191->170|202->181|202->181|203->182|203->182|285->264|285->264|320->299|320->299|345->324|345->324|407->386|407->386|407->386|407->386|407->386|409->388|409->388|410->389|410->389|426->405|426->405|437->416|437->416|449->428|449->428|449->428|449->428|449->428|451->430|451->430|452->431|452->431|458->437|458->437|466->445|466->445|517->496|517->496|518->497|518->497|583->562|583->562|583->562|679->658|679->658|679->658|705->684|705->684|705->684|875->854|875->854|875->854
                  -- GENERATED --
              */
          