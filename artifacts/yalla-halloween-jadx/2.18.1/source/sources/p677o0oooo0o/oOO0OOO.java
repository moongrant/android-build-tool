package p677o0oooo0o;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0OOO extends oO0OO0O implements oOO00000 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final char[] f52176Oooo0o;

    public oOO0OOO(char[] cArr) {
        this.f52176Oooo0o = cArr;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooO(oO0OO0O oo0oo0o) {
        if (!(oo0oo0o instanceof oOO0OOO)) {
            return false;
        }
        char[] cArr = this.f52176Oooo0o;
        char[] cArr2 = ((oOO0OOO) oo0oo0o).f52176Oooo0o;
        if (cArr != cArr2) {
            if (cArr == null || cArr2 == null || cArr.length != cArr2.length) {
                return false;
            }
            for (int i = 0; i != cArr.length; i++) {
                if (cArr[i] != cArr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // p677o0oooo0o.oOO00000
    public final String OooO0OO() {
        return new String(this.f52176Oooo0o);
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final void OooOO0(oO0OO00 oo0oo00) throws IOException {
        oo0oo00.OooO0OO(30);
        oo0oo00.OooO0oo(this.f52176Oooo0o.length * 2);
        int i = 0;
        while (true) {
            char[] cArr = this.f52176Oooo0o;
            if (i == cArr.length) {
                return;
            }
            char c = cArr[i];
            oo0oo00.OooO0OO((byte) (c >> '\b'));
            oo0oo00.OooO0OO((byte) c);
            i++;
        }
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final int OooOO0O() {
        return (this.f52176Oooo0o.length * 2) + m.OooO00o(this.f52176Oooo0o.length * 2) + 1;
    }

    @Override // p677o0oooo0o.oO0OO0O
    public final boolean OooOOO0() {
        return false;
    }

    @Override // p677o0oooo0o.oO0OO0O, p677o0oooo0o.oOo0o0oO
    public final int hashCode() {
        char[] cArr = this.f52176Oooo0o;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    public final String toString() {
        return OooO0OO();
    }
}
