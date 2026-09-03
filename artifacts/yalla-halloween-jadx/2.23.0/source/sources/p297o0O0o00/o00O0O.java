package p297o0O0o00;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O extends oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f42390OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<String> f42391OooO0O0;

    public o00O0O(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f42390OooO00o = str;
        this.f42391OooO0O0 = arrayList;
    }

    @Override // p297o0O0o00.oo0o0Oo
    public final List<String> OooO00o() {
        return this.f42391OooO0O0;
    }

    @Override // p297o0O0o00.oo0o0Oo
    public final String OooO0O0() {
        return this.f42390OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oo0o0Oo)) {
            return false;
        }
        oo0o0Oo oo0o0oo = (oo0o0Oo) obj;
        return this.f42390OooO00o.equals(oo0o0oo.OooO0O0()) && this.f42391OooO0O0.equals(oo0o0oo.OooO00o());
    }

    public final int hashCode() {
        return ((this.f42390OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f42391OooO0O0.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f42390OooO00o + ", usedDates=" + this.f42391OooO0O0 + "}";
    }
}
