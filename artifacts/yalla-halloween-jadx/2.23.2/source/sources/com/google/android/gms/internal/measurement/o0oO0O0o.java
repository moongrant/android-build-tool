package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oO0O0o implements o0O0OOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0OOOo[] f15138OooO00o;

    public o0oO0O0o(o0O0OOOo... o0o0ooooArr) {
        this.f15138OooO00o = o0o0ooooArr;
    }

    @Override // com.google.android.gms.internal.measurement.o0O0OOOo
    public final o0O0OOO0 OooO00o(Class cls) {
        for (int i = 0; i < 2; i++) {
            o0O0OOOo o0o0oooo = this.f15138OooO00o[i];
            if (o0o0oooo.OooO0O0(cls)) {
                return o0o0oooo.OooO00o(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.o0O0OOOo
    public final boolean OooO0O0(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.f15138OooO00o[i].OooO0O0(cls)) {
                return true;
            }
        }
        return false;
    }
}
