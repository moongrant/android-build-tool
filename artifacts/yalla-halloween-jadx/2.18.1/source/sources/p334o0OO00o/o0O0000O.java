package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzke;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0000O implements o0oO0Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0O0000O f37359OooO00o = new o0O0000O();

    @Override // p334o0OO00o.o0oO0Ooo
    public final o0O00OOO OooO00o(Class cls) {
        if (!zzke.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (o0O00OOO) zzke.OooO(cls.asSubclass(zzke.class)).OooOO0(3);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // p334o0OO00o.o0oO0Ooo
    public final boolean OooO0O0(Class cls) {
        return zzke.class.isAssignableFrom(cls);
    }
}
