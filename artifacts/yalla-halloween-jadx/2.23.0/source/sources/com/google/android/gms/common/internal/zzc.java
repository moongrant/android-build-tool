package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzc {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public Object f15155OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f15156OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f15157OooO0OO;

    public zzc(BaseGmsClient baseGmsClient, Object obj) {
        this.f15157OooO0OO = baseGmsClient;
        this.f15155OooO00o = obj;
    }

    public abstract void OooO00o();

    public abstract void OooO0O0();

    public final void zze() {
        Object obj;
        synchronized (this) {
            obj = this.f15155OooO00o;
            if (this.f15156OooO0O0) {
                Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            OooO00o();
        }
        synchronized (this) {
            this.f15156OooO0O0 = true;
        }
        zzg();
    }

    public final void zzf() {
        synchronized (this) {
            this.f15155OooO00o = null;
        }
    }

    public final void zzg() {
        zzf();
        synchronized (this.f15157OooO0OO.f15025OooOOo) {
            this.f15157OooO0OO.f15025OooOOo.remove(this);
        }
    }
}
