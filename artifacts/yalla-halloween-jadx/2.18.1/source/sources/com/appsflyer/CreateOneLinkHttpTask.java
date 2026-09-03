package com.appsflyer;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.appsflyer.internal.ag;
import com.appsflyer.internal.aj;
import com.appsflyer.internal.n;
import com.appsflyer.share.LinkGenerator;
import com.qiniu.android.http.request.Request;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class CreateOneLinkHttpTask extends aj {
    public ResponseListener AFInAppEventType;
    private final Map<String, String> AFLogger$LogLevel;
    private String AppsFlyer2dXConversionCallback;
    private final String getLevel;
    public String valueOf;

    public interface ResponseListener {
        @WorkerThread
        void onResponse(String str);

        @WorkerThread
        void onResponseError(String str);
    }

    public CreateOneLinkHttpTask(@NonNull String str, @NonNull Map<String, String> map, ag agVar, @NonNull Context context) {
        super(agVar, context, Request.HttpMethodPOST);
        this.AppsFlyer2dXConversionCallback = "";
        if (context != null) {
            this.AppsFlyer2dXConversionCallback = context.getPackageName();
        } else {
            AFLogger.AppsFlyer2dXConversionCallback("CreateOneLinkHttpTask: context can't be null");
        }
        this.values = str;
        this.getLevel = "-1";
        this.AFLogger$LogLevel = map;
    }

    @Override // com.appsflyer.internal.aj
    public final void valueOf(HttpsURLConnection httpsURLConnection) throws IOException {
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setUseCaches(false);
        HashMap map = new HashMap();
        map.put("ttl", this.getLevel);
        map.put("uuid", this.AFVersionDeclaration);
        map.put("data", this.AFLogger$LogLevel);
        map.put("meta", this.init);
        String str = this.valueOf;
        if (str != null) {
            map.put("brand_domain", str);
        }
        String string = n.AFKeystoreWrapper(map).toString();
        AFInAppEventType(httpsURLConnection, this.AFInAppEventParameterName, string);
        httpsURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(string);
        dataOutputStream.flush();
        dataOutputStream.close();
    }

    @Override // com.appsflyer.internal.aj
    public final void values(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                this.AFInAppEventType.onResponse(jSONObject.optString(itKeys.next()));
            }
        } catch (JSONException e) {
            this.AFInAppEventType.onResponseError("Can't parse one link data");
            AFLogger.AFKeystoreWrapper("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    @Override // com.appsflyer.internal.aj
    public final void values() {
        LinkGenerator linkGeneratorAddParameters = new LinkGenerator("af_app_invites").setBaseURL(this.values, AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN), this.AppsFlyer2dXConversionCallback).addParameter("af_siteid", this.AppsFlyer2dXConversionCallback).addParameters(this.AFLogger$LogLevel);
        ag.AFInAppEventType();
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string != null) {
            linkGeneratorAddParameters.setReferrerCustomerId(string);
        }
        this.AFInAppEventType.onResponse(linkGeneratorAddParameters.generateLink());
    }

    @Override // com.appsflyer.internal.aj
    public final String valueOf() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(aj.AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), ag.AFInAppEventType().getHostName()));
        sb.append("/");
        sb.append(this.values);
        return sb.toString();
    }
}
