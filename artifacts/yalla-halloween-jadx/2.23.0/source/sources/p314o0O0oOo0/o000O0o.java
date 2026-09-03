package p314o0O0oOo0;

import javax.annotation.Nonnull;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0o extends o000O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f42591OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f42592OooO0O0;

    public o000O0o(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f42591OooO00o = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f42592OooO0O0 = str2;
    }

    @Override // p314o0O0oOo0.o000O00O
    @Nonnull
    public final String OooO00o() {
        return this.f42591OooO00o;
    }

    @Override // p314o0O0oOo0.o000O00O
    @Nonnull
    public final String OooO0O0() {
        return this.f42592OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000O00O)) {
            return false;
        }
        o000O00O o000o00o2 = (o000O00O) obj;
        return this.f42591OooO00o.equals(o000o00o2.OooO00o()) && this.f42592OooO0O0.equals(o000o00o2.OooO0O0());
    }

    public final int hashCode() {
        return ((this.f42591OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f42592OooO0O0.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f42591OooO00o);
        sb.append(", version=");
        return o0O00o0.OooO0O0(sb, this.f42592OooO0O0, "}");
    }
}
