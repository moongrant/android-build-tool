package com.efs.sdk.base.core.b;

import android.os.Handler;
import android.os.Message;
import android.support.v4.media.session.OooOOO0;
import android.text.TextUtils;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.facebook.AuthenticationTokenClaims;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Handler implements Runnable {
    public boolean a;

    public static class a {
        private static final c a = new c(0);
    }

    public /* synthetic */ c(byte b) {
        this();
    }

    public static c a() {
        return a.a;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 2) {
            com.efs.sdk.base.core.util.a.d.a(this);
            return;
        }
        com.efs.sdk.base.core.util.d.a("efs.cache", "disk listener not support command: " + message.what, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.efs.sdk.base.core.b.a unused = com.efs.sdk.base.core.b.a.b.a;
        File fileF = com.efs.sdk.base.core.util.a.f(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (fileF.exists()) {
            for (File file : com.efs.sdk.base.core.util.b.d(fileF)) {
                if (com.efs.sdk.base.core.b.a.a(file.getName())) {
                    com.efs.sdk.base.core.b.a.c(file);
                }
            }
        }
        com.efs.sdk.base.core.config.a.c cVarA = com.efs.sdk.base.core.config.a.c.a();
        String str = cVarA.d.e.containsKey("disk_bytes") ? cVarA.d.e.get("disk_bytes") : "4194304";
        long j = Long.parseLong(TextUtils.isEmpty(str) ? "4194304" : str);
        long jC = com.efs.sdk.base.core.util.b.c(com.efs.sdk.base.core.util.a.d(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid())) + com.efs.sdk.base.core.util.b.c(com.efs.sdk.base.core.util.a.f(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid()));
        boolean z = jC < j;
        this.a = z;
        if (!z) {
            StringBuilder sb = new StringBuilder("Cache Limited! curr ");
            sb.append(jC);
            sb.append("byte, max ");
            com.efs.sdk.base.core.util.d.a("efs.cache", OooOOO0.OooO00o(sb, j, " byte."), null);
        }
        sendEmptyMessageDelayed(2, AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED);
    }

    private c() {
        super(com.efs.sdk.base.core.util.a.a.a.getLooper());
        this.a = true;
        sendEmptyMessageDelayed(2, 60000L);
    }
}
