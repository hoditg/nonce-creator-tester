$(document).ready(function(){
	
	$('.features-area .visual .link').click(function() {
		$(this).hide();
		$('.features-area .visual .img-02').fadeIn();
	return false;
	});
	
	var width_ = $(window).width();
	var container_width = $('.features-area .container').width();
	if (width_ < container_width +456){
		$('.features-area .nav-holder').css({
			left: '-243px'
		});
		$('.features-area .nav-holder').addClass('left');
	}
	else {
		$('.features-area .nav-holder').css({
			left: '18px'
		});
		$('.features-area .nav-holder').removeClass('left');
	}
	
	$(window).resize(function(){
		var width_ = $(window).width();
		var container_width = $('.features-area .container').width();
		if (width_ < container_width +456){
			$('.features-area .nav-holder').css({
				left: '-243px'
			});
			$('.features-area .nav-holder').addClass('left');
		}
		else {
			$('.features-area .nav-holder').css({
				left: '18px'
			});
			$('.features-area .nav-holder').removeClass('left');
		}
	});
	
	/* new */
	if ($('.nav-holder').length > 0) {
		$('body').scrollspy({ target: '.nav-holder' });
		
		$('.add-nav a').click(function(e){
			var href = $(this).attr("href"),
				offsetTop = href === "#" ? 0 : $(href).offset().top;
			$('html, body').stop().animate({ 
				scrollTop: offsetTop
			}, 300);
			e.preventDefault();
		});
		
		var scroll_pos_test = $('.features-area .nav-holder').offset().top;
		$(window).scroll(function() {
			var top_ = $(window).scrollTop();
			if (top_ > scroll_pos_test - 90) {
				$('.features-area .nav-holder').addClass('top');
			}
			else {
				$('.features-area .nav-holder').removeClass('top');
			}
		});
	}
	
	$('[placeholder]').textPlaceholder();
	
	(function() {
		setTimeout(function() {
			var $target = $('.features-area').find('.detect'),
				$bubble = $target.find('.bubble'),
				topOffset = $target.offset().top,
				allowAnimation = true;
			
			$(window).scroll(function() {
				var tmp = $(window).scrollTop();
				
				if (tmp >= topOffset) {
					if (allowAnimation) {
						allowAnimation = false;
						$bubble.animate({
							'opacity': 1,
							'margin-bottom': 200
						});
					}
				}
				else {
					if (!allowAnimation) {
						allowAnimation = true;
						$bubble.animate({
							'opacity': 0,
							'margin-bottom': 0
						});
					}
				}
			});
			
			$('.features-area').find('.visual').find('.img-02').hide();
		}, 400);
	})();
	
	$('.features-area').find('.promo-block').find('.bonus').find('img').poshytip({
		className: 'tip-simple',
		showOn: 'hover',
		alignTo: 'target',
		alignX: 'right',
		alignY: 'center',
		offsetX: 25,
		offsetY: 0,
		showTimeout: 100,
		content: function() {
			var src = $(this).attr('data-src');
			return '<img src="' + src + '">';
		}
	});
});

/**
 * @see http://github.com/NV/placeholder.js
 */
jQuery.fn.textPlaceholder = function () {

	return this.each(function(){

		var that = this;

		if (that.placeholder && 'placeholder' in document.createElement(that.tagName)) return;

		var placeholder = that.getAttribute('placeholder');
		var input = jQuery(that);

		if (that.value === '' || that.value == placeholder) {
			input.addClass('text-placeholder');
			that.value = placeholder;
		}

		input.focus(function(){
			if (input.hasClass('text-placeholder')) {
				this.value = '';
				input.removeClass('text-placeholder')
			}
		});

		input.blur(function(){
			if (this.value === '') {
				input.addClass('text-placeholder');
				this.value = placeholder;
			} else {
				input.removeClass('text-placeholder');
			}
		});

		that.form && jQuery(that.form).submit(function(){
			if (input.hasClass('text-placeholder')) {
				that.value = '';
			}
		});

	});

};


