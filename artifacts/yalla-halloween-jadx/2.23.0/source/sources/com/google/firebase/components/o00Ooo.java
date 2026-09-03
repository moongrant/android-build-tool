package com.google.firebase.components;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import p069o0000ooO.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo<T> implements p298o0O0o00o.OooO0OO<T>, p298o0O0o00o.OooO0O0<T> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0O0O00 f19839OooO0OO = new o0O0O00();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00O0O f19840OooO0Oo = new o00O0O();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("this")
    public o0O0o00o.OooO0O0.OooO00o<T> f19841OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile p298o0O0o00o.OooO0OO<T> f19842OooO0O0;

    public o00Ooo(o0O0O00 o0o0o00, p298o0O0o00o.OooO0OO oooO0OO) {
        this.f19841OooO00o = o0o0o00;
        this.f19842OooO0O0 = oooO0OO;
    }

    public final void OooO00o(@NonNull final o0O0o00o.OooO0O0.OooO00o<T> oooO00o) {
        p298o0O0o00o.OooO0OO<T> oooO0OO;
        p298o0O0o00o.OooO0OO<T> oooO0OO2;
        p298o0O0o00o.OooO0OO<T> oooO0OO3 = this.f19842OooO0O0;
        o00O0O o00o0o2 = f19840OooO0Oo;
        if (oooO0OO3 != o00o0o2) {
            oooO00o.OooO00o(oooO0OO3);
            return;
        }
        synchronized (this) {
            oooO0OO = this.f19842OooO0O0;
            if (oooO0OO != o00o0o2) {
                oooO0OO2 = oooO0OO;
            } else {
                final o0O0o00o.OooO0O0.OooO00o<T> oooO00o2 = this.f19841OooO00o;
                this.f19841OooO00o = new o0O0o00o.OooO0O0.OooO00o() { // from class: com.google.firebase.components.o00Oo0
                    @Override // o0O0o00o.OooO0O0.OooO00o
                    public final void OooO00o(p298o0O0o00o.OooO0OO oooO0OO4) {
                        oooO00o2.OooO00o(oooO0OO4);
                        oooO00o.OooO00o(oooO0OO4);
                    }
                };
                oooO0OO2 = null;
            }
        }
        if (oooO0OO2 != null) {
            oooO00o.OooO00o(oooO0OO);
        }
    }

    @Override // p298o0O0o00o.OooO0OO
    public final T get() {
        return this.f19842OooO0O0.get();
    }
}
