package p267o00oooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0000o0 extends oO0000Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final char f40404OooO00o;

    public oO0000o0(char c) {
        this.f40404OooO00o = c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i = this.f40404OooO00o;
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
        return c == this.f40404OooO00o;
    }
}