/* ========================================================================
 * Bootstrap: scrollspy.js v3.2.0
 * http://getbootstrap.com/javascript/#scrollspy
 * ========================================================================
 * Copyright 2011-2014 Twitter, Inc.
 * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)
 * ======================================================================== */


+function ($) {
  'use strict';

  // SCROLLSPY CLASS DEFINITION
  // ==========================

  function ScrollSpy(element, options) {
    var process  = $.proxy(this.process, this)

    this.$body          = $('body')
    this.$scrollElement = $(element).is('body') ? $(window) : $(element)
    this.options        = $.extend({}, ScrollSpy.DEFAULTS, options)
    this.selector       = (this.options.target || '') + ' .nav li > a'
    this.offsets        = []
    this.targets        = []
    this.activeTarget   = null
    this.scrollHeight   = 0

    this.$scrollElement.on('scroll.bs.scrollspy', process)
    this.refresh()
    this.process()
  }

  ScrollSpy.VERSION  = '3.2.0'

  ScrollSpy.DEFAULTS = {
    offset: 10
  }

  ScrollSpy.prototype.getScrollHeight = function () {
    return this.$scrollElement[0].scrollHeight || Math.max(this.$body[0].scrollHeight, document.documentElement.scrollHeight)
  }

  ScrollSpy.prototype.refresh = function () {
    var offsetMethod = 'offset'
    var offsetBase   = 0

    if (!$.isWindow(this.$scrollElement[0])) {
      offsetMethod = 'position'
      offsetBase   = this.$scrollElement.scrollTop()
    }

    this.offsets = []
    this.targets = []
    this.scrollHeight = this.getScrollHeight()

    var self     = this

    this.$body
      .find(this.selector)
      .map(function () {
        var $el   = $(this)
        var href  = $el.data('target') || $el.attr('href')
        var $href = /^#./.test(href) && $(href)

        return ($href
          && $href.length
          && $href.is(':visible')
          && [[$href[offsetMethod]().top + offsetBase, href]]) || null
      })
      .sort(function (a, b) { return a[0] - b[0] })
      .each(function () {
        self.offsets.push(this[0])
        self.targets.push(this[1])
      })
  }

  ScrollSpy.prototype.process = function () {
    var scrollTop    = this.$scrollElement.scrollTop() + this.options.offset
    var scrollHeight = this.getScrollHeight()
    var maxScroll    = this.options.offset + scrollHeight - this.$scrollElement.height()
    var offsets      = this.offsets
    var targets      = this.targets
    var activeTarget = this.activeTarget
    var i

    if (this.scrollHeight != scrollHeight) {
      this.refresh()
    }

    if (scrollTop >= maxScroll) {
      return activeTarget != (i = targets[targets.length - 1]) && this.activate(i)
    }

    if (activeTarget && scrollTop <= offsets[0]) {
      return activeTarget != (i = targets[0]) && this.activate(i)
    }

    for (i = offsets.length; i--;) {
      activeTarget != targets[i]
        && scrollTop >= offsets[i]
        && (!offsets[i + 1] || scrollTop <= offsets[i + 1])
        && this.activate(targets[i])
    }
  }

  ScrollSpy.prototype.activate = function (target) {
    this.activeTarget = target

    $(this.selector)
      .parentsUntil(this.options.target, '.active')
      .removeClass('active')

    var selector = this.selector +
        '[data-target="' + target + '"],' +
        this.selector + '[href="' + target + '"]'

    var active = $(selector)
      .parents('li')
      .addClass('active')

    if (active.parent('.dropdown-menu').length) {
      active = active
        .closest('li.dropdown')
        .addClass('active')
    }

    active.trigger('activate.bs.scrollspy')
  }


  // SCROLLSPY PLUGIN DEFINITION
  // ===========================

  function Plugin(option) {
    return this.each(function () {
      var $this   = $(this)
      var data    = $this.data('bs.scrollspy')
      var options = typeof option == 'object' && option

      if (!data) $this.data('bs.scrollspy', (data = new ScrollSpy(this, options)))
      if (typeof option == 'string') data[option]()
    })
  }

  var old = $.fn.scrollspy

  $.fn.scrollspy             = Plugin
  $.fn.scrollspy.Constructor = ScrollSpy


  // SCROLLSPY NO CONFLICT
  // =====================

  $.fn.scrollspy.noConflict = function () {
    $.fn.scrollspy = old
    return this
  }


  // SCROLLSPY DATA-API
  // ==================

  $(window).on('load.bs.scrollspy.data-api', function () {
    $('[data-spy="scroll"]').each(function () {
      var $spy = $(this)
      Plugin.call($spy, $spy.data())
    })
  })

}(jQuery);

