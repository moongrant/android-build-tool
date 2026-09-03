package oo0ooO;

import com.android.billingclient.api.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 extends OooO0O0 {
    @Override // oo0ooO.OooO0O0, oo0ooO.OooOO0
    public final void OooO00o(OooOO0O oooOO0O) {
        StringBuilder sb = new StringBuilder();
        while (oooOO0O.OooO0OO()) {
            char cOooO0O0 = oooOO0O.OooO0O0();
            oooOO0O.f60948OooO0o++;
            OooO0O0(sb, cOooO0O0);
            if (sb.length() % 3 == 0) {
                OooO0O0.OooO0o0(oooOO0O, sb);
                if (o0000O00.OooO0o0(oooOO0O.f60944OooO00o, oooOO0O.f60948OooO0o, 3) != 3) {
                    oooOO0O.f60950OooO0oO = 0;
                    break;
                }
            }
        }
        OooO0Oo(oooOO0O, sb);
    }

    @Override // oo0ooO.OooO0O0
    public final int OooO0O0(StringBuilder sb, char c) {
        if (c == '\r') {
            sb.append((char) 0);
        } else if (c == ' ') {
            sb.append((char) 3);
        } else if (c == '*') {
            sb.append((char) 1);
        } else if (c == '>') {
            sb.append((char) 2);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
        } else {
            if (c < 'A' || c > 'Z') {
                o0000O00.OooO0O0(c);
                throw null;
            }
            sb.append((char) ((c - 'A') + 14));
        }
        return 1;
    }

    @Override // oo0ooO.OooO0O0
    public final int OooO0OO() {
        return 3;
    }

    @Override // oo0ooO.OooO0O0
    public final void OooO0Oo(OooOO0O oooOO0O, StringBuilder sb) {
        oooOO0O.OooO0Oo(oooOO0O.OooO00o());
        int iOooO00o = oooOO0O.f60951OooO0oo.f60954OooO0O0 - oooOO0O.OooO00o();
        oooOO0O.f60948OooO0o -= sb.length();
        String str = oooOO0O.f60944OooO00o;
        if ((str.length() - oooOO0O.f60943OooO) - oooOO0O.f60948OooO0o > 1 || iOooO00o > 1 || (str.length() - oooOO0O.f60943OooO) - oooOO0O.f60948OooO0o != iOooO00o) {
            oooOO0O.OooO0o0((char) 254);
        }
        if (oooOO0O.f60950OooO0oO < 0) {
            oooOO0O.f60950OooO0oO = 0;
        }
    }
}
