package p265o00oooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00O extends o0O00O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final char f41074OooO00o;

    public o0O00O(char c) {
        this.f41074OooO00o = c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i = this.f41074OooO00o;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c) {
        return c == this.f41074OooO00o;
    }
}
