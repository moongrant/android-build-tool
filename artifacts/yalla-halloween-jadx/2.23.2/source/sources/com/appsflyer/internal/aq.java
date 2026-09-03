package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class aq {
    private static void AFInAppEventParameterName(String str) {
        if (ag.valueOf != null) {
            try {
                AFLogger.valueOf("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                ag.valueOf.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.AFKeystoreWrapper(th.getLocalizedMessage(), th);
            }
        }
    }

    public static void AFInAppEventType(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (j.AFInAppEventParameterName().valueOf == null) {
            AFKeystoreWrapper(map);
            return;
        }
        try {
            try {
                DeepLink deepLinkValueOf = DeepLink.valueOf(map);
                deepLinkValueOf.AFInAppEventParameterName.put("is_deferred", false);
                deepLinkResult = new DeepLinkResult(deepLinkValueOf, null);
            } catch (JSONException e) {
                AFLogger.AFInAppEventType("[DDL] Error occurred", e);
                deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
            }
            AFKeystoreWrapper(deepLinkResult);
        } catch (Throwable th) {
            AFKeystoreWrapper(new DeepLinkResult(null, null));
            throw th;
        }
    }

    public static void AFKeystoreWrapper(DeepLinkResult deepLinkResult) {
        if (j.AFInAppEventParameterName().valueOf == null) {
            AFLogger.valueOf("[DDL] skipping, no callback registered");
            return;
        }
        StringBuilder sb = new StringBuilder("[DDL] Calling onDeepLinking with:\n");
        sb.append(deepLinkResult.toString());
        AFLogger.valueOf(sb.toString());
        try {
            j.AFInAppEventParameterName().valueOf.onDeepLinking(deepLinkResult);
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper(th.getLocalizedMessage(), th);
        }
    }

    public static void valueOf(String str, DeepLinkResult.Error error) {
        if (j.AFInAppEventParameterName().valueOf == null) {
            AFInAppEventParameterName(str);
        } else {
            AFLogger.valueOf("[DDL] Error occurred: ".concat(String.valueOf(str)));
            AFKeystoreWrapper(new DeepLinkResult(null, error));
        }
    }

    private static void AFKeystoreWrapper(Map<String, String> map) {
        if (ag.valueOf != null) {
            try {
                StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.valueOf(sb.toString());
                ag.valueOf.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.AFKeystoreWrapper(th.getLocalizedMessage(), th);
            }
        }
    }
}
