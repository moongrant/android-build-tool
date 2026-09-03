package com.google.firebase.components;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o<T> implements p301o0O0o0O.OooO0o<T>, p301o0O0o0O.OooO0OO<T> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final com.facebook.appevents.OooOo00 f19378OooO0OO = new com.facebook.appevents.OooOo00();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00Oo0 f19379OooO0Oo = new o00Oo0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("this")
    public o0O0o0O.OooO0OO.OooO00o<T> f19380OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile p301o0O0o0O.OooO0o<T> f19381OooO0O0;

    public oo000o(com.facebook.appevents.OooOo00 oooOo00, p301o0O0o0O.OooO0o oooO0o) {
        this.f19380OooO00o = oooOo00;
        this.f19381OooO0O0 = oooO0o;
    }

    public final void OooO00o(@NonNull final o0O0o0O.OooO0OO.OooO00o<T> oooO00o) {
        p301o0O0o0O.OooO0o<T> oooO0o;
        p301o0O0o0O.OooO0o<T> oooO0o2;
        p301o0O0o0O.OooO0o<T> oooO0o3 = this.f19381OooO0O0;
        o00Oo0 o00oo1 = f19379OooO0Oo;
        if (oooO0o3 != o00oo1) {
            oooO00o.OooO00o(oooO0o3);
            return;
        }
        synchronized (this) {
            oooO0o = this.f19381OooO0O0;
            if (oooO0o != o00oo1) {
                oooO0o2 = oooO0o;
            } else {
                final o0O0o0O.OooO0OO.OooO00o<T> oooO00o2 = this.f19380OooO00o;
                this.f19380OooO00o = new o0O0o0O.OooO0OO.OooO00o() { // from class: com.google.firebase.components.o00Ooo
                    @Override // o0O0o0O.OooO0OO.OooO00o
                    public final void OooO00o(p301o0O0o0O.OooO0o oooO0o4) {
                        oooO00o2.OooO00o(oooO0o4);
                        oooO00o.OooO00o(oooO0o4);
                    }
                };
                oooO0o2 = null;
            }
        }
        if (oooO0o2 != null) {
            oooO00o.OooO00o(oooO0o);
        }
    }

    @Override // p301o0O0o0O.OooO0o
    public final T get() {
        return this.f19381OooO0O0.get();
    }
}
