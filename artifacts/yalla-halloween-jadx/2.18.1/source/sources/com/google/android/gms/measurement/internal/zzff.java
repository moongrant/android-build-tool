package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.MainThread;
import o0OO0OoO.OooO00o;
import o0OO0OoO.Oooo0;
import o0OO0OoO.o000OOo;

/* JADX INFO: loaded from: classes2.dex */
public final class zzff implements ServiceConnection {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f16167OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ zzfg f16168OooO0O0;

    public zzff(zzfg zzfgVar, String str) {
        this.f16168OooO0O0 = zzfgVar;
        this.f16167OooO00o = str;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            OooO00o.OooO0O0(this.f16168OooO0O0.f16169OooO00o, "Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzbr zzbrVarZzb = com.google.android.gms.internal.measurement.zzbq.zzb(iBinder);
            if (zzbrVarZzb == null) {
                this.f16168OooO0O0.f16169OooO00o.zzay().zzk().zza("Install Referrer Service implementation was not found");
            } else {
                this.f16168OooO0O0.f16169OooO00o.zzay().zzj().zza("Install Referrer Service connected");
                this.f16168OooO0O0.f16169OooO00o.zzaz().zzp(new o000OOo(this, zzbrVarZzb, this));
            }
        } catch (RuntimeException e) {
            this.f16168OooO0O0.f16169OooO00o.zzay().zzk().zzb("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        Oooo0.OooO00o(this.f16168OooO0O0.f16169OooO00o, "Install Referrer Service disconnected");
    }
}
