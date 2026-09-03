package oo0ooO;

import com.android.billingclient.api.o0000O00;
import io.agora.rtc.Constants;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements OooOO0 {
    @Override // oo0ooO.OooOO0
    public final void OooO00o(OooOO0O oooOO0O) {
        int i;
        int i2 = oooOO0O.f60948OooO0o;
        String str = oooOO0O.f60944OooO00o;
        int length = str.length();
        if (i2 < length) {
            char cCharAt = str.charAt(i2);
            i = 0;
            while (true) {
                if (!(cCharAt >= '0' && cCharAt <= '9') || i2 >= length) {
                    break;
                }
                i++;
                i2++;
                if (i2 < length) {
                    cCharAt = str.charAt(i2);
                }
            }
        } else {
            i = 0;
        }
        if (i >= 2) {
            char cCharAt2 = str.charAt(oooOO0O.f60948OooO0o);
            char cCharAt3 = str.charAt(oooOO0O.f60948OooO0o + 1);
            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                    oooOO0O.OooO0o0((char) ((cCharAt3 - '0') + ((cCharAt2 - '0') * 10) + Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED));
                    oooOO0O.f60948OooO0o += 2;
                    return;
                }
            }
            throw new IllegalArgumentException("not digits: " + cCharAt2 + cCharAt3);
        }
        char cOooO0O0 = oooOO0O.OooO0O0();
        int iOooO0o0 = o0000O00.OooO0o0(str, oooOO0O.f60948OooO0o, 0);
        if (iOooO0o0 == 0) {
            if (!o0000O00.OooO0OO(cOooO0O0)) {
                oooOO0O.OooO0o0((char) (cOooO0O0 + 1));
                oooOO0O.f60948OooO0o++;
                return;
            } else {
                oooOO0O.OooO0o0((char) 235);
                oooOO0O.OooO0o0((char) ((cOooO0O0 - 128) + 1));
                oooOO0O.f60948OooO0o++;
                return;
            }
        }
        if (iOooO0o0 == 1) {
            oooOO0O.OooO0o0((char) 230);
            oooOO0O.f60950OooO0oO = 1;
            return;
        }
        if (iOooO0o0 == 2) {
            oooOO0O.OooO0o0((char) 239);
            oooOO0O.f60950OooO0oO = 2;
            return;
        }
        if (iOooO0o0 == 3) {
            oooOO0O.OooO0o0((char) 238);
            oooOO0O.f60950OooO0oO = 3;
        } else if (iOooO0o0 == 4) {
            oooOO0O.OooO0o0((char) 240);
            oooOO0O.f60950OooO0oO = 4;
        } else {
            if (iOooO0o0 != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iOooO0o0)));
            }
            oooOO0O.OooO0o0((char) 231);
            oooOO0O.f60950OooO0oO = 5;
        }
    }
}
