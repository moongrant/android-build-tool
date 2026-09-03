package p045Oooooo;

import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends o00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f1843OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f1844OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f1845OooO0oO;

    public OooOo00(int i, int i2, int i3) {
        this.f1844OooO0o0 = i;
        this.f1843OooO0o = i2;
        this.f1845OooO0oO = i3;
    }

    @Override // p045Oooooo.o00
    public final int OooO00o() {
        return this.f1845OooO0oO;
    }

    @Override // p045Oooooo.o00
    public final int OooO0O0() {
        return this.f1844OooO0o0;
    }

    @Override // p045Oooooo.o00
    public final int OooO0OO() {
        return this.f1843OooO0o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00)) {
            return false;
        }
        o00 o00Var = (o00) obj;
        return this.f1844OooO0o0 == o00Var.OooO0O0() && this.f1843OooO0o == o00Var.OooO0OO() && this.f1845OooO0oO == o00Var.OooO00o();
    }

    public final int hashCode() {
        return ((((this.f1844OooO0o0 ^ 1000003) * 1000003) ^ this.f1843OooO0o) * 1000003) ^ this.f1845OooO0oO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb.append(this.f1844OooO0o0);
        sb.append(", transfer=");
        sb.append(this.f1843OooO0o);
        sb.append(", range=");
        return OooOO0.OooO00o(sb, this.f1845OooO0oO, "}");
    }
}
