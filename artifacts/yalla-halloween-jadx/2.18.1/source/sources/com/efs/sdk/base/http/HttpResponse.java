package com.efs.sdk.base.http;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.efs.sdk.base.core.d.d;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o;
import p100o000oOoO.o0;

/* JADX INFO: loaded from: classes.dex */
public class HttpResponse extends d<Map<String, String>> {
    private static final String KEY_BIZ_CODE = "biz_code";
    private static final String KEY_REQUEST_URL = "req_url";
    public static final int REQUEST_ERROR_DEFAULT = -1;
    public static final int REQUEST_ERROR_NETWORK_DISCONNECT = -2;
    public static final int REQUEST_ERROR_SOCKET_TIMEOUT = -3;

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.HashMap] */
    public HttpResponse() {
        this.extra = new HashMap();
    }

    public String getBizCode() {
        return !((Map) this.extra).containsKey(KEY_BIZ_CODE) ? "" : (String) ((Map) this.extra).get(KEY_BIZ_CODE);
    }

    public int getHttpCode() {
        return this.f12669code;
    }

    public String getReqUrl() {
        return !((Map) this.extra).containsKey(KEY_REQUEST_URL) ? "" : (String) ((Map) this.extra).get(KEY_REQUEST_URL);
    }

    public void setBizCode(@NonNull String str) {
        ((Map) this.extra).put(KEY_BIZ_CODE, str);
    }

    public void setHttpCode(int i) {
        this.succ = (i >= 200 && i < 300) || i == 304;
        this.f12669code = i;
    }

    public void setReqUrl(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (str.contains("?")) {
            str = str.substring(0, str.indexOf("?"));
        }
        ((Map) this.extra).put(KEY_REQUEST_URL, str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpResponse {succ=");
        sb.append(this.succ);
        sb.append(", code=");
        sb.append(this.f12669code);
        sb.append(", data='");
        OooO00o.OooO00o(sb, this.data, '\'', ", extra=");
        return o0.OooO00o(sb, this.extra, '}');
    }
}
