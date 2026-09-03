package o000OOoO;

import androidx.media3.common.util.UnstableApi;
import io.agora.rtc.Constants;
import io.agora.rtc.internal.RtcEngineEvent;
import kotlin.io.ConstantsKt;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f34626OooO00o = {1, 2, 3, 6};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f34627OooO0O0 = {48000, 44100, 32000};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f34628OooO0OO = {24000, 22050, 16000};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[] f34629OooO0Oo = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f34631OooO0o0 = {32, 40, 48, 56, 64, 80, 96, 112, 128, Constants.ERR_ALREADY_IN_RECORDING, 192, 224, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 320, 384, 448, ConstantsKt.MINIMUM_BLOCK_SIZE, 576, 640};

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final int[] f34630OooO0o = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, RtcEngineEvent.EvtType.EVT_JOIN_PUBILSHER_RESPONSE, 1253, 1393};

    public static int OooO00o(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f34627OooO0O0[i];
        if (i4 == 44100) {
            return ((i2 % 2) + f34630OooO0o[i3]) * 2;
        }
        int i5 = f34631OooO0o0[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }
}
