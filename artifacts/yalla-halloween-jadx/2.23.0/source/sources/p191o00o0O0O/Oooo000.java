package p191o00o0O0O;

import p176o00o0.OooOo;
import p176o00o0.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 extends o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0Oo0oo f38913OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f38914OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final p176o00o0.Oooo000<?> f38915OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Oooo0<?, byte[]> f38916OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOo f38917OooO0o0;

    public Oooo000(o0Oo0oo o0oo0oo2, String str, p176o00o0.Oooo000 oooo000, Oooo0 oooo0, OooOo oooOo) {
        this.f38913OooO00o = o0oo0oo2;
        this.f38914OooO0O0 = str;
        this.f38915OooO0OO = oooo000;
        this.f38916OooO0Oo = oooo0;
        this.f38917OooO0o0 = oooOo;
    }

    @Override // p191o00o0O0O.o0OOO0o
    public final OooOo OooO00o() {
        return this.f38917OooO0o0;
    }

    @Override // p191o00o0O0O.o0OOO0o
    public final p176o00o0.Oooo000<?> OooO0O0() {
        return this.f38915OooO0OO;
    }

    @Override // p191o00o0O0O.o0OOO0o
    public final Oooo0<?, byte[]> OooO0OO() {
        return this.f38916OooO0Oo;
    }

    @Override // p191o00o0O0O.o0OOO0o
    public final o0Oo0oo OooO0Oo() {
        return this.f38913OooO00o;
    }

    @Override // p191o00o0O0O.o0OOO0o
    public final String OooO0o0() {
        return this.f38914OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0OOO0o)) {
            return false;
        }
        o0OOO0o o0ooo0o2 = (o0OOO0o) obj;
        return this.f38913OooO00o.equals(o0ooo0o2.OooO0Oo()) && this.f38914OooO0O0.equals(o0ooo0o2.OooO0o0()) && this.f38915OooO0OO.equals(o0ooo0o2.OooO0O0()) && this.f38916OooO0Oo.equals(o0ooo0o2.OooO0OO()) && this.f38917OooO0o0.equals(o0ooo0o2.OooO00o());
    }

    public final int hashCode() {
        return ((((((((this.f38913OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f38914OooO0O0.hashCode()) * 1000003) ^ this.f38915OooO0OO.hashCode()) * 1000003) ^ this.f38916OooO0Oo.hashCode()) * 1000003) ^ this.f38917OooO0o0.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.f38913OooO00o + ", transportName=" + this.f38914OooO0O0 + ", event=" + this.f38915OooO0OO + ", transformer=" + this.f38916OooO0Oo + ", encoding=" + this.f38917OooO0o0 + "}";
    }
}
