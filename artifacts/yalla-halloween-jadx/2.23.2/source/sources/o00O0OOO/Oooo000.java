package o00O0OOO;

import androidx.work.impl.WorkDatabase;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes2.dex */
public class Oooo000 implements o0OO00OO.OooO {
    public static final int OooO0O0(WorkDatabase workDatabase, String str) {
        Long lOooO0O0 = workDatabase.OooOOo0().OooO0O0(str);
        int iLongValue = lOooO0O0 != null ? (int) lOooO0O0.longValue() : 0;
        workDatabase.OooOOo0().OooO00o(new o00O0OO.OooO0o(str, Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
        return iLongValue;
    }

    public static void OooO0o(o0OO00OO.OooOO0 oooOO1, StringBuilder sb) {
        int iCharAt = (sb.charAt(1) * '(') + (sb.charAt(0) * 1600) + sb.charAt(2) + 1;
        oooOO1.f42296OooO0o0.append(new String(new char[]{(char) (iCharAt / PSKKeyManager.MAX_KEY_LENGTH_BYTES), (char) (iCharAt % PSKKeyManager.MAX_KEY_LENGTH_BYTES)}));
        sb.delete(0, 3);
    }

    @Override // o0OO00OO.OooO
    public void OooO00o(o0OO00OO.OooOO0 oooOO1) {
        StringBuilder sb = new StringBuilder();
        while (oooOO1.OooO0OO()) {
            char cOooO0O0 = oooOO1.OooO0O0();
            oooOO1.f42295OooO0o++;
            int iOooO0OO = OooO0OO(sb, cOooO0O0);
            int iOooO00o = oooOO1.OooO00o() + ((sb.length() / 3) << 1);
            oooOO1.OooO0Oo(iOooO00o);
            int i = oooOO1.f42298OooO0oo.f42305OooO0O0 - iOooO00o;
            if (!oooOO1.OooO0OO()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (i < 2 || i > 2)) {
                    int length = sb.length();
                    sb.delete(length - iOooO0OO, length);
                    oooOO1.f42295OooO0o--;
                    iOooO0OO = OooO0OO(sb2, oooOO1.OooO0O0());
                    oooOO1.f42298OooO0oo = null;
                }
                while (sb.length() % 3 == 1 && ((iOooO0OO <= 3 && i != 1) || iOooO0OO > 3)) {
                    int length2 = sb.length();
                    sb.delete(length2 - iOooO0OO, length2);
                    oooOO1.f42295OooO0o--;
                    iOooO0OO = OooO0OO(sb2, oooOO1.OooO0O0());
                    oooOO1.f42298OooO0oo = null;
                }
                break;
            }
            if (sb.length() % 3 == 0) {
                if (o0OO00OO.OooOOO0.OooO0o0(oooOO1.f42291OooO00o, oooOO1.f42295OooO0o, OooO0Oo()) != OooO0Oo()) {
                    oooOO1.f42297OooO0oO = 0;
                    break;
                }
            }
        }
        OooO0o0(oooOO1, sb);
    }

    public int OooO0OO(StringBuilder sb, char c) {
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
            return OooO0OO(sb, (char) (c - 128)) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c - '`'));
        return 2;
    }

    public int OooO0Oo() {
        return 1;
    }

    public void OooO0o0(o0OO00OO.OooOO0 oooOO1, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int iOooO00o = oooOO1.OooO00o() + length;
        oooOO1.OooO0Oo(iOooO00o);
        int i = oooOO1.f42298OooO0oo.f42305OooO0O0 - iOooO00o;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                OooO0o(oooOO1, sb);
            }
            if (oooOO1.OooO0OO()) {
                oooOO1.OooO0o0((char) 254);
            }
        } else if (i == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                OooO0o(oooOO1, sb);
            }
            if (oooOO1.OooO0OO()) {
                oooOO1.OooO0o0((char) 254);
            }
            oooOO1.f42295OooO0o--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb.length() >= 3) {
                OooO0o(oooOO1, sb);
            }
            if (i > 0 || oooOO1.OooO0OO()) {
                oooOO1.OooO0o0((char) 254);
            }
        }
        oooOO1.f42297OooO0oO = 0;
    }
}
