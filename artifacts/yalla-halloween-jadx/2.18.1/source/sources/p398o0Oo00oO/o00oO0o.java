package p398o0Oo00oO;

import androidx.compose.ui.platform.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o extends OooOo {
    @Override // p398o0Oo00oO.OooOo, p398o0Oo00oO.o0OoOo0
    public final void OooO00o(o00O0O o00o0o2) {
        StringBuilder sb = new StringBuilder();
        while (o00o0o2.OooO0Oo()) {
            char cOooO0O0 = o00o0o2.OooO0O0();
            o00o0o2.f38966OooO0o++;
            OooO0OO(cOooO0O0, sb);
            if (sb.length() % 3 == 0) {
                OooOo.OooO0o(o00o0o2, sb);
                if (o00O0.OooOOO(o00o0o2.f38962OooO00o, o00o0o2.f38966OooO0o, 3) != 3) {
                    o00o0o2.f38968OooO0oO = 0;
                    break;
                }
            }
        }
        OooO0o0(o00o0o2, sb);
    }

    @Override // p398o0Oo00oO.OooOo
    public final int OooO0OO(char c, StringBuilder sb) {
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
                o00O0.OooO0o(c);
                throw null;
            }
            sb.append((char) ((c - 'A') + 14));
        }
        return 1;
    }

    @Override // p398o0Oo00oO.OooOo
    public final int OooO0Oo() {
        return 3;
    }

    @Override // p398o0Oo00oO.OooOo
    public final void OooO0o0(o00O0O o00o0o2, StringBuilder sb) {
        o00o0o2.OooO0o0();
        int iOooO00o = o00o0o2.f38969OooO0oo.f38976OooO0O0 - o00o0o2.OooO00o();
        o00o0o2.f38966OooO0o -= sb.length();
        if (o00o0o2.OooO0OO() > 1 || iOooO00o > 1 || o00o0o2.OooO0OO() != iOooO00o) {
            o00o0o2.OooO0oO((char) 254);
        }
        if (o00o0o2.f38968OooO0oO < 0) {
            o00o0o2.f38968OooO0oO = 0;
        }
    }
}
