package p446o0OoOoO;

import OooO00o.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0Oo extends o000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final char f40264OooO00o;

    public o000O0Oo(char c) {
        this.f40264OooO00o = c;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("CharMatcher.is('");
        int i = this.f40264OooO00o;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        sbOooO0o0.append(String.copyValueOf(cArr));
        sbOooO0o0.append("')");
        return sbOooO0o0.toString();
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c) {
        return c == this.f40264OooO00o;
    }
}
