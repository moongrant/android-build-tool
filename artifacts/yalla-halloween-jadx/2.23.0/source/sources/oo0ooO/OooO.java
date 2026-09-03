package oo0ooO;

import com.android.billingclient.api.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO implements OooOO0 {
    public static String OooO0O0(StringBuilder sb) {
        int length = sb.length() - 0;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (sb.charAt(0) << 18) + ((length >= 2 ? sb.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? sb.charAt(2) : (char) 0) << 6) + (length >= 4 ? sb.charAt(3) : (char) 0);
        char c = (char) ((iCharAt >> 16) & 255);
        char c2 = (char) ((iCharAt >> 8) & 255);
        char c3 = (char) (iCharAt & 255);
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c);
        if (length >= 2) {
            sb2.append(c2);
        }
        if (length >= 3) {
            sb2.append(c3);
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x009b A[Catch: all -> 0x00e6, TryCatch #0 {all -> 0x00e6, blocks: (B:23:0x005a, B:28:0x0067, B:30:0x0083, B:35:0x009b, B:41:0x00ad, B:43:0x00c1, B:45:0x00d0, B:46:0x00d8, B:49:0x00de, B:50:0x00e5), top: B:54:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad A[Catch: all -> 0x00e6, TryCatch #0 {all -> 0x00e6, blocks: (B:23:0x005a, B:28:0x0067, B:30:0x0083, B:35:0x009b, B:41:0x00ad, B:43:0x00c1, B:45:0x00d0, B:46:0x00d8, B:49:0x00de, B:50:0x00e5), top: B:54:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1 A[Catch: all -> 0x00e6, TryCatch #0 {all -> 0x00e6, blocks: (B:23:0x005a, B:28:0x0067, B:30:0x0083, B:35:0x009b, B:41:0x00ad, B:43:0x00c1, B:45:0x00d0, B:46:0x00d8, B:49:0x00de, B:50:0x00e5), top: B:54:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0 A[Catch: all -> 0x00e6, TryCatch #0 {all -> 0x00e6, blocks: (B:23:0x005a, B:28:0x0067, B:30:0x0083, B:35:0x009b, B:41:0x00ad, B:43:0x00c1, B:45:0x00d0, B:46:0x00d8, B:49:0x00de, B:50:0x00e5), top: B:54:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8 A[Catch: all -> 0x00e6, TRY_LEAVE, TryCatch #0 {all -> 0x00e6, blocks: (B:23:0x005a, B:28:0x0067, B:30:0x0083, B:35:0x009b, B:41:0x00ad, B:43:0x00c1, B:45:0x00d0, B:46:0x00d8, B:49:0x00de, B:50:0x00e5), top: B:54:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00de A[Catch: all -> 0x00e6, TRY_ENTER, TryCatch #0 {all -> 0x00e6, blocks: (B:23:0x005a, B:28:0x0067, B:30:0x0083, B:35:0x009b, B:41:0x00ad, B:43:0x00c1, B:45:0x00d0, B:46:0x00d8, B:49:0x00de, B:50:0x00e5), top: B:54:0x005a }] */
    @Override // oo0ooO.OooOO0
    public final void OooO00o(OooOO0O oooOO0O) {
        String str;
        StringBuilder sb;
        boolean z;
        int i;
        String strOooO0O0;
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            boolean zOooO0OO = oooOO0O.OooO0OO();
            str = oooOO0O.f60944OooO00o;
            sb = oooOO0O.f60949OooO0o0;
            z = true;
            if (!zOooO0OO) {
                break;
            }
            char cOooO0O0 = oooOO0O.OooO0O0();
            if (cOooO0O0 >= ' ' && cOooO0O0 <= '?') {
                sb2.append(cOooO0O0);
            } else {
                if (cOooO0O0 < '@' || cOooO0O0 > '^') {
                    o0000O00.OooO0O0(cOooO0O0);
                    throw null;
                }
                sb2.append((char) (cOooO0O0 - '@'));
            }
            oooOO0O.f60948OooO0o++;
            if (sb2.length() >= 4) {
                sb.append(OooO0O0(sb2));
                sb2.delete(0, 4);
                if (o0000O00.OooO0o0(str, oooOO0O.f60948OooO0o, 4) != 4) {
                    oooOO0O.f60950OooO0oO = 0;
                    break;
                }
            }
        }
        sb2.append((char) 31);
        try {
            int length = sb2.length();
            if (length == 0) {
                oooOO0O.f60950OooO0oO = 0;
                return;
            }
            if (length == 1) {
                oooOO0O.OooO0Oo(oooOO0O.OooO00o());
                int iOooO00o = oooOO0O.f60951OooO0oo.f60954OooO0O0 - oooOO0O.OooO00o();
                int length2 = (str.length() - oooOO0O.f60943OooO) - oooOO0O.f60948OooO0o;
                if (length2 > iOooO00o) {
                    oooOO0O.OooO0Oo(oooOO0O.OooO00o() + 1);
                    iOooO00o = oooOO0O.f60951OooO0oo.f60954OooO0O0 - oooOO0O.OooO00o();
                }
                if (length2 > iOooO00o || iOooO00o > 2) {
                    if (length <= 4) {
                        throw new IllegalStateException("Count must not exceed 4");
                    }
                    i = length - 1;
                    strOooO0O0 = OooO0O0(sb2);
                    if ((!oooOO0O.OooO0OO()) || i > 2) {
                        z = false;
                    }
                    if (i <= 2) {
                        oooOO0O.OooO0Oo(oooOO0O.OooO00o() + i);
                        if (oooOO0O.f60951OooO0oo.f60954OooO0O0 - oooOO0O.OooO00o() >= 3) {
                            oooOO0O.OooO0Oo(oooOO0O.OooO00o() + strOooO0O0.length());
                            z = false;
                        }
                    }
                    if (z) {
                        oooOO0O.f60951OooO0oo = null;
                        oooOO0O.f60948OooO0o -= i;
                    } else {
                        sb.append(strOooO0O0);
                    }
                }
            } else {
                if (length <= 4) {
                    throw new IllegalStateException("Count must not exceed 4");
                }
                i = length - 1;
                strOooO0O0 = OooO0O0(sb2);
                if (!oooOO0O.OooO0OO()) {
                    z = false;
                } else {
                    z = false;
                }
                if (i <= 2) {
                    oooOO0O.OooO0Oo(oooOO0O.OooO00o() + i);
                    if (oooOO0O.f60951OooO0oo.f60954OooO0O0 - oooOO0O.OooO00o() >= 3) {
                        oooOO0O.OooO0Oo(oooOO0O.OooO00o() + strOooO0O0.length());
                        z = false;
                    }
                }
                if (z) {
                    oooOO0O.f60951OooO0oo = null;
                    oooOO0O.f60948OooO0o -= i;
                } else {
                    sb.append(strOooO0O0);
                }
            }
            oooOO0O.f60950OooO0oO = 0;
        } catch (Throwable th) {
            oooOO0O.f60950OooO0oO = 0;
            throw th;
        }
    }
}
