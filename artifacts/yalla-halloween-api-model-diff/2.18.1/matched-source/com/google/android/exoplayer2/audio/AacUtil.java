package com.google.android.exoplayer2.audio;

import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import com.uc.crashsdk.export.LogType;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p265o00ooo00.Oooo0;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class AacUtil {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f13467OooO00o = {96000, 88200, 64000, 48000, 44100, LogType.UNEXP_KNOWN_REASON, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f13468OooO0O0 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AacAudioObjectType {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f13469OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f13470OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f13471OooO0OO;

        public OooO00o(int i, int i2, String str) {
            this.f13469OooO00o = i;
            this.f13470OooO0O0 = i2;
            this.f13471OooO0OO = str;
        }
    }

    public static int OooO00o(int i) {
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public static int OooO0O0(o0000OO0 o0000oo1) {
        int iOooO0oO = o0000oo1.OooO0oO(4);
        if (iOooO0oO == 15) {
            return o0000oo1.OooO0oO(24);
        }
        o00000O0.OooO00o(iOooO0oO < 13);
        return f13467OooO00o[iOooO0oO];
    }

    public static OooO00o OooO0OO(o0000OO0 o0000oo1, boolean z) throws ParserException {
        int iOooO0oO = o0000oo1.OooO0oO(5);
        if (iOooO0oO == 31) {
            iOooO0oO = o0000oo1.OooO0oO(6) + 32;
        }
        int iOooO0O0 = OooO0O0(o0000oo1);
        int iOooO0oO2 = o0000oo1.OooO0oO(4);
        String strOooO00o = Oooo0.OooO00o(19, "mp4a.40.", iOooO0oO);
        if (iOooO0oO == 5 || iOooO0oO == 29) {
            iOooO0O0 = OooO0O0(o0000oo1);
            int iOooO0oO3 = o0000oo1.OooO0oO(5);
            if (iOooO0oO3 == 31) {
                iOooO0oO3 = o0000oo1.OooO0oO(6) + 32;
            }
            iOooO0oO = iOooO0oO3;
            if (iOooO0oO == 22) {
                iOooO0oO2 = o0000oo1.OooO0oO(4);
            }
        }
        if (z) {
            if (iOooO0oO != 1 && iOooO0oO != 2 && iOooO0oO != 3 && iOooO0oO != 4 && iOooO0oO != 6 && iOooO0oO != 7 && iOooO0oO != 17) {
                switch (iOooO0oO) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new ParserException(Oooo0.OooO00o(42, "Unsupported audio object type: ", iOooO0oO));
                }
            }
            if (o0000oo1.OooO0o()) {
                Log.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (o0000oo1.OooO0o()) {
                o0000oo1.OooOOO0(14);
            }
            boolean zOooO0o = o0000oo1.OooO0o();
            if (iOooO0oO2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iOooO0oO == 6 || iOooO0oO == 20) {
                o0000oo1.OooOOO0(3);
            }
            if (zOooO0o) {
                if (iOooO0oO == 22) {
                    o0000oo1.OooOOO0(16);
                }
                if (iOooO0oO == 17 || iOooO0oO == 19 || iOooO0oO == 20 || iOooO0oO == 23) {
                    o0000oo1.OooOOO0(3);
                }
                o0000oo1.OooOOO0(1);
            }
            switch (iOooO0oO) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iOooO0oO4 = o0000oo1.OooO0oO(2);
                    if (iOooO0oO4 == 2 || iOooO0oO4 == 3) {
                        throw new ParserException(Oooo0.OooO00o(33, "Unsupported epConfig: ", iOooO0oO4));
                    }
                    break;
            }
        }
        int i = f13468OooO0O0[iOooO0oO2];
        o00000O0.OooO00o(i != -1);
        return new OooO00o(iOooO0O0, i, strOooO00o);
    }

    public static OooO00o OooO0Oo(byte[] bArr) throws ParserException {
        return OooO0OO(new o0000OO0(bArr, bArr.length), false);
    }
}
