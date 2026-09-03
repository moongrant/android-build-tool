package p245o00oo0o;

import android.media.MediaFormat;
import android.support.v4.media.OooO00o;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00OO0O0 {
    public static void OooO00o(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void OooO0O0(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(OooO00o.OooO00o("csd-", i), ByteBuffer.wrap(list.get(i)));
        }
    }
}