/*
 * Poshy Tip jQuery plugin v1.2
 * http://vadikom.com/tools/poshy-tip-jquery-plugin-for-stylish-tooltips/
 * Copyright 2010-2013, Vasil Dinkov, http://vadikom.com/
 */

(function(e){var a=[],d=/^url\(["']?([^"'\)]*)["']?\);?$/i,c=/\.png$/i,b=!!window.createPopup&&document.documentElement.currentStyle.minWidth=="undefined";function f(){e.each(a,function(){this.refresh(true)})}e(window).resize(f);e.Poshytip=function(h,g){this.$elm=e(h);this.opts=e.extend({},e.fn.poshytip.defaults,g);this.$tip=e(['<div class="',this.opts.className,'">','<div class="tip-inner tip-bg-image"></div>','<div class="tip-arrow tip-arrow-top tip-arrow-right tip-arrow-bottom tip-arrow-left"></div>',"</div>"].join("")).appendTo(document.body);this.$arrow=this.$tip.find("div.tip-arrow");this.$inner=this.$tip.find("div.tip-inner");this.disabled=false;this.content=null;this.init()};e.Poshytip.prototype={init:function(){a.push(this);var g=this.$elm.attr("title");this.$elm.data("title.poshytip",g!==undefined?g:null).data("poshytip",this);if(this.opts.showOn!="none"){this.$elm.bind({"mouseenter.poshytip":e.proxy(this.mouseenter,this),"mouseleave.poshytip":e.proxy(this.mouseleave,this)});switch(this.opts.showOn){case"hover":if(this.opts.alignTo=="cursor"){this.$elm.bind("mousemove.poshytip",e.proxy(this.mousemove,this))}if(this.opts.allowTipHover){this.$tip.hover(e.proxy(this.clearTimeouts,this),e.proxy(this.mouseleave,this))}break;case"focus":this.$elm.bind({"focus.poshytip":e.proxy(this.showDelayed,this),"blur.poshytip":e.proxy(this.hideDelayed,this)});break}}},mouseenter:function(g){if(this.disabled){return true}this.$elm.attr("title","");if(this.opts.showOn=="focus"){return true}this.showDelayed()},mouseleave:function(g){if(this.disabled||this.asyncAnimating&&(this.$tip[0]===g.relatedTarget||jQuery.contains(this.$tip[0],g.relatedTarget))){return true}if(!this.$tip.data("active")){var h=this.$elm.data("title.poshytip");if(h!==null){this.$elm.attr("title",h)}}if(this.opts.showOn=="focus"){return true}this.hideDelayed()},mousemove:function(g){if(this.disabled){return true}this.eventX=g.pageX;this.eventY=g.pageY;if(this.opts.followCursor&&this.$tip.data("active")){this.calcPos();this.$tip.css({left:this.pos.l,top:this.pos.t});if(this.pos.arrow){this.$arrow[0].className="tip-arrow tip-arrow-"+this.pos.arrow}}},show:function(){if(this.disabled||this.$tip.data("active")){return}this.reset();this.update();if(!this.content){return}this.display();if(this.opts.timeOnScreen){this.hideDelayed(this.opts.timeOnScreen)}},showDelayed:function(g){this.clearTimeouts();this.showTimeout=setTimeout(e.proxy(this.show,this),typeof g=="number"?g:this.opts.showTimeout)},hide:function(){if(this.disabled||!this.$tip.data("active")){return}this.display(true)},hideDelayed:function(g){this.clearTimeouts();this.hideTimeout=setTimeout(e.proxy(this.hide,this),typeof g=="number"?g:this.opts.hideTimeout)},reset:function(){this.$tip.queue([]).detach().css("visibility","hidden").data("active",false);this.$inner.find("*").poshytip("hide");if(this.opts.fade){this.$tip.css("opacity",this.opacity)}this.$arrow[0].className="tip-arrow tip-arrow-top tip-arrow-right tip-arrow-bottom tip-arrow-left";this.asyncAnimating=false},update:function(j,k){if(this.disabled){return}var i=j!==undefined;if(i){if(!k){this.opts.content=j}if(!this.$tip.data("active")){return}}else{j=this.opts.content}var h=this,g=typeof j=="function"?j.call(this.$elm[0],function(l){h.update(l)}):j=="[title]"?this.$elm.data("title.poshytip"):j;if(this.content!==g){this.$inner.empty().append(g);this.content=g}this.refresh(i)},refresh:function(h){if(this.disabled){return}if(h){if(!this.$tip.data("active")){return}var k={left:this.$tip.css("left"),top:this.$tip.css("top")}}this.$tip.css({left:0,top:0}).appendTo(document.body);if(this.opacity===undefined){this.opacity=this.$tip.css("opacity")}var l=this.$tip.css("background-image").match(d),m=this.$arrow.css("background-image").match(d);if(l){var i=c.test(l[1]);if(b&&i){this.$tip.css("background-image","none");this.$inner.css({margin:0,border:0,padding:0});l=i=false}else{this.$tip.prepend('<table class="tip-table" border="0" cellpadding="0" cellspacing="0"><tr><td class="tip-top tip-bg-image" colspan="2"><span></span></td><td class="tip-right tip-bg-image" rowspan="2"><span></span></td></tr><tr><td class="tip-left tip-bg-image" rowspan="2"><span></span></td><td></td></tr><tr><td class="tip-bottom tip-bg-image" colspan="2"><span></span></td></tr></table>').css({border:0,padding:0,"background-image":"none","background-color":"transparent"}).find(".tip-bg-image").css("background-image",'url("'+l[1]+'")').end().find("td").eq(3).append(this.$inner)}if(i&&!e.support.opacity){this.opts.fade=false}}if(m&&!e.support.opacity){if(b&&c.test(m[1])){m=false;this.$arrow.css("background-image","none")}this.opts.fade=false}var o=this.$tip.find("> table.tip-table");if(b){this.$tip[0].style.width="";o.width("auto").find("td").eq(3).width("auto");var n=this.$tip.width(),j=parseInt(this.$tip.css("min-width")),g=parseInt(this.$tip.css("max-width"));if(!isNaN(j)&&n<j){n=j}else{if(!isNaN(g)&&n>g){n=g}}this.$tip.add(o).width(n).eq(0).find("td").eq(3).width("100%")}else{if(o[0]){o.width("auto").find("td").eq(3).width("auto").end().end().width(document.defaultView&&document.defaultView.getComputedStyle&&parseFloat(document.defaultView.getComputedStyle(this.$tip[0],null).width)||this.$tip.width()).find("td").eq(3).width("100%")}}this.tipOuterW=this.$tip.outerWidth();this.tipOuterH=this.$tip.outerHeight();this.calcPos();if(m&&this.pos.arrow){this.$arrow[0].className="tip-arrow tip-arrow-"+this.pos.arrow;this.$arrow.css("visibility","inherit")}if(h&&this.opts.refreshAniDuration){this.asyncAnimating=true;var p=this;this.$tip.css(k).animate({left:this.pos.l,top:this.pos.t},this.opts.refreshAniDuration,function(){p.asyncAnimating=false})}else{this.$tip.css({left:this.pos.l,top:this.pos.t})}},display:function(h){var i=this.$tip.data("active");if(i&&!h||!i&&h){return}this.$tip.stop();if((this.opts.slide&&this.pos.arrow||this.opts.fade)&&(h&&this.opts.hideAniDuration||!h&&this.opts.showAniDuration)){var n={},m={};if(this.opts.slide&&this.pos.arrow){var l,g;if(this.pos.arrow=="bottom"||this.pos.arrow=="top"){l="top";g="bottom"}else{l="left";g="right"}var k=parseInt(this.$tip.css(l));n[l]=k+(h?0:(this.pos.arrow==g?-this.opts.slideOffset:this.opts.slideOffset));m[l]=k+(h?(this.pos.arrow==g?this.opts.slideOffset:-this.opts.slideOffset):0)+"px"}if(this.opts.fade){n.opacity=h?this.$tip.css("opacity"):0;m.opacity=h?0:this.opacity}this.$tip.css(n).animate(m,this.opts[h?"hideAniDuration":"showAniDuration"])}h?this.$tip.queue(e.proxy(this.reset,this)):this.$tip.css("visibility","inherit");if(i){var j=this.$elm.data("title.poshytip");if(j!==null){this.$elm.attr("title",j)}}this.$tip.data("active",!i)},disable:function(){this.reset();this.disabled=true},enable:function(){this.disabled=false},destroy:function(){this.reset();this.$tip.remove();delete this.$tip;this.content=null;this.$elm.unbind(".poshytip").removeData("title.poshytip").removeData("poshytip");a.splice(e.inArray(this,a),1)},clearTimeouts:function(){if(this.showTimeout){clearTimeout(this.showTimeout);this.showTimeout=0}if(this.hideTimeout){clearTimeout(this.hideTimeout);this.hideTimeout=0}},calcPos:function(){var n={l:0,t:0,arrow:""},h=e(window),k={l:h.scrollLeft(),t:h.scrollTop(),w:h.width(),h:h.height()},p,j,m,i,q,g;if(this.opts.alignTo=="cursor"){p=j=m=this.eventX;i=q=g=this.eventY}else{var o=this.$elm.offset(),l={l:o.left,t:o.top,w:this.$elm.outerWidth(),h:this.$elm.outerHeight()};p=l.l+(this.opts.alignX!="inner-right"?0:l.w);j=p+Math.floor(l.w/2);m=p+(this.opts.alignX!="inner-left"?l.w:0);i=l.t+(this.opts.alignY!="inner-bottom"?0:l.h);q=i+Math.floor(l.h/2);g=i+(this.opts.alignY!="inner-top"?l.h:0)}switch(this.opts.alignX){case"right":case"inner-left":n.l=m+this.opts.offsetX;if(this.opts.keepInViewport&&n.l+this.tipOuterW>k.l+k.w){n.l=k.l+k.w-this.tipOuterW}if(this.opts.alignX=="right"||this.opts.alignY=="center"){n.arrow="left"}break;case"center":n.l=j-Math.floor(this.tipOuterW/2);if(this.opts.keepInViewport){if(n.l+this.tipOuterW>k.l+k.w){n.l=k.l+k.w-this.tipOuterW}else{if(n.l<k.l){n.l=k.l}}}break;default:n.l=p-this.tipOuterW-this.opts.offsetX;if(this.opts.keepInViewport&&n.l<k.l){n.l=k.l}if(this.opts.alignX=="left"||this.opts.alignY=="center"){n.arrow="right"}}switch(this.opts.alignY){case"bottom":case"inner-top":n.t=g+this.opts.offsetY;if(!n.arrow||this.opts.alignTo=="cursor"){n.arrow="top"}if(this.opts.keepInViewport&&n.t+this.tipOuterH>k.t+k.h){n.t=i-this.tipOuterH-this.opts.offsetY;if(n.arrow=="top"){n.arrow="bottom"}}break;case"center":n.t=q-Math.floor(this.tipOuterH/2);if(this.opts.keepInViewport){if(n.t+this.tipOuterH>k.t+k.h){n.t=k.t+k.h-this.tipOuterH}else{if(n.t<k.t){n.t=k.t}}}break;default:n.t=i-this.tipOuterH-this.opts.offsetY;if(!n.arrow||this.opts.alignTo=="cursor"){n.arrow="bottom"}if(this.opts.keepInViewport&&n.t<k.t){n.t=g+this.opts.offsetY;if(n.arrow=="bottom"){n.arrow="top"}}}this.pos=n}};e.fn.poshytip=function(h){if(typeof h=="string"){var g=arguments,l=h;Array.prototype.shift.call(g);if(l=="destroy"){this.die?this.die("mouseenter.poshytip").die("focus.poshytip"):e(document).undelegate(this.selector,"mouseenter.poshytip").undelegate(this.selector,"focus.poshytip")}return this.each(function(){var m=e(this).data("poshytip");if(m&&m[l]){m[l].apply(m,g)}})}var j=e.extend({},e.fn.poshytip.defaults,h);if(!e("#poshytip-css-"+j.className)[0]){e(['<style id="poshytip-css-',j.className,'" type="text/css">',"div.",j.className,"{visibility:hidden;position:absolute;top:0;left:0;}","div.",j.className," table.tip-table, div.",j.className," table.tip-table td{margin:0;font-family:inherit;font-size:inherit;font-weight:inherit;font-style:inherit;font-variant:inherit;vertical-align:middle;}","div.",j.className," td.tip-bg-image span{display:block;font:1px/1px sans-serif;height:",j.bgImageFrameSize,"px;width:",j.bgImageFrameSize,"px;overflow:hidden;}","div.",j.className," td.tip-right{background-position:100% 0;}","div.",j.className," td.tip-bottom{background-position:100% 100%;}","div.",j.className," td.tip-left{background-position:0 100%;}","div.",j.className," div.tip-inner{background-position:-",j.bgImageFrameSize,"px -",j.bgImageFrameSize,"px;}","div.",j.className," div.tip-arrow{visibility:hidden;position:absolute;overflow:hidden;font:1px/1px sans-serif;}","</style>"].join("")).appendTo("head")}if(j.liveEvents&&j.showOn!="none"){var i,k=e.extend({},j,{liveEvents:false});switch(j.showOn){case"hover":i=function(){var m=e(this);if(!m.data("poshytip")){m.poshytip(k).poshytip("mouseenter")}};this.live?this.live("mouseenter.poshytip",i):e(document).delegate(this.selector,"mouseenter.poshytip",i);break;case"focus":i=function(){var m=e(this);if(!m.data("poshytip")){m.poshytip(k).poshytip("showDelayed")}};this.live?this.live("focus.poshytip",i):e(document).delegate(this.selector,"focus.poshytip",i);break}return this}return this.each(function(){new e.Poshytip(this,j)})};e.fn.poshytip.defaults={content:"[title]",className:"tip-yellow",bgImageFrameSize:10,showTimeout:500,hideTimeout:100,timeOnScreen:0,showOn:"hover",liveEvents:false,alignTo:"cursor",alignX:"right",alignY:"top",offsetX:-22,offsetY:18,keepInViewport:true,allowTipHover:true,followCursor:false,fade:true,slide:true,slideOffset:8,showAniDuration:300,hideAniDuration:300,refreshAniDuration:200}})(jQuery);

