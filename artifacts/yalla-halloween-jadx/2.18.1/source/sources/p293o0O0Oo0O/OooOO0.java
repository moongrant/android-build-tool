package p293o0O0Oo0O;

import com.uc.crashsdk.export.LogType;
import io.agora.rtc.Constants;
import io.agora.rtc.internal.RtcEngineEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f35729OooO00o = {1, 2, 3, 6};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f35730OooO0O0 = {48000, 44100, LogType.UNEXP_KNOWN_REASON};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f35731OooO0OO = {24000, 22050, 16000};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[] f35732OooO0Oo = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f35734OooO0o0 = {32, 40, 48, 56, 64, 80, 96, 112, 128, Constants.ERR_ALREADY_IN_RECORDING, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final int[] f35733OooO0o = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, RtcEngineEvent.EvtType.EVT_JOIN_PUBILSHER_RESPONSE, 1253, 1393};

    public static int OooO00o(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f35730OooO0O0;
        if (i >= 3 || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f35733OooO0o;
        if (i3 >= 19) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return ((i2 % 2) + iArr2[i3]) * 2;
        }
        int i5 = f35734OooO0o0[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }
}
