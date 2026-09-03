package p362o0OOOoo;

import OooO00o.OooO00o;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o extends o0ooOOo.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f38541OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f38542OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f38543OooO0OO;

    public oo000o(boolean z) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        Objects.requireNonNull(str, "Null osRelease");
        this.f38541OooO00o = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.f38542OooO0O0 = str2;
        this.f38543OooO0OO = z;
    }

    @Override // o0OOOoo.o0ooOOo.OooO0OO
    public final boolean OooO00o() {
        return this.f38543OooO0OO;
    }

    @Override // o0OOOoo.o0ooOOo.OooO0OO
    public final String OooO0O0() {
        return this.f38542OooO0O0;
    }

    @Override // o0OOOoo.o0ooOOo.OooO0OO
    public final String OooO0OO() {
        return this.f38541OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0ooOOo.OooO0OO)) {
            return false;
        }
        o0ooOOo.OooO0OO oooO0OO = (o0ooOOo.OooO0OO) obj;
        return this.f38541OooO00o.equals(oooO0OO.OooO0OO()) && this.f38542OooO0O0.equals(oooO0OO.OooO0O0()) && this.f38543OooO0OO == oooO0OO.OooO00o();
    }

    public final int hashCode() {
        return ((((this.f38541OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f38542OooO0O0.hashCode()) * 1000003) ^ (this.f38543OooO0OO ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("OsData{osRelease=");
        sbOooO0o0.append(this.f38541OooO00o);
        sbOooO0o0.append(", osCodeName=");
        sbOooO0o0.append(this.f38542OooO0O0);
        sbOooO0o0.append(", isRooted=");
        sbOooO0o0.append(this.f38543OooO0OO);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
