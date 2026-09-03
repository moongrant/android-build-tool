package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO implements OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f10019OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0OO.OooO00o f10020OooO0o0;

    public OooO(@NonNull Context context, @NonNull com.bumptech.glide.OooOo00.OooO0O0 oooO0O0) {
        this.f10019OooO0Oo = context.getApplicationContext();
        this.f10020OooO0o0 = oooO0O0;
    }

    @Override // com.bumptech.glide.manager.Oooo000
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.Oooo000
    public final void onStart() {
        o00oO0o o00oo0oOooO00o = o00oO0o.OooO00o(this.f10019OooO0Oo);
        OooO0OO.OooO00o oooO00o = this.f10020OooO0o0;
        synchronized (o00oo0oOooO00o) {
            o00oo0oOooO00o.f10041OooO0O0.add(oooO00o);
            if (!o00oo0oOooO00o.f10042OooO0OO && !o00oo0oOooO00o.f10041OooO0O0.isEmpty()) {
                o00oo0oOooO00o.f10042OooO0OO = o00oo0oOooO00o.f10040OooO00o.OooO00o();
            }
        }
    }

    @Override // com.bumptech.glide.manager.Oooo000
    public final void onStop() {
        o00oO0o o00oo0oOooO00o = o00oO0o.OooO00o(this.f10019OooO0Oo);
        OooO0OO.OooO00o oooO00o = this.f10020OooO0o0;
        synchronized (o00oo0oOooO00o) {
            o00oo0oOooO00o.f10041OooO0O0.remove(oooO00o);
            if (o00oo0oOooO00o.f10042OooO0OO && o00oo0oOooO00o.f10041OooO0O0.isEmpty()) {
                o00oo0oOooO00o.f10040OooO00o.unregister();
                o00oo0oOooO00o.f10042OooO0OO = false;
            }
        }
    }
}
