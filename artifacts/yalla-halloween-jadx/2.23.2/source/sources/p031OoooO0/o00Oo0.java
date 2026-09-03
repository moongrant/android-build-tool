package p031OoooO0;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f1379OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1380OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final byte[] f1381OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Charset f1376OooO0Oo = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final String[] f1378OooO0o0 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final int[] f1377OooO0o = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    public o00Oo0(int i, int i2, byte[] bArr) {
        this.f1379OooO00o = i;
        this.f1380OooO0O0 = i2;
        this.f1381OooO0OO = bArr;
    }

    @NonNull
    public static o00Oo0 OooO00o(long j, @NonNull ByteOrder byteOrder) {
        return OooO0O0(new long[]{j}, byteOrder);
    }

    @NonNull
    public static o00Oo0 OooO0O0(@NonNull long[] jArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f1377OooO0o[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j : jArr) {
            byteBufferWrap.putInt((int) j);
        }
        return new o00Oo0(4, jArr.length, byteBufferWrap.array());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(f1378OooO0o0[this.f1379OooO00o]);
        sb.append(", data length:");
        return OooOO0.OooO00o(sb, this.f1381OooO0OO.length, ")");
    }
}
