package p361o0OOOoOo;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final AtomicLong f38408OooO00o = new AtomicLong(0);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static String f38409OooO0O0;

    public Oooo000(o000OO o000oo2) {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArrOooO00o = OooO00o(time % 1000);
        byte[] bArrOooO00o2 = OooO00o(f38408OooO00o.incrementAndGet());
        byte[] bArrOooO00o3 = OooO00o(Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {bArrArray[0], bArrArray[1], bArrArray[2], bArrArray[3], bArrOooO00o[0], bArrOooO00o[1], bArrOooO00o2[0], bArrOooO00o2[1], bArrOooO00o3[0], bArrOooO00o3[1]};
        String strOooOO0o = Oooo0.OooOO0o(o000oo2.OooO0OO());
        String strOooO = Oooo0.OooO(bArr);
        Locale locale = Locale.US;
        f38409OooO0O0 = String.format(locale, "%s%s%s%s", strOooO.substring(0, 12), strOooO.substring(12, 16), strOooO.subSequence(16, 20), strOooOO0o.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] OooO00o(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return f38409OooO0O0;
    }
}
