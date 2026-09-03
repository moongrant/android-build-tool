package p412o0Oo0o00;

import p058o0000OoO.OooO;
import p413o0Oo0o0O.o000000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f39286OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f39287OooO0O0;

    public o0000Ooo(String str, String str2) {
        this.f39286OooO00o = str;
        this.f39287OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o0000Ooo) {
            o0000Ooo o0000ooo = (o0000Ooo) obj;
            if (o000000.OooO0o(this.f39286OooO00o, o0000ooo.f39286OooO00o) && o000000.OooO0o(this.f39287OooO0O0, o0000ooo.f39287OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f39287OooO0O0;
        int iHashCode = (899 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39286OooO00o;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f39286OooO00o);
        sb.append(" realm=\"");
        return OooO.OooO00o(sb, this.f39287OooO0O0, "\"");
    }
}
