package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.MainThread;
import p269o00ooooo.o0OOO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfk implements ServiceConnection {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f15963OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ zzfl f15964OooO0O0;

    public zzfk(zzfl zzflVar, String str) {
        this.f15964OooO0O0 = zzflVar;
        this.f15963OooO00o = str;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzfl zzflVar = this.f15964OooO0O0;
        if (iBinder == null) {
            zzflVar.f15965OooO00o.zzaA().zzk().zza("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzbr zzbrVarZzb = com.google.android.gms.internal.measurement.zzbq.zzb(iBinder);
            if (zzbrVarZzb == null) {
                zzflVar.f15965OooO00o.zzaA().zzk().zza("Install Referrer Service implementation was not found");
            } else {
                zzflVar.f15965OooO00o.zzaA().zzj().zza("Install Referrer Service connected");
                zzflVar.f15965OooO00o.zzaB().zzp(new o0OOO0OO(this, zzbrVarZzb, this));
            }
        } catch (RuntimeException e) {
            zzflVar.f15965OooO00o.zzaA().zzk().zzb("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f15964OooO0O0.f15965OooO00o.zzaA().zzj().zza("Install Referrer Service disconnected");
    }
}
