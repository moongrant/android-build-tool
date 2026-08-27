/* eslint-disable */
(function installYallaLocalizedArchive() {
  "use strict";
  var SLUG = "yalla-football-carnival-2024";
  var BASE = "/activities/" + SLUG + "/";
  var ledger = [];
  var errors = [];
  var appInfo = {userId:"0",region:"0",token:"",v:"9999",s:"1",appVersionCode:9999,roomID:0,recentRoomID:0,statusHeight:0,userToken:""};
  window.appInfo = Object.assign({}, appInfo, window.appInfo || {});
  window.__YALLA_REPLAY__ = {officialSpa:true,localized:true,language:"zh-CN",readOnly:true,offline:true,slug:SLUG,ledger:ledger,errors:errors};
  try {
    localStorage.setItem("hasavif", JSON.stringify("avif"));
    localStorage.setItem("haswebp", JSON.stringify("webp"));
  } catch (_) {}
  try {
    if (navigator.serviceWorker && navigator.serviceWorker.getRegistrations) {
      navigator.serviceWorker.getRegistrations().then(function(rs){rs.forEach(function(r){r.unregister();});}).catch(function(){});
    }
  } catch (_) {}
  function isApi(url) {
    try { return /\/(?:api|Api)\//.test(new URL(String(url), location.href).pathname); }
    catch (_) { return /\/(?:api|Api)\//.test(String(url)); }
  }
  function endpoint(url) { try { return new URL(String(url), location.href).pathname; } catch (_) { return String(url); } }
  function note(kind,url,method,status) { ledger.push({kind:kind,url:String(url),method:String(method||"GET"),status:status,at:Date.now()}); }
  function toast(text) {
    var old=document.getElementById("yallaArchiveToast"); if(old) old.remove();
    var el=document.createElement("div"); el.id="yallaArchiveToast"; el.textContent=text;
    el.style.cssText="position:fixed;left:50%;bottom:24px;z-index:2147483647;max-width:84%;transform:translateX(-50%);padding:10px 16px;border:1px solid rgba(255,255,255,.38);border-radius:999px;background:rgba(12,16,31,.9);box-shadow:0 8px 28px rgba(0,0,0,.28);color:#fff;font:600 13px/1.35 Arial,sans-serif;text-align:center;pointer-events:none";
    document.body.appendChild(el); setTimeout(function(){el.remove();},1800);
  }

  function responseFor(path, method) {
    var p = String(path || "").toLowerCase();
    var write = false;
    var data = null;
    if (new RegExp("/buried/", "i").test(p)) {
      data = true;
    } else if (SLUG === "yalla-football-carnival-2024") {
      if (/\/asiancup\/init\/?$/.test(p)) data = {};
      else if (/getuserinfo/.test(p)) data = {remainNum:0,totalNum:0,hatNum:0,themeNum:0,bagPropNum:0,freeLotteryNum:0,headUrl:BASE+"assets/external/file.yalla.live/Activity/nationalFence/horse.png",prettyId:0,isBlack:false,coin:0,needChoiceTitle:false};
      else if (/getactivityinfo/.test(p)) data = {day:0,prop1Id:0,prop2Id:0,circleId:2057392,top1HeadUrl:BASE+"assets/external/file.yalla.live/Activity/Defaultavatar.jpg",top1Title:0};
      else if (/getmytaskinfo/.test(p)) data = [];
      else if (/getsigninfo/.test(p)) data = {signDays:[],today:0};
      else if (/getrank/.test(p)) data = [];
      else if (/getprocesslogtop50|getredpacketlogtop50|getredpacketlogbyuserid/.test(p)) data = [];
      else if (/getredpacketlogbyid|getprocessreward|getactivityredpacket/.test(p)) data = null;
      else if (/signin/.test(p)) data = 0;
      else if (/choicetitle|rewardtask|shared|receiveactivityredpacket|receivereward/.test(p)) { write = true; data = 0; }
    } else {
      if (/\/kingcar\/init\/?$/.test(p)) data = {};
      else if (/getuserinfo/.test(p)) data = {headUrl:"",roomId:0,isVip:false,lotteryLevel:1,lotteryNum:0,receiveReturnRewardLevel:0,receiveReturnRewardStatus:0,remainNum:0,totalNum:0,usedLotteryNum:0};
      else if (/getactivityinfo/.test(p)) data = {activityEndDate:"",countdown:1,endTime:"",materialConfigs:[],onceLotteryNum:100,progressConfigs:[],propConfigs:[],returnRewardConfigs:[],startTime:"",timeZone:0};
      else if (/getlotteryinfo/.test(p)) data = [];
      else if (/gettotalprogressinfo/.test(p)) data = {canReceiveCount:0,completedCount:0,currentNum:0,needCount:0,receivedCount:0,rewardDetails:[],totalNum:0};
      else if (/getrankrewardinfo/.test(p)) data = {maxDailyRankNum:0,maxTotalRankNum:0,dailyRankRewardInfos:[],totalRankRewardInfos:[]};
      else if (/getkingcarranklist|getkingcarmonthly|getrewardinfo/.test(p)) data = [];
      else if (/getrewardbyrecordid|getcopywritingaddress/.test(p)) data = null;
      else if (/uplotterylevel|multlottery|receivetotalprogressinfo|receivereturnprogressinfo/.test(p)) { write = true; data = /multlottery/.test(p) ? [] : 0; }
    }
    if (String(method || "GET").toUpperCase() !== "GET" && !/signin|buried/.test(p)) write = true;
    return {payload:{code:0,data:data,list:[],res:[],count:0,message:"ok"},write:write};
  }

  var nativeFetch=window.fetch&&window.fetch.bind(window);
  if(nativeFetch) window.fetch=function(input,init){
    var url=typeof input==="string"?input:input.url;
    if(!isApi(url)) return nativeFetch(input,init);
    var method=(init&&init.method)||(input&&input.method)||"GET";
    var out=responseFor(endpoint(url),method); note("fetch",url,method,200);
    if(out.write) toast("归档回放为只读，交易、抽取、领奖与升级不会执行");
    return Promise.resolve(new Response(JSON.stringify(out.payload),{status:200,headers:{"Content-Type":"application/json; charset=utf-8"}}));
  };
  var NativeXHR=window.XMLHttpRequest;
  function ArchiveXHR(){this.native=new NativeXHR();this.listeners={};this.headers={};this.archive=false;this.rs=0;this.st=0;this.rt="";this.r=null;this.ty="";this.to=0;this.wc=false;}
  ArchiveXHR.prototype.open=function(method,url,async,user,password){this.method=method;this.url=String(url);this.archive=isApi(url);this.async=async!==false;if(this.archive){this.rs=1;this.emit("readystatechange");}else this.native.open(method,url,async===undefined?true:async,user,password);};
  ArchiveXHR.prototype.send=function(data){var self=this;if(this.archive){var out=responseFor(endpoint(this.url),this.method);note("xhr",this.url,this.method,200);if(out.write)toast("归档回放为只读，交易、抽取、领奖与升级不会执行");var finish=function(){self.st=200;self.rs=4;self.rt=JSON.stringify(out.payload);self.r=self.ty==="json"?out.payload:self.rt;self.emit("readystatechange");self.emit("load");self.emit("loadend");};this.async?setTimeout(finish,0):finish();return;}this.native.responseType=this.ty;this.native.timeout=this.to;this.native.withCredentials=this.wc;Object.keys(this.headers).forEach(function(k){self.native.setRequestHeader(k,self.headers[k]);});["readystatechange","load","loadend","error","abort","timeout","progress"].forEach(function(t){self.native.addEventListener(t,function(e){self.emit(t,e);});});this.native.send(data);};
  ArchiveXHR.prototype.abort=function(){if(this.archive){this.emit("abort");this.emit("loadend");}else this.native.abort();};
  ArchiveXHR.prototype.setRequestHeader=function(k,v){this.headers[k]=v;};
  ArchiveXHR.prototype.getAllResponseHeaders=function(){return this.archive?"content-type: application/json; charset=utf-8\r\n":this.native.getAllResponseHeaders();};
  ArchiveXHR.prototype.getResponseHeader=function(k){return this.archive&&String(k).toLowerCase()==="content-type"?"application/json; charset=utf-8":this.native.getResponseHeader(k);};
  ArchiveXHR.prototype.addEventListener=function(t,f){(this.listeners[t]||(this.listeners[t]=[])).push(f);};
  ArchiveXHR.prototype.removeEventListener=function(t,f){this.listeners[t]=(this.listeners[t]||[]).filter(function(x){return x!==f;});};
  ArchiveXHR.prototype.emit=function(t,e){e=e||{type:t,target:this,currentTarget:this};var h=this["on"+t];if(typeof h==="function")h.call(this,e);(this.listeners[t]||[]).slice().forEach(function(f){f.call(this,e);},this);};
  Object.defineProperties(ArchiveXHR.prototype,{
    readyState:{get:function(){return this.archive?this.rs:this.native.readyState;}},status:{get:function(){return this.archive?this.st:this.native.status;}},statusText:{get:function(){return this.archive?"OK":this.native.statusText;}},responseText:{get:function(){return this.archive?this.rt:this.native.responseText;}},response:{get:function(){return this.archive?this.r:this.native.response;}},responseURL:{get:function(){return this.archive?location.origin+endpoint(this.url):this.native.responseURL;}},responseType:{get:function(){return this.ty;},set:function(v){this.ty=v;}},timeout:{get:function(){return this.to;},set:function(v){this.to=v;}},withCredentials:{get:function(){return this.wc;},set:function(v){this.wc=v;}},upload:{get:function(){return this.native.upload;}}
  });
  window.XMLHttpRequest=ArchiveXHR;
  function action(name){return function(){note("bridge",name,"",0);if(/recharge|purchase|receive|reward|share|lottery|draw|vip|room|download/i.test(name))toast("该入口在本地归档中保持只读");};}
  function getInfo(){return JSON.stringify(appInfo);}
  window.Yalla=Object.assign({},window.Yalla||{},{getInfo:getInfo,getStatusHeight:function(){return 0;},closeLoading:action("closeLoading"),coinNotEnoughQuick:action("coin"),downloadPage:action("download"),goToRecharge:action("recharge"),quickRecharch:action("quickRecharge"),shareActivity:action("share"),shareThird:action("shareThird"),roomPage:action("room"),goToVip:action("vip"),sailfishLog:action("sailfishLog")});
  window.webkit=window.webkit||{};window.webkit.messageHandlers=window.webkit.messageHandlers||{};
  ["closeLoading","coinNotEnough","downloadPage","quickRecharch","rechargePage","roomPage","goToVip","shareActivityToFriends","shareThird","sailfishLog"].forEach(function(name){window.webkit.messageHandlers[name]=window.webkit.messageHandlers[name]||{postMessage:action(name)};});
  window.webkit.messageHandlers.getInfo=window.webkit.messageHandlers.getInfo||{postMessage:function(){setTimeout(function(){["getInfoH5","getInfoCallBack","getInfoCallback"].forEach(function(n){if(typeof window[n]==="function")try{window[n](JSON.stringify(appInfo));}catch(_){}});},0);}};
  window.open=function(url){note("blocked-open",url,"",0);toast("外部跳转已在归档中关闭");return null;};
  window.addEventListener("error",function(e){errors.push(String(e.message||e.error||"error"));},true);
  window.addEventListener("unhandledrejection",function(e){errors.push(String(e.reason||"unhandled rejection"));try{e.preventDefault();}catch(_){};});
  function clickVisible(selector, exactText) {
    var nodes = Array.prototype.slice.call(document.querySelectorAll(selector));
    var target = nodes.find(function (node) {
      var visible = !!(node.offsetWidth || node.offsetHeight || node.getClientRects().length);
      var matches = exactText == null || String(node.textContent || "").trim() === exactText;
      return visible && matches;
    });
    if (!target) return false;
    target.click();
    return true;
  }
  function applyArchiveView() {
    var view = new URLSearchParams(location.search).get("view") || "main";
    if (view === "daily" || view === "total") {
      if (!clickVisible("p", "排行榜")) return false;
      setTimeout(function () {
        clickVisible(".rank_tab p", view === "daily" ? "日榜" : "总榜");
        document.documentElement.setAttribute("data-archive-view", view);
      }, 80);
      return true;
    }
    if (view === "rules" && clickVisible(".head_rule")) return true;
    if (view === "records" && clickVisible(".btn_records")) return true;
    document.documentElement.setAttribute("data-archive-view", view);
    return view === "main";
  }
  var viewAttempts = 0;
  var viewTimer = setInterval(function () {
    viewAttempts += 1;
    if (applyArchiveView() || viewAttempts > 60) {
      clearInterval(viewTimer);
      document.documentElement.setAttribute("data-archive-view", new URLSearchParams(location.search).get("view") || "main");
    }
  }, 100);
  document.documentElement.setAttribute("data-yalla-replay","ready");
})();
