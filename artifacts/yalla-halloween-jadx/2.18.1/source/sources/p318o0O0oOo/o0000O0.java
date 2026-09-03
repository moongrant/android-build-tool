package p318o0O0oOo;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f36693OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Object f36694OooO0O0;

    public /* synthetic */ o0000O0(String str) {
        this.f36694OooO0O0 = str;
        this.f36693OooO00o = 0;
    }

    public final void OooO00o(long j) {
        int i = this.f36693OooO00o;
        Object obj = this.f36694OooO0O0;
        if (i == ((long[]) obj).length) {
            this.f36694OooO0O0 = Arrays.copyOf((long[]) obj, i * 2);
        }
        long[] jArr = (long[]) this.f36694OooO0O0;
        int i2 = this.f36693OooO00o;
        this.f36693OooO00o = i2 + 1;
        jArr[i2] = j;
    }

    public final long OooO0O0(int i) {
        if (i >= 0 && i < this.f36693OooO00o) {
            return ((long[]) this.f36694OooO0O0)[i];
        }
        int i2 = this.f36693OooO00o;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final String OooO0OO() {
        int i = this.f36693OooO00o;
        if (i == -1) {
            return null;
        }
        int iIndexOf = ((String) this.f36694OooO0O0).indexOf(46, i);
        if (iIndexOf == -1) {
            String strSubstring = ((String) this.f36694OooO0O0).substring(this.f36693OooO00o);
            this.f36693OooO00o = -1;
            return strSubstring;
        }
        String strSubstring2 = ((String) this.f36694OooO0O0).substring(this.f36693OooO00o, iIndexOf);
        this.f36693OooO00o = iIndexOf + 1;
        return strSubstring2;
    }
}
