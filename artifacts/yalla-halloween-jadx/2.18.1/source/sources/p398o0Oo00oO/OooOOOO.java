package p398o0Oo00oO;

import androidx.compose.ui.platform.o00O0;
import io.agora.rtc.Constants;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO implements o0OoOo0 {
    @Override // p398o0Oo00oO.o0OoOo0
    public final void OooO00o(o00O0O o00o0o2) {
        int i;
        String str = o00o0o2.f38962OooO00o;
        int i2 = o00o0o2.f38966OooO0o;
        int length = str.length();
        if (i2 < length) {
            char cCharAt = str.charAt(i2);
            i = 0;
            while (o00O0.OooOO0O(cCharAt) && i2 < length) {
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
            char cCharAt2 = o00o0o2.f38962OooO00o.charAt(o00o0o2.f38966OooO0o);
            char cCharAt3 = o00o0o2.f38962OooO00o.charAt(o00o0o2.f38966OooO0o + 1);
            if (o00O0.OooOO0O(cCharAt2) && o00O0.OooOO0O(cCharAt3)) {
                o00o0o2.OooO0oO((char) ((cCharAt3 - '0') + ((cCharAt2 - '0') * 10) + Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED));
                o00o0o2.f38966OooO0o += 2;
                return;
            } else {
                throw new IllegalArgumentException("not digits: " + cCharAt2 + cCharAt3);
            }
        }
        char cOooO0O0 = o00o0o2.OooO0O0();
        int iOooOOO = o00O0.OooOOO(o00o0o2.f38962OooO00o, o00o0o2.f38966OooO0o, 0);
        if (iOooOOO == 0) {
            if (!o00O0.OooOO0o(cOooO0O0)) {
                o00o0o2.OooO0oO((char) (cOooO0O0 + 1));
                o00o0o2.f38966OooO0o++;
                return;
            } else {
                o00o0o2.OooO0oO((char) 235);
                o00o0o2.OooO0oO((char) ((cOooO0O0 - 128) + 1));
                o00o0o2.f38966OooO0o++;
                return;
            }
        }
        if (iOooOOO == 1) {
            o00o0o2.OooO0oO((char) 230);
            o00o0o2.f38968OooO0oO = 1;
            return;
        }
        if (iOooOOO == 2) {
            o00o0o2.OooO0oO((char) 239);
            o00o0o2.f38968OooO0oO = 2;
            return;
        }
        if (iOooOOO == 3) {
            o00o0o2.OooO0oO((char) 238);
            o00o0o2.f38968OooO0oO = 3;
        } else if (iOooOOO == 4) {
            o00o0o2.OooO0oO((char) 240);
            o00o0o2.f38968OooO0oO = 4;
        } else {
            if (iOooOOO != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iOooOOO)));
            }
            o00o0o2.OooO0oO((char) 231);
            o00o0o2.f38968OooO0oO = 5;
        }
    }
}
