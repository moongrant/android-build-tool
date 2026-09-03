package p701oO0Oo0oo;

import java.security.spec.AlgorithmParameterSpec;
import p677o0oooo0o.ooOOO0Oo;
import p679o0ooooOo.lk;
import p679o0ooooOo.nk;
import p679o0ooooOo.ok;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00Oo0 f52931OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f52932OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f52933OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f52934OooO0Oo;

    public o00O0O(String str, String str2, String str3) {
        ok okVar;
        try {
            okVar = (ok) nk.f52224OooO0O0.get(new ooOOO0Oo(str));
        } catch (IllegalArgumentException unused) {
            ooOOO0Oo ooooo0oo = (ooOOO0Oo) nk.f52223OooO00o.get(str);
            if (ooooo0oo != null) {
                str = ooooo0oo.f52198Oooo0o;
                okVar = (ok) nk.f52224OooO0O0.get(ooooo0oo);
            } else {
                okVar = null;
            }
        }
        if (okVar == null) {
            throw new IllegalArgumentException("no key parameter set for passed in name/OID.");
        }
        this.f52931OooO00o = new o00Oo0(okVar.f52230Oooo0oO.OooOOoo(), okVar.f52231Oooo0oo.OooOOoo(), okVar.f52228Oooo.OooOOoo());
        this.f52932OooO0O0 = str;
        this.f52933OooO0OO = str2;
        this.f52934OooO0Oo = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o00O0O)) {
            return false;
        }
        o00O0O o00o0o2 = (o00O0O) obj;
        if (!this.f52931OooO00o.equals(o00o0o2.f52931OooO00o) || !this.f52933OooO0OO.equals(o00o0o2.f52933OooO0OO)) {
            return false;
        }
        String str = this.f52934OooO0Oo;
        String str2 = o00o0o2.f52934OooO0Oo;
        return str == str2 || (str != null && str.equals(str2));
    }

    public final int hashCode() {
        int iHashCode = this.f52931OooO00o.hashCode() ^ this.f52933OooO0OO.hashCode();
        String str = this.f52934OooO0Oo;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }

    public o00O0O(o00Oo0 o00oo1) {
        this.f52931OooO00o = o00oo1;
        this.f52933OooO0OO = lk.f52212OooO0OO.f52198Oooo0o;
        this.f52934OooO0Oo = null;
    }
}
