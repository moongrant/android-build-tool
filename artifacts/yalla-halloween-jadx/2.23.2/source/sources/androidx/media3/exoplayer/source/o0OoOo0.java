package androidx.media3.exoplayer.source;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.extractor.TrackOutput;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;
import net.sqlcipher.database.SQLiteDatabase;
import org.jctools.util.Pow2;
import p080o000OoO.o00;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p074o000OO0o.o00Oo0 f8088OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f8089OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000O000 f8090OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO00o f8091OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO00o f8092OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO00o f8093OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f8094OooO0oO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f8095OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f8096OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public p074o000OO0o.o00O0O f8097OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public OooO00o f8098OooO0Oo;

        public OooO00o(long j, int i) {
            p080o000OoO.o00Oo0.OooO0Oo(this.f8097OooO0OO == null);
            this.f8095OooO00o = j;
            this.f8096OooO0O0 = j + ((long) i);
        }
    }

    public o0OoOo0(p074o000OO0o.o00Oo0 o00oo1) {
        this.f8088OooO00o = o00oo1;
        int i = ((p074o000OO0o.o0ooOOo) o00oo1).f34467OooO0O0;
        this.f8089OooO0O0 = i;
        this.f8090OooO0OO = new o000O000(32);
        OooO00o oooO00o = new OooO00o(0L, i);
        this.f8091OooO0Oo = oooO00o;
        this.f8093OooO0o0 = oooO00o;
        this.f8092OooO0o = oooO00o;
    }

    public static OooO00o OooO0OO(OooO00o oooO00o, long j, ByteBuffer byteBuffer, int i) {
        while (j >= oooO00o.f8096OooO0O0) {
            oooO00o = oooO00o.f8098OooO0Oo;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (oooO00o.f8096OooO0O0 - j));
            p074o000OO0o.o00O0O o00o0o2 = oooO00o.f8097OooO0OO;
            byteBuffer.put(o00o0o2.f34422OooO00o, ((int) (j - oooO00o.f8095OooO00o)) + o00o0o2.f34423OooO0O0, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == oooO00o.f8096OooO0O0) {
                oooO00o = oooO00o.f8098OooO0Oo;
            }
        }
        return oooO00o;
    }

    public static OooO00o OooO0Oo(OooO00o oooO00o, long j, byte[] bArr, int i) {
        while (j >= oooO00o.f8096OooO0O0) {
            oooO00o = oooO00o.f8098OooO0Oo;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (oooO00o.f8096OooO0O0 - j));
            p074o000OO0o.o00O0O o00o0o2 = oooO00o.f8097OooO0OO;
            System.arraycopy(o00o0o2.f34422OooO00o, ((int) (j - oooO00o.f8095OooO00o)) + o00o0o2.f34423OooO0O0, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == oooO00o.f8096OooO0O0) {
                oooO00o = oooO00o.f8098OooO0Oo;
            }
        }
        return oooO00o;
    }

    public static OooO00o OooO0o0(OooO00o oooO00o, DecoderInputBuffer decoderInputBuffer, o00O0O.OooO00o oooO00o2, o000O000 o000o001) {
        if (decoderInputBuffer.OooO0o(Pow2.MAX_POW2)) {
            long j = oooO00o2.f8071OooO0O0;
            int iOooOoOO = 1;
            o000o001.OooOooO(1);
            OooO00o oooO00oOooO0Oo = OooO0Oo(oooO00o, j, o000o001.f34962OooO00o, 1);
            long j2 = j + 1;
            byte b = o000o001.f34962OooO00o[0];
            boolean z = (b & ByteCompanionObject.MIN_VALUE) != 0;
            int i = b & ByteCompanionObject.MAX_VALUE;
            o000O00.OooO oooO = decoderInputBuffer.f7085OooO0o0;
            byte[] bArr = oooO.f33920OooO00o;
            if (bArr == null) {
                oooO.f33920OooO00o = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            oooO00o = OooO0Oo(oooO00oOooO0Oo, j2, oooO.f33920OooO00o, i);
            long j3 = j2 + ((long) i);
            if (z) {
                o000o001.OooOooO(2);
                oooO00o = OooO0Oo(oooO00o, j3, o000o001.f34962OooO00o, 2);
                j3 += 2;
                iOooOoOO = o000o001.OooOoOO();
            }
            int[] iArr = oooO.f33923OooO0Oo;
            if (iArr == null || iArr.length < iOooOoOO) {
                iArr = new int[iOooOoOO];
            }
            int[] iArr2 = oooO.f33925OooO0o0;
            if (iArr2 == null || iArr2.length < iOooOoOO) {
                iArr2 = new int[iOooOoOO];
            }
            if (z) {
                int i2 = iOooOoOO * 6;
                o000o001.OooOooO(i2);
                oooO00o = OooO0Oo(oooO00o, j3, o000o001.f34962OooO00o, i2);
                j3 += (long) i2;
                o000o001.Oooo00O(0);
                for (int i3 = 0; i3 < iOooOoOO; i3++) {
                    iArr[i3] = o000o001.OooOoOO();
                    iArr2[i3] = o000o001.OooOoO0();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = oooO00o2.f8070OooO00o - ((int) (j3 - oooO00o2.f8071OooO0O0));
            }
            TrackOutput.OooO00o oooO00o3 = oooO00o2.f8072OooO0OO;
            int i4 = o00.f34910OooO00o;
            byte[] bArr2 = oooO00o3.f8373OooO0O0;
            byte[] bArr3 = oooO.f33920OooO00o;
            oooO.f33924OooO0o = iOooOoOO;
            oooO.f33923OooO0Oo = iArr;
            oooO.f33925OooO0o0 = iArr2;
            oooO.f33921OooO0O0 = bArr2;
            oooO.f33920OooO00o = bArr3;
            int i5 = oooO00o3.f8372OooO00o;
            oooO.f33922OooO0OO = i5;
            int i6 = oooO00o3.f8374OooO0OO;
            oooO.f33926OooO0oO = i6;
            int i7 = oooO00o3.f8375OooO0Oo;
            oooO.f33927OooO0oo = i7;
            MediaCodec.CryptoInfo cryptoInfo = oooO.f33919OooO;
            cryptoInfo.numSubSamples = iOooOoOO;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            if (o00.f34910OooO00o >= 24) {
                o000O00.OooO.OooO00o oooO00o4 = oooO.f33928OooOO0;
                oooO00o4.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = oooO00o4.f33930OooO0O0;
                pattern.set(i6, i7);
                oooO00o4.f33929OooO00o.setPattern(pattern);
            }
            long j4 = oooO00o2.f8071OooO0O0;
            int i8 = (int) (j3 - j4);
            oooO00o2.f8071OooO0O0 = j4 + ((long) i8);
            oooO00o2.f8070OooO00o -= i8;
        }
        if (!decoderInputBuffer.OooO0o(SQLiteDatabase.CREATE_IF_NECESSARY)) {
            decoderInputBuffer.OooOO0(oooO00o2.f8070OooO00o);
            return OooO0OO(oooO00o, oooO00o2.f8071OooO0O0, decoderInputBuffer.f7084OooO0o, oooO00o2.f8070OooO00o);
        }
        o000o001.OooOooO(4);
        OooO00o oooO00oOooO0Oo2 = OooO0Oo(oooO00o, oooO00o2.f8071OooO0O0, o000o001.f34962OooO00o, 4);
        int iOooOoO0 = o000o001.OooOoO0();
        oooO00o2.f8071OooO0O0 += 4;
        oooO00o2.f8070OooO00o -= 4;
        decoderInputBuffer.OooOO0(iOooOoO0);
        OooO00o oooO00oOooO0OO = OooO0OO(oooO00oOooO0Oo2, oooO00o2.f8071OooO0O0, decoderInputBuffer.f7084OooO0o, iOooOoO0);
        oooO00o2.f8071OooO0O0 += (long) iOooOoO0;
        int i9 = oooO00o2.f8070OooO00o - iOooOoO0;
        oooO00o2.f8070OooO00o = i9;
        ByteBuffer byteBuffer = decoderInputBuffer.f7083OooO;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            decoderInputBuffer.f7083OooO = ByteBuffer.allocate(i9);
        } else {
            decoderInputBuffer.f7083OooO.clear();
        }
        return OooO0OO(oooO00oOooO0OO, oooO00o2.f8071OooO0O0, decoderInputBuffer.f7083OooO, oooO00o2.f8070OooO00o);
    }

    public final void OooO00o(long j) {
        OooO00o oooO00o;
        if (j == -1) {
            return;
        }
        while (true) {
            oooO00o = this.f8091OooO0Oo;
            if (j < oooO00o.f8096OooO0O0) {
                break;
            }
            p074o000OO0o.o00Oo0 o00oo1 = this.f8088OooO00o;
            p074o000OO0o.o00O0O o00o0o2 = oooO00o.f8097OooO0OO;
            p074o000OO0o.o0ooOOo o0ooooo = (p074o000OO0o.o0ooOOo) o00oo1;
            synchronized (o0ooooo) {
                p074o000OO0o.o00O0O[] o00o0oArr = o0ooooo.f34470OooO0o;
                int i = o0ooooo.f34471OooO0o0;
                o0ooooo.f34471OooO0o0 = i + 1;
                o00o0oArr[i] = o00o0o2;
                o0ooooo.f34469OooO0Oo--;
                o0ooooo.notifyAll();
            }
            OooO00o oooO00o2 = this.f8091OooO0Oo;
            oooO00o2.f8097OooO0OO = null;
            OooO00o oooO00o3 = oooO00o2.f8098OooO0Oo;
            oooO00o2.f8098OooO0Oo = null;
            this.f8091OooO0Oo = oooO00o3;
        }
        if (this.f8093OooO0o0.f8095OooO00o < oooO00o.f8095OooO00o) {
            this.f8093OooO0o0 = oooO00o;
        }
    }

    public final int OooO0O0(int i) {
        p074o000OO0o.o00O0O o00o0o2;
        OooO00o oooO00o = this.f8092OooO0o;
        if (oooO00o.f8097OooO0OO == null) {
            p074o000OO0o.o0ooOOo o0ooooo = (p074o000OO0o.o0ooOOo) this.f8088OooO00o;
            synchronized (o0ooooo) {
                int i2 = o0ooooo.f34469OooO0Oo + 1;
                o0ooooo.f34469OooO0Oo = i2;
                int i3 = o0ooooo.f34471OooO0o0;
                if (i3 > 0) {
                    p074o000OO0o.o00O0O[] o00o0oArr = o0ooooo.f34470OooO0o;
                    int i4 = i3 - 1;
                    o0ooooo.f34471OooO0o0 = i4;
                    o00o0o2 = o00o0oArr[i4];
                    o00o0o2.getClass();
                    o0ooooo.f34470OooO0o[o0ooooo.f34471OooO0o0] = null;
                } else {
                    p074o000OO0o.o00O0O o00o0o3 = new p074o000OO0o.o00O0O(new byte[o0ooooo.f34467OooO0O0], 0);
                    p074o000OO0o.o00O0O[] o00o0oArr2 = o0ooooo.f34470OooO0o;
                    if (i2 > o00o0oArr2.length) {
                        o0ooooo.f34470OooO0o = (p074o000OO0o.o00O0O[]) Arrays.copyOf(o00o0oArr2, o00o0oArr2.length * 2);
                    }
                    o00o0o2 = o00o0o3;
                }
            }
            OooO00o oooO00o2 = new OooO00o(this.f8092OooO0o.f8096OooO0O0, this.f8089OooO0O0);
            oooO00o.f8097OooO0OO = o00o0o2;
            oooO00o.f8098OooO0Oo = oooO00o2;
        }
        return Math.min(i, (int) (this.f8092OooO0o.f8096OooO0O0 - this.f8094OooO0oO));
    }
}
