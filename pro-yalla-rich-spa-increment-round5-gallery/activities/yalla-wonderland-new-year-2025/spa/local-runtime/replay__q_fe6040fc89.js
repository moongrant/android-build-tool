(function installYallaOfficialSpaArchive() {
  "use strict";
  var SLUG = "yalla-wonderland-2025";
  var API_STATUS = 200;
  var ledger = [];
  var errors = [];
  var info = {userId:"0",region:"0",token:"",v:"9999",s:"1",appVersionCode:9999,roomID:0,recentRoomID:0,statusHeight:0};
  var replayResponses = {};
  try {
    var FixtureXHR = window.XMLHttpRequest;
    var fixtureRequest = new FixtureXHR();
    fixtureRequest.open("GET", "/activities/yalla-wonderland-2025/fixtures/api/archive-replay.json", false);
    fixtureRequest.send(null);
    if (fixtureRequest.status >= 200 && fixtureRequest.status < 300) {
      replayResponses = JSON.parse(fixtureRequest.responseText).responses || {};
    }
  } catch (fixtureError) {
    errors.push("fixture-load: " + String(fixtureError));
  }
  window.__YALLA_REPLAY__ = {officialSpa:true, readOnly:true, slug:SLUG, ledger:ledger, errors:errors};
  try {
    localStorage.setItem("hasavif", JSON.stringify("noavif"));
    localStorage.setItem("haswebp", JSON.stringify("nowebp"));
    localStorage.setItem("supportAvif", "");
    localStorage.setItem("supportWebp", "");
  } catch (_) {}
  function isApi(url) {
    try { return /\/(?:api|Api)(?:\/)/.test(new URL(String(url), location.href).pathname); }
    catch (_) { return /\/(?:api|Api)(?:\/)/.test(String(url)); }
  }
  function endpoint(url) {
    try { return new URL(String(url), location.href).pathname; } catch (_) { return String(url); }
  }
  function isAnalytics(path) { return /\/Buried(?:\/)/i.test(path); }
  function hasFixture(path) { return Object.prototype.hasOwnProperty.call(replayResponses, path); }
  function isWrite(method, path) {
    if (isAnalytics(path)) return false;
    if (String(method || "GET").toUpperCase() !== "GET") return true;
    return /(?:Purchase|Receive|Reward|Lottery|Draw|Exchange|Submit|Bind|Join|RecallWith|NotDaily|NotSend|SendThird)/i.test(path);
  }
  function body(path, status) {
    if (isAnalytics(path)) return {code:0,data:true,message:"ok"};
    if (hasFixture(path)) return replayResponses[path];
    return {code:status === 200 ? 0 : status,data:null,list:[],res:[],count:0,message:"Archived official SPA: historical API data is unavailable"};
  }
  function note(kind, url, method, status) { ledger.push({kind:kind,url:String(url),method:String(method||"GET"),status:status,at:Date.now()}); }
  function toast(text) {
    var old = document.getElementById("yallaArchiveToast"); if (old) old.remove();
    var el = document.createElement("div"); el.id="yallaArchiveToast"; el.textContent=text;
    el.style.cssText="position:fixed;left:50%;bottom:24px;z-index:2147483647;max-width:84%;transform:translateX(-50%);padding:10px 16px;border:1px solid rgba(255,255,255,.38);border-radius:999px;background:rgba(12,16,31,.9);box-shadow:0 8px 28px rgba(0,0,0,.28);color:#fff;font:600 13px/1.35 Arial,sans-serif;text-align:center;pointer-events:none";
    document.body.appendChild(el); setTimeout(function(){el.remove();},1800);
  }
  var nativeFetch = window.fetch && window.fetch.bind(window);
  if (nativeFetch) window.fetch = function(input, init) {
    var url = typeof input === "string" ? input : input.url;
    if (!isApi(url)) return nativeFetch(input, init);
    var method = (init && init.method) || (input && input.method) || "GET";
    var path = endpoint(url); var status = isAnalytics(path) || hasFixture(path) ? 200 : (isWrite(method,path) ? 410 : API_STATUS);
    note("fetch",url,method,status); if (status===410) toast("归档回放为只读，交易与领奖不会执行");
    return Promise.resolve(new Response(JSON.stringify(body(path,status)), {status:status,headers:{"Content-Type":"application/json"}}));
  };
  var NativeXHR = window.XMLHttpRequest;
  function ArchiveXHR() { this.native=new NativeXHR(); this.listeners={}; this.headers={}; this.archive=false; this.rs=0; this.st=0; this.rt=""; this.r=null; this.ty=""; this.to=0; this.wc=false; }
  ArchiveXHR.prototype.open=function(method,url,async,user,password){ this.method=method; this.url=String(url); this.archive=isApi(url); this.async=async!==false; if(this.archive){this.rs=1;this.emit("readystatechange");}else this.native.open(method,url,async===undefined?true:async,user,password); };
  ArchiveXHR.prototype.send=function(data){ var self=this; if(this.archive){ var path=endpoint(this.url), status=isAnalytics(path)||hasFixture(path)?200:(isWrite(this.method,path)?410:API_STATUS); note("xhr",this.url,this.method,status); if(status===410) toast("归档回放为只读，交易与领奖不会执行"); var finish=function(){var obj=body(path,status);self.st=status;self.rs=4;self.rt=JSON.stringify(obj);self.r=self.ty==="json"?obj:self.rt;self.emit("readystatechange");if(status>=200&&status<300)self.emit("load");else self.emit("error");self.emit("loadend");}; this.async?setTimeout(finish,0):finish(); return; } this.native.responseType=this.ty;this.native.timeout=this.to;this.native.withCredentials=this.wc;Object.keys(this.headers).forEach(function(k){self.native.setRequestHeader(k,self.headers[k]);});["readystatechange","load","loadend","error","abort","timeout","progress"].forEach(function(t){self.native.addEventListener(t,function(e){self.emit(t,e);});});this.native.send(data); };
  ArchiveXHR.prototype.abort=function(){if(this.archive){this.emit("abort");this.emit("loadend");}else this.native.abort();};
  ArchiveXHR.prototype.setRequestHeader=function(k,v){this.headers[k]=v;};
  ArchiveXHR.prototype.getAllResponseHeaders=function(){return this.archive?"content-type: application/json\r\n":this.native.getAllResponseHeaders();};
  ArchiveXHR.prototype.getResponseHeader=function(k){return this.archive&&String(k).toLowerCase()==="content-type"?"application/json":this.native.getResponseHeader(k);};
  ArchiveXHR.prototype.addEventListener=function(t,f){(this.listeners[t]||(this.listeners[t]=[])).push(f);};
  ArchiveXHR.prototype.removeEventListener=function(t,f){this.listeners[t]=(this.listeners[t]||[]).filter(function(x){return x!==f;});};
  ArchiveXHR.prototype.emit=function(t,e){e=e||{type:t,target:this,currentTarget:this};var h=this["on"+t];if(typeof h==="function")h.call(this,e);(this.listeners[t]||[]).slice().forEach(function(f){f.call(this,e);},this);};
  Object.defineProperties(ArchiveXHR.prototype,{
    readyState:{get:function(){return this.archive?this.rs:this.native.readyState;}},status:{get:function(){return this.archive?this.st:this.native.status;}},statusText:{get:function(){return this.archive?(this.st===200?"OK":this.st===410?"Gone":"Unauthorized"):this.native.statusText;}},responseText:{get:function(){return this.archive?this.rt:this.native.responseText;}},response:{get:function(){return this.archive?this.r:this.native.response;}},responseURL:{get:function(){return this.archive?location.origin+endpoint(this.url):this.native.responseURL;}},responseType:{get:function(){return this.ty;},set:function(v){this.ty=v;}},timeout:{get:function(){return this.to;},set:function(v){this.to=v;}},withCredentials:{get:function(){return this.wc;},set:function(v){this.wc=v;}},upload:{get:function(){return this.native.upload;}}
  });
  window.XMLHttpRequest = ArchiveXHR;
  function action(name) { return function(){note("bridge",name,"",0); if(/recharge|purchase|receive|reward|share/i.test(name)) toast("归档回放为只读");}; }
  function getInfo() { return JSON.stringify(info); }
  window.Yalla = Object.assign({}, window.Yalla || {}, {getInfo:getInfo,closeLoading:action("closeLoading"),coinNotEnoughQuick:action("coin"),downloadPage:action("download"),goToRecharge:action("recharge"),quickRecharch:action("quickRecharge"),shareActivity:action("share"),shareThird:action("shareThird")});
  window.webkit=window.webkit||{};window.webkit.messageHandlers=window.webkit.messageHandlers||{};
  ["closeLoading","coinNotEnough","downloadPage","quickRecharch","rechargePage","roomPage","shareActivityToFriends","shareThird"].forEach(function(name){window.webkit.messageHandlers[name]=window.webkit.messageHandlers[name]||{postMessage:action(name)};});
  window.webkit.messageHandlers.getInfo=window.webkit.messageHandlers.getInfo||{postMessage:function(){setTimeout(function(){["getInfoH5","getInfoCallBack","getInfoCallback"].forEach(function(n){if(typeof window[n]==="function")try{window[n](JSON.stringify(info));}catch(_){}});},0);}};
  var nativeOpen=window.open; window.open=function(url){note("blocked-open",url,"",0);toast("外部跳转已在归档中关闭");return null;};
  window.addEventListener("error",function(e){errors.push(String(e.message||e.error||"error"));});
  window.addEventListener("unhandledrejection",function(e){errors.push(String(e.reason||"unhandled rejection"));});
  document.documentElement.setAttribute("data-yalla-replay","ready");
})();
