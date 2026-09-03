package p393o0OOooo0;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o0Oo0oo f38928OooO0o0 = new o0Oo0oo(o0OO00O.f38924OooO0O0, 0, 0, 0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f38929OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OO00O f38930OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f38931OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f38932OooO0Oo;

    public o0Oo0oo(o0OO00O o0oo00o2, int i, int i2, int i3) {
        this.f38930OooO0O0 = o0oo00o2;
        this.f38929OooO00o = i;
        this.f38931OooO0OO = i2;
        this.f38932OooO0Oo = i3;
    }

    public final o0Oo0oo OooO00o(int i) {
        int i2;
        o0OO00O o0ooo0o2 = this.f38930OooO0O0;
        int i3 = this.f38929OooO00o;
        int i4 = this.f38932OooO0Oo;
        if (i3 == 4 || i3 == 2) {
            int i5 = o0ooOOo.f38934OooO0OO[i3][0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            Objects.requireNonNull(o0ooo0o2);
            i4 += i7;
            o0ooo0o2 = new o0OOO0o(o0ooo0o2, i6, i7);
            i3 = 0;
        }
        int i8 = this.f38931OooO0OO;
        if (i8 == 0 || i8 == 31) {
            i2 = 18;
        } else {
            i2 = i8 == 62 ? 9 : 8;
        }
        int i9 = i8 + 1;
        o0Oo0oo o0oo0oo2 = new o0Oo0oo(o0ooo0o2, i3, i9, i4 + i2);
        return i9 == 2078 ? o0oo0oo2.OooO0O0(i + 1) : o0oo0oo2;
    }

    public final o0Oo0oo OooO0O0(int i) {
        int i2 = this.f38931OooO0OO;
        if (i2 == 0) {
            return this;
        }
        o0OO00O o0oo00o2 = this.f38930OooO0O0;
        Objects.requireNonNull(o0oo00o2);
        return new o0Oo0oo(new o00Ooo(o0oo00o2, i - i2, i2), this.f38929OooO00o, 0, this.f38932OooO0Oo);
    }

    public final boolean OooO0OO(o0Oo0oo o0oo0oo2) {
        int i;
        int i2 = this.f38932OooO0Oo + (o0ooOOo.f38934OooO0OO[this.f38929OooO00o][o0oo0oo2.f38929OooO00o] >> 16);
        int i3 = o0oo0oo2.f38931OooO0OO;
        if (i3 > 0 && ((i = this.f38931OooO0OO) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= o0oo0oo2.f38932OooO0Oo;
    }

    public final o0Oo0oo OooO0Oo(int i, int i2) {
        int i3 = this.f38932OooO0Oo;
        o0OO00O o0ooo0o2 = this.f38930OooO0O0;
        int i4 = this.f38929OooO00o;
        if (i != i4) {
            int i5 = o0ooOOo.f38934OooO0OO[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            Objects.requireNonNull(o0ooo0o2);
            i3 += i7;
            o0ooo0o2 = new o0OOO0o(o0ooo0o2, i6, i7);
        }
        int i8 = i == 2 ? 4 : 5;
        Objects.requireNonNull(o0ooo0o2);
        return new o0Oo0oo(new o0OOO0o(o0ooo0o2, i2, i8), i, 0, i3 + i8);
    }

    public final o0Oo0oo OooO0o0(int i, int i2) {
        o0OO00O o0oo00o2 = this.f38930OooO0O0;
        int i3 = this.f38929OooO00o;
        int i4 = i3 == 2 ? 4 : 5;
        int i5 = o0ooOOo.f38936OooO0o0[i3][i];
        Objects.requireNonNull(o0oo00o2);
        return new o0Oo0oo(new o0OOO0o(new o0OOO0o(o0oo00o2, i5, i4), i2, 5), this.f38929OooO00o, 0, this.f38932OooO0Oo + i4 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", o0ooOOo.f38933OooO0O0[this.f38929OooO00o], Integer.valueOf(this.f38932OooO0Oo), Integer.valueOf(this.f38931OooO0OO));
    }
}
