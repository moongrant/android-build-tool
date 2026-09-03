package p433o0OoOO0o;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements o0O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f39920OooO00o = 4;

    public o0(int i) {
    }

    @Override // p433o0OoOO0o.o0O000
    public final void OooO00o(String str, String str2) {
        OooO0O0(str, str2, null);
    }

    @Override // p433o0OoOO0o.o0O000
    public final void OooO0O0(String str, String str2, Throwable th) {
        if (OooO0o0(6)) {
            Log.e(str, str2, th);
        }
    }

    @Override // p433o0OoOO0o.o0O000
    public final void OooO0OO(String str, String str2) {
        if (OooO0o0(3)) {
            Log.d(str, str2, null);
        }
    }

    @Override // p433o0OoOO0o.o0O000
    public final void OooO0Oo(String str) {
        if (OooO0o0(5)) {
            Log.w("Twitter", str, null);
        }
    }

    public final boolean OooO0o0(int i) {
        return this.f39920OooO00o <= i;
    }

    public o0() {
    }
}
