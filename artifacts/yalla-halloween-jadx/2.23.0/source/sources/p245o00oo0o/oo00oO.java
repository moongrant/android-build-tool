package p245o00oo0o;

import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Log;
import com.qiniu.android.http.ResponseInfo;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class oo00oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f40635OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f40636OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("valueLock")
    public static boolean f40637OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("valueLock")
    public static long f40638OooO0Oo;

    public interface OooO00o {
    }

    public static final class OooO0O0 implements Loader.OooO00o<Loader.OooO0o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final OooO00o f40639OooO0Oo;

        public OooO0O0(@Nullable DashMediaSource.OooO00o oooO00o) {
            this.f40639OooO0Oo = oooO00o;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
        public final void OooO0Oo(Loader.OooO0o oooO0o, long j, long j2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
        public final void OooO0o(Loader.OooO0o oooO0o, long j, long j2) {
            boolean z;
            OooO00o oooO00o = this.f40639OooO0Oo;
            if (oooO00o != null) {
                synchronized (oo00oO.f40636OooO0O0) {
                    z = oo00oO.f40637OooO0OO;
                }
                if (z) {
                    ((DashMediaSource.OooO00o) oooO00o).OooO00o();
                    return;
                }
                IOException iOException = new IOException(new ConcurrentModificationException());
                DashMediaSource dashMediaSource = DashMediaSource.this;
                dashMediaSource.getClass();
                Log.OooO0Oo("DashMediaSource", "Failed to resolve time offset.", iOException);
                dashMediaSource.OooOo0o(true);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
        public final Loader.OooO0O0 OooOO0o(Loader.OooO0o oooO0o, long j, long j2, IOException iOException, int i) {
            OooO00o oooO00o = this.f40639OooO0Oo;
            if (oooO00o != null) {
                DashMediaSource dashMediaSource = DashMediaSource.this;
                dashMediaSource.getClass();
                Log.OooO0Oo("DashMediaSource", "Failed to resolve time offset.", iOException);
                dashMediaSource.OooOo0o(true);
            }
            return Loader.f14192OooO0Oo;
        }
    }

    public static final class OooO0OO implements Loader.OooO0o {
        @Override // com.google.android.exoplayer2.upstream.Loader.OooO0o
        public final void OooO00o() throws IOException {
            synchronized (oo00oO.f40635OooO00o) {
                Object obj = oo00oO.f40636OooO0O0;
                synchronized (obj) {
                    try {
                        if (oo00oO.f40637OooO0OO) {
                            return;
                        }
                        long jOooO00o = oo00oO.OooO00o();
                        synchronized (obj) {
                            oo00oO.f40638OooO0Oo = jOooO00o;
                            oo00oO.f40637OooO0OO = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.OooO0o
        public final void OooO0O0() {
        }
    }

    public static long OooO00o() throws Throwable {
        DatagramSocket datagramSocket;
        synchronized (f40636OooO0O0) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(ResponseInfo.UnknownError);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                datagramSocket = datagramSocket2;
            } else {
                long j = jCurrentTimeMillis / 1000;
                Long.signum(j);
                long j2 = jCurrentTimeMillis - (j * 1000);
                long j3 = j + 2208988800L;
                bArr[40] = (byte) (j3 >> 24);
                bArr[41] = (byte) (j3 >> 16);
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) (j3 >> 8);
                    bArr[43] = (byte) (j3 >> 0);
                    long j4 = (j2 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j4 >> 24);
                    bArr[45] = (byte) (j4 >> 16);
                    bArr[46] = (byte) (j4 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        datagramSocket.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j5 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
            byte b = bArr[0];
            int i = bArr[1] & UByte.MAX_VALUE;
            long jOooO0Oo = OooO0Oo(24, bArr);
            long jOooO0Oo2 = OooO0Oo(32, bArr);
            long jOooO0Oo3 = OooO0Oo(40, bArr);
            OooO0O0((byte) ((b >> 6) & 3), (byte) (b & 7), i, jOooO0Oo3);
            long j6 = (j5 + (((jOooO0Oo3 - j5) + (jOooO0Oo2 - jOooO0Oo)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j6;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
        }
    }

    public static void OooO0O0(byte b, byte b2, int i, long j) throws IOException {
        if (b == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b2 != 4 && b2 != 5) {
            throw new IOException(android.support.v4.media.OooO00o.OooO00o("SNTP: Untrusted mode: ", b2));
        }
        if (i == 0 || i > 15) {
            throw new IOException(android.support.v4.media.OooO00o.OooO00o("SNTP: Untrusted stratum: ", i));
        }
        if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long OooO0OO(int i, byte[] bArr) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    public static long OooO0Oo(int i, byte[] bArr) {
        long jOooO0OO = OooO0OO(i, bArr);
        long jOooO0OO2 = OooO0OO(i + 4, bArr);
        if (jOooO0OO == 0 && jOooO0OO2 == 0) {
            return 0L;
        }
        return ((jOooO0OO2 * 1000) / 4294967296L) + ((jOooO0OO - 2208988800L) * 1000);
    }
}
