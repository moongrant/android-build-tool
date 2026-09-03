package p300o0O0o00o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f41732OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<String> f41733OooO0O0;

    public OooO(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f41732OooO00o = str;
        this.f41733OooO0O0 = arrayList;
    }

    @Override // p300o0O0o00o.oo000o
    public final List<String> OooO00o() {
        return this.f41733OooO0O0;
    }

    @Override // p300o0O0o00o.oo000o
    public final String OooO0O0() {
        return this.f41732OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oo000o)) {
            return false;
        }
        oo000o oo000oVar = (oo000o) obj;
        return this.f41732OooO00o.equals(oo000oVar.OooO0O0()) && this.f41733OooO0O0.equals(oo000oVar.OooO00o());
    }

    public final int hashCode() {
        return ((this.f41732OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f41733OooO0O0.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f41732OooO00o + ", usedDates=" + this.f41733OooO0O0 + "}";
    }
}
