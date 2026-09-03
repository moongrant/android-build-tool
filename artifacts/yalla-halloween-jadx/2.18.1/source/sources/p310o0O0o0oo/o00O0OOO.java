package p310o0O0o0oo;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.extractor.TrackOutput;
import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OO;
import p318o0O0oOo.o000OOo0;
import p466o0OooO0.o0000O0O;
import p709oo0oOOo.OooO0OO;
import p709oo0oOOo.OooOO0O;
import p709oo0oOOo.OooOOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OOO implements TrackOutput {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O0OO f36427OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Looper f36429OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.OooO0O0 f36430OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public OooO0O0 f36431OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o f36432OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Format f36433OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public DrmSession f36434OooO0oo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f36442OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f36443OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f36444OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f36445OooOo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f36447OooOo00;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public Format f36452OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f36453OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public Format f36454OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f36455OooOooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f36428OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f36426OooO = 1000;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int[] f36435OooOO0 = new int[1000];

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long[] f36436OooOO0O = new long[1000];

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long[] f36438OooOOO = new long[1000];

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int[] f36439OooOOO0 = new int[1000];

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int[] f36437OooOO0o = new int[1000];

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public TrackOutput.OooO00o[] f36440OooOOOO = new TrackOutput.OooO00o[1000];

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Format[] f36441OooOOOo = new Format[1000];

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f36446OooOo0 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f36448OooOo0O = Long.MIN_VALUE;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f36449OooOo0o = Long.MIN_VALUE;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f36450OooOoO = true;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f36451OooOoO0 = true;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f36456OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f36457OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public TrackOutput.OooO00o f36458OooO0OO;
    }

    public interface OooO0O0 {
    }

    public o00O0OOO(OooO0OO oooO0OO, Looper looper, com.google.android.exoplayer2.drm.OooO0O0 oooO0O0, com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o c0097OooO00o) {
        this.f36429OooO0OO = looper;
        this.f36430OooO0Oo = oooO0O0;
        this.f36432OooO0o0 = c0097OooO00o;
        this.f36427OooO00o = new o00O0OO(oooO0OO);
    }

    public final long OooO(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iOooOO0 = OooOO0(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.f36438OooOOO[iOooOO0]);
            if ((this.f36439OooOOO0[iOooOO0] & 1) != 0) {
                break;
            }
            iOooOO0--;
            if (iOooOO0 == -1) {
                iOooOO0 = this.f36426OooO - 1;
            }
        }
        return jMax;
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void OooO00o(o000 o000Var, int i) {
        o00O0OO o00o0oo2 = this.f36427OooO00o;
        Objects.requireNonNull(o00o0oo2);
        while (i > 0) {
            int iOooO0O0 = o00o0oo2.OooO0O0(i);
            o00O0OO.OooO00o oooO00o = o00o0oo2.f36355OooO0o;
            o000Var.OooO0OO(oooO00o.f36361OooO0Oo.f53367OooO00o, oooO00o.OooO00o(o00o0oo2.f36357OooO0oO), iOooO0O0);
            i -= iOooO0O0;
            long j = o00o0oo2.f36357OooO0oO + ((long) iOooO0O0);
            o00o0oo2.f36357OooO0oO = j;
            o00O0OO.OooO00o oooO00o2 = o00o0oo2.f36355OooO0o;
            if (j == oooO00o2.f36359OooO0O0) {
                o00o0oo2.f36355OooO0o = oooO00o2.f36362OooO0o0;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final int OooO0O0(OooOO0O oooOO0O, int i, boolean z) {
        return OooOOOo(oooOO0O, i, z);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void OooO0OO(o000 o000Var, int i) {
        OooO00o(o000Var, i);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void OooO0Oo(long j, int i, int i2, int i3, @Nullable TrackOutput.OooO00o oooO00o) {
        int i4 = i & 1;
        boolean z = i4 != 0;
        if (this.f36451OooOoO0) {
            if (!z) {
                return;
            } else {
                this.f36451OooOoO0 = false;
            }
        }
        long j2 = j + 0;
        if (this.f36453OooOoo) {
            if (j2 < this.f36446OooOo0) {
                return;
            }
            if (i4 == 0) {
                if (!this.f36455OooOooO) {
                    String strValueOf = String.valueOf(this.f36452OooOoOO);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 50);
                    sb.append("Overriding unexpected non-sync sample for format: ");
                    sb.append(strValueOf);
                    Log.w("SampleQueue", sb.toString());
                    this.f36455OooOooO = true;
                }
                i |= 1;
            }
        }
        long j3 = (this.f36427OooO00o.f36357OooO0oO - ((long) i2)) - ((long) i3);
        synchronized (this) {
            int i5 = this.f36443OooOOo0;
            if (i5 > 0) {
                int iOooOO0 = OooOO0(i5 - 1);
                o00000O0.OooO00o(this.f36436OooOO0O[iOooOO0] + ((long) this.f36437OooOO0o[iOooOO0]) <= j3);
            }
            this.f36445OooOo = (536870912 & i) != 0;
            this.f36449OooOo0o = Math.max(this.f36449OooOo0o, j2);
            int iOooOO1 = OooOO0(this.f36443OooOOo0);
            this.f36438OooOOO[iOooOO1] = j2;
            long[] jArr = this.f36436OooOO0O;
            jArr[iOooOO1] = j3;
            this.f36437OooOO0o[iOooOO1] = i2;
            this.f36439OooOOO0[iOooOO1] = i;
            this.f36440OooOOOO[iOooOO1] = oooO00o;
            Format[] formatArr = this.f36441OooOOOo;
            Format format = this.f36452OooOoOO;
            formatArr[iOooOO1] = format;
            this.f36435OooOO0[iOooOO1] = 0;
            this.f36454OooOoo0 = format;
            int i6 = this.f36443OooOOo0 + 1;
            this.f36443OooOOo0 = i6;
            int i7 = this.f36426OooO;
            if (i6 == i7) {
                int i8 = i7 + 1000;
                int[] iArr = new int[i8];
                long[] jArr2 = new long[i8];
                long[] jArr3 = new long[i8];
                int[] iArr2 = new int[i8];
                int[] iArr3 = new int[i8];
                TrackOutput.OooO00o[] oooO00oArr = new TrackOutput.OooO00o[i8];
                Format[] formatArr2 = new Format[i8];
                int i9 = this.f36444OooOOoo;
                int i10 = i7 - i9;
                System.arraycopy(jArr, i9, jArr2, 0, i10);
                System.arraycopy(this.f36438OooOOO, this.f36444OooOOoo, jArr3, 0, i10);
                System.arraycopy(this.f36439OooOOO0, this.f36444OooOOoo, iArr2, 0, i10);
                System.arraycopy(this.f36437OooOO0o, this.f36444OooOOoo, iArr3, 0, i10);
                System.arraycopy(this.f36440OooOOOO, this.f36444OooOOoo, oooO00oArr, 0, i10);
                System.arraycopy(this.f36441OooOOOo, this.f36444OooOOoo, formatArr2, 0, i10);
                System.arraycopy(this.f36435OooOO0, this.f36444OooOOoo, iArr, 0, i10);
                int i11 = this.f36444OooOOoo;
                System.arraycopy(this.f36436OooOO0O, 0, jArr2, i10, i11);
                System.arraycopy(this.f36438OooOOO, 0, jArr3, i10, i11);
                System.arraycopy(this.f36439OooOOO0, 0, iArr2, i10, i11);
                System.arraycopy(this.f36437OooOO0o, 0, iArr3, i10, i11);
                System.arraycopy(this.f36440OooOOOO, 0, oooO00oArr, i10, i11);
                System.arraycopy(this.f36441OooOOOo, 0, formatArr2, i10, i11);
                System.arraycopy(this.f36435OooOO0, 0, iArr, i10, i11);
                this.f36436OooOO0O = jArr2;
                this.f36438OooOOO = jArr3;
                this.f36439OooOOO0 = iArr2;
                this.f36437OooOO0o = iArr3;
                this.f36440OooOOOO = oooO00oArr;
                this.f36441OooOOOo = formatArr2;
                this.f36435OooOO0 = iArr;
                this.f36444OooOOoo = 0;
                this.f36426OooO = i8;
            }
        }
    }

    public final long OooO0o(int i) {
        this.f36448OooOo0O = Math.max(this.f36448OooOo0O, OooO(i));
        int i2 = this.f36443OooOOo0 - i;
        this.f36443OooOOo0 = i2;
        this.f36442OooOOo += i;
        int i3 = this.f36444OooOOoo + i;
        this.f36444OooOOoo = i3;
        int i4 = this.f36426OooO;
        if (i3 >= i4) {
            this.f36444OooOOoo = i3 - i4;
        }
        int i5 = this.f36447OooOo00 - i;
        this.f36447OooOo00 = i5;
        if (i5 < 0) {
            this.f36447OooOo00 = 0;
        }
        if (i2 != 0) {
            return this.f36436OooOO0O[this.f36444OooOOoo];
        }
        int i6 = this.f36444OooOOoo;
        if (i6 != 0) {
            i4 = i6;
        }
        int i7 = i4 - 1;
        return this.f36436OooOO0O[i7] + ((long) this.f36437OooOO0o[i7]);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void OooO0o0(Format format) {
        boolean z;
        synchronized (this) {
            z = false;
            this.f36450OooOoO = false;
            if (!o000OOo0.OooO00o(format, this.f36452OooOoOO)) {
                if (o000OOo0.OooO00o(format, this.f36454OooOoo0)) {
                    this.f36452OooOoOO = this.f36454OooOoo0;
                } else {
                    this.f36452OooOoOO = format;
                }
                Format format2 = this.f36452OooOoOO;
                this.f36453OooOoo = o000OO.OooO00o(format2.f13131OoooOOo, format2.f13129OoooOO0);
                this.f36455OooOooO = false;
                z = true;
            }
        }
        OooO0O0 oooO0O0 = this.f36431OooO0o;
        if (oooO0O0 == null || !z) {
            return;
        }
        o00O0OO0 o00o0oo1 = (o00O0OO0) oooO0O0;
        o00o0oo1.f36379Ooooo00.post(o00o0oo1.f36377OoooOoO);
    }

    public final void OooO0oO() {
        long jOooO0o;
        o00O0OO o00o0oo2 = this.f36427OooO00o;
        synchronized (this) {
            int i = this.f36443OooOOo0;
            jOooO0o = i == 0 ? -1L : OooO0o(i);
        }
        o00o0oo2.OooO00o(jOooO0o);
    }

    public final int OooO0oo(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2 && this.f36438OooOOO[i] <= j; i4++) {
            if (!z || (this.f36439OooOOO0[i] & 1) != 0) {
                i3 = i4;
            }
            i++;
            if (i == this.f36426OooO) {
                i = 0;
            }
        }
        return i3;
    }

    public final int OooOO0(int i) {
        int i2 = this.f36444OooOOoo + i;
        int i3 = this.f36426OooO;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final boolean OooOO0O() {
        return this.f36447OooOo00 != this.f36443OooOOo0;
    }

    @CallSuper
    public final synchronized boolean OooOO0o(boolean z) {
        Format format;
        boolean z2 = true;
        if (OooOO0O()) {
            int iOooOO0 = OooOO0(this.f36447OooOo00);
            if (this.f36441OooOOOo[iOooOO0] != this.f36433OooO0oO) {
                return true;
            }
            return OooOOO0(iOooOO0);
        }
        if (!z && !this.f36445OooOo && ((format = this.f36452OooOoOO) == null || format == this.f36433OooO0oO)) {
            z2 = false;
        }
        return z2;
    }

    public final void OooOOO(Format format, o0000O0O o0000o0o2) {
        Format format2 = this.f36433OooO0oO;
        boolean z = format2 == null;
        DrmInitData drmInitData = z ? null : format2.f13134OoooOoo;
        this.f36433OooO0oO = format;
        DrmInitData drmInitData2 = format.f13134OoooOoo;
        Class<? extends p301o0O0Oooo.o000OOo0> clsOooO0OO = this.f36430OooO0Oo.OooO0OO(format);
        Format.OooO0O0 oooO0O0OooO00o = format.OooO00o();
        oooO0O0OooO00o.f13182OooOooO = clsOooO0OO;
        o0000o0o2.f40508OooO0O0 = oooO0O0OooO00o.OooO00o();
        o0000o0o2.f40507OooO00o = this.f36434OooO0oo;
        if (z || !o000OOo0.OooO00o(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.f36434OooO0oo;
            DrmSession drmSessionOooO0O0 = this.f36430OooO0Oo.OooO0O0(this.f36429OooO0OO, this.f36432OooO0o0, format);
            this.f36434OooO0oo = drmSessionOooO0O0;
            o0000o0o2.f40507OooO00o = drmSessionOooO0O0;
            if (drmSession != null) {
                drmSession.OooO0O0(this.f36432OooO0o0);
            }
        }
    }

    public final boolean OooOOO0(int i) {
        DrmSession drmSession = this.f36434OooO0oo;
        return drmSession == null || drmSession.getState() == 4 || ((this.f36439OooOOO0[i] & 1073741824) == 0 && this.f36434OooO0oo.OooO0OO());
    }

    @CallSuper
    public final void OooOOOO(boolean z) {
        o00O0OO o00o0oo2 = this.f36427OooO00o;
        o00O0OO.OooO00o oooO00o = o00o0oo2.f36354OooO0Oo;
        if (oooO00o.f36360OooO0OO) {
            o00O0OO.OooO00o oooO00o2 = o00o0oo2.f36355OooO0o;
            int i = (((int) (oooO00o2.f36358OooO00o - oooO00o.f36358OooO00o)) / o00o0oo2.f36352OooO0O0) + (oooO00o2.f36360OooO0OO ? 1 : 0);
            p709oo0oOOo.OooO0O0[] oooO0O0Arr = new p709oo0oOOo.OooO0O0[i];
            int i2 = 0;
            while (i2 < i) {
                oooO0O0Arr[i2] = oooO00o.f36361OooO0Oo;
                oooO00o.f36361OooO0Oo = null;
                o00O0OO.OooO00o oooO00o3 = oooO00o.f36362OooO0o0;
                oooO00o.f36362OooO0o0 = null;
                i2++;
                oooO00o = oooO00o3;
            }
            ((OooOOOO) o00o0oo2.f36351OooO00o).OooO00o(oooO0O0Arr);
        }
        o00O0OO.OooO00o oooO00o4 = new o00O0OO.OooO00o(0L, o00o0oo2.f36352OooO0O0);
        o00o0oo2.f36354OooO0Oo = oooO00o4;
        o00o0oo2.f36356OooO0o0 = oooO00o4;
        o00o0oo2.f36355OooO0o = oooO00o4;
        o00o0oo2.f36357OooO0oO = 0L;
        ((OooOOOO) o00o0oo2.f36351OooO00o).OooO0O0();
        this.f36443OooOOo0 = 0;
        this.f36442OooOOo = 0;
        this.f36444OooOOoo = 0;
        this.f36447OooOo00 = 0;
        this.f36451OooOoO0 = true;
        this.f36446OooOo0 = Long.MIN_VALUE;
        this.f36448OooOo0O = Long.MIN_VALUE;
        this.f36449OooOo0o = Long.MIN_VALUE;
        this.f36445OooOo = false;
        this.f36454OooOoo0 = null;
        if (z) {
            this.f36452OooOoOO = null;
            this.f36450OooOoO = true;
        }
    }

    public final int OooOOOo(OooOO0O oooOO0O, int i, boolean z) throws IOException {
        o00O0OO o00o0oo2 = this.f36427OooO00o;
        int iOooO0O0 = o00o0oo2.OooO0O0(i);
        o00O0OO.OooO00o oooO00o = o00o0oo2.f36355OooO0o;
        int i2 = oooOO0O.read(oooO00o.f36361OooO0Oo.f53367OooO00o, oooO00o.OooO00o(o00o0oo2.f36357OooO0oO), iOooO0O0);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = o00o0oo2.f36357OooO0oO + ((long) i2);
        o00o0oo2.f36357OooO0oO = j;
        o00O0OO.OooO00o oooO00o2 = o00o0oo2.f36355OooO0o;
        if (j != oooO00o2.f36359OooO0O0) {
            return i2;
        }
        o00o0oo2.f36355OooO0o = oooO00o2.f36362OooO0o0;
        return i2;
    }

    public final synchronized boolean OooOOo0(long j, boolean z) {
        synchronized (this) {
            this.f36447OooOo00 = 0;
            o00O0OO o00o0oo2 = this.f36427OooO00o;
            o00o0oo2.f36356OooO0o0 = o00o0oo2.f36354OooO0Oo;
        }
        int iOooOO0 = OooOO0(0);
        if (OooOO0O() && j >= this.f36438OooOOO[iOooOO0] && (j <= this.f36449OooOo0o || z)) {
            int iOooO0oo = OooO0oo(iOooOO0, this.f36443OooOOo0 - this.f36447OooOo00, j, true);
            if (iOooO0oo == -1) {
                return false;
            }
            this.f36446OooOo0 = j;
            this.f36447OooOo00 += iOooO0oo;
            return true;
        }
        return false;
    }
}
