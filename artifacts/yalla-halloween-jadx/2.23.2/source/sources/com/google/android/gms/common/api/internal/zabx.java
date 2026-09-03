package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zabx extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public Context f14418OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final zabw f14419OooO0O0;

    public zabx(zabw zabwVar) {
        this.f14419OooO0O0 = zabwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f14419OooO0O0.zaa();
            zab();
        }
    }

    public final void zaa(Context context) {
        this.f14418OooO00o = context;
    }

    public final synchronized void zab() {
        Context context = this.f14418OooO00o;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f14418OooO00o = null;
    }
}
