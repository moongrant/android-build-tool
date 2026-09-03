package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p080o000OoO.o000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class AacUtil {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f8359OooO00o = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f8360OooO0O0 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AacAudioObjectType {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f8361OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f8362OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f8363OooO0OO;

        public OooO00o(int i, int i2, String str) {
            this.f8361OooO00o = i;
            this.f8362OooO0O0 = i2;
            this.f8363OooO0OO = str;
        }
    }

    public static int OooO00o(o000 o000Var) throws ParserException {
        int iOooO0oO = o000Var.OooO0oO(4);
        if (iOooO0oO == 15) {
            if (o000Var.OooO0O0() >= 24) {
                return o000Var.OooO0oO(24);
            }
            throw ParserException.OooO00o("AAC header insufficient data", null);
        }
        if (iOooO0oO < 13) {
            return f8359OooO00o[iOooO0oO];
        }
        throw ParserException.OooO00o("AAC header wrong Sampling Frequency Index", null);
    }

    public static OooO00o OooO0O0(o000 o000Var, boolean z) throws ParserException {
        int iOooO0oO = o000Var.OooO0oO(5);
        if (iOooO0oO == 31) {
            iOooO0oO = o000Var.OooO0oO(6) + 32;
        }
        int iOooO00o = OooO00o(o000Var);
        int iOooO0oO2 = o000Var.OooO0oO(4);
        String strOooO00o = android.support.v4.media.OooO00o.OooO00o("mp4a.40.", iOooO0oO);
        if (iOooO0oO == 5 || iOooO0oO == 29) {
            iOooO00o = OooO00o(o000Var);
            int iOooO0oO3 = o000Var.OooO0oO(5);
            if (iOooO0oO3 == 31) {
                iOooO0oO3 = o000Var.OooO0oO(6) + 32;
            }
            iOooO0oO = iOooO0oO3;
            if (iOooO0oO == 22) {
                iOooO0oO2 = o000Var.OooO0oO(4);
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
                        throw ParserException.OooO0O0("Unsupported audio object type: " + iOooO0oO);
                }
            }
            if (o000Var.OooO0o()) {
                Log.OooO0o("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (o000Var.OooO0o()) {
                o000Var.OooOOO0(14);
            }
            boolean zOooO0o = o000Var.OooO0o();
            if (iOooO0oO2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iOooO0oO == 6 || iOooO0oO == 20) {
                o000Var.OooOOO0(3);
            }
            if (zOooO0o) {
                if (iOooO0oO == 22) {
                    o000Var.OooOOO0(16);
                }
                if (iOooO0oO == 17 || iOooO0oO == 19 || iOooO0oO == 20 || iOooO0oO == 23) {
                    o000Var.OooOOO0(3);
                }
                o000Var.OooOOO0(1);
            }
            switch (iOooO0oO) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iOooO0oO4 = o000Var.OooO0oO(2);
                    if (iOooO0oO4 == 2 || iOooO0oO4 == 3) {
                        throw ParserException.OooO0O0("Unsupported epConfig: " + iOooO0oO4);
                    }
                    break;
            }
        }
        int i = f8360OooO0O0[iOooO0oO2];
        if (i != -1) {
            return new OooO00o(iOooO00o, i, strOooO00o);
        }
        throw ParserException.OooO00o(null, null);
    }
}
