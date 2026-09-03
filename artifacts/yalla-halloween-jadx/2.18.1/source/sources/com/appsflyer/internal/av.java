package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.OooO0o;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.qiniu.android.http.request.Request;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class av implements Runnable {

    @NonNull
    private bf AFInAppEventParameterName;

    @NonNull
    public final az AFInAppEventType;

    @NonNull
    public final bd AFKeystoreWrapper;

    @NonNull
    private final bh AFLogger$LogLevel;
    public BillingClient valueOf;

    @NonNull
    public final ExecutorService values;

    public av(@NonNull bd bdVar, @NonNull bf bfVar, @NonNull az azVar, @NonNull ExecutorService executorService, @NonNull bh bhVar) {
        this.AFKeystoreWrapper = bdVar;
        this.AFInAppEventParameterName = bfVar;
        this.AFInAppEventType = azVar;
        this.values = executorService;
        this.AFLogger$LogLevel = bhVar;
    }

    public static /* synthetic */ void values(av avVar, boolean z, List list) {
        z zVar = null;
        aa aaVar = new aa(false, z, list, null);
        bh bhVar = avVar.AFLogger$LogLevel;
        String str = String.format("https://%sars.%s/api/v1/android/validate_subscription", AppsFlyerLib.getInstance().getHostPrefix(), ag.AFInAppEventType().getHostName());
        HashMap map = new HashMap();
        map.put("app_id", bhVar.AFInAppEventType.values.getPackageName());
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string != null) {
            map.put("cuid", string);
        }
        Context context = bhVar.AFInAppEventType.values;
        map.put("app_version_name", aa.AFInAppEventParameterName(context, context.getPackageName()));
        HashMap map2 = new HashMap();
        b.e.a aVarAFKeystoreWrapper = z.AFKeystoreWrapper(bhVar.AFInAppEventType.values, new HashMap());
        String str2 = aVarAFKeystoreWrapper != null ? aVarAFKeystoreWrapper.AFKeystoreWrapper : null;
        if (str2 != null) {
            map2.put("advertising_id", str2);
        }
        map2.put("appsflyer_id", al.AFInAppEventParameterName(new WeakReference(bhVar.AFInAppEventType.values)));
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        map2.put("os_version", sb.toString());
        map2.put("sdk_version", ag.values);
        map.put("device_data", map2);
        map.put("is_cached", Boolean.valueOf(aaVar.AFInAppEventType()));
        map.put("environment", aaVar.AFKeystoreWrapper() ? "SANDBOX" : "PRODUCTION");
        map.put("additional_parameters", aaVar.values);
        ArrayList arrayList = new ArrayList();
        for (Purchase purchase : aaVar.AFInAppEventType) {
            HashMap map3 = new HashMap();
            map3.put(FirebaseMessagingService.EXTRA_TOKEN, purchase.OooO0O0());
            map3.put("subscription_id", purchase.getSku());
            arrayList.add(map3);
        }
        map.put(BillingClient.FeatureType.SUBSCRIPTIONS, arrayList);
        v vVar = new v(str, new JSONObject(map).toString().getBytes(), Request.HttpMethodPOST, Collections.emptyMap());
        u uVar = bhVar.AFKeystoreWrapper;
        bm bmVar = new bm(vVar, uVar.AFInAppEventParameterName, uVar.valueOf, new bk());
        bl<String> blVar = new bl<String>(z, zVar) { // from class: com.appsflyer.internal.av.4
            private /* synthetic */ boolean AFInAppEventType;

            @Override // com.appsflyer.internal.bl
            public final void AFInAppEventType(bi<String> biVar) {
                if (biVar.AFKeystoreWrapper() && this.AFInAppEventType) {
                    av.this.AFInAppEventType.AFKeystoreWrapper("ars_history_sent");
                }
            }

            @Override // com.appsflyer.internal.bl
            public final void valueOf(Throwable th) {
                AFLogger.values(th);
            }
        };
        if (bmVar.values.getAndSet(true)) {
            throw new IllegalStateException("Http call is already executed");
        }
        bmVar.valueOf.submit(new bm.AnonymousClass3(blVar));
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.valueOf == null) {
                bf bfVar = this.AFInAppEventParameterName;
                ax axVar = new ax(this);
                Context context = bfVar.values;
                if (context == null) {
                    throw new IllegalArgumentException("Please provide a valid Context.");
                }
                OooO0o oooO0o = new OooO0o(true, context, axVar);
                this.valueOf = oooO0o;
                oooO0o.OooO0OO(new aw(this));
            }
        } catch (Throwable th) {
            if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                AFLogger.AppsFlyer2dXConversionCallback("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
            }
            AFLogger.AFInAppEventType("Failed to setup Play billing", th);
        }
    }
}
