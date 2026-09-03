package com.geetest.captcha;

import android.content.Context;
import com.geetest.core.GeeGuard;
import com.geetest.core.GeeGuardConfiguration;
import com.qiniu.android.common.Constants;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0002J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/geetest/captcha/utils/CoreUtils;", "", "()V", "isAvailable", "", "()Z", "map", "", "", "Lorg/json/JSONObject;", "getMap", "()Ljava/util/Map;", "setMap", "(Ljava/util/Map;)V", "getData", com.umeng.analytics.pro.d.R, "Landroid/content/Context;", "sign", "getDataWithSign", "url", "captcha_release"}, k = 1, mv = {1, 1, 16})
public final class y {
    public static final y a = new y();

    @Nullable
    private static Map<String, ? extends JSONObject> b;

    private y() {
    }

    public static void a(@Nullable Map<String, ? extends JSONObject> map) {
        b = map;
    }

    private static String b(Context context, String str) {
        try {
            Object objNewInstance = GeeGuardConfiguration.Builder.class.newInstance();
            GeeGuardConfiguration.Builder.class.getMethod("setAppId", String.class).invoke(objNewInstance, "54847f3301740c85982a1d3d566bd24e");
            GeeGuardConfiguration.Builder.class.getMethod("setExtraInfo", HashMap.class).invoke(objNewInstance, b);
            Class cls = Boolean.TYPE;
            GeeGuardConfiguration.Builder.class.getMethod("setAlInfo", cls).invoke(objNewInstance, Boolean.FALSE);
            GeeGuardConfiguration.Builder.class.getMethod("setDevInfo", cls).invoke(objNewInstance, Boolean.TRUE);
            GeeGuardConfiguration.Builder.class.getMethod("setLevel", Integer.TYPE).invoke(objNewInstance, 1);
            GeeGuardConfiguration.Builder.class.getMethod("addSignature", String.class).invoke(objNewInstance, str);
            Object objInvoke = GeeGuard.class.getMethod("getData", Context.class, GeeGuardConfiguration.class).invoke(null, context, GeeGuardConfiguration.Builder.class.getMethod("build", new Class[0]).invoke(objNewInstance, new Object[0]));
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static String a(@Nullable Context context, @NotNull String str) {
        Map<String, String> map;
        if (context != null) {
            try {
                StringBuilder sb = new StringBuilder();
                ae.b bVar = ae.a;
                ae aeVarA = ae.b.a(str);
                JSONObject jSONObject = new JSONObject(URLDecoder.decode((aeVarA == null || (map = aeVarA.a().b) == null) ? null : map.get("data"), Constants.UTF_8));
                String string = jSONObject.getString("challenge");
                sb.append(jSONObject.getString("captchaId"));
                sb.append(string);
                sb.append(context.getPackageName());
                sb.append("1.7.6");
                ag agVar = ag.a;
                ag.a("Sign content: ".concat(String.valueOf(sb)));
                return b(context, sb.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
