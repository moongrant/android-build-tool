package oo0ooO;

import com.android.billingclient.api.o0000O00;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes2.dex */
public class OooO0O0 implements OooOO0 {
    public static void OooO0o0(OooOO0O oooOO0O, StringBuilder sb) {
        int iCharAt = (sb.charAt(1) * '(') + (sb.charAt(0) * 1600) + sb.charAt(2) + 1;
        oooOO0O.f60949OooO0o0.append(new String(new char[]{(char) (iCharAt / PSKKeyManager.MAX_KEY_LENGTH_BYTES), (char) (iCharAt % PSKKeyManager.MAX_KEY_LENGTH_BYTES)}));
        sb.delete(0, 3);
    }

    @Override // oo0ooO.OooOO0
    public void OooO00o(OooOO0O oooOO0O) {
        StringBuilder sb = new StringBuilder();
        while (oooOO0O.OooO0OO()) {
            char cOooO0O0 = oooOO0O.OooO0O0();
            oooOO0O.f60948OooO0o++;
            int iOooO0O0 = OooO0O0(sb, cOooO0O0);
            int iOooO00o = oooOO0O.OooO00o() + ((sb.length() / 3) << 1);
            oooOO0O.OooO0Oo(iOooO00o);
            int i = oooOO0O.f60951OooO0oo.f60954OooO0O0 - iOooO00o;
            if (!oooOO0O.OooO0OO()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (i < 2 || i > 2)) {
                    int length = sb.length();
                    sb.delete(length - iOooO0O0, length);
                    oooOO0O.f60948OooO0o--;
                    iOooO0O0 = OooO0O0(sb2, oooOO0O.OooO0O0());
                    oooOO0O.f60951OooO0oo = null;
                }
                while (sb.length() % 3 == 1 && ((iOooO0O0 <= 3 && i != 1) || iOooO0O0 > 3)) {
                    int length2 = sb.length();
                    sb.delete(length2 - iOooO0O0, length2);
                    oooOO0O.f60948OooO0o--;
                    iOooO0O0 = OooO0O0(sb2, oooOO0O.OooO0O0());
                    oooOO0O.f60951OooO0oo = null;
                }
                break;
            }
            if (sb.length() % 3 == 0) {
                if (o0000O00.OooO0o0(oooOO0O.f60944OooO00o, oooOO0O.f60948OooO0o, OooO0OO()) != OooO0OO()) {
                    oooOO0O.f60950OooO0oO = 0;
                    break;
                }
            }
        }
        OooO0Oo(oooOO0O, sb);
    }

    public int OooO0O0(StringBuilder sb, char c) {
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
            return OooO0O0(sb, (char) (c - 128)) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c - '`'));
        return 2;
    }

    public int OooO0OO() {
        return 1;
    }

    public void OooO0Oo(OooOO0O oooOO0O, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int iOooO00o = oooOO0O.OooO00o() + length;
        oooOO0O.OooO0Oo(iOooO00o);
        int i = oooOO0O.f60951OooO0oo.f60954OooO0O0 - iOooO00o;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                OooO0o0(oooOO0O, sb);
            }
            if (oooOO0O.OooO0OO()) {
                oooOO0O.OooO0o0((char) 254);
            }
        } else if (i == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                OooO0o0(oooOO0O, sb);
            }
            if (oooOO0O.OooO0OO()) {
                oooOO0O.OooO0o0((char) 254);
            }
            oooOO0O.f60948OooO0o--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb.length() >= 3) {
                OooO0o0(oooOO0O, sb);
            }
            if (i > 0 || oooOO0O.OooO0OO()) {
                oooOO0O.OooO0o0((char) 254);
            }
        }
        oooOO0O.f60950OooO0oO = 0;
    }
}
