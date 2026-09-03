package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzc {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public Object f14679OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f14680OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f14681OooO0OO;

    public zzc(BaseGmsClient baseGmsClient, Object obj) {
        this.f14681OooO0OO = baseGmsClient;
        this.f14679OooO00o = obj;
    }

    public abstract void OooO00o();

    public abstract void OooO0O0();

    public final void zze() {
        Object obj;
        synchronized (this) {
            obj = this.f14679OooO00o;
            if (this.f14680OooO0O0) {
                Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            OooO00o();
        }
        synchronized (this) {
            this.f14680OooO0O0 = true;
        }
        zzg();
    }

    public final void zzf() {
        synchronized (this) {
            this.f14679OooO00o = null;
        }
    }

    public final void zzg() {
        zzf();
        synchronized (this.f14681OooO0OO.f14549OooOOo) {
            this.f14681OooO0OO.f14549OooOOo.remove(this);
        }
    }
}
