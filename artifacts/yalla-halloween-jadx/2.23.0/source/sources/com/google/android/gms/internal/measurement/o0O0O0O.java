package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O0O implements o0O0OOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0OOO0[] f15543OooO00o;

    public o0O0O0O(o0O0OOO0... o0o0ooo0Arr) {
        this.f15543OooO00o = o0o0ooo0Arr;
    }

    @Override // com.google.android.gms.internal.measurement.o0O0OOO0
    public final o0O0OO0 OooO00o(Class cls) {
        for (int i = 0; i < 2; i++) {
            o0O0OOO0 o0o0ooo0 = this.f15543OooO00o[i];
            if (o0o0ooo0.OooO0O0(cls)) {
                return o0o0ooo0.OooO00o(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.o0O0OOO0
    public final boolean OooO0O0(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.f15543OooO00o[i].OooO0O0(cls)) {
                return true;
            }
        }
        return false;
    }
}
