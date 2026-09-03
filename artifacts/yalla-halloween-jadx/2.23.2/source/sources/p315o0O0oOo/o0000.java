package p315o0O0oOo;

import javax.annotation.Nonnull;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000 extends o0000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f41884OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f41885OooO0O0;

    public o0000(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f41884OooO00o = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f41885OooO0O0 = str2;
    }

    @Override // p315o0O0oOo.o0000O0
    @Nonnull
    public final String OooO00o() {
        return this.f41884OooO00o;
    }

    @Override // p315o0O0oOo.o0000O0
    @Nonnull
    public final String OooO0O0() {
        return this.f41885OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0000O0)) {
            return false;
        }
        o0000O0 o0000o1 = (o0000O0) obj;
        return this.f41884OooO00o.equals(o0000o1.OooO00o()) && this.f41885OooO0O0.equals(o0000o1.OooO0O0());
    }

    public final int hashCode() {
        return ((this.f41884OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f41885OooO0O0.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f41884OooO00o);
        sb.append(", version=");
        return o0oOO.OooO0O0(sb, this.f41885OooO0O0, "}");
    }
}
