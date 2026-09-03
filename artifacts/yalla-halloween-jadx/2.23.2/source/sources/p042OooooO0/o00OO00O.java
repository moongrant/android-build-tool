package p042OooooO0;

import androidx.annotation.IntRange;
import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO00O extends oOO00O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1780OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f1781OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f1782OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f1783OooO0o0;

    public static final class OooO00o extends oOO00O.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Integer f1784OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Integer f1785OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Integer f1786OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Integer f1787OooO0Oo;
    }

    public o00OO00O(int i, int i2, int i3, int i4) {
        this.f1780OooO0O0 = i;
        this.f1781OooO0OO = i2;
        this.f1782OooO0Oo = i3;
        this.f1783OooO0o0 = i4;
    }

    @Override // p042OooooO0.oOO00O
    public final int OooO00o() {
        return this.f1783OooO0o0;
    }

    @Override // p042OooooO0.oOO00O
    public final int OooO0O0() {
        return this.f1780OooO0O0;
    }

    @Override // p042OooooO0.oOO00O
    @IntRange(from = 1)
    public final int OooO0Oo() {
        return this.f1782OooO0Oo;
    }

    @Override // p042OooooO0.oOO00O
    @IntRange(from = 1)
    public final int OooO0o0() {
        return this.f1781OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oOO00O)) {
            return false;
        }
        oOO00O ooo00o = (oOO00O) obj;
        return this.f1780OooO0O0 == ooo00o.OooO0O0() && this.f1781OooO0OO == ooo00o.OooO0o0() && this.f1782OooO0Oo == ooo00o.OooO0Oo() && this.f1783OooO0o0 == ooo00o.OooO00o();
    }

    public final int hashCode() {
        return ((((((this.f1780OooO0O0 ^ 1000003) * 1000003) ^ this.f1781OooO0OO) * 1000003) ^ this.f1782OooO0Oo) * 1000003) ^ this.f1783OooO0o0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSettings{audioSource=");
        sb.append(this.f1780OooO0O0);
        sb.append(", sampleRate=");
        sb.append(this.f1781OooO0OO);
        sb.append(", channelCount=");
        sb.append(this.f1782OooO0Oo);
        sb.append(", audioFormat=");
        return OooOO0.OooO00o(sb, this.f1783OooO0o0, "}");
    }
}
