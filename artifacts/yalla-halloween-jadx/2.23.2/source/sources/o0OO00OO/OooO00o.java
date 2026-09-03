package o0OO00OO;

import io.agora.rtc.Constants;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements OooO {
    @Override // o0OO00OO.OooO
    public final void OooO00o(OooOO0 oooOO1) {
        int i;
        int i2 = oooOO1.f42295OooO0o;
        String str = oooOO1.f42291OooO00o;
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
            char cCharAt2 = str.charAt(oooOO1.f42295OooO0o);
            char cCharAt3 = str.charAt(oooOO1.f42295OooO0o + 1);
            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                    oooOO1.OooO0o0((char) ((cCharAt3 - '0') + ((cCharAt2 - '0') * 10) + Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED));
                    oooOO1.f42295OooO0o += 2;
                    return;
                }
            }
            throw new IllegalArgumentException("not digits: " + cCharAt2 + cCharAt3);
        }
        char cOooO0O0 = oooOO1.OooO0O0();
        int iOooO0o0 = OooOOO0.OooO0o0(str, oooOO1.f42295OooO0o, 0);
        if (iOooO0o0 == 0) {
            if (!OooOOO0.OooO0OO(cOooO0O0)) {
                oooOO1.OooO0o0((char) (cOooO0O0 + 1));
                oooOO1.f42295OooO0o++;
                return;
            } else {
                oooOO1.OooO0o0((char) 235);
                oooOO1.OooO0o0((char) ((cOooO0O0 - 128) + 1));
                oooOO1.f42295OooO0o++;
                return;
            }
        }
        if (iOooO0o0 == 1) {
            oooOO1.OooO0o0((char) 230);
            oooOO1.f42297OooO0oO = 1;
            return;
        }
        if (iOooO0o0 == 2) {
            oooOO1.OooO0o0((char) 239);
            oooOO1.f42297OooO0oO = 2;
            return;
        }
        if (iOooO0o0 == 3) {
            oooOO1.OooO0o0((char) 238);
            oooOO1.f42297OooO0oO = 3;
        } else if (iOooO0o0 == 4) {
            oooOO1.OooO0o0((char) 240);
            oooOO1.f42297OooO0oO = 4;
        } else {
            if (iOooO0o0 != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iOooO0o0)));
            }
            oooOO1.OooO0o0((char) 231);
            oooOO1.f42297OooO0oO = 5;
        }
    }
}
