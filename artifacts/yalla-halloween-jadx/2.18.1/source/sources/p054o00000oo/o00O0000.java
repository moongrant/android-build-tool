package p054o00000oo;

import o00000O.o0OO00O;
import p042Ooooo0o.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0000 {
    public static final long OooO00o(long j, long j2) {
        int iOooO0o0;
        int iOooO0oO = o0OO00O.OooO0oO(j);
        int iOooO0o = o0OO00O.OooO0o(j);
        if (o0OO00O.OooO0oO(j2) < o0OO00O.OooO0o(j) && o0OO00O.OooO0oO(j) < o0OO00O.OooO0o(j2)) {
            if (o0OO00O.OooO00o(j2, j)) {
                iOooO0oO = o0OO00O.OooO0oO(j2);
                iOooO0o = iOooO0oO;
            } else {
                if (o0OO00O.OooO00o(j, j2)) {
                    iOooO0o0 = o0OO00O.OooO0o0(j2);
                } else {
                    if (iOooO0oO < o0OO00O.OooO0o(j2) && o0OO00O.OooO0oO(j2) <= iOooO0oO) {
                        iOooO0oO = o0OO00O.OooO0oO(j2);
                        iOooO0o0 = o0OO00O.OooO0o0(j2);
                    } else {
                        iOooO0o = o0OO00O.OooO0oO(j2);
                    }
                }
                iOooO0o -= iOooO0o0;
            }
        } else if (iOooO0o > o0OO00O.OooO0oO(j2)) {
            iOooO0oO -= o0OO00O.OooO0o0(j2);
            iOooO0o0 = o0OO00O.OooO0o0(j2);
            iOooO0o -= iOooO0o0;
        }
        return o000O0O0.OooO00o(iOooO0oO, iOooO0o);
    }
}
