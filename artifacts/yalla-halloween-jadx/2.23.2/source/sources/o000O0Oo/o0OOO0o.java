package o000O0Oo;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final byte[] f34275OooO0Oo = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, ByteCompanionObject.MIN_VALUE, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final byte[] f34276OooO0o0 = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public ByteBuffer f34277OooO00o = AudioProcessor.f6730OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f34279OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f34278OooO0O0 = 2;

    public static void OooO00o(int i, ByteBuffer byteBuffer, int i2, boolean z, long j) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        long j2 = i2;
        com.google.common.base.o0OoOo0.OooO0O0(j2, "out of range: %s", (j2 >> 8) == 0);
        byteBuffer.put((byte) j2);
    }
}
