package com.geetest.captcha;

import android.content.Context;
import android.util.Pair;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    public static class a {
        private static final h a = new h(0);
    }

    public /* synthetic */ h(byte b) {
        this();
    }

    public static String a(Context context) {
        JSONObject jSONObject = new JSONObject();
        if (context == null) {
            return jSONObject.toString();
        }
        String strA = f.a(context, "gt_fp");
        long jB = f.b(context, "gt_ts");
        if (jB == 0) {
            jB = System.currentTimeMillis();
            try {
                context.getSharedPreferences("gt_fp", 0).edit().putLong("gt_ts", jB).apply();
            } catch (Exception unused) {
            }
        }
        try {
            String strA2 = m.a(context);
            if (f.a(strA) && !f.a(strA2)) {
                strA = f.c(context, strA2);
            }
            jSONObject.put("bd", strA2);
            Pair<String, String> pairA = i.a(context);
            if (pairA != null) {
                jSONObject.put("d", pairA.first);
                jSONObject.put("e", pairA.second);
                if (f.a(strA) && !f.a((String) pairA.first)) {
                    strA = f.c(context, (String) pairA.first);
                }
            } else {
                jSONObject.put("d", "$unknown");
                jSONObject.put("e", "$unknown");
            }
            if (f.a(strA)) {
                strA = f.c(context, UUID.randomUUID().toString());
            }
            jSONObject.put("fp", strA);
            jSONObject.put("ts", String.valueOf(jB));
            jSONObject.put("ver", "1.0.0");
            jSONObject.put("client_type", "android");
        } catch (JSONException unused2) {
        }
        return jSONObject.toString();
    }

    private h() {
    }
}
