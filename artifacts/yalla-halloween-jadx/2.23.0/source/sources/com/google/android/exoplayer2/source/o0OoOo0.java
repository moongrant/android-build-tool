package com.google.android.exoplayer2.source;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;
import net.sqlcipher.database.SQLiteDatabase;
import org.jctools.util.Pow2;
import p206o00o0oOO.o0oOOo;
import p244o00oo0Oo.o000O0Oo;
import p244o00oo0Oo.o000OO0O;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OO0O f13349OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f13350OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Oo00 f13351OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO00o f13352OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO00o f13353OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO00o f13354OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f13355OooO0oO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public long f13356OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f13357OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public o000O0Oo f13358OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public OooO00o f13359OooO0Oo;

        public OooO00o(long j, int i) {
            o00O000o.OooO0Oo(this.f13358OooO0OO == null);
            this.f13356OooO00o = j;
            this.f13357OooO0O0 = j + ((long) i);
        }
    }

    public o0OoOo0(o000OO0O o000oo0o2) {
        this.f13349OooO00o = o000oo0o2;
        int i = ((p244o00oo0Oo.o00O000o) o000oo0o2).f40481OooO0O0;
        this.f13350OooO0O0 = i;
        this.f13351OooO0OO = new o00Oo00(32);
        OooO00o oooO00o = new OooO00o(0L, i);
        this.f13352OooO0Oo = oooO00o;
        this.f13354OooO0o0 = oooO00o;
        this.f13353OooO0o = oooO00o;
    }

    public static OooO00o OooO0Oo(OooO00o oooO00o, long j, ByteBuffer byteBuffer, int i) {
        while (j >= oooO00o.f13357OooO0O0) {
            oooO00o = oooO00o.f13359OooO0Oo;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (oooO00o.f13357OooO0O0 - j));
            o000O0Oo o000o0oo2 = oooO00o.f13358OooO0OO;
            byteBuffer.put(o000o0oo2.f40469OooO00o, ((int) (j - oooO00o.f13356OooO00o)) + o000o0oo2.f40470OooO0O0, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == oooO00o.f13357OooO0O0) {
                oooO00o = oooO00o.f13359OooO0Oo;
            }
        }
        return oooO00o;
    }

    public static OooO00o OooO0o(OooO00o oooO00o, DecoderInputBuffer decoderInputBuffer, o00O0O.OooO00o oooO00o2, o00Oo00 o00oo00) {
        if (decoderInputBuffer.OooO0o(Pow2.MAX_POW2)) {
            long j = oooO00o2.f13332OooO0O0;
            int iOooOoOO = 1;
            o00oo00.OooOooO(1);
            OooO00o oooO00oOooO0o0 = OooO0o0(oooO00o, j, o00oo00.f40591OooO00o, 1);
            long j2 = j + 1;
            byte b = o00oo00.f40591OooO00o[0];
            boolean z = (b & ByteCompanionObject.MIN_VALUE) != 0;
            int i = b & ByteCompanionObject.MAX_VALUE;
            o0oOOo o0oooo = decoderInputBuffer.f11675OooO0o0;
            byte[] bArr = o0oooo.f39426OooO00o;
            if (bArr == null) {
                o0oooo.f39426OooO00o = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            oooO00o = OooO0o0(oooO00oOooO0o0, j2, o0oooo.f39426OooO00o, i);
            long j3 = j2 + ((long) i);
            if (z) {
                o00oo00.OooOooO(2);
                oooO00o = OooO0o0(oooO00o, j3, o00oo00.f40591OooO00o, 2);
                j3 += 2;
                iOooOoOO = o00oo00.OooOoOO();
            }
            int[] iArr = o0oooo.f39429OooO0Oo;
            if (iArr == null || iArr.length < iOooOoOO) {
                iArr = new int[iOooOoOO];
            }
            int[] iArr2 = o0oooo.f39431OooO0o0;
            if (iArr2 == null || iArr2.length < iOooOoOO) {
                iArr2 = new int[iOooOoOO];
            }
            if (z) {
                int i2 = iOooOoOO * 6;
                o00oo00.OooOooO(i2);
                oooO00o = OooO0o0(oooO00o, j3, o00oo00.f40591OooO00o, i2);
                j3 += (long) i2;
                o00oo00.Oooo00O(0);
                for (int i3 = 0; i3 < iOooOoOO; i3++) {
                    iArr[i3] = o00oo00.OooOoOO();
                    iArr2[i3] = o00oo00.OooOoO0();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = oooO00o2.f13331OooO00o - ((int) (j3 - oooO00o2.f13332OooO0O0));
            }
            TrackOutput.OooO00o oooO00o3 = oooO00o2.f13333OooO0OO;
            int i4 = o0O00.f40595OooO00o;
            byte[] bArr2 = oooO00o3.f11793OooO0O0;
            byte[] bArr3 = o0oooo.f39426OooO00o;
            o0oooo.f39430OooO0o = iOooOoOO;
            o0oooo.f39429OooO0Oo = iArr;
            o0oooo.f39431OooO0o0 = iArr2;
            o0oooo.f39427OooO0O0 = bArr2;
            o0oooo.f39426OooO00o = bArr3;
            int i5 = oooO00o3.f11792OooO00o;
            o0oooo.f39428OooO0OO = i5;
            int i6 = oooO00o3.f11794OooO0OO;
            o0oooo.f39432OooO0oO = i6;
            int i7 = oooO00o3.f11795OooO0Oo;
            o0oooo.f39433OooO0oo = i7;
            MediaCodec.CryptoInfo cryptoInfo = o0oooo.f39425OooO;
            cryptoInfo.numSubSamples = iOooOoOO;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            if (o0O00.f40595OooO00o >= 24) {
                o0oOOo.OooO00o oooO00o4 = o0oooo.f39434OooOO0;
                oooO00o4.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = oooO00o4.f39436OooO0O0;
                pattern.set(i6, i7);
                oooO00o4.f39435OooO00o.setPattern(pattern);
            }
            long j4 = oooO00o2.f13332OooO0O0;
            int i8 = (int) (j3 - j4);
            oooO00o2.f13332OooO0O0 = j4 + ((long) i8);
            oooO00o2.f13331OooO00o -= i8;
        }
        if (!decoderInputBuffer.OooO0o(SQLiteDatabase.CREATE_IF_NECESSARY)) {
            decoderInputBuffer.OooOO0(oooO00o2.f13331OooO00o);
            return OooO0Oo(oooO00o, oooO00o2.f13332OooO0O0, decoderInputBuffer.f11674OooO0o, oooO00o2.f13331OooO00o);
        }
        o00oo00.OooOooO(4);
        OooO00o oooO00oOooO0o1 = OooO0o0(oooO00o, oooO00o2.f13332OooO0O0, o00oo00.f40591OooO00o, 4);
        int iOooOoO0 = o00oo00.OooOoO0();
        oooO00o2.f13332OooO0O0 += 4;
        oooO00o2.f13331OooO00o -= 4;
        decoderInputBuffer.OooOO0(iOooOoO0);
        OooO00o oooO00oOooO0Oo = OooO0Oo(oooO00oOooO0o1, oooO00o2.f13332OooO0O0, decoderInputBuffer.f11674OooO0o, iOooOoO0);
        oooO00o2.f13332OooO0O0 += (long) iOooOoO0;
        int i9 = oooO00o2.f13331OooO00o - iOooOoO0;
        oooO00o2.f13331OooO00o = i9;
        ByteBuffer byteBuffer = decoderInputBuffer.f11673OooO;
        if (byteBuffer == null || byteBuffer.capacity() < i9) {
            decoderInputBuffer.f11673OooO = ByteBuffer.allocate(i9);
        } else {
            decoderInputBuffer.f11673OooO.clear();
        }
        return OooO0Oo(oooO00oOooO0Oo, oooO00o2.f13332OooO0O0, decoderInputBuffer.f11673OooO, oooO00o2.f13331OooO00o);
    }

    public static OooO00o OooO0o0(OooO00o oooO00o, long j, byte[] bArr, int i) {
        while (j >= oooO00o.f13357OooO0O0) {
            oooO00o = oooO00o.f13359OooO0Oo;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (oooO00o.f13357OooO0O0 - j));
            o000O0Oo o000o0oo2 = oooO00o.f13358OooO0OO;
            System.arraycopy(o000o0oo2.f40469OooO00o, ((int) (j - oooO00o.f13356OooO00o)) + o000o0oo2.f40470OooO0O0, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == oooO00o.f13357OooO0O0) {
                oooO00o = oooO00o.f13359OooO0Oo;
            }
        }
        return oooO00o;
    }

    public final void OooO00o(OooO00o oooO00o) {
        if (oooO00o.f13358OooO0OO == null) {
            return;
        }
        p244o00oo0Oo.o00O000o o00o000o2 = (p244o00oo0Oo.o00O000o) this.f13349OooO00o;
        synchronized (o00o000o2) {
            OooO00o oooO00o2 = oooO00o;
            while (oooO00o2 != null) {
                o000O0Oo[] o000o0ooArr = o00o000o2.f40484OooO0o;
                int i = o00o000o2.f40485OooO0o0;
                o00o000o2.f40485OooO0o0 = i + 1;
                o000O0Oo o000o0oo2 = oooO00o2.f13358OooO0OO;
                o000o0oo2.getClass();
                o000o0ooArr[i] = o000o0oo2;
                o00o000o2.f40483OooO0Oo--;
                oooO00o2 = oooO00o2.f13359OooO0Oo;
                if (oooO00o2 == null || oooO00o2.f13358OooO0OO == null) {
                    oooO00o2 = null;
                }
            }
            o00o000o2.notifyAll();
        }
        oooO00o.f13358OooO0OO = null;
        oooO00o.f13359OooO0Oo = null;
    }

    public final void OooO0O0(long j) {
        OooO00o oooO00o;
        if (j == -1) {
            return;
        }
        while (true) {
            oooO00o = this.f13352OooO0Oo;
            if (j < oooO00o.f13357OooO0O0) {
                break;
            }
            o000OO0O o000oo0o2 = this.f13349OooO00o;
            o000O0Oo o000o0oo2 = oooO00o.f13358OooO0OO;
            p244o00oo0Oo.o00O000o o00o000o2 = (p244o00oo0Oo.o00O000o) o000oo0o2;
            synchronized (o00o000o2) {
                o000O0Oo[] o000o0ooArr = o00o000o2.f40484OooO0o;
                int i = o00o000o2.f40485OooO0o0;
                o00o000o2.f40485OooO0o0 = i + 1;
                o000o0ooArr[i] = o000o0oo2;
                o00o000o2.f40483OooO0Oo--;
                o00o000o2.notifyAll();
            }
            OooO00o oooO00o2 = this.f13352OooO0Oo;
            oooO00o2.f13358OooO0OO = null;
            OooO00o oooO00o3 = oooO00o2.f13359OooO0Oo;
            oooO00o2.f13359OooO0Oo = null;
            this.f13352OooO0Oo = oooO00o3;
        }
        if (this.f13354OooO0o0.f13356OooO00o < oooO00o.f13356OooO00o) {
            this.f13354OooO0o0 = oooO00o;
        }
    }

    public final int OooO0OO(int i) {
        o000O0Oo o000o0oo2;
        OooO00o oooO00o = this.f13353OooO0o;
        if (oooO00o.f13358OooO0OO == null) {
            p244o00oo0Oo.o00O000o o00o000o2 = (p244o00oo0Oo.o00O000o) this.f13349OooO00o;
            synchronized (o00o000o2) {
                int i2 = o00o000o2.f40483OooO0Oo + 1;
                o00o000o2.f40483OooO0Oo = i2;
                int i3 = o00o000o2.f40485OooO0o0;
                if (i3 > 0) {
                    o000O0Oo[] o000o0ooArr = o00o000o2.f40484OooO0o;
                    int i4 = i3 - 1;
                    o00o000o2.f40485OooO0o0 = i4;
                    o000o0oo2 = o000o0ooArr[i4];
                    o000o0oo2.getClass();
                    o00o000o2.f40484OooO0o[o00o000o2.f40485OooO0o0] = null;
                } else {
                    o000O0Oo o000o0oo3 = new o000O0Oo(new byte[o00o000o2.f40481OooO0O0], 0);
                    o000O0Oo[] o000o0ooArr2 = o00o000o2.f40484OooO0o;
                    if (i2 > o000o0ooArr2.length) {
                        o00o000o2.f40484OooO0o = (o000O0Oo[]) Arrays.copyOf(o000o0ooArr2, o000o0ooArr2.length * 2);
                    }
                    o000o0oo2 = o000o0oo3;
                }
            }
            OooO00o oooO00o2 = new OooO00o(this.f13353OooO0o.f13357OooO0O0, this.f13350OooO0O0);
            oooO00o.f13358OooO0OO = o000o0oo2;
            oooO00o.f13359OooO0Oo = oooO00o2;
        }
        return Math.min(i, (int) (this.f13353OooO0o.f13357OooO0O0 - this.f13355OooO0oO));
    }
}
