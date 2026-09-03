package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f13110OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0O0.OooO00o f13111OooO0o0;

    public OooO0o(@NonNull Context context, @NonNull com.bumptech.glide.OooOo00.OooO0O0 oooO0O0) {
        this.f13110OooO0Oo = context.getApplicationContext();
        this.f13111OooO0o0 = oooO0O0;
    }

    @Override // com.bumptech.glide.manager.OooOo00
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.OooOo00
    public final void onStart() {
        o00O0O o00o0oOooO00o = o00O0O.OooO00o(this.f13110OooO0Oo);
        OooO0O0.OooO00o oooO00o = this.f13111OooO0o0;
        synchronized (o00o0oOooO00o) {
            o00o0oOooO00o.f13130OooO0O0.add(oooO00o);
            if (!o00o0oOooO00o.f13131OooO0OO && !o00o0oOooO00o.f13130OooO0O0.isEmpty()) {
                o00o0oOooO00o.f13131OooO0OO = o00o0oOooO00o.f13129OooO00o.OooO00o();
            }
        }
    }

    @Override // com.bumptech.glide.manager.OooOo00
    public final void onStop() {
        o00O0O o00o0oOooO00o = o00O0O.OooO00o(this.f13110OooO0Oo);
        OooO0O0.OooO00o oooO00o = this.f13111OooO0o0;
        synchronized (o00o0oOooO00o) {
            o00o0oOooO00o.f13130OooO0O0.remove(oooO00o);
            if (o00o0oOooO00o.f13131OooO0OO && o00o0oOooO00o.f13130OooO0O0.isEmpty()) {
                o00o0oOooO00o.f13129OooO00o.unregister();
                o00o0oOooO00o.f13131OooO0OO = false;
            }
        }
    }
}
