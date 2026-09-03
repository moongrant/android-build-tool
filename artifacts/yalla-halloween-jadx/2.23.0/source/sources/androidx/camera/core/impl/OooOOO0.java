package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f3586OooO00o;

    public OooOOO0(Object obj) {
        this.f3586OooO00o = obj;
    }

    @Override // androidx.camera.core.impl.o000Oo0
    @NonNull
    public final Object OooO00o() {
        return this.f3586OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o000Oo0) {
            return this.f3586OooO00o.equals(((o000Oo0) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return this.f3586OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.f3586OooO00o + "}";
    }
}
