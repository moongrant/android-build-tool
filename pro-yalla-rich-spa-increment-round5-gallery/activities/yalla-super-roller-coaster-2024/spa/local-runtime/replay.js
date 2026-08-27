(function installRollerCoasterArchiveBridge() {
  "use strict";

  var archive = {
    name: "Super Roller Coaster",
    mode: "official-spa-archive",
    capturedAt: "2026-08-13",
    notice: "The official campaign API is expired. The original Vue SPA and visual assets are running locally; server data remains in the official empty state.",
    actions: [],
  };

  window.__ROLLER_COASTER_ARCHIVE__ = archive;

  try {
    localStorage.setItem("hasavif", "noavif");
    localStorage.setItem("haswebp", "nowebp");
  } catch (_) {
    // The app still runs when storage is unavailable.
  }

  if (new URLSearchParams(window.location.search).get("archive") === "standalone") {
    return;
  }

  function showArchiveNote(action) {
    archive.actions.push({ action: action, at: new Date().toISOString() });
    var existing = document.getElementById("rollerArchiveToast");
    if (existing) existing.remove();

    var toast = document.createElement("div");
    toast.id = "rollerArchiveToast";
    toast.textContent = "Archived interaction: " + action;
    toast.style.cssText = [
      "position:fixed",
      "left:50%",
      "bottom:24px",
      "z-index:2147483647",
      "max-width:82%",
      "transform:translateX(-50%)",
      "padding:10px 16px",
      "border:1px solid rgba(255,255,255,.4)",
      "border-radius:999px",
      "background:rgba(18,9,55,.92)",
      "box-shadow:0 8px 28px rgba(0,0,0,.28)",
      "color:#fff",
      "font:600 13px/1.35 Arial,sans-serif",
      "text-align:center",
      "pointer-events:none",
    ].join(";");
    document.body.appendChild(toast);
    window.setTimeout(function () { toast.remove(); }, 1800);
  }

  function bridgeAction(name) {
    return function () { showArchiveNote(name); };
  }

  window.Yalla = Object.assign({}, window.Yalla || {}, {
    coinNotEnoughQuick: bridgeAction("coin balance prompt"),
    downloadPage: bridgeAction("download Yalla"),
    getInfo: function () { return ""; },
    goToRecharge: bridgeAction("recharge"),
    quickRecharch: bridgeAction("quick recharge"),
    shareActivity: bridgeAction("share activity"),
    shareThird: bridgeAction("share card"),
  });

  var handlers = [
    "coinNotEnough",
    "downloadPage",
    "getInfo",
    "quickRecharch",
    "rechargePage",
    "roomPage",
    "shareActivityToFriends",
    "shareThird",
  ];
  window.webkit = window.webkit || {};
  window.webkit.messageHandlers = window.webkit.messageHandlers || {};
  handlers.forEach(function (name) {
    if (!window.webkit.messageHandlers[name]) {
      window.webkit.messageHandlers[name] = {
        postMessage: name === "getInfo" ? function () {} : bridgeAction(name),
      };
    }
  });

  var axiosValue;
  Object.defineProperty(window, "axios", {
    configurable: true,
    get: function () { return axiosValue; },
    set: function (value) {
      axiosValue = value;
      Object.defineProperty(window, "axios", {
        configurable: true,
        enumerable: true,
        writable: true,
        value: value,
      });

      if (!value || !value.interceptors || !value.interceptors.request) return;
      value.interceptors.request.use(function (config) {
        var requestUrl = String(config.url || "");
        if (requestUrl.indexOf("/api/Buried/") >= 0) {
          config.adapter = function () {
            return Promise.resolve({
              data: { code: 0, data: true },
              status: 200,
              statusText: "OK",
              headers: {},
              config: config,
              request: {},
            });
          };
        } else if (requestUrl.indexOf("/api/RollerCoaster/") >= 0) {
          config.adapter = function () {
            var error = new Error("Archived campaign API is intentionally offline");
            error.config = config;
            error.response = {
              data: { code: 410, message: archive.notice },
              status: 410,
              statusText: "Gone",
              headers: {},
              config: config,
              request: {},
            };
            return Promise.reject(error);
          };
        }
        return config;
      });
    },
  });
})();
