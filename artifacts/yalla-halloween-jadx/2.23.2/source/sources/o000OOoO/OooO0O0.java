package o000OOoO;

import androidx.media3.common.util.UnstableApi;
import com.google.logging.type.LogSeverity;
import com.zego.zegoliveroom.constants.ZegoConstants;
import p080o000OoO.o000;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f34632OooO00o = {ZegoConstants.StreamUpdateType.Deleted, 2000, 1920, 1601, 1600, 1001, 1000, 960, LogSeverity.EMERGENCY_VALUE, LogSeverity.EMERGENCY_VALUE, 480, 400, 400, 2048};

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f34633OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f34634OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f34635OooO0OO;

        public OooO00o(int i, int i2, int i3) {
            this.f34633OooO00o = i;
            this.f34634OooO0O0 = i2;
            this.f34635OooO0OO = i3;
        }
    }

    public static void OooO00o(int i, o000O000 o000o001) {
        o000o001.OooOooO(7);
        byte[] bArr = o000o001.f34962OooO00o;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    public static OooO00o OooO0O0(o000 o000Var) {
        int i;
        int i2;
        int iOooO0oO = o000Var.OooO0oO(16);
        int iOooO0oO2 = o000Var.OooO0oO(16);
        if (iOooO0oO2 == 65535) {
            iOooO0oO2 = o000Var.OooO0oO(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iOooO0oO2 + i;
        if (iOooO0oO == 44097) {
            i3 += 2;
        }
        if (o000Var.OooO0oO(2) == 3) {
            do {
                o000Var.OooO0oO(2);
            } while (o000Var.OooO0o());
        }
        int iOooO0oO3 = o000Var.OooO0oO(10);
        if (o000Var.OooO0o() && o000Var.OooO0oO(3) > 0) {
            o000Var.OooOOO0(2);
        }
        int i4 = o000Var.OooO0o() ? 48000 : 44100;
        int iOooO0oO4 = o000Var.OooO0oO(4);
        int[] iArr = f34632OooO00o;
        if (i4 == 44100 && iOooO0oO4 == 13) {
            i2 = iArr[iOooO0oO4];
        } else if (i4 != 48000 || iOooO0oO4 >= 14) {
            i2 = 0;
        } else {
            int i5 = iArr[iOooO0oO4];
            int i6 = iOooO0oO3 % 5;
            if (i6 == 1) {
                if (iOooO0oO4 != 3 || iOooO0oO4 == 8) {
                    i5++;
                }
            } else if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4 && (iOooO0oO4 == 3 || iOooO0oO4 == 8 || iOooO0oO4 == 11)) {
                        i5++;
                    }
                } else if (iOooO0oO4 != 3) {
                    i5++;
                } else {
                    i5++;
                }
            } else if (iOooO0oO4 == 8 || iOooO0oO4 == 11) {
                i5++;
            }
            i2 = i5;
        }
        return new OooO00o(i4, i3, i2);
    }
}
