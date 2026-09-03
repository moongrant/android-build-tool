package p398o0Oo00oO;

import androidx.compose.ui.platform.o00O0;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO implements o0OoOo0 {
    public static String OooO0O0(CharSequence charSequence) {
        int length = charSequence.length() - 0;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (charSequence.charAt(0) << 18) + ((length >= 2 ? charSequence.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(3) : (char) 0);
        char c = (char) ((iCharAt >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        char c2 = (char) ((iCharAt >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        char c3 = (char) (iCharAt & KotlinVersion.MAX_COMPONENT_VALUE);
        StringBuilder sb = new StringBuilder(3);
        sb.append(c);
        if (length >= 2) {
            sb.append(c2);
        }
        if (length >= 3) {
            sb.append(c3);
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008d A[Catch: all -> 0x00d8, TryCatch #0 {all -> 0x00d8, blocks: (B:23:0x0058, B:28:0x0063, B:30:0x0075, B:35:0x008d, B:41:0x009f, B:43:0x00b3, B:45:0x00c2, B:46:0x00ca, B:49:0x00d0, B:50:0x00d7), top: B:54:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f A[Catch: all -> 0x00d8, TryCatch #0 {all -> 0x00d8, blocks: (B:23:0x0058, B:28:0x0063, B:30:0x0075, B:35:0x008d, B:41:0x009f, B:43:0x00b3, B:45:0x00c2, B:46:0x00ca, B:49:0x00d0, B:50:0x00d7), top: B:54:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3 A[Catch: all -> 0x00d8, TryCatch #0 {all -> 0x00d8, blocks: (B:23:0x0058, B:28:0x0063, B:30:0x0075, B:35:0x008d, B:41:0x009f, B:43:0x00b3, B:45:0x00c2, B:46:0x00ca, B:49:0x00d0, B:50:0x00d7), top: B:54:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2 A[Catch: all -> 0x00d8, TryCatch #0 {all -> 0x00d8, blocks: (B:23:0x0058, B:28:0x0063, B:30:0x0075, B:35:0x008d, B:41:0x009f, B:43:0x00b3, B:45:0x00c2, B:46:0x00ca, B:49:0x00d0, B:50:0x00d7), top: B:54:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #0 {all -> 0x00d8, blocks: (B:23:0x0058, B:28:0x0063, B:30:0x0075, B:35:0x008d, B:41:0x009f, B:43:0x00b3, B:45:0x00c2, B:46:0x00ca, B:49:0x00d0, B:50:0x00d7), top: B:54:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0 A[Catch: all -> 0x00d8, TRY_ENTER, TryCatch #0 {all -> 0x00d8, blocks: (B:23:0x0058, B:28:0x0063, B:30:0x0075, B:35:0x008d, B:41:0x009f, B:43:0x00b3, B:45:0x00c2, B:46:0x00ca, B:49:0x00d0, B:50:0x00d7), top: B:54:0x0058 }] */
    @Override // p398o0Oo00oO.o0OoOo0
    public final void OooO00o(o00O0O o00o0o2) {
        boolean z;
        int i;
        String strOooO0O0;
        StringBuilder sb = new StringBuilder();
        while (true) {
            z = true;
            if (!o00o0o2.OooO0Oo()) {
                break;
            }
            char cOooO0O0 = o00o0o2.OooO0O0();
            if (cOooO0O0 >= ' ' && cOooO0O0 <= '?') {
                sb.append(cOooO0O0);
            } else {
                if (cOooO0O0 < '@' || cOooO0O0 > '^') {
                    o00O0.OooO0o(cOooO0O0);
                    throw null;
                }
                sb.append((char) (cOooO0O0 - '@'));
            }
            o00o0o2.f38966OooO0o++;
            if (sb.length() >= 4) {
                o00o0o2.OooO0oo(OooO0O0(sb));
                sb.delete(0, 4);
                if (o00O0.OooOOO(o00o0o2.f38962OooO00o, o00o0o2.f38966OooO0o, 4) != 4) {
                    o00o0o2.f38968OooO0oO = 0;
                    break;
                }
            }
        }
        sb.append((char) 31);
        try {
            int length = sb.length();
            if (length != 0) {
                if (length == 1) {
                    o00o0o2.OooO0o0();
                    int iOooO00o = o00o0o2.f38969OooO0oo.f38976OooO0O0 - o00o0o2.OooO00o();
                    int iOooO0OO = o00o0o2.OooO0OO();
                    if (iOooO0OO > iOooO00o) {
                        o00o0o2.OooO0o(o00o0o2.OooO00o() + 1);
                        iOooO00o = o00o0o2.f38969OooO0oo.f38976OooO0O0 - o00o0o2.OooO00o();
                    }
                    if (iOooO0OO > iOooO00o || iOooO00o > 2) {
                        if (length <= 4) {
                            throw new IllegalStateException("Count must not exceed 4");
                        }
                        i = length - 1;
                        strOooO0O0 = OooO0O0(sb);
                        if ((!o00o0o2.OooO0Oo()) || i > 2) {
                            z = false;
                        }
                        if (i <= 2) {
                            o00o0o2.OooO0o(o00o0o2.OooO00o() + i);
                            if (o00o0o2.f38969OooO0oo.f38976OooO0O0 - o00o0o2.OooO00o() >= 3) {
                                o00o0o2.OooO0o(o00o0o2.OooO00o() + strOooO0O0.length());
                                z = false;
                            }
                        }
                        if (z) {
                            o00o0o2.f38969OooO0oo = null;
                            o00o0o2.f38966OooO0o -= i;
                        } else {
                            o00o0o2.OooO0oo(strOooO0O0);
                        }
                    }
                } else {
                    if (length <= 4) {
                        throw new IllegalStateException("Count must not exceed 4");
                    }
                    i = length - 1;
                    strOooO0O0 = OooO0O0(sb);
                    if (!o00o0o2.OooO0Oo()) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (i <= 2) {
                        o00o0o2.OooO0o(o00o0o2.OooO00o() + i);
                        if (o00o0o2.f38969OooO0oo.f38976OooO0O0 - o00o0o2.OooO00o() >= 3) {
                            o00o0o2.OooO0o(o00o0o2.OooO00o() + strOooO0O0.length());
                            z = false;
                        }
                    }
                    if (z) {
                        o00o0o2.f38969OooO0oo = null;
                        o00o0o2.f38966OooO0o -= i;
                    } else {
                        o00o0o2.OooO0oo(strOooO0O0);
                    }
                }
            }
            o00o0o2.f38968OooO0oO = 0;
        } catch (Throwable th) {
            o00o0o2.f38968OooO0oO = 0;
            throw th;
        }
    }
}
