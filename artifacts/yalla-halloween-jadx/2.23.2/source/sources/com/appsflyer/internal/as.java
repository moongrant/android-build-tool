package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class as extends aj {
    a AFInAppEventType;
    private String AppsFlyer2dXConversionCallback;
    private String getLevel;
    boolean valueOf;

    public interface a {
        void valueOf(String str);

        void values(Map<String, String> map);
    }

    public as(Uri uri, ag agVar, Context context) {
        super(agVar, context, "GET");
        this.valueOf = false;
        if (TextUtils.isEmpty(uri.getHost()) || TextUtils.isEmpty(uri.getPath())) {
            return;
        }
        String[] strArr = {"onelink.me", "onelnk.com", "app.aflink.com"};
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            if (uri.getHost().contains(strArr[i])) {
                z = true;
            }
        }
        if (j.AFLogger$LogLevel != null) {
            StringBuilder sb = new StringBuilder("Validate if link ");
            sb.append(uri);
            sb.append(" belongs to custom domains: ");
            sb.append(Arrays.asList(j.AFLogger$LogLevel));
            AFLogger.AFKeystoreWrapper(sb.toString());
            for (String str : j.AFLogger$LogLevel) {
                if (uri.getHost().contains(str) && !TextUtils.isEmpty(str)) {
                    AFLogger.valueOf("Link matches custom domain: ".concat(String.valueOf(str)));
                    this.valueOf = true;
                    z = true;
                }
            }
        }
        String[] strArrSplit = uri.getPath().split("/");
        if (z && strArrSplit.length == 3) {
            this.values = strArrSplit[1];
            this.getLevel = strArrSplit[2];
            this.AppsFlyer2dXConversionCallback = uri.toString();
        }
    }

    public final boolean AFInAppEventParameterName() {
        return (TextUtils.isEmpty(this.values) || TextUtils.isEmpty(this.getLevel) || this.values.equals("app")) ? false : true;
    }

    @Override // com.appsflyer.internal.aj
    public final void valueOf(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestProperty("Af-UUID", this.AFVersionDeclaration);
        String strValueOf = String.valueOf(this.init.get("build_number"));
        httpsURLConnection.setRequestProperty("Af-Meta-Sdk-Ver", strValueOf);
        httpsURLConnection.setRequestProperty("Af-Meta-Counter", String.valueOf(this.init.get("counter")));
        httpsURLConnection.setRequestProperty("Af-Meta-Model", String.valueOf(this.init.get(DeviceRequestsHelper.DEVICE_INFO_MODEL)));
        httpsURLConnection.setRequestProperty("Af-Meta-Platform", String.valueOf(this.init.get("platformextension")));
        httpsURLConnection.setRequestProperty("Af-Meta-System-Version", String.valueOf(this.init.get(ServerProtocol.DIALOG_PARAM_SDK_VERSION)));
        AFInAppEventType(httpsURLConnection, this.AFInAppEventParameterName, this.AFVersionDeclaration, this.values, this.getLevel, strValueOf);
    }

    @Override // com.appsflyer.internal.aj
    public final void values(String str) {
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            this.AFInAppEventType.values(map);
        } catch (JSONException e) {
            this.AFInAppEventType.valueOf("Can't parse OneLink data");
            AFLogger.AFKeystoreWrapper("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    @Override // com.appsflyer.internal.aj
    public final String valueOf() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(aj.AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), ag.AFInAppEventType().getHostName()));
        sb.append("/");
        sb.append(this.values);
        sb.append("?id=");
        sb.append(this.getLevel);
        return sb.toString();
    }

    @Override // com.appsflyer.internal.aj
    public final void values() {
        String str = this.AppsFlyer2dXConversionCallback;
        if (str == null) {
            str = "Can't get OneLink data";
        }
        this.AFInAppEventType.valueOf(str);
    }
}
