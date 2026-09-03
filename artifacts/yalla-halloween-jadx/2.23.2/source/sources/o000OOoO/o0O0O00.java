package o000OOoO;

import androidx.media3.common.util.UnstableApi;
import com.qiniu.android.http.ResponseInfo;
import com.squareup.wire.internal.MathMethodsKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import kotlin.UByte;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o0O0O00 {
    public static ArrayList OooO00o(byte[] bArr) {
        long j = (((long) (((bArr[11] & UByte.MAX_VALUE) << 8) | (bArr[10] & UByte.MAX_VALUE))) * MathMethodsKt.NANOS_PER_SECOND) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static long OooO0O0(byte b, byte b2) {
        int i;
        int i2;
        int i3 = b & UByte.MAX_VALUE;
        int i4 = i3 & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = ResponseInfo.UnknownError << (i6 & 1);
        } else {
            i2 = i6 == 3 ? 60000 : ResponseInfo.UnknownError << i6;
        }
        return ((long) i) * ((long) i2);
    }
}
