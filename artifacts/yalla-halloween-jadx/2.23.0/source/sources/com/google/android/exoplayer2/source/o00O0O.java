package com.google.android.exoplayer2.source;

import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Log;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.LongCompanionObject;
import org.jctools.util.Pow2;
import p022Oooo00O.o0OO0oO0;
import p203o00o0o0o.o00OOO0O;
import p226o00oOo00.o000Oo0;
import p244o00oo0Oo.o00;
import p244o00oo0Oo.o000O0Oo;
import p244o00oo0Oo.o000OO0O;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00OO0OO;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0O implements TrackOutput {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOo0 f13301OooO00o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final com.google.android.exoplayer2.drm.OooO0OO f13304OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public OooO0OO f13305OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final com.google.android.exoplayer2.drm.OooO0O0.OooO00o f13306OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.OooOo f13307OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public DrmSession f13308OooO0oo;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f13315OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f13316OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f13317OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f13318OooOOoo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f13323OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f13324OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.OooOo f13326OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f13327OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.OooOo f13328OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f13329OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public long f13330OooOooo;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f13302OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f13300OooO = 1000;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long[] f13309OooOO0 = new long[1000];

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long[] f13310OooOO0O = new long[1000];

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long[] f13312OooOOO = new long[1000];

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int[] f13313OooOOO0 = new int[1000];

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int[] f13311OooOO0o = new int[1000];

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public TrackOutput.OooO00o[] f13314OooOOOO = new TrackOutput.OooO00o[1000];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000Oo0<OooO0O0> f13303OooO0OO = new o000Oo0<>(new o0OO0oO0());

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f13321OooOo00 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f13320OooOo0 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f13322OooOo0O = Long.MIN_VALUE;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f13325OooOoO0 = true;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f13319OooOo = true;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f13331OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f13332OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public TrackOutput.OooO00o f13333OooO0OO;
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.google.android.exoplayer2.OooOo f13334OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final com.google.android.exoplayer2.drm.OooO0OO.OooO0O0 f13335OooO0O0;

        public OooO0O0(com.google.android.exoplayer2.OooOo oooOo, com.google.android.exoplayer2.drm.OooO0OO.OooO0O0 oooO0O0) {
            this.f13334OooO00o = oooOo;
            this.f13335OooO0O0 = oooO0O0;
        }
    }

    public interface OooO0OO {
    }

    public o00O0O(o000OO0O o000oo0o2, @Nullable com.google.android.exoplayer2.drm.OooO0OO oooO0OO, @Nullable com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o) {
        this.f13304OooO0Oo = oooO0OO;
        this.f13306OooO0o0 = oooO00o;
        this.f13301OooO00o = new o0OoOo0(o000oo0o2);
    }

    public final long OooO(int i) {
        int i2 = this.f13317OooOOo0;
        int i3 = this.f13315OooOOOo;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        o00O000o.OooO00o(i4 >= 0 && i4 <= i3 - this.f13318OooOOoo);
        int i5 = this.f13315OooOOOo - i4;
        this.f13315OooOOOo = i5;
        this.f13322OooOo0O = Math.max(this.f13320OooOo0, OooOOO0(i5));
        if (i4 == 0 && this.f13323OooOo0o) {
            z = true;
        }
        this.f13323OooOo0o = z;
        o000Oo0<OooO0O0> o000oo1 = this.f13303OooO0OO;
        SparseArray<OooO0O0> sparseArray = o000oo1.f39894OooO0O0;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            o000oo1.f39895OooO0OO.accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        o000oo1.f39893OooO00o = sparseArray.size() > 0 ? Math.min(o000oo1.f39893OooO00o, sparseArray.size() - 1) : -1;
        int i6 = this.f13315OooOOOo;
        if (i6 == 0) {
            return 0L;
        }
        int iOooOOO = OooOOO(i6 - 1);
        return this.f13310OooOO0O[iOooOOO] + ((long) this.f13311OooOO0o[iOooOOO]);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final int OooO00o(o00 o00Var, int i, boolean z) {
        return OooOo0o(o00Var, i, z);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void OooO0O0(int i, o00Oo00 o00oo00) {
        OooO0Oo(i, o00oo00);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0075 A[Catch: all -> 0x0097, TryCatch #0 {, blocks: (B:10:0x002c, B:14:0x0038, B:19:0x0048, B:21:0x0060, B:23:0x0077, B:22:0x0075), top: B:34:0x002c }] */
    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void OooO0OO(com.google.android.exoplayer2.OooOo oooOo) {
        com.google.android.exoplayer2.OooOo oooOo2;
        if (this.f13330OooOooo == 0 || oooOo.f11215OooOOoo == LongCompanionObject.MAX_VALUE) {
            oooOo2 = oooOo;
        } else {
            com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o(oooOo);
            oooO00o.f11248OooOOOO = oooOo.f11215OooOOoo + this.f13330OooOooo;
            oooOo2 = new com.google.android.exoplayer2.OooOo(oooO00o);
        }
        boolean z = false;
        this.f13324OooOoO = false;
        this.f13326OooOoOO = oooOo;
        synchronized (this) {
            this.f13325OooOoO0 = false;
            if (!o0O00.OooO00o(oooOo2, this.f13328OooOoo0)) {
                if (this.f13303OooO0OO.f39894OooO0O0.size() == 0) {
                    this.f13328OooOoo0 = oooOo2;
                } else {
                    SparseArray<OooO0O0> sparseArray = this.f13303OooO0OO.f39894OooO0O0;
                    if (sparseArray.valueAt(sparseArray.size() - 1).f13334OooO00o.equals(oooOo2)) {
                        SparseArray<OooO0O0> sparseArray2 = this.f13303OooO0OO.f39894OooO0O0;
                        this.f13328OooOoo0 = sparseArray2.valueAt(sparseArray2.size() - 1).f13334OooO00o;
                    } else {
                        this.f13328OooOoo0 = oooOo2;
                    }
                }
                com.google.android.exoplayer2.OooOo oooOo3 = this.f13328OooOoo0;
                this.f13327OooOoo = o00OO0OO.OooO00o(oooOo3.f11211OooOOOO, oooOo3.f11208OooOO0o);
                this.f13329OooOooO = false;
                z = true;
            }
        }
        OooO0OO oooO0OO = this.f13305OooO0o;
        if (oooO0OO == null || !z) {
            return;
        }
        Oooo0 oooo0 = (Oooo0) oooO0OO;
        oooo0.f13080OooOOoo.post(oooo0.f13079OooOOo0);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void OooO0Oo(int i, o00Oo00 o00oo00) {
        while (true) {
            o0OoOo0 o0oooo0 = this.f13301OooO00o;
            if (i <= 0) {
                o0oooo0.getClass();
                return;
            }
            int iOooO0OO = o0oooo0.OooO0OO(i);
            o0OoOo0.OooO00o oooO00o = o0oooo0.f13353OooO0o;
            o000O0Oo o000o0oo2 = oooO00o.f13358OooO0OO;
            o00oo00.OooO0Oo(((int) (o0oooo0.f13355OooO0oO - oooO00o.f13356OooO00o)) + o000o0oo2.f40470OooO0O0, iOooO0OO, o000o0oo2.f40469OooO00o);
            i -= iOooO0OO;
            long j = o0oooo0.f13355OooO0oO + ((long) iOooO0OO);
            o0oooo0.f13355OooO0oO = j;
            o0OoOo0.OooO00o oooO00o2 = o0oooo0.f13353OooO0o;
            if (j == oooO00o2.f13357OooO0O0) {
                o0oooo0.f13353OooO0o = oooO00o2.f13359OooO0Oo;
            }
        }
    }

    @GuardedBy("this")
    public final long OooO0o(int i) {
        this.f13320OooOo0 = Math.max(this.f13320OooOo0, OooOOO0(i));
        this.f13315OooOOOo -= i;
        int i2 = this.f13317OooOOo0 + i;
        this.f13317OooOOo0 = i2;
        int i3 = this.f13316OooOOo + i;
        this.f13316OooOOo = i3;
        int i4 = this.f13300OooO;
        if (i3 >= i4) {
            this.f13316OooOOo = i3 - i4;
        }
        int i5 = this.f13318OooOOoo - i;
        this.f13318OooOOoo = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.f13318OooOOoo = 0;
        }
        while (true) {
            o000Oo0<OooO0O0> o000oo1 = this.f13303OooO0OO;
            SparseArray<OooO0O0> sparseArray = o000oo1.f39894OooO0O0;
            if (i6 >= sparseArray.size() - 1) {
                break;
            }
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            o000oo1.f39895OooO0OO.accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = o000oo1.f39893OooO00o;
            if (i8 > 0) {
                o000oo1.f39893OooO00o = i8 - 1;
            }
            i6 = i7;
        }
        if (this.f13315OooOOOo != 0) {
            return this.f13310OooOO0O[this.f13316OooOOo];
        }
        int i9 = this.f13316OooOOo;
        if (i9 == 0) {
            i9 = this.f13300OooO;
        }
        int i10 = i9 - 1;
        return this.f13310OooOO0O[i10] + ((long) this.f13311OooOO0o[i10]);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00cc A[Catch: all -> 0x019e, TryCatch #0 {, blocks: (B:26:0x0054, B:28:0x0058, B:32:0x006e, B:33:0x0071, B:37:0x0079, B:43:0x00b3, B:66:0x012a, B:68:0x0133, B:45:0x00cc, B:47:0x00d0, B:49:0x00db, B:51:0x00f2, B:55:0x00fb, B:56:0x0100, B:58:0x0106, B:62:0x0114, B:64:0x0119, B:65:0x0127, B:48:0x00d9), top: B:74:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0 A[Catch: all -> 0x019e, TryCatch #0 {, blocks: (B:26:0x0054, B:28:0x0058, B:32:0x006e, B:33:0x0071, B:37:0x0079, B:43:0x00b3, B:66:0x012a, B:68:0x0133, B:45:0x00cc, B:47:0x00d0, B:49:0x00db, B:51:0x00f2, B:55:0x00fb, B:56:0x0100, B:58:0x0106, B:62:0x0114, B:64:0x0119, B:65:0x0127, B:48:0x00d9), top: B:74:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9 A[Catch: all -> 0x019e, TryCatch #0 {, blocks: (B:26:0x0054, B:28:0x0058, B:32:0x006e, B:33:0x0071, B:37:0x0079, B:43:0x00b3, B:66:0x012a, B:68:0x0133, B:45:0x00cc, B:47:0x00d0, B:49:0x00db, B:51:0x00f2, B:55:0x00fb, B:56:0x0100, B:58:0x0106, B:62:0x0114, B:64:0x0119, B:65:0x0127, B:48:0x00d9), top: B:74:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f2 A[Catch: all -> 0x019e, TryCatch #0 {, blocks: (B:26:0x0054, B:28:0x0058, B:32:0x006e, B:33:0x0071, B:37:0x0079, B:43:0x00b3, B:66:0x012a, B:68:0x0133, B:45:0x00cc, B:47:0x00d0, B:49:0x00db, B:51:0x00f2, B:55:0x00fb, B:56:0x0100, B:58:0x0106, B:62:0x0114, B:64:0x0119, B:65:0x0127, B:48:0x00d9), top: B:74:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:58:0x0106 A[Catch: all -> 0x019e, TryCatch #0 {, blocks: (B:26:0x0054, B:28:0x0058, B:32:0x006e, B:33:0x0071, B:37:0x0079, B:43:0x00b3, B:66:0x012a, B:68:0x0133, B:45:0x00cc, B:47:0x00d0, B:49:0x00db, B:51:0x00f2, B:55:0x00fb, B:56:0x0100, B:58:0x0106, B:62:0x0114, B:64:0x0119, B:65:0x0127, B:48:0x00d9), top: B:74:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0111  */
    /* JADX WARN: Code duplicated, block: B:61:0x0113  */
    /* JADX WARN: Code duplicated, block: B:64:0x0119 A[Catch: all -> 0x019e, TryCatch #0 {, blocks: (B:26:0x0054, B:28:0x0058, B:32:0x006e, B:33:0x0071, B:37:0x0079, B:43:0x00b3, B:66:0x012a, B:68:0x0133, B:45:0x00cc, B:47:0x00d0, B:49:0x00db, B:51:0x00f2, B:55:0x00fb, B:56:0x0100, B:58:0x0106, B:62:0x0114, B:64:0x0119, B:65:0x0127, B:48:0x00d9), top: B:74:0x0054 }] */
    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    public final void OooO0o0(long j, int i, int i2, int i3, @Nullable TrackOutput.OooO00o oooO00o) {
        com.google.android.exoplayer2.drm.OooO0OO oooO0OO;
        com.google.android.exoplayer2.drm.OooO0OO.OooO0O0 oooO0O0OooO0Oo;
        o000Oo0<OooO0O0> o000oo1;
        int i4;
        int i5;
        SparseArray<OooO0O0> sparseArray;
        int iKeyAt;
        boolean z;
        boolean z2;
        if (this.f13324OooOoO) {
            com.google.android.exoplayer2.OooOo oooOo = this.f13326OooOoOO;
            o00O000o.OooO0o0(oooOo);
            OooO0OO(oooOo);
        }
        int i6 = i & 1;
        boolean z3 = i6 != 0;
        if (this.f13319OooOo) {
            if (!z3) {
                return;
            } else {
                this.f13319OooOo = false;
            }
        }
        long j2 = j + this.f13330OooOooo;
        if (this.f13327OooOoo) {
            if (j2 < this.f13321OooOo00) {
                return;
            }
            if (i6 == 0) {
                if (!this.f13329OooOooO) {
                    Log.OooO0o("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f13328OooOoo0);
                    this.f13329OooOooO = true;
                }
                i |= 1;
            }
        }
        long j3 = (this.f13301OooO00o.f13355OooO0oO - ((long) i2)) - ((long) i3);
        synchronized (this) {
            int i7 = this.f13315OooOOOo;
            if (i7 > 0) {
                int iOooOOO = OooOOO(i7 - 1);
                o00O000o.OooO00o(this.f13310OooOO0O[iOooOOO] + ((long) this.f13311OooOO0o[iOooOOO]) <= j3);
            }
            this.f13323OooOo0o = (536870912 & i) != 0;
            this.f13322OooOo0O = Math.max(this.f13322OooOo0O, j2);
            int iOooOOO2 = OooOOO(this.f13315OooOOOo);
            this.f13312OooOOO[iOooOOO2] = j2;
            this.f13310OooOO0O[iOooOOO2] = j3;
            this.f13311OooOO0o[iOooOOO2] = i2;
            this.f13313OooOOO0[iOooOOO2] = i;
            this.f13314OooOOOO[iOooOOO2] = oooO00o;
            this.f13309OooOO0[iOooOOO2] = 0;
            if (this.f13303OooO0OO.f39894OooO0O0.size() == 0) {
                oooO0OO = this.f13304OooO0Oo;
                if (oooO0OO != null) {
                    oooO0O0OooO0Oo = oooO0OO.OooO0Oo(this.f13306OooO0o0, this.f13328OooOoo0);
                } else {
                    oooO0O0OooO0Oo = com.google.android.exoplayer2.drm.OooO0OO.OooO0O0.f11775OooO00o;
                }
                o000oo1 = this.f13303OooO0OO;
                i4 = this.f13317OooOOo0 + this.f13315OooOOOo;
                com.google.android.exoplayer2.OooOo oooOo2 = this.f13328OooOoo0;
                oooOo2.getClass();
                OooO0O0 oooO0O0 = new OooO0O0(oooOo2, oooO0O0OooO0Oo);
                i5 = o000oo1.f39893OooO00o;
                sparseArray = o000oo1.f39894OooO0O0;
                if (i5 == -1) {
                    if (sparseArray.size() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    o00O000o.OooO0Oo(z2);
                    o000oo1.f39893OooO00o = 0;
                }
                if (sparseArray.size() > 0) {
                    iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                    if (i4 >= iKeyAt) {
                        z = true;
                    } else {
                        z = false;
                    }
                    o00O000o.OooO00o(z);
                    if (iKeyAt == i4) {
                        o000oo1.f39895OooO0OO.accept(sparseArray.valueAt(sparseArray.size() - 1));
                    }
                }
                sparseArray.append(i4, oooO0O0);
            } else {
                SparseArray<OooO0O0> sparseArray2 = this.f13303OooO0OO.f39894OooO0O0;
                if (!sparseArray2.valueAt(sparseArray2.size() - 1).f13334OooO00o.equals(this.f13328OooOoo0)) {
                    oooO0OO = this.f13304OooO0Oo;
                    if (oooO0OO != null) {
                        oooO0O0OooO0Oo = oooO0OO.OooO0Oo(this.f13306OooO0o0, this.f13328OooOoo0);
                    } else {
                        oooO0O0OooO0Oo = com.google.android.exoplayer2.drm.OooO0OO.OooO0O0.f11775OooO00o;
                    }
                    o000oo1 = this.f13303OooO0OO;
                    i4 = this.f13317OooOOo0 + this.f13315OooOOOo;
                    com.google.android.exoplayer2.OooOo oooOo3 = this.f13328OooOoo0;
                    oooOo3.getClass();
                    OooO0O0 oooO0O1 = new OooO0O0(oooOo3, oooO0O0OooO0Oo);
                    i5 = o000oo1.f39893OooO00o;
                    sparseArray = o000oo1.f39894OooO0O0;
                    if (i5 == -1) {
                        if (sparseArray.size() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        o00O000o.OooO0Oo(z2);
                        o000oo1.f39893OooO00o = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i4 >= iKeyAt) {
                            z = true;
                        } else {
                            z = false;
                        }
                        o00O000o.OooO00o(z);
                        if (iKeyAt == i4) {
                            o000oo1.f39895OooO0OO.accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i4, oooO0O1);
                }
            }
            int i8 = this.f13315OooOOOo + 1;
            this.f13315OooOOOo = i8;
            int i9 = this.f13300OooO;
            if (i8 == i9) {
                int i10 = i9 + 1000;
                long[] jArr = new long[i10];
                long[] jArr2 = new long[i10];
                long[] jArr3 = new long[i10];
                int[] iArr = new int[i10];
                int[] iArr2 = new int[i10];
                TrackOutput.OooO00o[] oooO00oArr = new TrackOutput.OooO00o[i10];
                int i11 = this.f13316OooOOo;
                int i12 = i9 - i11;
                System.arraycopy(this.f13310OooOO0O, i11, jArr2, 0, i12);
                System.arraycopy(this.f13312OooOOO, this.f13316OooOOo, jArr3, 0, i12);
                System.arraycopy(this.f13313OooOOO0, this.f13316OooOOo, iArr, 0, i12);
                System.arraycopy(this.f13311OooOO0o, this.f13316OooOOo, iArr2, 0, i12);
                System.arraycopy(this.f13314OooOOOO, this.f13316OooOOo, oooO00oArr, 0, i12);
                System.arraycopy(this.f13309OooOO0, this.f13316OooOOo, jArr, 0, i12);
                int i13 = this.f13316OooOOo;
                System.arraycopy(this.f13310OooOO0O, 0, jArr2, i12, i13);
                System.arraycopy(this.f13312OooOOO, 0, jArr3, i12, i13);
                System.arraycopy(this.f13313OooOOO0, 0, iArr, i12, i13);
                System.arraycopy(this.f13311OooOO0o, 0, iArr2, i12, i13);
                System.arraycopy(this.f13314OooOOOO, 0, oooO00oArr, i12, i13);
                System.arraycopy(this.f13309OooOO0, 0, jArr, i12, i13);
                this.f13310OooOO0O = jArr2;
                this.f13312OooOOO = jArr3;
                this.f13313OooOOO0 = iArr;
                this.f13311OooOO0o = iArr2;
                this.f13314OooOOOO = oooO00oArr;
                this.f13309OooOO0 = jArr;
                this.f13316OooOOo = 0;
                this.f13300OooO = i10;
            }
        }
    }

    public final void OooO0oO(long j, boolean z, boolean z2) {
        long jOooO0o;
        int i;
        o0OoOo0 o0oooo0 = this.f13301OooO00o;
        synchronized (this) {
            int i2 = this.f13315OooOOOo;
            jOooO0o = -1;
            if (i2 != 0) {
                long[] jArr = this.f13312OooOOO;
                int i3 = this.f13316OooOOo;
                if (j >= jArr[i3]) {
                    if (z2 && (i = this.f13318OooOOoo) != i2) {
                        i2 = i + 1;
                    }
                    int iOooOO0O = OooOO0O(j, z, i3, i2);
                    if (iOooOO0O != -1) {
                        jOooO0o = OooO0o(iOooOO0O);
                    }
                }
            }
        }
        o0oooo0.OooO0O0(jOooO0o);
    }

    public final void OooO0oo() {
        long jOooO0o;
        o0OoOo0 o0oooo0 = this.f13301OooO00o;
        synchronized (this) {
            int i = this.f13315OooOOOo;
            jOooO0o = i == 0 ? -1L : OooO0o(i);
        }
        o0oooo0.OooO0O0(jOooO0o);
    }

    public final void OooOO0(int i) {
        long jOooO = OooO(i);
        o0OoOo0 o0oooo0 = this.f13301OooO00o;
        o00O000o.OooO00o(jOooO <= o0oooo0.f13355OooO0oO);
        o0oooo0.f13355OooO0oO = jOooO;
        int i2 = o0oooo0.f13350OooO0O0;
        if (jOooO != 0) {
            o0OoOo0.OooO00o oooO00o = o0oooo0.f13352OooO0Oo;
            if (jOooO != oooO00o.f13356OooO00o) {
                while (o0oooo0.f13355OooO0oO > oooO00o.f13357OooO0O0) {
                    oooO00o = oooO00o.f13359OooO0Oo;
                }
                o0OoOo0.OooO00o oooO00o2 = oooO00o.f13359OooO0Oo;
                oooO00o2.getClass();
                o0oooo0.OooO00o(oooO00o2);
                o0OoOo0.OooO00o oooO00o3 = new o0OoOo0.OooO00o(oooO00o.f13357OooO0O0, i2);
                oooO00o.f13359OooO0Oo = oooO00o3;
                if (o0oooo0.f13355OooO0oO == oooO00o.f13357OooO0O0) {
                    oooO00o = oooO00o3;
                }
                o0oooo0.f13353OooO0o = oooO00o;
                if (o0oooo0.f13354OooO0o0 == oooO00o2) {
                    o0oooo0.f13354OooO0o0 = oooO00o3;
                    return;
                }
                return;
            }
        }
        o0oooo0.OooO00o(o0oooo0.f13352OooO0Oo);
        o0OoOo0.OooO00o oooO00o4 = new o0OoOo0.OooO00o(o0oooo0.f13355OooO0oO, i2);
        o0oooo0.f13352OooO0Oo = oooO00o4;
        o0oooo0.f13354OooO0o0 = oooO00o4;
        o0oooo0.f13353OooO0o = oooO00o4;
    }

    public final int OooOO0O(long j, boolean z, int i, int i2) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f13312OooOOO[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.f13313OooOOO0[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f13300OooO) {
                i = 0;
            }
        }
        return i3;
    }

    public final synchronized long OooOO0o() {
        return this.f13322OooOo0O;
    }

    public final int OooOOO(int i) {
        int i2 = this.f13316OooOOo + i;
        int i3 = this.f13300OooO;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final long OooOOO0(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iOooOOO = OooOOO(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.f13312OooOOO[iOooOOO]);
            if ((this.f13313OooOOO0[iOooOOO] & 1) != 0) {
                break;
            }
            iOooOOO--;
            if (iOooOOO == -1) {
                iOooOOO = this.f13300OooO - 1;
            }
        }
        return jMax;
    }

    public final synchronized int OooOOOO(long j, boolean z) {
        int iOooOOO = OooOOO(this.f13318OooOOoo);
        int i = this.f13318OooOOoo;
        int i2 = this.f13315OooOOOo;
        if ((i != i2) && j >= this.f13312OooOOO[iOooOOO]) {
            if (j > this.f13322OooOo0O && z) {
                return i2 - i;
            }
            int iOooOO0O = OooOO0O(j, true, iOooOOO, i2 - i);
            if (iOooOO0O == -1) {
                return 0;
            }
            return iOooOO0O;
        }
        return 0;
    }

    @Nullable
    public final synchronized com.google.android.exoplayer2.OooOo OooOOOo() {
        return this.f13325OooOoO0 ? null : this.f13328OooOoo0;
    }

    public final boolean OooOOo(int i) {
        DrmSession drmSession = this.f13308OooO0oo;
        return drmSession == null || drmSession.getState() == 4 || ((this.f13313OooOOO0[i] & Pow2.MAX_POW2) == 0 && this.f13308OooO0oo.OooO0Oo());
    }

    @CallSuper
    public final synchronized boolean OooOOo0(boolean z) {
        com.google.android.exoplayer2.OooOo oooOo;
        int i = this.f13318OooOOoo;
        boolean z2 = true;
        if (i != this.f13315OooOOOo) {
            if (this.f13303OooO0OO.OooO00o(this.f13317OooOOo0 + i).f13334OooO00o != this.f13307OooO0oO) {
                return true;
            }
            return OooOOo(OooOOO(this.f13318OooOOoo));
        }
        if (!z && !this.f13323OooOo0o && ((oooOo = this.f13328OooOoo0) == null || oooOo == this.f13307OooO0oO)) {
            z2 = false;
        }
        return z2;
    }

    public final void OooOOoo(com.google.android.exoplayer2.OooOo oooOo, o00OOO0O o00ooo0o) {
        com.google.android.exoplayer2.OooOo oooOoOooO00o;
        com.google.android.exoplayer2.OooOo oooOo2 = this.f13307OooO0oO;
        boolean z = oooOo2 == null;
        DrmInitData drmInitData = z ? null : oooOo2.f11213OooOOo;
        this.f13307OooO0oO = oooOo;
        DrmInitData drmInitData2 = oooOo.f11213OooOOo;
        com.google.android.exoplayer2.drm.OooO0OO oooO0OO = this.f13304OooO0Oo;
        if (oooO0OO != null) {
            int iOooO00o = oooO0OO.OooO00o(oooOo);
            com.google.android.exoplayer2.OooOo.OooO00o OooO00o2 = oooOo.OooO00o();
            OooO00o2.f11265Oooo000 = iOooO00o;
            oooOoOooO00o = OooO00o2.OooO00o();
        } else {
            oooOoOooO00o = oooOo;
        }
        o00ooo0o.f39211OooO0O0 = oooOoOooO00o;
        o00ooo0o.f39210OooO00o = this.f13308OooO0oo;
        if (oooO0OO == null) {
            return;
        }
        if (z || !o0O00.OooO00o(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.f13308OooO0oo;
            com.google.android.exoplayer2.drm.OooO0O0.OooO00o oooO00o = this.f13306OooO0o0;
            DrmSession drmSessionOooO0O0 = oooO0OO.OooO0O0(oooO00o, oooOo);
            this.f13308OooO0oo = drmSessionOooO0O0;
            o00ooo0o.f39210OooO00o = drmSessionOooO0O0;
            if (drmSession != null) {
                drmSession.OooO0O0(oooO00o);
            }
        }
    }

    public final synchronized boolean OooOo(long j, boolean z) {
        OooOo0O();
        int iOooOOO = OooOOO(this.f13318OooOOoo);
        int i = this.f13318OooOOoo;
        int i2 = this.f13315OooOOOo;
        if ((i != i2) && j >= this.f13312OooOOO[iOooOOO] && (j <= this.f13322OooOo0O || z)) {
            int iOooOO0O = OooOO0O(j, true, iOooOOO, i2 - i);
            if (iOooOO0O == -1) {
                return false;
            }
            this.f13321OooOo00 = j;
            this.f13318OooOOoo += iOooOO0O;
            return true;
        }
        return false;
    }

    @CallSuper
    public final void OooOo0(boolean z) {
        o000Oo0<OooO0O0> o000oo1;
        SparseArray<OooO0O0> sparseArray;
        o0OoOo0 o0oooo0 = this.f13301OooO00o;
        o0oooo0.OooO00o(o0oooo0.f13352OooO0Oo);
        o0OoOo0.OooO00o oooO00o = o0oooo0.f13352OooO0Oo;
        int i = 0;
        o00O000o.OooO0Oo(oooO00o.f13358OooO0OO == null);
        oooO00o.f13356OooO00o = 0L;
        oooO00o.f13357OooO0O0 = ((long) o0oooo0.f13350OooO0O0) + 0;
        o0OoOo0.OooO00o oooO00o2 = o0oooo0.f13352OooO0Oo;
        o0oooo0.f13354OooO0o0 = oooO00o2;
        o0oooo0.f13353OooO0o = oooO00o2;
        o0oooo0.f13355OooO0oO = 0L;
        ((p244o00oo0Oo.o00O000o) o0oooo0.f13349OooO00o).OooO0O0();
        this.f13315OooOOOo = 0;
        this.f13317OooOOo0 = 0;
        this.f13316OooOOo = 0;
        this.f13318OooOOoo = 0;
        this.f13319OooOo = true;
        this.f13321OooOo00 = Long.MIN_VALUE;
        this.f13320OooOo0 = Long.MIN_VALUE;
        this.f13322OooOo0O = Long.MIN_VALUE;
        this.f13323OooOo0o = false;
        while (true) {
            o000oo1 = this.f13303OooO0OO;
            sparseArray = o000oo1.f39894OooO0O0;
            if (i >= sparseArray.size()) {
                break;
            }
            o000oo1.f39895OooO0OO.accept(sparseArray.valueAt(i));
            i++;
        }
        o000oo1.f39893OooO00o = -1;
        sparseArray.clear();
        if (z) {
            this.f13326OooOoOO = null;
            this.f13328OooOoo0 = null;
            this.f13325OooOoO0 = true;
        }
    }

    @CallSuper
    public final int OooOo00(o00OOO0O o00ooo0o, DecoderInputBuffer decoderInputBuffer, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        OooO00o oooO00o = this.f13302OooO0O0;
        synchronized (this) {
            decoderInputBuffer.f11676OooO0oO = false;
            int i3 = this.f13318OooOOoo;
            if (i3 != this.f13315OooOOOo) {
                com.google.android.exoplayer2.OooOo oooOo = this.f13303OooO0OO.OooO00o(this.f13317OooOOo0 + i3).f13334OooO00o;
                if (!z2 && oooOo == this.f13307OooO0oO) {
                    int iOooOOO = OooOOO(this.f13318OooOOoo);
                    if (OooOOo(iOooOOO)) {
                        decoderInputBuffer.f39410OooO0Oo = this.f13313OooOOO0[iOooOOO];
                        if (this.f13318OooOOoo == this.f13315OooOOOo - 1 && (z || this.f13323OooOo0o)) {
                            decoderInputBuffer.OooO0o0(536870912);
                        }
                        long j = this.f13312OooOOO[iOooOOO];
                        decoderInputBuffer.f11677OooO0oo = j;
                        if (j < this.f13321OooOo00) {
                            decoderInputBuffer.OooO0o0(Integer.MIN_VALUE);
                        }
                        oooO00o.f13331OooO00o = this.f13311OooOO0o[iOooOOO];
                        oooO00o.f13332OooO0O0 = this.f13310OooOO0O[iOooOOO];
                        oooO00o.f13333OooO0OO = this.f13314OooOOOO[iOooOOO];
                        i2 = -4;
                    } else {
                        decoderInputBuffer.f11676OooO0oO = true;
                        i2 = -3;
                    }
                }
                OooOOoo(oooOo, o00ooo0o);
                i2 = -5;
            } else {
                if (!z && !this.f13323OooOo0o) {
                    com.google.android.exoplayer2.OooOo oooOo2 = this.f13328OooOoo0;
                    if (oooOo2 == null || (!z2 && oooOo2 == this.f13307OooO0oO)) {
                        i2 = -3;
                    } else {
                        OooOOoo(oooOo2, o00ooo0o);
                        i2 = -5;
                    }
                }
                decoderInputBuffer.f39410OooO0Oo = 4;
                i2 = -4;
            }
        }
        if (i2 == -4 && !decoderInputBuffer.OooO0o(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z3) {
                    o0OoOo0 o0oooo0 = this.f13301OooO00o;
                    o0OoOo0.OooO0o(o0oooo0.f13354OooO0o0, decoderInputBuffer, this.f13302OooO0O0, o0oooo0.f13351OooO0OO);
                } else {
                    o0OoOo0 o0oooo1 = this.f13301OooO00o;
                    o0oooo1.f13354OooO0o0 = o0OoOo0.OooO0o(o0oooo1.f13354OooO0o0, decoderInputBuffer, this.f13302OooO0O0, o0oooo1.f13351OooO0OO);
                }
            }
            if (!z3) {
                this.f13318OooOOoo++;
            }
        }
        return i2;
    }

    public final synchronized void OooOo0O() {
        this.f13318OooOOoo = 0;
        o0OoOo0 o0oooo0 = this.f13301OooO00o;
        o0oooo0.f13354OooO0o0 = o0oooo0.f13352OooO0Oo;
    }

    public final int OooOo0o(o00 o00Var, int i, boolean z) throws IOException {
        o0OoOo0 o0oooo0 = this.f13301OooO00o;
        int iOooO0OO = o0oooo0.OooO0OO(i);
        o0OoOo0.OooO00o oooO00o = o0oooo0.f13353OooO0o;
        o000O0Oo o000o0oo2 = oooO00o.f13358OooO0OO;
        int i2 = o00Var.read(o000o0oo2.f40469OooO00o, ((int) (o0oooo0.f13355OooO0oO - oooO00o.f13356OooO00o)) + o000o0oo2.f40470OooO0O0, iOooO0OO);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = o0oooo0.f13355OooO0oO + ((long) i2);
        o0oooo0.f13355OooO0oO = j;
        o0OoOo0.OooO00o oooO00o2 = o0oooo0.f13353OooO0o;
        if (j != oooO00o2.f13357OooO0O0) {
            return i2;
        }
        o0oooo0.f13353OooO0o = oooO00o2.f13359OooO0Oo;
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void OooOoO0(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.f13318OooOOoo + i <= this.f13315OooOOOo) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        o00O000o.OooO00o(z);
        this.f13318OooOOoo += i;
    }
}
