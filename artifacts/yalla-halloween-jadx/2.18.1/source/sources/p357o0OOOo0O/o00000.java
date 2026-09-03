package p357o0OOOo0O;

import android.support.v4.media.OooO00o;
import com.umeng.analytics.pro.d;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<?> f38321OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f38322OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f38323OooO0OO;

    public o00000(Class<?> cls, int i, int i2) {
        this.f38321OooO00o = cls;
        this.f38322OooO0O0 = i;
        this.f38323OooO0OO = i2;
    }

    public final boolean OooO00o() {
        return this.f38322OooO0O0 == 2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o00000)) {
            return false;
        }
        o00000 o00000Var = (o00000) obj;
        return this.f38321OooO00o == o00000Var.f38321OooO00o && this.f38322OooO0O0 == o00000Var.f38322OooO0O0 && this.f38323OooO0OO == o00000Var.f38323OooO0OO;
    }

    public final int hashCode() {
        return ((((this.f38321OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f38322OooO0O0) * 1000003) ^ this.f38323OooO0OO;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f38321OooO00o);
        sb.append(", type=");
        int i = this.f38322OooO0O0;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.f38323OooO0OO;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = d.M;
        } else {
            if (i2 != 2) {
                throw new AssertionError(OooO00o.OooO00o("Unsupported injection: ", i2));
            }
            str2 = "deferred";
        }
        return OooO.OooO00o(sb, str2, "}");
    }
}
