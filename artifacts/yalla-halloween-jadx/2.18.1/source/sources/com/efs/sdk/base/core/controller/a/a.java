package com.efs.sdk.base.core.controller.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.efs.sdk.base.core.config.b;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.efs.sdk.base.core.util.a.d;

/* JADX INFO: loaded from: classes.dex */
public final class a extends BroadcastReceiver implements Runnable {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        d.a(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = b.a.a;
        String networkType = NetworkUtil.getNetworkType(ControllerCenter.getGlobalEnvStruct().mAppContext);
        com.efs.sdk.base.core.util.d.a("efs.info.manager", "network change: ".concat(String.valueOf(networkType)), null);
        bVar.a.a("net", networkType);
    }
}
