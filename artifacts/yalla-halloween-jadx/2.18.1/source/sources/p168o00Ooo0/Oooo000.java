package p168o00Ooo0;

import android.media.MediaFormat;
import com.weieyu.yalla.R;
import java.nio.ByteBuffer;
import java.util.List;
import p265o00ooo00.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f32641OooO00o = {21, 20, 21, 21, 22, 22, 23, 24, 24, 24, 23, 23};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f32642OooO0O0 = {R.string.capricorn, R.string.aquarius, R.string.pisces, R.string.aries, R.string.taurus, R.string.gemini, R.string.cancer, R.string.leo, R.string.virgo, R.string.libra, R.string.scorpio, R.string.sagittarius, R.string.capricorn};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final byte[] f32643OooO0OO = {60, -28, 116, 20, 125, -126, -107, -104, -94, -115, -71, 108, 116, -19, 118, 34, 99, 116, 115, -95, -1, -35, 59, -114, -78, -60, -63, 20, -124, -107, -118, 84};

    public static void OooO00o(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void OooO0O0(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(Oooo0.OooO00o(15, "csd-", i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
