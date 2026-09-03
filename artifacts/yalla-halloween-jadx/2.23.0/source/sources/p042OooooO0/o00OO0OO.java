package p042OooooO0;

import androidx.annotation.IntRange;
import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO0OO extends o00O00o0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1794OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f1795OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f1796OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f1797OooO0o0;

    public static final class OooO00o extends o00O00o0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Integer f1798OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Integer f1799OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Integer f1800OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Integer f1801OooO0Oo;
    }

    public o00OO0OO(int i, int i2, int i3, int i4) {
        this.f1794OooO0O0 = i;
        this.f1795OooO0OO = i2;
        this.f1796OooO0Oo = i3;
        this.f1797OooO0o0 = i4;
    }

    @Override // p042OooooO0.o00O00o0
    public final int OooO00o() {
        return this.f1797OooO0o0;
    }

    @Override // p042OooooO0.o00O00o0
    public final int OooO0O0() {
        return this.f1794OooO0O0;
    }

    @Override // p042OooooO0.o00O00o0
    @IntRange(from = 1)
    public final int OooO0Oo() {
        return this.f1796OooO0Oo;
    }

    @Override // p042OooooO0.o00O00o0
    @IntRange(from = 1)
    public final int OooO0o0() {
        return this.f1795OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00O00o0)) {
            return false;
        }
        o00O00o0 o00o00o1 = (o00O00o0) obj;
        return this.f1794OooO0O0 == o00o00o1.OooO0O0() && this.f1795OooO0OO == o00o00o1.OooO0o0() && this.f1796OooO0Oo == o00o00o1.OooO0Oo() && this.f1797OooO0o0 == o00o00o1.OooO00o();
    }

    public final int hashCode() {
        return ((((((this.f1794OooO0O0 ^ 1000003) * 1000003) ^ this.f1795OooO0OO) * 1000003) ^ this.f1796OooO0Oo) * 1000003) ^ this.f1797OooO0o0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSettings{audioSource=");
        sb.append(this.f1794OooO0O0);
        sb.append(", sampleRate=");
        sb.append(this.f1795OooO0OO);
        sb.append(", channelCount=");
        sb.append(this.f1796OooO0Oo);
        sb.append(", audioFormat=");
        return OooOO0.OooO0O0(sb, this.f1797OooO0o0, "}");
    }
}
