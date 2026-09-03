package p264o00ooo0o;

import com.google.android.gms.internal.ads_identifier.zzh;
import o0OO00OO.OooO;
import o0OO00OO.OooOO0;
import o0OO00OO.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O00 implements zzh, OooO {
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
    @Override // o0OO00OO.OooO
    public final void OooO00o(OooOO0 oooOO1) {
        String str;
        StringBuilder sb;
        boolean z;
        int i;
        String strOooO0O0;
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            boolean zOooO0OO = oooOO1.OooO0OO();
            str = oooOO1.f42291OooO00o;
            sb = oooOO1.f42296OooO0o0;
            z = true;
            if (!zOooO0OO) {
                break;
            }
            char cOooO0O0 = oooOO1.OooO0O0();
            if (cOooO0O0 >= ' ' && cOooO0O0 <= '?') {
                sb2.append(cOooO0O0);
            } else {
                if (cOooO0O0 < '@' || cOooO0O0 > '^') {
                    OooOOO0.OooO0O0(cOooO0O0);
                    throw null;
                }
                sb2.append((char) (cOooO0O0 - '@'));
            }
            oooOO1.f42295OooO0o++;
            if (sb2.length() >= 4) {
                sb.append(OooO0O0(sb2));
                sb2.delete(0, 4);
                if (OooOOO0.OooO0o0(str, oooOO1.f42295OooO0o, 4) != 4) {
                    oooOO1.f42297OooO0oO = 0;
                    break;
                }
            }
        }
        sb2.append((char) 31);
        try {
            int length = sb2.length();
            if (length == 0) {
                oooOO1.f42297OooO0oO = 0;
                return;
            }
            if (length == 1) {
                oooOO1.OooO0Oo(oooOO1.OooO00o());
                int iOooO00o = oooOO1.f42298OooO0oo.f42305OooO0O0 - oooOO1.OooO00o();
                int length2 = (str.length() - oooOO1.f42290OooO) - oooOO1.f42295OooO0o;
                if (length2 > iOooO00o) {
                    oooOO1.OooO0Oo(oooOO1.OooO00o() + 1);
                    iOooO00o = oooOO1.f42298OooO0oo.f42305OooO0O0 - oooOO1.OooO00o();
                }
                if (length2 > iOooO00o || iOooO00o > 2) {
                    if (length <= 4) {
                        throw new IllegalStateException("Count must not exceed 4");
                    }
                    i = length - 1;
                    strOooO0O0 = OooO0O0(sb2);
                    if ((!oooOO1.OooO0OO()) || i > 2) {
                        z = false;
                    }
                    if (i <= 2) {
                        oooOO1.OooO0Oo(oooOO1.OooO00o() + i);
                        if (oooOO1.f42298OooO0oo.f42305OooO0O0 - oooOO1.OooO00o() >= 3) {
                            oooOO1.OooO0Oo(oooOO1.OooO00o() + strOooO0O0.length());
                            z = false;
                        }
                    }
                    if (z) {
                        oooOO1.f42298OooO0oo = null;
                        oooOO1.f42295OooO0o -= i;
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
                if (!oooOO1.OooO0OO()) {
                    z = false;
                } else {
                    z = false;
                }
                if (i <= 2) {
                    oooOO1.OooO0Oo(oooOO1.OooO00o() + i);
                    if (oooOO1.f42298OooO0oo.f42305OooO0O0 - oooOO1.OooO00o() >= 3) {
                        oooOO1.OooO0Oo(oooOO1.OooO00o() + strOooO0O0.length());
                        z = false;
                    }
                }
                if (z) {
                    oooOO1.f42298OooO0oo = null;
                    oooOO1.f42295OooO0o -= i;
                } else {
                    sb.append(strOooO0O0);
                }
            }
            oooOO1.f42297OooO0oO = 0;
        } catch (Throwable th) {
            oooOO1.f42297OooO0oO = 0;
            throw th;
        }
    }
}
