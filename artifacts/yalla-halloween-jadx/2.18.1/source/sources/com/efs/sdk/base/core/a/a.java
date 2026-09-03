package com.efs.sdk.base.core.a;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.efs.sdk.base.http.HttpResponse;
import com.facebook.appevents.AppEventsConstants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static volatile long b = -1;
    public boolean a;

    /* JADX INFO: renamed from: com.efs.sdk.base.core.a.a$a, reason: collision with other inner class name */
    public static class C0085a {
        private static final a a = new a(0);
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    public static a a() {
        return C0085a.a;
    }

    public static long b() {
        return b == -1 ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + b;
    }

    private a() {
        this.a = true;
    }

    @NonNull
    public final HttpResponse a(String str, c cVar, File file, boolean z) {
        String strB = cVar.b();
        String strA = a(str, cVar);
        if (this.a) {
            com.efs.sdk.base.core.util.d.a("efs.px.api", "Upload file, url is ".concat(String.valueOf(strA)));
        }
        HashMap map = new HashMap(1);
        map.put("wpk-header", strB);
        com.efs.sdk.base.core.util.b.d dVarA = new com.efs.sdk.base.core.util.b.d(strA).a(map);
        dVarA.a.d = file;
        com.efs.sdk.base.core.util.b.d dVarA2 = dVarA.a("type", cVar.h);
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.l);
        return dVarA2.a("size", sb.toString()).a("flow_limit", Boolean.toString(z)).a(d.a()).a().b();
    }

    public static String a(@NonNull String str, @NonNull c cVar) {
        String str2;
        byte b2 = cVar.g;
        if (b2 == 1) {
            str2 = "/apm_logs";
        } else if (b2 != 2) {
            str2 = b2 != 3 ? "/api/v1/raw/upload" : "/api/v1/mix/upload";
        } else {
            str2 = "/perf_upload";
        }
        return OooOo00.OooO0Oo(str, str2);
    }

    public static void a(@Nullable HttpResponse httpResponse) {
        if (httpResponse == null || !httpResponse.succ || TextUtils.isEmpty(httpResponse.data)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(httpResponse.data);
            String strOptString = jSONObject.optString("code", "-1");
            httpResponse.setBizCode(strOptString);
            if (!AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(strOptString)) {
                httpResponse.succ = false;
            }
            if (jSONObject.has("cver")) {
                ((Map) httpResponse.extra).put("cver", jSONObject.getString("cver"));
            }
            long j = jSONObject.getLong("stm") * 1000;
            if (Math.abs(j - b()) > 1500000) {
                b = j - SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            com.efs.sdk.base.core.util.d.b("efs.px.api", "checkPxReturn error", th);
        }
    }
}
