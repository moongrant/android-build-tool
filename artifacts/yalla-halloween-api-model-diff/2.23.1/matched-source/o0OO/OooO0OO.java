package o0OO;

import com.squareup.okhttp.o00Oo0;
import com.squareup.okhttp.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo0 f42170OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Ooo f42171OooO0O0;

    public OooO0OO(o00Oo0 o00oo1, o00Ooo o00ooo2) {
        this.f42170OooO00o = o00oo1;
        this.f42171OooO0O0 = o00ooo2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
    
        if (r4.OooO00o().f21036OooO0o0 == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean OooO00o(o00Oo0 o00oo1, o00Ooo o00ooo2) {
        int i = o00ooo2.f21182OooO0OO;
        if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
            if (i != 307) {
                if (i != 308 && i != 404 && i != 405) {
                    switch (i) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (o00ooo2.OooO0OO("Expires") == null) {
                if (o00ooo2.OooO00o().f21033OooO0OO == -1) {
                    if (!o00ooo2.OooO00o().f21035OooO0o) {
                    }
                }
            }
        }
        if (o00ooo2.OooO00o().f21032OooO0O0) {
            return false;
        }
        com.squareup.okhttp.OooO oooOOooO00o = o00oo1.f21173OooO0o;
        if (oooOOooO00o == null) {
            oooOOooO00o = com.squareup.okhttp.OooO.OooO00o(o00oo1.f21171OooO0OO);
            o00oo1.f21173OooO0o = oooOOooO00o;
        }
        return !oooOOooO00o.f21032OooO0O0;
    }
}
