package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00O0o implements o0O0OOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0O00O0o f15535OooO00o = new o0O00O0o();

    @Override // com.google.android.gms.internal.measurement.o0O0OOO0
    public final o0O0OO0 OooO00o(Class cls) {
        if (!zzlb.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (o0O0OO0) zzlb.OooO0o0(cls.asSubclass(zzlb.class)).OooOO0o(3);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0O0OOO0
    public final boolean OooO0O0(Class cls) {
        return zzlb.class.isAssignableFrom(cls);
    }
}
