package com.efs.sdk.base.core.config.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.efs.sdk.base.IConfigRefreshAction;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.efs.sdk.base.http.HttpResponse;
import java.util.HashMap;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class a implements IConfigRefreshAction {

    /* JADX INFO: renamed from: com.efs.sdk.base.core.config.a.a$a, reason: collision with other inner class name */
    public static class C0087a {
        private static final a a = new a();
    }

    public static a a() {
        return C0087a.a;
    }

    @Override // com.efs.sdk.base.IConfigRefreshAction
    @NonNull
    public final String refresh() {
        String str = "";
        if (!NetworkUtil.isConnected(ControllerCenter.getGlobalEnvStruct().mAppContext)) {
            com.efs.sdk.base.core.util.d.a("efs.config", "Config refresh fail, network is disconnected.");
            return "";
        }
        String strA = c.a().a(true);
        com.efs.sdk.base.core.a.c cVarA = com.efs.sdk.base.core.a.c.a();
        for (int i = 0; i < 3; i++) {
            com.efs.sdk.base.core.a.a aVarA = com.efs.sdk.base.core.a.a.a();
            String strB = cVarA.b();
            String strOooO0Oo = OooOo00.OooO0Oo(strA, "/apm_cc");
            if (aVarA.a) {
                com.efs.sdk.base.core.util.d.a("efs.px.api", "get config from server, url is ".concat(String.valueOf(strOooO0Oo)));
            }
            HashMap map = new HashMap(1);
            map.put("wpk-header", strB);
            com.efs.sdk.base.core.util.b.c cVarA2 = new com.efs.sdk.base.core.util.b.d(strOooO0Oo).a(map).a(com.efs.sdk.base.core.a.b.a()).a();
            cVarA2.a.e = "get";
            HttpResponse httpResponseA = cVarA2.a();
            if (httpResponseA.succ) {
                str = httpResponseA.data;
                break;
            }
            if (TextUtils.isEmpty(httpResponseA.getBizCode()) || !"1000".equals(httpResponseA.getBizCode())) {
                return "";
            }
        }
        com.efs.sdk.base.core.util.d.a("efs.config", "config request succ, config is:\n ".concat(String.valueOf(str)));
        return str;
    }
}
