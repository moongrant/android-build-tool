package p398o0Oo00oO;

import androidx.compose.ui.platform.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public class OooOo implements o0OoOo0 {
    public static void OooO0o(o00O0O o00o0o2, StringBuilder sb) {
        int iCharAt = (sb.charAt(1) * '(') + (sb.charAt(0) * 1600) + sb.charAt(2) + 1;
        o00o0o2.OooO0oo(new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)}));
        sb.delete(0, 3);
    }

    @Override // p398o0Oo00oO.o0OoOo0
    public void OooO00o(o00O0O o00o0o2) {
        StringBuilder sb = new StringBuilder();
        while (o00o0o2.OooO0Oo()) {
            char cOooO0O0 = o00o0o2.OooO0O0();
            o00o0o2.f38966OooO0o++;
            int iOooO0OO = OooO0OO(cOooO0O0, sb);
            int iOooO00o = o00o0o2.OooO00o() + ((sb.length() / 3) << 1);
            o00o0o2.OooO0o(iOooO00o);
            int i = o00o0o2.f38969OooO0oo.f38976OooO0O0 - iOooO00o;
            if (!o00o0o2.OooO0Oo()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (i < 2 || i > 2)) {
                    iOooO0OO = OooO0O0(o00o0o2, sb, sb2, iOooO0OO);
                }
                while (sb.length() % 3 == 1 && ((iOooO0OO <= 3 && i != 1) || iOooO0OO > 3)) {
                    iOooO0OO = OooO0O0(o00o0o2, sb, sb2, iOooO0OO);
                }
                break;
            }
            if (sb.length() % 3 == 0 && o00O0.OooOOO(o00o0o2.f38962OooO00o, o00o0o2.f38966OooO0o, OooO0Oo()) != OooO0Oo()) {
                o00o0o2.f38968OooO0oO = 0;
                break;
            }
        }
        OooO0o0(o00o0o2, sb);
    }

    public final int OooO0O0(o00O0O o00o0o2, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        o00o0o2.f38966OooO0o--;
        int iOooO0OO = OooO0OO(o00o0o2.OooO0O0(), sb2);
        o00o0o2.f38969OooO0oo = null;
        return iOooO0OO;
    }

    public int OooO0OO(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        }
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A') + 14));
            return 1;
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        }
        if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        }
        if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        }
        if (c < '`' || c > 127) {
            sb.append("\u0001\u001e");
            return OooO0OO((char) (c - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c - '`'));
        return 2;
    }

    public int OooO0Oo() {
        return 1;
    }

    public void OooO0o0(o00O0O o00o0o2, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int iOooO00o = o00o0o2.OooO00o() + length;
        o00o0o2.OooO0o(iOooO00o);
        int i = o00o0o2.f38969OooO0oo.f38976OooO0O0 - iOooO00o;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                OooO0o(o00o0o2, sb);
            }
            if (o00o0o2.OooO0Oo()) {
                o00o0o2.OooO0oO((char) 254);
            }
        } else if (i == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                OooO0o(o00o0o2, sb);
            }
            if (o00o0o2.OooO0Oo()) {
                o00o0o2.OooO0oO((char) 254);
            }
            o00o0o2.f38966OooO0o--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb.length() >= 3) {
                OooO0o(o00o0o2, sb);
            }
            if (i > 0 || o00o0o2.OooO0Oo()) {
                o00o0o2.OooO0oO((char) 254);
            }
        }
        o00o0o2.f38968OooO0oO = 0;
    }
}
