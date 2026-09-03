package o0OO00OO;

import o00O0OOO.Oooo000;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 extends Oooo000 {
    @Override // o00O0OOO.Oooo000, o0OO00OO.OooO
    public final void OooO00o(OooOO0 oooOO1) {
        StringBuilder sb = new StringBuilder();
        while (oooOO1.OooO0OO()) {
            char cOooO0O0 = oooOO1.OooO0O0();
            oooOO1.f42295OooO0o++;
            OooO0OO(sb, cOooO0O0);
            if (sb.length() % 3 == 0) {
                Oooo000.OooO0o(oooOO1, sb);
                if (OooOOO0.OooO0o0(oooOO1.f42291OooO00o, oooOO1.f42295OooO0o, 3) != 3) {
                    oooOO1.f42297OooO0oO = 0;
                    break;
                }
            }
        }
        OooO0o0(oooOO1, sb);
    }

    @Override // o00O0OOO.Oooo000
    public final int OooO0OO(StringBuilder sb, char c) {
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
                OooOOO0.OooO0O0(c);
                throw null;
            }
            sb.append((char) ((c - 'A') + 14));
        }
        return 1;
    }

    @Override // o00O0OOO.Oooo000
    public final int OooO0Oo() {
        return 3;
    }

    @Override // o00O0OOO.Oooo000
    public final void OooO0o0(OooOO0 oooOO1, StringBuilder sb) {
        oooOO1.OooO0Oo(oooOO1.OooO00o());
        int iOooO00o = oooOO1.f42298OooO0oo.f42305OooO0O0 - oooOO1.OooO00o();
        oooOO1.f42295OooO0o -= sb.length();
        String str = oooOO1.f42291OooO00o;
        if ((str.length() - oooOO1.f42290OooO) - oooOO1.f42295OooO0o > 1 || iOooO00o > 1 || (str.length() - oooOO1.f42290OooO) - oooOO1.f42295OooO0o != iOooO00o) {
            oooOO1.OooO0o0((char) 254);
        }
        if (oooOO1.f42297OooO0oO < 0) {
            oooOO1.f42297OooO0oO = 0;
        }
    }
}
