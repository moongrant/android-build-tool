package p080o000OoO;

import android.media.MediaFormat;
import android.support.v4.media.OooO00o;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o00000OO {
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
